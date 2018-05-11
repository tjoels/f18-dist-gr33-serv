package galgeleg.logik.Lobby;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import galgeleg.logik.ClientInterface;
import galgeleg.logik.LobbyInterface;
import galgeleg.login.bruger_authorisation.Bruger;
import galgeleg.login.bruger_authorisation.Brugeradmin;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lobby extends UnicastRemoteObject implements LobbyInterface {

    public static HashMap<String, Integer> Users;
    public static HashMap<String, ClientInterface> ConnectedUsers;
    private static HashMap<Integer, Game> Games;

    private static ArrayList<String> GameQueue;

    private Bruger bruger = null;

    public Lobby() throws RemoteException {
        Users = new HashMap<>();
        ConnectedUsers = new HashMap<>();
        Games = new HashMap<>();

        GameQueue = new ArrayList<>();
    }

    @Override
    public Boolean login(String username, String password) {

        HttpURLConnection connection = null;

        try {
            URL url = new URL("http://javabog.dk:9901/brugeradmin?wsdl");
            QName qname = new QName("http://soap.transport.brugerautorisation/", "BrugeradminImplService");
            Service service = Service.create(url, qname);
            Brugeradmin brugeradmin = service.getPort(Brugeradmin.class);

            connection = (HttpURLConnection) url.openConnection();

            try {
                if (brugeradmin != null) {
                    try {
                        bruger = brugeradmin.hentBruger(username, password);
                    } catch (ServerSOAPFaultException e) {
                        System.out.println("A client entered wrong username or password." +
                                "\nUsername entered: " + username +
                                "\nPassword entered: " + password);
                        return false;
                    }
                }
                if (bruger  != null) {
                    Users.putIfAbsent(bruger.getBrugernavn(), 0);
                    System.err.println("[" + bruger.getBrugernavn() + " : " + bruger.getFornavn() + "] client joined.");
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (connection != null)
                connection.disconnect();
        }

        return false;
    }

    public synchronized void registrer(String username, ClientInterface client) {
        ConnectedUsers.put(username, client);
    }

    public synchronized void sendToAll(String message, String from) throws RemoteException {
        System.out.println("[" + from + "]: " + message);

        for(Map.Entry<String, Integer> entry : Users.entrySet()) {
            String key = entry.getKey();
            String newMessage = "[" + from + "]: " + message;
            if(!key.equalsIgnoreCase(from))
                ConnectedUsers.get(key).getMessage(newMessage);
        }
    }

    public void joinGameQueue(String username) {
        GameQueue.add(username);
        Games.clear();

        try {
            Games.put(0, new Game());
            Games.get(0).addPlayerToGame(username);
            Games.get(0).startGame(); //Change to waitForPlayer() for testing multiplayer.
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void disconnectClient(String username) {
        if (ConnectedUsers.get(username) != null) {
            ConnectedUsers.remove(username);
            System.out.println("[" + username + "]: Disconnected from server");
        }
    }
}
