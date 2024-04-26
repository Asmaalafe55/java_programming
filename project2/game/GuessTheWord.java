package project2.game;

public class GuessTheWord {

  private boolean play = true;
  private Words randomWord = new Words();

  public void start() {
    do {
      showWord();
      getInput();
      checkInput();
    } while (play);
  }

  public void showWord() {
    System.out.println(randomWord);
    play = false;
  }

  public void getInput() {
    System.out.println("Get Input");
  }

  public void checkInput() {
    System.out.println("Check Input");
  }
}
