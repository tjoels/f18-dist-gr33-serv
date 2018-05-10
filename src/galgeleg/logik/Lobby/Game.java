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

    public Game() {

        PlayerGame = new HashMap<>();
        Players = new ArrayList<>();

    }

    public void addPlayerToGame(String username) {
        Players.add(username);
    }

    /*
    Implement for multiplayer mode.
     */
    public void waitForPlayers() {
        timer = new Timer();

        //ToDo Find a way for the broadcast to be accepted.
        /*
            sendToAll("Game starting in: ", "[System]");
         */

        System.out.println("Game starting in: ");
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, time, 1000);

        try {
            startGame();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private int setInterval() {
        if (time == 1)
            timer.cancel();
        return --time;
    }

    /*
    Method works due to the game being incomplete.
    When multiplayer mode works, this funktion will fail most likely.
    //ToDo Rework method.
     */
    public void startGame() throws RemoteException {
        String word;

        ArrayList <String> possibleWords = new DR_WordList().getWords();
        word = possibleWords.get(new Random().nextInt(possibleWords.size()));

        this.server = new Galgelogik(word);

        for (String Player : Players) {
            PlayerGame.put(Player, server);
            Lobby.ConnectedUsers.get(Player).startGame(server);
        }
    }
}
