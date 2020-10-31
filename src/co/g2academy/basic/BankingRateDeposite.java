package co.g2academy.basic;

import java.util.Scanner;

public class BankingRateDeposite {
    public static void main(String[] args) {
        int initialTabungan;
        float RATE_BUNGA = 0.02f;
        float INCREAMENT_RATE = 0.01f;
        
        Scanner inputTabungan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tabungan Saat Ini >> ");
        initialTabungan = inputTabungan.nextInt();

        for (int i = 1; i <= 4 ; i++) {
            int tabungan;
            tabungan = initialTabungan;
            System.out.println("\nTabungan Awal : " + tabungan + " dengan rate bunga " + RATE_BUNGA);
            for (int j = 1; j <=5 ; j++) {
                tabungan = (int)(tabungan + tabungan*RATE_BUNGA);
                System.out.println ("Simulasi pada tahun ke " + j + " Tabungan Anda Menjadi " + tabungan);
            }
            RATE_BUNGA = RATE_BUNGA + INCREAMENT_RATE;
        }

    }
}
