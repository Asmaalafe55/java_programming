package project2.game;

import java.util.Scanner;

public class GuessTheWord {

  private boolean play = true;
  private Words randomWord = new Words();
  private Scanner scanner = new Scanner(System.in);

  public void start() {
    do {
      showWord();
      getInput();
      checkInput();
    } while (play);
  }

  public void showWord() {
    System.out.println(randomWord);
  }

  public void getInput() {
    System.out.println("Enter a letter to guess the word: ");
    String userGuess = scanner.nextLine();
    randomWord.guess(userGuess.charAt(0));
    System.out.println("Get Input");
  }

  public void checkInput() {
    System.out.println("Check Input");
  }

  public void end() {
    scanner.close();
  }
}
