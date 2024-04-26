package project2.game;

import java.util.Random;

public class Words {

  private String[] randomWords = {
    "animals",
    "happiness",
    "indefinate",
    "steady",
    "birthday",
    "extreme",
    "rights",
    "properties",
    "ceremony",
    "independence",
    "beneath",
    "information",
    "students",
    "employee",
  };
  private String selectedWord;
  private Random random = new Random();
  private char[] letters;

  public Words() {
    selectedWord = randomWords[random.nextInt(randomWords.length)];
    letters = new char[selectedWord.length()]; // for the letters that the user inputs
  }

  public String toString() {
    StringBuilder word = new StringBuilder();

    for (char letter : letters) {
      word.append(letter == '\u0000' ? '_' : letter);
      word.append(' ');
    }

    return word.toString();
    // String word = ""; // instead of String-> StringBuilder could be better for memory
    // for (char letter : letters) {
    //     if (letter == '\u0000') { // it the letter is equal to null
    //       word += '_';
    //     } else {
    //       word += letter;
    //     }
    //       word += ' ';
    //   }
    // to enhance this code we can do this in one line
    //     if (letter == '\u0000') { // it the letter is equal to null
    //     word.append('_');
    //   } else {
    //     word.append(letter);
    //   }
    // return word;
  }

  public boolean isGuessedRight() {
    for (char letter : letters) {
      if (letter == '\u0000') {
        return false;
      }
    }
    return true;
  }

  public boolean guess(char letter) {
    // in this method we need to add the letters that have been guessted from the player
    // we have to loop into the selectedWord and check if the letter that the user guessed is in the selectedWord
    boolean guessedRight = false;
    for (int i = 0; i < selectedWord.length(); i++) {
      if (letter == selectedWord.charAt(i)) {
        letters[i] = letter;
        guessedRight = true;
      }
    }
    return guessedRight;
  }
}
