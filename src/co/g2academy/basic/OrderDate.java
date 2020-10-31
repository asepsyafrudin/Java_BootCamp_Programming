package co.g2academy.basic;

import java.time.LocalDate;
import java.util.Scanner;

public class OrderDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate orderDate;
        int month, day, year;
        final int WEEKS_FOR_DELIVERY = 2;
        System.out.print("Enter Order Day >> ");
        day = input.nextInt();
        System.out.print("Enter Order Month>> ");
        month = input.nextInt();
        System.out.print("Enter Order Year>> ");
        year = input.nextInt();
        orderDate = LocalDate.of(year,month,day);
        System.out.println("=====================");
        System.out.println("your Order Date is = " + orderDate);
        System.out.println("Your Delivery Order is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));

    }
}
