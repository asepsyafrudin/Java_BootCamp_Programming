package co.g2academy.basic;

public class TestOperator {
    public static void main(String[] args) {
        //Logical Operator :
        int x = 10;
        System.out.println(x > 10 && x <10);

        int y = 100 ;
        System.out.println(y > x || y>10);

        //bitwise operator
        int z = y >>1;
        System.out.println(z);
        System.out.println(z>>2);
        System.out.println(z<<1);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);

        double d = 1_000_000_000_000d;
        maxInteger = (int) d;
        System.out.println(maxInteger);

    }
}
