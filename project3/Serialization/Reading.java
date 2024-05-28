package project3.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reading {

  public static void main(String[] args) {
    System.out.println("Reading ...");

    try (FileInputStream fileInput = new FileInputStream("vehicle.data")) {
      ObjectInputStream objectInput = new ObjectInputStream(fileInput);
      Vehicle vehicle1 = (Vehicle) objectInput.readObject();
      Vehicle vehicle2 = (Vehicle) objectInput.readObject();

      Vehicle[] vehicle = (Vehicle[]) objectInput.readObject();
      ArrayList<Vehicle> vehicleList = (ArrayList<
          Vehicle
        >) objectInput.readObject();

      for (Vehicle myVehicle : vehicle) {
        System.out.println(myVehicle);
      }
      for (Vehicle myVehicle : vehicleList) {
        System.out.println(myVehicle);
      }

      int value = objectInput.readInt();
      for (int n = 0; n < value; n++) {
        Vehicle vehicles = (Vehicle) objectInput.readObject();
        System.out.println(vehicles);
      }

      System.out.println(vehicle1);
      System.out.println(vehicle2);

      objectInput.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
