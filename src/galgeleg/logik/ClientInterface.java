package galgeleg.logik;

public interface ClientInterface extends java.rmi.Remote{

        void getMessage(String message)                                 throws java.rmi.RemoteException;

        void startGame(GalgeInterface galgeInterface)                   throws java.rmi.RemoteException;

}
