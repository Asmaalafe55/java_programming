interface FunctionalInterface {
  int start(int value, int value1);
}

interface AnotherFunctionalInterface {
  int start(String value);
}

class Car {

  public void drive(FunctionalInterface obj) {
    System.out.println("Driving the car");
    int number = obj.start(17, 25);
    System.out.println("Returning the number: " + number);
  }
  //   public void drive(AnotherFunctionalInterface obj) {
  //     System.out.println("Driving the car");
  //     int number = obj.start("Hello there!");
  //     System.out.println("Returning the number: " + number);
  //   }
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
        public int start(int value, int value1) {
          System.out.println("Starting");
          return value;
        }
      }
    );
    System.err.println(" ");

    // with labda expressions :
    Car car1 = new Car();
    // car1.drive(() -> System.out.println("Starting"));

    System.err.println(" ");

    car1.drive((int value, int value1) -> {
      System.out.println("Starting ..");
      System.out.println("Continue driving");
      return value * value1;
    });
    // Lambda expressions are always assosiated with interfaces that have a single method

    System.err.println(" ");
    // if we want to return value from the block that we want to execute
    // if that, we need to modify the interface, we replace void with the type we want to return

    // a valid single experssion , all it does is to return 20
    // car1.drive(value -> 20 * value);
    // then we added a parameter to the start method
    // for example intger
  }
}
