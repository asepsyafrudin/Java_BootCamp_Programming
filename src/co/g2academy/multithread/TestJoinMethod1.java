package co.g2academy.multithread;

public class TestJoinMethod1 extends Thread {
    @Override
    public void run() {
        for(int i = 1 ; i<=5; i++) {
            try {
                Thread.sleep(500); // process akan di hambat selama 500 milisecond
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Number : " + i);
        }
    }

    public static void main(String[] args) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();

        t1.start();

        try {
            t1.join(1500); //menjalankan t1 dulu kemudian setelah selesai akan menjalankan instruksi di bawahnya
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();


    }
}
