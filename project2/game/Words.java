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
    // String word = ""; // instead of String-> StringBuilder could be better for memory
    StringBuilder word = new StringBuilder();
    for (char letter : letters) {
      if (letter == '\u0000') { // it the letter is equal to null
        // word += '_';
        word.append('_');
      } else {
        // word += letter;
        word.append(letter);
      }
      //   word += ' ';
      word.append(' ');
    }
    return word.toString();
  }
}
