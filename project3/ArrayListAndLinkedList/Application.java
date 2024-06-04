package project3.ArrayListAndLinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

  public static void main(String[] args) {
    ArrayList<Integer> values = new ArrayList<Integer>();
    // if we dont specify the size of the arraylist, the default is 10
    values.add(20);
    values.add(60);
    values.add(200);
    System.out.println(values.get(2));

    for (int i = 0; i < values.size(); i++) {
      System.out.println(values.get(i));
    }

    // to remove from a list :
    values.remove(0);

    for (Integer myValue : values) {
      System.out.println(myValue);
    }
    // ArrayList is made out of arrays, it manages arrays internally, it look like : [0][1][2][3]
    // moving back and forth is easy, and getting an item from the list is easy, if we add an
    //  item to the array that it is out of range, it creates another array and copy the items to it

    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    // in LinkedList it is slower to get an item from the LinkedList than the ArrayList, couse we have to start from the first item
    // however, it is faster to add or remove any item to the LinkedList in the middle of it
    // it look like : [0]->[1]->[2]->[3]
  }
}
