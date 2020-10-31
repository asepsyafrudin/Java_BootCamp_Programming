package co.g2academy.basic;

import java.util.Scanner;

public class RantaiException {
    public static void main(String[] args) throws Exception {
        int [] arrayData = {0,1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Data ke : " );
        int indexInput = userInput.nextInt();
        System.out.println("\n Exception Biasa");
        try {
            System.out.println("Data dari Array ke " + indexInput + " Adalah " + arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("\n ini Exception didalam fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.println("Data dari Array ke " + indexInput + " Adalah " + data);
        System.out.println("ini Akhir dari Program");
    }

    private static int ambilDataDariArray (int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }

        return hasil;
    }
}
