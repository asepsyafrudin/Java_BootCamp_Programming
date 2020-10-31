package co.g2academy.basic;

public class Pattern {

    public static void main(String[] args) {
	// write your code here
        int col = 5 ;
        int row = 5 ;

        for (int i = 1 ; i <= row ;  ++i) {
            for (int j = 1 ; j <= i ; ++j ) {
                System.out.print("* ") ;
            }
            System.out.print("\n");
        }

        System.out.println("\n======================");
        int col2 = 5 ;
        int row2 = 5 ;

        for (int i = 1 ; i <= row2 ;  ++i) {
            for (int j = 1 ; j <= i ; ++j ) {
                System.out.print(j +" ") ;
            }
            System.out.print("\n");
        }
        System.out.println("\n======================");

        int col3 = 5 ;
        int row3 = 5 ;
        char [] array1 = {'A' , 'B' , 'C' , 'D', 'E'};

        for (int i = 0 ; i < row2 ;  ++i) {
            for (int j = 0 ; j <= i ; ++j ) {
                System.out.print(array1[i] + " ") ;
            }
            System.out.print("\n");
        }

        System.out.println("\n======================");
        int col4 = 5;
        int row4 = 5;

        for (int i = 0 ; i<row4 ; ++i) {
            for (int j = row4 ; j>i ;  --j) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n======================");
        int col5 = 5 ;
        int row5 = 5;
        for (int i = row5 ; i>=1 ; i--) {
            for (int j = 1 ; j<=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n======================");

        int rows = 5, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        System.out.println("\n======================");
        int rows7 = 5, A = 0, count = 0, count1 = 0;

        for(int i = 1; i <= rows7; ++i) {
            for(int space = 1; space <= rows7 - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while(A != 2 * i - 1) {
                if (count <= rows7 - 1) {
                    System.out.print((i + A) + " ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i + A - 2 * count1) + " ");
                }

                ++A;
            }
            count1 = count = A = 0;

            System.out.println();
        }

        System.out.println("\n======================");


    }
}
