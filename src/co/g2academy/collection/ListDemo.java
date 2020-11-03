package co.g2academy.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        //creating arraylist
        List<Integer> arr1 = new ArrayList<Integer>();

        arr1.add(0, 1);
        arr1.add(1, 2);

        System.out.println(arr1);
        //creating another list
        List<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        //will add list arr2 from index 1 to arr1
        arr1.addAll(1, arr2);
        System.out.println(arr1);

        //remove element from index 1
        arr1.remove(1);
        System.out.println(arr1);

        //print element at index no 3
        System.out.println(arr1.get(3));

        //replace index 0 with 5
        arr1.set(0,5);
        System.out.println(arr1);


        //size of array
        int n = 5;
        //Declaring ArrayList
        List<Integer> arr3 = new ArrayList<Integer>(n);

        //Appending the new Element
        for( int i = 1 ; i<n; i++) {
            arr3.add(i);
        }

        //printing elements
        System.out.println(arr3);

        //remove element
        arr3.remove(3);

        //Display Deleting the list after deletion
        System.out.println(arr3);

        //printing one by one
      for(int i = 0 ; i<arr3.size(); i ++) {
          System.out.print(arr3.get(i) + " ");
      }

      //declaring new ArrayList

        List<Integer> arr4 = new ArrayList<Integer>();
          arr4.add(5);
          arr4.add(6);
          arr4.add(2);
          arr4.add(12);
          arr4.add(7);

        System.out.println("\nBefore Sort");
        System.out.println(arr4);

        System.out.println("After Sort");
        Collections.sort(arr4);
        System.out.println(arr4);

        System.out.println("After Reverse");
        Collections.reverse(arr4);
        System.out.println(arr4);








    }
}
