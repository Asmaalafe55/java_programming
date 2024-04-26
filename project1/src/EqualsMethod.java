package project1.src;

class Laptop {

  private int id;
  private String brand;

  public Laptop(int id, String brand) {
    this.id = id;
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Laptop [id=" + id + ", brand=" + brand + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Laptop other = (Laptop) obj;
    if (id != other.id) return false;
    if (brand == null) {
      if (other.brand != null) return false;
    } else if (!brand.equals(other.brand)) return false;
    return true;
  }
}

public class EqualsMethod {

  public static void main(String[] args) {
    Laptop laptop1 = new Laptop(250, "Apple");
    Laptop laptop2 = new Laptop(90, "Dell");
    Laptop laptop3 = new Laptop(90, "Dell");

    System.out.println(laptop1 == laptop2); // it checks wether two objects are pointing at the same object or not in terms of memory
    System.out.println(laptop1.equals(laptop2));
    System.out.println(laptop3.equals(laptop2));
  }
}
