package project3.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

// serialization means turnning an object into bitstream
// and if you deserialize an object, it means taking bitstream and turning it back into an object
// we will do serialization into files

public class Writing {

  public static void main(String[] args) {
    System.out.println("Writing objects .. ");
    Vehicle car = new Vehicle(329, "Toyota");
    Vehicle truck = new Vehicle(456, "Ford");

    Vehicle[] vehicle = {
      new Vehicle(1, "Ford"),
      new Vehicle(2, "Toyota"),
      new Vehicle(3, "Fiat"),
    };

    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>(
      Arrays.asList(vehicle)
    );

    System.out.println(car);
    System.out.println(truck);

    try (FileOutputStream fileOutput = new FileOutputStream("vehicle.data")) {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(
        fileOutput
      );
      objectOutputStream.writeObject(car); // serialize the object to file / writing
      objectOutputStream.writeObject(truck);
      objectOutputStream.writeObject(vehicle);
      objectOutputStream.writeObject(vehicleList);

      objectOutputStream.writeInt(vehicleList.size());
      for (Vehicle vehicles : vehicleList) {
        objectOutputStream.writeObject(vehicles);
      }

      objectOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
