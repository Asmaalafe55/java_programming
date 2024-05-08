package project3.Serialization;

public class Vehicle {

  private int serialNumber;
  private String brand;

  public Vehicle(int serialNumber, String brand) {
    this.serialNumber = serialNumber;
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Vehicle [serialNumber=" + serialNumber + ", brand=" + brand + "]";
  }
}
