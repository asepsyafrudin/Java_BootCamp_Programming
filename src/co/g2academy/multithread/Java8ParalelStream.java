package co.g2academy.multithread;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8ParalelStream {
    public static void main(String[] args) {
        System.out.println("Using Sequential Stream");
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        IntStream stream = Arrays.stream(data);

        stream.forEach(item -> {
            System.out.println(item + " is proccesed by " + Thread.currentThread().getName());
        });

        System.out.println("Using Paralel Stream");
        IntStream paralel = Arrays.stream(data).parallel();
        paralel.forEach(item -> {
            System.out.println(item + " is proccesed by " + Thread.currentThread().getName());
        });
    }
}
