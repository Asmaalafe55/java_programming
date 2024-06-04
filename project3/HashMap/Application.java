package project3.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    // HashMap type looks like: <key, value>
    map.put(3, "dog");
    map.put(5, "cat");
    map.put(1, "tiger");
    map.put(6, "lion");

    String animal = map.get(3);

    System.out.println(animal);
    // if we are trying to get an value that is not in the map, the value that will be returned is null
    System.out.println(map.get(55));
    // this will return null

    // to iterate into a hashMap
    for (Map.Entry<Integer, String> myAnimals : map.entrySet()) {
      int key = myAnimals.getKey();
      String value = myAnimals.getValue();
      System.out.println(key + ": " + value);
      // hashMap does not keep its order
    }
  }
}
