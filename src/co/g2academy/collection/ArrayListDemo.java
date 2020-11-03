package co.g2academy.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Declaring the ArrayList with initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        //appending new element at the end of the list
        for(int i = 1 ; i<=5 ; i++) {
            al.add(i);
        }

        //Display ArrayList (Printing the Element)
        System.out.println(al);

        //remove element at index no 3
        al.remove(3);

        //Display ArrayList after Deletion
        System.out.println(al);

        //printing element one by one
        for(int i = 0 ; i<al.size(); i ++) {
            System.out.print(al.get(i) + " ");
        }


    }
}
