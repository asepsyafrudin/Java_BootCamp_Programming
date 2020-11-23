package co.g2academy.multithread;

public class ThreadSleep extends Thread {
    public void run() {
        for (int i = 1 ; i <= 5 ; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " sleeping for " + i  + " times");

        }
    }

    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ts1.setName("Thread 1");
        ts2.setName("Thread 2");

        ts1.start();
        ts2.start();
    }

}
