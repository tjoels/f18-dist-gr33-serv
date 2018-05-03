package galgeleg.logik.Lobby;

import galgeleg.logik.Galgelogik.DR_WordList;
import galgeleg.logik.Galgelogik.Galgelogik;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.*;

public class Game {

    private Galgelogik server;

    private HashMap<String, Galgelogik> PlayerGame;
    private ArrayList<String> Players;

    private Timer timer;
    private int time = 11;

    public Game() throws MalformedURLException, RemoteException {

        PlayerGame = new HashMap<>();
        Players = new ArrayList<>();

    }

    public void addPlayerToGame(String username) {
        Players.add(username);
    }

    public void waitForPlayers() {
        timer = new Timer();
        //ToDo Find a way for the broadcast to be accepted. Annoncere at der er en der vil spille, og at man skal vælge om man vil spille med.
        /*
            sendToAll("Game starting in: ", "[System]");
         */

        System.out.println("Game starting in: ");

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, time, 1000);
    }

    private int setInterval() {
        if (time == 1)
            timer.cancel();
        return --time;
    }

    public void startGame() throws RemoteException {
        //TODO: only supports one player.
        //waitForPlayers();

        if (Players.size() < 2) {
            this.server = new Galgelogik(null);
            PlayerGame.put(Players.get(0), server);
            Lobby.ConnectedUsers.get(Players.get(0)).startGame(server);
        } else {
            String word;

            ArrayList<String> possibleWords = new DR_WordList().getWords();
            word = possibleWords.get(new Random().nextInt(possibleWords.size()));

            this.server = new Galgelogik(word);

            for (int i = 0; i < Players.size(); i++) {
                PlayerGame.put(Players.get(i), server);
                Lobby.ConnectedUsers.get(Players.get(i)).startGame(server);
            }
        }
    }
}
