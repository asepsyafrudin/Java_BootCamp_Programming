package co.g2academy.multithread;

public class TestMultiPriority1 extends Thread{
    @Override
    public void run() {
        System.out.println("The Thread Name is " + Thread.currentThread().getName() + " And The Priority is " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        TestMultiPriority1 t1 = new TestMultiPriority1();
        TestMultiPriority1 t2 = new TestMultiPriority1();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
