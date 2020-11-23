package co.g2academy.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("testout2.txt");
            fw.write("This is code to write string to file row 1");
            fw.write("\nThis is code to write string to file row 2");
            fw.flush();

        }catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
