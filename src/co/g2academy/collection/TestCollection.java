package co.g2academy.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //cara panjang
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }


        System.out.println("=====================");
        //cara cepat enhanced loop
        for(String element : list) {
            System.out.println(element);
        }

        System.out.println("=====================");
        //iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }




    }
}
