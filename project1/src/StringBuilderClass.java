package project1.src;

public class StringBuilderClass {

  public static void main(String[] args) {
    // official way to concat strings
    String example1 = "Hello! ";
    example1 += "My Name ";
    // we are creating new string and concat another string into it (internal)
    example1 += "is Asmaa1.";
    // until this line we have got 3 strings
    // sure this takes more memory than the stringBuilder
    System.out.println(example1);

    StringBuilder example2 = new StringBuilder();
    example2.append("Hello! ");
    example2.append("My name ");
    example2.append("is Asmaa2. ");
    System.out.println(example2);

    // often we want to get a string out of a stringBuilder
    String text = example2.toString();
    System.out.println(text + "3");

    String name = "Asmaaaaa";
    StringBuilder example3 = new StringBuilder("Hello! ");
    example3.append("My name ").append("is ").append(name);
    System.out.println(example3);
  }
}
