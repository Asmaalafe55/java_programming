package project3.AbstractClasses;

public abstract class Vehicle {

  private String engine;

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  // if we want to force all the child classes to implement the drive method, then it has to be abstract method
  public abstract void drive();
  // it is exactly like the decliration in the interfaces
}
