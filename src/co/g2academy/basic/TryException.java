package co.g2academy.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryException {
    public static void main(String[] args){
        int [] array  = {1,2,3,4} ;
        FileInputStream fileInput = null;
        Scanner userInput = new Scanner(System.in);
        System.out.print(" Nilai array ke : ");
        int index = userInput.nextInt();

        //exceotion handling (try , catch , finally)
        System.out.println("Handling out of bound");
        try {
            System.out.println("Index ke-" + index + " ,adalah " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }

        // runtime eror jika file tidak ada
        System.out.println("Handling IO not Found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }


        //Menggabungkan dua Exception
        System.out.println("Menggabungkan dua buah Exception");
        try {
            System.out.println("Index ke-" + index + " ,adalah " + array[index]);
            fileInput = new FileInputStream("input.txt");
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Input yang anda masukkan tidak sesuai dengan jumlah array");
        }catch (IOException e ) {
            System.err.println("File tidak ditemukan");
        }

        // finally
        System.out.println("Menambahkan Finally");
        try {
            System.out.println("Index ke-" + index + " ,adalah " + array[index]);
            fileInput = new FileInputStream("input.txt");
        }  catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
            System.err.println("Input yang anda masukkan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("Finally");
        }


        System.out.println("Akhir dari Program");



    }
}
