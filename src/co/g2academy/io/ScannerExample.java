package co.g2academy.io;

import java.io.FileWriter;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        try{
            Scanner inputUser = new Scanner(System.in);
            FileWriter outputUser = new FileWriter("testout3.txt");
            System.out.print("Please Enter Your Name : ");
            String name = inputUser.nextLine();
            outputUser.write("My Name is : " + name);
            System.out.print("Please Enter Your Age : ");
            Integer age = inputUser.nextInt();
            outputUser.write("\nMy Age is : " + age.toString());
            outputUser.flush();

            System.out.println(" Your name is : " + name);
            System.out.println("Your age is : " + age);
            System.out.println("Program Finished , File Already Made");

        }catch(Exception e) {
            System.out.println(e);
        }

    }
}
