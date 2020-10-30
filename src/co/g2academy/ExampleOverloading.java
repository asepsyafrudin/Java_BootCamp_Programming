package co.g2academy;

public class ExampleOverloading {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.6;

        int result1 = minFunction(a , b);
        double result2 = minFunction(c , d);

        System.out.println("Minimum Value of Result 1 = " + result1);
        System.out.println("Minimum Value of Result 2 = " + result2);




    }

    public static int minFunction(int n1 , int n2 ) {
        int min;
        if (n1>n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static double minFunction(double n1 , double n2 ) {
        double min;
        if (n1>n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}
