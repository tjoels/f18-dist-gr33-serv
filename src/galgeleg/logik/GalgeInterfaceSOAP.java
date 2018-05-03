package galgeleg.logik;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface GalgeInterfaceSOAP {

    @WebMethod void restart();

    @WebMethod void guessLetter(String bogstav);

    @WebMethod int getWrongLetterCount();

    @WebMethod int getScore();

    @WebMethod boolean getGameOver();

    @WebMethod String outputToClient();
    @WebMethod void logStatus();

}
