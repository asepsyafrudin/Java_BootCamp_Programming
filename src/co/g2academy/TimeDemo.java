package co.g2academy;
import java.time.LocalDateTime;

public class TimeDemo {
    public static void main(String[] args) {
        int previousSecond = 0;
                for( ; ; ) {
                    LocalDateTime currentTime = LocalDateTime.now();
                    int second = currentTime.getSecond();
                    if( second != previousSecond) {
                        int hour = currentTime.getHour();
                        int minutes = currentTime.getMinute();
                        second = currentTime.getSecond();

                        System.out.println(hour +" : " + minutes + " : " + second);
                        previousSecond = second;
                    }
                }
    }
}
