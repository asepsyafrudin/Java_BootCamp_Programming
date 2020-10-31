package co.g2academy.basic;

import java.util.Scanner;

public class AverageOfQuizScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputScore = 0;
        int countScore = 0;
        int quit = 999;
        int[] dataScore = new int[10];

        text :
        while (inputScore != quit) {
            System.out.print("Quiz Number = " + (countScore+1) + " Enter Quiz Score or 999 to Quit Application : ");
            inputScore = input.nextInt();
            if (inputScore != quit) {
                dataScore[countScore] = inputScore;
                countScore++;
                if(countScore == dataScore.length) {
                    break text;
                }
            }
        }

        if(countScore!=0) {
            System.out.println("\nYour Input data is : ");
            for(int i = 0 ; i<dataScore.length; i++) {
                if(dataScore[i] !=0) {
                    System.out.print(dataScore[i] + " , ");
                }
            }
            double averageScore = averageArray(dataScore);
            System.out.println("Average Quiz Score is : "  + averageScore);
        } else{
            System.out.println("No Score were entered!!");
        }

    }

    public static double averageArray (int [] array) {
        int count = 0;
        double result = 0;
        for(int i = 0 ; i<array.length ; i++) {
            if (array[i] != 0) {

                result += array[i];
                count++;

            } else {
                continue;
            }
        }
        result /= count;
        return result;
    }
}
