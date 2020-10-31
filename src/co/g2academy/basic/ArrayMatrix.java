package co.g2academy.basic;

import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {
        int[][] array2D = {
            {1,2,3},
            {1,2,3}
        };
        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);

        char[] arrayChar1= {'a','b','c'};
        char[] arrayChar2 = {'d','e'}; 

        char[][] charGabung = {
            arrayChar1, 
            arrayChar2
        };
        
        System.out.println(arrayChar1);
        System.out.println(charGabung);
        System.out.println(Integer.toHexString(System.identityHashCode(charGabung[0])));
        System.out.println(Integer.toHexString(System.identityHashCode(charGabung[1])));
        System.out.println(Arrays.toString(charGabung));


        //menjumlahkan dua buah matrix array. 

        int [][] arrayMatrix1 = {
            {1,5,1},
            {2,4,5}
        };

        int [][] arrayMatrix2 = {
            {3,4,6},
            {7,7,8}
        };

        System.out.println("Hasil Penjumlahan Matrix : ");
        printArray2D(arrayMatrix1);
        System.out.println("+");
        printArray2D(arrayMatrix2);
        System.out.println("=");
        int[][] hasil1 = penjumlahanArray2D(arrayMatrix1, arrayMatrix2);
        printArray2D(hasil1);

        int [][] arrayMatrix3 = {
            {1,5,1},
            {2,3,5}
            
        };

        int [][] arrayMatrix4 = {
            {3,4,6},
            {7,7,8},
            {2,3,5}
            
        };

        int[][] hasil2 = penjumlahanArray2D(arrayMatrix3, arrayMatrix4);
        printArray2D(hasil2);


        //perkalian matrix :
         int[][] hasil3 = perkalianArray2D(arrayMatrix3, arrayMatrix4);
         printArray2D(hasil3);
    }
    



    public static void printArray2D(int[][] array1) {
        int row = array1.length;
        int col = array1[0].length;
        for (int i = 0; i < row; i++) {
            System.out.print("[");
            for (int j = 0; j < col; j++) {
                System.out.print(array1[i][j]);
                if (j < col -1 ) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
              System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static int[][] penjumlahanArray2D(int[][] array1, int[][] array2){
        int row1 = array1.length;
        int col1 = array1[0].length;
        int row2 = array2.length;
        int col2 = array2[0].length;
        int[][] hasil = new int[row1][col1];
        if (row1 == row2 && col1== col2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                     hasil[i][j]= array1[i][j] + array2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah Colom dan Baris Tidak Sama");
        }
        return hasil; 
        
    }

    public static int[][] perkalianArray2D(int[][] array1, int[][] array2) {
        int row1 = array1.length;
        int col1 = array1[0].length;
        // int row2 = array2.length;
        int col2 = array2[0].length;

        int[][] hasilPerkalian = new int[row1][col2];
        int buffer;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                buffer = 0;
                for (int k = 0; k < col1; k++) {
                    buffer+= array1[i][k] * array2[k][j];
                }
                hasilPerkalian[i][j] = buffer;
            }
            
        }
        return hasilPerkalian;

    }
}
