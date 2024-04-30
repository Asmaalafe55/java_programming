package project3.Enums;

public class Application {

  public static final int RED = 1;
  public static final int YELLOW = 2;
  public static final int BLUE = 3;

  public static void main(String[] args) {
    int color = RED;
    switch (color) {
      case YELLOW:
        System.out.println("YELLOW");
        break;
      case RED:
        System.out.println("RED");
        break;
    }

    Color color1 = Color.RED1;

    switch (color1) {
      case BLUE1:
        System.out.println("BLUE1");
        break;
      case RED1:
        System.out.println("RED1");
        break;
      case YELLOW1:
        System.out.println("YELLOW1");

        break;
      default:
        break;
    }

    System.out.println(Color.YELLOW1);
    System.out.println(Color.YELLOW1.getClass());
    System.out.println(Color.YELLOW1 instanceof Color);

    System.out.println(Color.BLUE1.getMeaning());

    System.out.println("Enum meaning as a string is: " + Color.RED1.name());

    Color color2 = Color.RED1.valueOf("RED1");
    System.out.println(color2);
  }
}
