package co.g2academy.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        try{
            FileOutputStream fout = new FileOutputStream(
                    "testout.txt");
            fout.write(65);
            String out = "This is the first code to write file";
            fout.write(out.getBytes());
            fout.close();

        } catch (IOException e) {
            System.out.println(e);

        }
       ;
    }
}
