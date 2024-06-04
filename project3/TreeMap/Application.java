package project3.TreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

// import java.util.TreeMap;

public class Application {

  public static void main(String[] args) {
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<
      Integer,
      String
    >();
    // TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
    // it is the same syntax like the hashMap

    sortedMaps(linkedHashMap);
  }

  public static void sortedMaps(Map<Integer, String> map) {
    map.put(232, "ice cream");
    map.put(434, "pie");
    map.put(456, "pizza");
    map.put(567, "hot dog");

    for (Integer numbers : map.keySet()) {
      String food = map.get(numbers);
      System.out.println(numbers + " :" + food);
    }
  }
}
