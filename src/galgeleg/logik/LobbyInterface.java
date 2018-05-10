package galgeleg.logik;

public interface LobbyInterface extends java.rmi.Remote {

    Boolean login(String username, String password)                 throws java.rmi.RemoteException;

    void registrer(String username, ClientInterface client)  throws java.rmi.RemoteException;

    void sendToAll(String message, String from)                     throws java.rmi.RemoteException;

    void joinGameQueue(String username)                             throws java.rmi.RemoteException;

    void disconnectClient(String username)                          throws java.rmi.RemoteException;
}
