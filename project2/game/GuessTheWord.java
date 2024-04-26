package project2.game;

import java.util.Scanner;

public class GuessTheWord {

  private boolean play = true;
  private Words randomWord = new Words();
  private Scanner scanner = new Scanner(System.in);
  private int rounds = 10;
  private char lastRound;

  public void start() {
    do {
      showWord();
      getInput();
      checkInput();
    } while (play);
  }

  public void showWord() {
    System.out.println("You have " + rounds + " tries left.");
    System.out.println(randomWord);
  }

  public void getInput() {
    System.out.println("Enter a letter to guess the word: ");
    String userGuess = scanner.nextLine();
    lastRound = userGuess.charAt(0);
  }

  public void checkInput() {
    boolean isGuessedRoght = randomWord.guess(lastRound);
    if (isGuessedRoght) {
      if (randomWord.isGuessedRight()) {
        System.out.println("Congrats! you won");
        System.out.println("The word is : " + randomWord);
        play = false;
      }
    } else {
      rounds--;

      if (rounds == 0) {
        System.out.println("Game Over!");
        play = false;
      }
    }
  }

  public void end() {
    scanner.close();
  }
}
