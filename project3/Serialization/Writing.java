package project3.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writing {

  public static void main(String[] args) {
    System.out.println("Writing objects .. ");
    Vehicle car = new Vehicle(329, "Toyota");
    Vehicle truck = new Vehicle(456, "Ford");

    System.out.println(car);
    System.out.println(truck);

    try (FileOutputStream fileOutput = new FileOutputStream("vehicle.data")) {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(
        fileOutput
      );
      objectOutputStream.writeObject(car);
      objectOutputStream.writeObject(truck);

      objectOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
