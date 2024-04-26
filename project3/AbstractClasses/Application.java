package project3.AbstractClasses;

public class Application {

  public static void main(String[] args) {
    // Abstract class: is a restricted class that cannot be used to create objects
    // (to access it, it must be inherited from another class).

    Car car = new Car();
    car.setEngine("hybrid");

    Truck truck = new Truck();
    truck.setEngine("electric");
    // Vehicle vehicle = new Vehicle();
    // it is an abstract class, why to create an object of it if you have Car and Truck
  }
}
