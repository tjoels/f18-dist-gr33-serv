package galgeleg.logik.Galgelogik;

import galgeleg.logik.GalgeInterface;
import galgeleg.logik.GalgeInterfaceSOAP;

import javax.jws.WebService;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Random;

@WebService(endpointInterface = "galgeleg.logik.GalgeInterfaceSOAP")
public class Galgelogik extends UnicastRemoteObject implements GalgeInterface, GalgeInterfaceSOAP {
  /** AHT afprøvning er possibleWords synlig på pakkeniveau */

  ArrayList<String> outputToClientArray = new ArrayList<String>();
  ArrayList<String> possibleWords = new ArrayList<String>();

  private String word;
  private String visibleWord;

  private ArrayList<String> usedLetters = new ArrayList<String>();

  private int wrongLetterCount;
  private int score;

  private boolean lastLetterWasCorrect;
  private boolean gameWon;
  private boolean gameLost;

  public String getWord() {
    return word;
  }

  public String getVisibleWord() {
    return visibleWord;
  }

  public ArrayList<String> getUsedLetters() {
    return usedLetters;
  }

  @Override
  public int getWrongLetterCount() {
    return wrongLetterCount;
  }

  public int getScore() {
    return score;
  }

  public boolean getLastLetterWasCorrect() {
    return lastLetterWasCorrect;
  }

  public boolean getGameWon() {
    return gameWon;
  }

  public boolean getGameLost() {
    return gameLost;
  }

  @Override
  public boolean getGameOver() {
    return gameLost || gameWon;
  }

  public Galgelogik(String word) throws java.rmi.RemoteException {

    if(word == null){
      possibleWords = new DR_WordList().getWords();
    } else {
      possibleWords.add(word);
    }

    restart();
  }

  @Override
  public void restart() {
    usedLetters.clear();
    wrongLetterCount = 0;
    gameWon = false;
    gameLost = false;
    word = possibleWords.get(new Random().nextInt(possibleWords.size()));
    updateVisibleWord();
  }


  private void updateVisibleWord() {
    visibleWord = "";
    gameWon = true;

    for (int n = 0; n < word.length(); n++) {
      String bogstav = word.substring(n, n + 1);

      if (usedLetters.contains(bogstav)) {
        visibleWord = visibleWord + bogstav;
      } else {
        visibleWord = visibleWord + "*";
        gameWon = false;
      }
    }
  }

  @Override
  public void guessLetter(String letter) {
    outputToClientArray.clear();

    if (letter.length() != 1) return;

    System.out.println("Der gættes på bogstavet: " + letter);
    outputToClientArray.add("Der gættes på bogstavet: " + letter + "\n"); // klient output

    if (usedLetters.contains(letter)) return;

    if (gameWon || gameLost) return;

    usedLetters.add(letter);

    if (word.contains(letter)) {
      lastLetterWasCorrect = true;
      System.out.println("Bogstavet var korrekt: " + letter);
      outputToClientArray.add("Bogstavet var korrekt\n"); // klient output
    } else {
      // Vi gættede på et bogstav der ikke var i word.
      lastLetterWasCorrect = false;
      System.out.println("Bogstavet var IKKE korrekt: " + letter);
      outputToClientArray.add("Bogstavet var IKKE korrekt\n"); // klient output
      wrongLetterCount = wrongLetterCount + 1;

      if (wrongLetterCount > 6) {
        gameLost = true;
      }
    }

    updateVisibleWord();
  }

  @Override
  public void logStatus() {
    outputToClientArray.clear();

    System.out.println("---------- ");
    if (getGameOver()) System.out.println("- word (skult) = " + word);
    System.out.println("- visibleWord = " + visibleWord);
    System.out.println("- forkerteBogstaver = " + wrongLetterCount);
    System.out.println("- brugeBogstaver = " + usedLetters);
    if (gameLost) System.out.println("- SPILLET ER TABT");
    if (gameWon) System.out.println("- SPILLET ER VUNDET");
    System.out.println("---------- ");


    // Klient output
    outputToClientArray.add("---------- \n"); // klient output
    outputToClientArray.add("- word (skult) = " + word + "\n"); // klient output
    outputToClientArray.add("- visibleWord = " + visibleWord + "\n"); // klient output
    outputToClientArray.add("- forkerteBogstaver = " + wrongLetterCount + "\n"); // klient output
    outputToClientArray.add("- usedLetters = " + usedLetters + "\n"); // klient output
    if (gameLost) outputToClientArray.add("- SPILLET ER TABT\n"); // klient output
    if (gameWon) outputToClientArray.add("- SPILLET ER VUDNET\n"); // klient output
    outputToClientArray.add("--------------- \n");
  }

  @Override
  public String outputToClient()
  {
    return outputToClientArray.toString();
  }
}
