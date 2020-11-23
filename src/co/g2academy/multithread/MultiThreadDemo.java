package co.g2academy.multithread;

public class MultiThreadDemo extends Thread{
    @Override
    public void run() {
        try{
            for(int i = 1; i <= 5 ; i++) {
                System.out.println("Cetak i : " + i);
                Thread.sleep(600);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MultiThreadDemo t1 = new MultiThreadDemo();
        MultiThreadDemo t2 = new MultiThreadDemo();
        t1.start();
        t2.start();


    }
}
