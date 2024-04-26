package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) throws FileNotFoundException {
    // Introduction to exceptions
    File file = new File("example.txt");
    Scanner readFile = new Scanner(file);
    // we did not create example.txt file, so this method will throw an exception for sure

  }
}
