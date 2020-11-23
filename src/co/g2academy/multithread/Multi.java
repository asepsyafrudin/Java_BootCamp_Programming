package co.g2academy.multithread;

public class Multi extends Thread {
    public void run() {

        int random = (int) (Math.random() * 10) * 1000;
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println( getName() + " is Running and was sleep for " + random +" ms");

    }

    public static void main(String[] args) {
        for(int i = 1 ; i <= 100 ; i++) {
            Multi t1 = new Multi();
            t1.setName("Thread " + i);
            t1.start();
        }
    }
}
