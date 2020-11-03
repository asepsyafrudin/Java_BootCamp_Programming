package co.g2academy.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Creating Tree Set and adding the element
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Asep");
        ts.add("Syafrudin");
        ts.add("Putri");
        ts.add("Asyifa");
        ts.add("Rahman");
        ts.add("Rezvan");

        System.out.println(ts);

        for(String value : ts) {
            System.out.print(value + ",");
        }



    }
}
