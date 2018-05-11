package galgeleg;

import galgeleg.logik.Lobby.Lobby;
import galgeleg.logik.LobbyInterface;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GalgeServer {

    public static void main(String args[]) throws Exception {

        System.setProperty("java.rmi.server.hostname", "130.225.170.244");   // Tried with fix from
        // https://stackoverflow.com/questions/15685686/java-rmi-connectexception-connection-refused-to-host-127-0-1-1
        LobbyInterface lobby = new Lobby();
        LocateRegistry.createRegistry(1076);

        try {
            //Naming.rebind("rmi://ubuntu4.saluton.dk:1076/galgeleg", lobby);
            Naming.rebind("rmi://130.225.170.244:1076/galgeleg", lobby);
//            Naming.rebind("rmi://localhost:1076/galgeleg", lobby);

            System.err.println("Waiting for connection from clients.");
        } catch (Exception e) {
            System.out.println("Chat Server failed: " + e);
        }

    }

}
