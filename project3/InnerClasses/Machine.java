package project3.InnerClasses;

public class Machine {

  private int id;

  // non static inner clasess or nested classes
  class ArtificialIntelligence {

    // this calss have access to the data in the machine class
    public void activate() {
      System.out.println("Machine " + id + " is activated.");
    }
  }

  static class Tire {

    public void repair() {
      // System.out.println("Tires are repaired" + id);
      // it will give an  error couse it is a static class
      // unless we gave an id static
      // this inner static class can be used if we dont want it to use the data of the machine class
      // but if we want to use in the outer class (Application), then we have to declare it there (see lines 9-10 in Application file)
      System.out.println("Tires are repaired");
    }
  }

  public Machine(int id) {
    this.id = id;
  }

  public void run() {
    System.err.println("Runinng : " + id);
    ArtificialIntelligence ai = new ArtificialIntelligence();
    ai.activate();
    // another thing is to declare classes in a methods
    final String type = "Electric";

    class Test {

      // it have acces to id
      // it have axxes to any stuff we declare in the method
      public void example() {
        System.out.println("id: " + id);
        System.out.println("Type: " + type);
      }
    }

    // we can create instance of this class
    Test test = new Test();
    test.example();
    // its not usual to do but in case
  }
  // note : anonymous classes are a type of inner classes
  // the only role is : that we have one public class in the same file, and its name should be the name of the file

}
