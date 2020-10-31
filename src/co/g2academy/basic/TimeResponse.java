package co.g2academy.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeResponse {
    public static void main (String[] args) {
        LocalDate today , thousandYears;
        LocalDateTime time1;
        LocalDateTime time2;
        int second1, second2, difference , totalDaysOfMonth, dateToday, remainingDaysMonth;

        today = LocalDate.now();
        totalDaysOfMonth = today.lengthOfMonth();
        dateToday = today.getDayOfMonth();
        remainingDaysMonth = totalDaysOfMonth - dateToday;
        thousandYears = today.plusDays(1000);

        time1 = LocalDateTime.now();
        second1 = time1.getSecond();

        System.out.println("Length of Month is " + totalDaysOfMonth);
        System.out.println("Date of today is " + dateToday);
        System.out.println("We still have remaining " + remainingDaysMonth + " days until next Month");
        System.out.println("Today is " + today);
        System.out.println("1000 Years after Today is " + thousandYears);

        int previousSecond =0;
        for(;;) {
            time2 = LocalDateTime.now();
            int nowSecond = time2.getSecond();
            if(nowSecond != previousSecond) {
                System.out.println(time2.getHour() + ":" + time1.getMinute() + ":" + nowSecond);
                previousSecond = nowSecond;
            }

        }


//        JOptionPane.showConfirmDialog(null , "Is Stealing ever Justified? ");
//
//        time2 = LocalDateTime.now();
//        second2 = time2.getSecond();
//
//        difference = second2 - second1;
//        JOptionPane.showMessageDialog(null , "End Second : " + second2 +
//                "\nStart Second : " + second1 +"\nYou Need " + difference + " Second for you to answer");



    }
}
