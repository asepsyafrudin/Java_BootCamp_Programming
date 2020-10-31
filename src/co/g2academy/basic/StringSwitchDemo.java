package co.g2academy.basic;
import java.util.Scanner;

public class StringSwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Input Name of Month : ");
        String month = input.next();
        int monthNumber = getMonth(month);

        System.out.println("The " + month + " is  number " + monthNumber);
    }

    public static int getMonth (String month) {
        int monthNumber = 0;
        if (month == null) {
            return monthNumber;
        }

        switch(month.toLowerCase()) {
            case "januari" :
                monthNumber = 1 ; break;
            case "februari" :
                monthNumber = 2; break;
            case "maret" :
                monthNumber = 3; break;
            case "april" :
                monthNumber = 4; break;
            case "mei" :
                monthNumber = 5; break;
            case "juni" :
                monthNumber = 6; break;
            case "juli" :
                monthNumber = 7; break;
            case "agustus" :
                monthNumber = 8; break;
            case "september" :
                monthNumber = 9; break;
            case "oktober" :
                monthNumber = 10; break;
            case "november" :
                monthNumber = 11; break;
            case "desember" :
                monthNumber = 12; break;
            default :
                System.out.println("Invalid Month");
        }

        return monthNumber;
    }
}
