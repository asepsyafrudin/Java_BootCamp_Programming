package co.g2academy.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Please Enter Your Searching Words : ");
            Pattern pattern = Pattern.compile(scan.nextLine());
            System.out.print("Plese Enter The Sentance : ");
            Matcher matcher = pattern.matcher(scan.nextLine());
            boolean found = false;


            while(matcher.find()) {
                System.out.println("The Searching Word " + matcher.group() + " is start index from " + matcher.start() +
                        " and ending in index " + matcher.end());
                found = true;
            }

            if(!found) {
                System.out.println("The Words is not found anywhere");
            }
        }
    }
}
