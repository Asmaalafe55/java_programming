package project3.RuntimeException;

public class Application {

  public static void main(String[] args) {
    // we have already seen the check exceptions which we have to handle them
    // in this example we will use the exceptions that we dont have to handle (uncheck exception / runtime exception)
    int value = 11;
    value = value / 0;
    // runtime exception will not force us to handle them

    String empty = null;
    System.out.println(empty.length());
    // this will throw NullPointerException couse the empty string is pointing for no where?!

    String[] numbers = { "one", "two", "three" };
    System.out.println(numbers[3]);
    // since the array is starting from index 0, there is no index 3 in the numbers array
    // and then we will get the ArrayIndexOutOfBoundsException
  }
}
