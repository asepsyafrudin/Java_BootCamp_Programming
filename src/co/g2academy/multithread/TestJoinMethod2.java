package co.g2academy.multithread;

public class TestJoinMethod2 extends Thread{

    @Override
    public void run() {
        System.out.println("running....");
    }

    public static void main(String[] args) {
        TestJoinMethod2 t1 = new TestJoinMethod2();
        TestJoinMethod2 t2 = new TestJoinMethod2();

        System.out.println("Get Name of Thread 1 : " + t1.getName());
        System.out.println("Get Name of Thread 2 : " + t2.getName());
        System.out.println("Get Id of Thread 1 : " + t1.getId());

        t1.start();
        t2.start();

        t1.setName("Asep");
        System.out.println("Change Name of Thread 1 to be : " + t1.getName());

    }

}
