interface FunctionalInterface {
  void start();
}

class Car {

  public void drive(FunctionalInterface obj) {
    System.out.println("Driving the car");
    obj.start();
  }
}

public class Application {

  public static void main(String[] args) {
    // when we want to pass a block of code to a method
    // or to pass some code to a thread

    // we will compare it with anonymous classes:
    Car car = new Car();
    car.drive(
      new FunctionalInterface() {
        @Override
        public void start() {
          System.out.println("Starting");
        }
      }
    );
    System.err.println(" ");

    // with labda expressions :
    Car car1 = new Car();
    car1.drive(() -> System.out.println("Starting"));

    System.err.println(" ");

    car1.drive(() -> {
      System.out.println("Starting ..");
      System.out.println("Continue driving");
    });
  }
}
