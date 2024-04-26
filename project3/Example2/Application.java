package project3.Example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    // Introduction to exceptions
    File file = new File("example.txt");
    try {
      Scanner readFile = new Scanner(file);
      // if its trying to scan the file and there is an error then it goes to the catch statment
    } catch (FileNotFoundException e) {
      // the catch statment will throw the error (exception)
      e.printStackTrace();
      // we can add any other message here like:
      System.out.println("File not found: " + file.toString());
    }
  }
}
// the diffirence between example1 and example2 is that we are not throwing an exception in tha main method
// we are finding the error and handeling it (in some cases the code after the error will run regularly)
