package co.g2academy.multithread;

public class WorkerThread2 implements Runnable {
    private String message;

    WorkerThread2(String message) {
        this.message = message;
    }


    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message " + message);
        try {
            processMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " (End) message " + message );
    }

    private void processMessage() throws InterruptedException {
        Thread.sleep(5000);
    }
}
