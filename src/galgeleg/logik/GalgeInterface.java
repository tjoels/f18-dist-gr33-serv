package galgeleg.logik;

public interface GalgeInterface extends java.rmi.Remote {

    void restart()                                      throws java.rmi.RemoteException;

    void guessLetter(String bogstav)                    throws java.rmi.RemoteException;

    String visibleWord()                               throws java.rmi.RemoteException;

    int getWrongLetterCount()                           throws java.rmi.RemoteException;

    int getScore()                                      throws java.rmi.RemoteException;

    boolean getGameOver()                               throws java.rmi.RemoteException;

    String outputToClient()                             throws java.rmi.RemoteException;
    void logStatus()                                    throws java.rmi.RemoteException;

}
