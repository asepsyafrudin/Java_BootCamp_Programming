package co.g2academy;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Asep");
        display(names , "add Names");
        names.add("Septiani");
        display(names , "Add Names");
        names.add("Putri Asyifa Rahman");
        display(names , "Add Names");
        names.add(2, "Muhammad Rezvan Adam");
        display(names, " Add Name at Index Number 2");
        names.remove(2);
        display(names, "remove name at index no 2");
        names.set(1 , "Mama");
        display(names, "Set name 1 to be Mama");

    }

    public static void display(ArrayList<String> names , String message) {
        System.out.println("\n\nThe Size Of The List is : " + names.size());
        System.out.println("This is for :  " + message );
        for(int i = 0 ; i<names.size() ; i++) {
            System.out.println("Position " + i + " Name : "  +names.get(i));
        }
    }
}
