package co.g2academy.basic;

import java.util.Scanner;


public class GetUserInfo {
    public static void main(String[] args) {
       String name;
       int age;
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleae Enter Your Age >>");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please Enter Your Name >> ");
        name = scanner.nextLine();
        System.out.println("Hai Selamat Datang " + name);
        System.out.println("Umur Saya Adalah : " + age + " Tahun");
        scanner.close();

    }
}
