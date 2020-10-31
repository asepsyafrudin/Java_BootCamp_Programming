package co.g2academy.basic;


public class BreakDemo {
    public static void main(String[] args) {
        int [] array = {32,1,5,6,2,5,7,2,1,1000,1222,12,56};

        int i = 0 ;
        int searchFor = 5;
        boolean found = false;
        for(i = 0 ; i < array.length ; i++) {
            if( array [i] == searchFor ) {
                found = true;
                break;
            }
        }

        if(found = true) {
            System.out.println("Found " + searchFor + " on the index number " + i);
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}
