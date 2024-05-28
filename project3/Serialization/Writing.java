package project3.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// serialization means turnning an object into bitstream
// and if you deserialize an object, it means taking bitstream and turning it back into an object
// we will do serialization into files

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
      objectOutputStream.writeObject(car); // serialize the object to file / writing
      objectOutputStream.writeObject(truck);

      objectOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
