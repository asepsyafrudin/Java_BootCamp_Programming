package co.g2academy.io;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("testout2.txt");

            int i = fr.read();
            while (i!=-1) {
                System.out.print((char)i);
                i = fr.read();
            }

        } catch(Exception e) {
            System.out.println(e);
        }



    }
}
