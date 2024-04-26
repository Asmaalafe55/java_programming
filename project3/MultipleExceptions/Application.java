package project3.MultipleExceptions;

import java.text.ParseException;
import javax.imageio.IIOException;

public class Application {

  public static void main(String[] args) {
    // here we will handle the exceptions as we said before

    MultipleExceptions me = new MultipleExceptions();

    // try {
    //   me.start();
    // } catch (IIOException e) {
    //   e.printStackTrace();
    // } catch (ParseException e) {
    //   System.out.println("Incorrect Format");
    // }

    // try {
    //   me.start();
    // } catch (IIOException | ParseException e) {
    //   e.printStackTrace();
    // }

    // polemorphism
    try {
      me.start();
    } catch (Exception e) {
      // it catchs any type of exceptions
      e.printStackTrace();
    }
  }
}
