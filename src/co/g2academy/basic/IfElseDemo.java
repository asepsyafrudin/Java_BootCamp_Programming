package co.g2academy.basic;

public class IfElseDemo {
    public static void main(String[] args) {
        int testScore = 76 ;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >=80) {
            grade = 'B';
        } else if (testScore >= 70 ) {
            grade = 'C';
        } else if (testScore >=60 ) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Grade of " + testScore + " is " + grade);
    }
}
