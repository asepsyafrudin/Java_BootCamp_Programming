package co.g2academy.string;

public class ConcatTest {
    public static String concatWithString() {
        String t = "Java";
        for(int i = 0; i <10000; i++) {
            t = t + "TPoint";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <10000; i++) {
            sb.append("TPoint");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String : " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concateing with String Buffer : " + (System.currentTimeMillis()-startTime) + "ms");

    }
}
