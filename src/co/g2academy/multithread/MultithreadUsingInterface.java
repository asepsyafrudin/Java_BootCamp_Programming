package co.g2academy.multithread;

public class MultithreadUsingInterface implements Runnable {

    public void run() {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        MultithreadUsingInterface m = new MultithreadUsingInterface();
        Thread t1 = new Thread(m);
        t1.start();
    }




}
