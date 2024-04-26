package project3.Example3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    // Introduction to exceptions
    try {
      read();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
    // even when the read method is throwing an exception, we still have to handle thr error in the main
    // if we catch the error in the read method itself, (to handle it) then we dont have to handle it in the main
  }

  public static void read() throws FileNotFoundException {
    File file = new File("example.txt");
    Scanner readFile = new Scanner(file);
  }
}
