package project1.src;

class Car1 {

  public static final int speed = 150;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRevenueData() {
    String data = "Revenue: " + calculateRevenue();
    return data;
  }

  private int calculateRevenue() {
    return 12000;
  }
}

public class Encapsulation {

  public static void main(String[] args) {}
}
