package co.g2academy;
import java.util.*;

public class BubbleSortDemo {
    public static void main(String[] args){
        int[] someNums = new int[5];
        int comparisonToMake = someNums.length -1;
        Scanner keyboard = new Scanner(System.in);
        int temp;

        for(int i = 0 ; i<someNums.length ;  ++i) {
            System.out.print("Enter Number " + (i+1) + " >> ");
            someNums[i] = keyboard.nextInt();
        }
        display(someNums , 0);

        for(int i = 0 ; i<someNums.length ; ++i){
            for(int j = 0 ; j<comparisonToMake ; ++j) {
                if(someNums[j] > someNums[j+1]) {
                    temp = someNums[j];
                    someNums[j] = someNums[j+1];
                    someNums[j+1] = temp;
                }
            }
            display(someNums, (i+1));
            --comparisonToMake;
        }
    }

    public static void display(int[] array , int index) {
        System.out.print("Iteration " + index + " : ");
        for(int i = 0 ; i<array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}