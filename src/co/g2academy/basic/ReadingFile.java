package co.g2academy.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        System.out.println("File Input Bernilai : " + fileInput);

        //mmebuka file
        fileInput = new FileInputStream("input.txt");
        System.out.println("File Input Bernilai : " + fileInput);

        //membaca file
        int data = fileInput.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileInput.read();
        }

        //menutup file
        fileInput.close();

        //scenario pembukaan file
        try {
            //membuka file
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            //membaca file
            int buffer = fileInput.read();

            //menulis file
            fileOutput.write(buffer);

            // membaca file
            buffer = fileInput.read();

            //menulis file
            fileOutput.write(buffer);

        } finally {
            if (fileInput != null) {
                fileInput.close();

                if (fileOutput != null) {
                    fileInput.close();
                }

            }


        }
    }
}
