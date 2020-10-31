package co.g2academy.basic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryExceptionDemo {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Array Ke Berapa yang ingin kamu lihat : ");
        int index = userInput.nextInt();

        try {
            System.out.println("Array pada Index ke : " + index + " adalah " + array[index]);
        } catch (Exception e) {
            System.out.println(e);
        }

        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } finally {
            System.out.println("Final");
        }


        System.out.println("Program Telah Berakhir!! Terimakasih !!");
    }
}
