package galgeleg;

import galgeleg.logik.Lobby.Lobby;
import galgeleg.logik.LobbyInterface;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GalgeServer {

    public static void main(String args[]) throws Exception {

        LobbyInterface lobby = new Lobby();
        LocateRegistry.createRegistry(1076);

        try {
            Naming.rebind("rmi://localhost:1076/galgeleg", lobby);

            System.err.println("Waiting for connection from clients.");
        }catch (Exception e) {
            System.out.println("Chat Server failed: " + e);
        }

    }

}

