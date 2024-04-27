package project3.PassingByValue;

public class Application {

  public static void main(String[] args) {
    Application app = new Application();
    Cat cat = new Cat("Luna");
    int number = 10;
    app.display(number);
    app.display(cat);
  }

  public void display(int number) {
    System.out.println("The number = " + number);
  }

  public void display(Cat cat) {
    // method overloading : having two or more methods (or functions) in a class with the same name and different arguments (or parameters)
    System.out.println(cat);
    cat.setName("Lossi");
    System.out.println(cat);
    cat = new Cat("Sunshine");
    System.out.println(cat);
  }
}
