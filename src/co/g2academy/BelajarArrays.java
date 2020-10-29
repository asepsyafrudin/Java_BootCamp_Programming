package co.g2academy;

import java.util.Arrays;

public class BelajarArrays {
    public static void main(String[] args) {
        int[] angka1 = {1,2,3,4,5};
        
        //merubah array menjadi string
        System.out.println("\nMerubah Array Menjadi String\n===============");
        printArray(angka1);

        //mengkopy array
        System.out.println("\nMengkopy array\n===============");
        int[] angka2 = new int[5];
        printArray(angka1);
        printArray(angka2);
        System.out.println("Mengkopy dengan loop");

        for(int i= 0 ; i < angka1.length; i++){
            angka2 [i] = angka1 [i];
        }
        printArray(angka1);
        System.out.println(angka1);
        printArray(angka2);
        System.out.println(angka2);

        System.out.println("\nMengkopy dengan Copyof");
        int[] angka3 = Arrays.copyOf(angka1, 3);
        printArray(angka3);

        System.out.println("\nMengkopy dengan copyRange");
        int[] angka4 = Arrays.copyOfRange(angka1, 2, 5); // index ke 2 sampai index ke 4 yang akan di print. index ke 5 tidak akan di print
        printArray(angka4);

        System.out.println("\nFill Array\n==============");
        int[] angka5 = new int[20];
        Arrays.fill(angka5, 5);
        printArray(angka5);

        //komparasi array 
        System.out.println("\nKomparasi Array\n===============");
        int[] angka6 = {1,3,3,4,5};
        int[] angka7 = {1,2,3,4,5};

        System.out.println(Arrays.equals(angka6, angka7)); //print menyamakan array 6 dan array 7

        if (Arrays.equals(angka6, angka7)) {
            System.out.println("Array ini Sama");
        } else {
            System.out.println("Array ini Beda"); 
        }

        System.out.println("\nMengecek Mana Array Yang Lebih Besar"); // Cek Mana yang lebih besar
        System.out.println(Arrays.compare(angka6,angka7));

        System.out.println("\nMengecek mana index yang berbeda"); // Cek index Mana Yang berbeda
        System.out.println(Arrays.mismatch(angka6, angka7));


        //soring data
        int [] angka8 = {1,3,5,2,5,7,8,1};  
        Arrays.sort(angka8);  
        printArray(angka8);

        //search array 
        System.out.println("\nSearch Array");
        int angka = 3;
        int posisi = Arrays.binarySearch(angka8, angka);
        System.out.println("angka " + angka + " ada di index " + posisi);


        //tugas sort membalikkan urutan array dari terbesar ke yang terkecil
        int [] angka9 = new int[8];
           for (int j = 0, i = 7; j < 8 ; j++, i--) {
               angka9[i] = angka8[j];  
           }
    
        System.out.println("Membalik sort array");
        printArray(angka8);
        printArray(angka9);

        //membuat array baru yang menjumlahkan dua buah array
           //cara 1 :
        System.out.println("Menjumlahkan dua buah array");
        
        int [] angka10 = tambahArray(angka8, angka9);
        printArray(angka10);
        
        //menggabungkan dua buah array
        int[] angka11 = gabungArray(angka9, angka10);

        System.out.println(Arrays.toString(angka11));
        
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 4; j++) {
                if(i<=j) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= 4; i++) { 
            for (int j = 1; j <= 4; j++) {
                if(i == 1 || i==4 || j==1 || j==4 ) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        //Belajar Array Multidimensi
        System.out.println("Belajar Array Multidimensi");

        //cara buat array 2 dimensi
          int[][] arrayAngka1 = {
              {1,2}, {3,4}
            };

        print2DArray(arrayAngka1);
                    
        int [][] arrayAngka2 = new int[5][4];
        print2DArray(arrayAngka2);

        //looping array secara manual : 
        System.out.println("Looping Secara Manual");
        for (int i = 0; i < arrayAngka2.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayAngka2[i].length; j++) {
                System.out.print(arrayAngka2[i][j] + ",");  
            }
            System.out.print("]\n");
            
        }

        System.out.println("Looping dengan ForEach");
        for (int[] baris : arrayAngka2) {
            System.out.print("[");
            for (int elemen : baris ){
                System.out.print(elemen + ",");                
            }
            System.out.print("]\n");
        }






    }
    
    private static void printArray( int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }
    
    private static int[] tambahArray(int[] array1,  int[] array2) {
        int [] arrayHasil = new int[array1.length];
        for (int j=0 ; j < array1.length ; j++) {
            arrayHasil[j] = array1[j]+ array2[j];
        }
        return arrayHasil;
        
    }
    
    private static int[] gabungArray(int[] array1 , int[] array2){
        int[] arrayHasil= new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayHasil[i] = array1[i];
        }
    
        for (int i = 0; i < array2.length; i++) {
            arrayHasil[i+array2.length] = array2[i];
        }
        return arrayHasil;
    }

    private static void print2DArray (int [] [] array1) {
       for (int i = 0; i < array1.length; i++) {
           System.out.println(Arrays.toString(array1[i]));
           
       }

    }
}