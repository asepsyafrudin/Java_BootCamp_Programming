package co.g2academy.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please enter your Name : ");

        String name ="";
        while(!name.equals("stop")) {
            System.out.println("Please enter your date : ");
            name = br.readLine();
            System.out.println("Data is : " + name);
        }

        br.close();
        isr.close();



    }
}
