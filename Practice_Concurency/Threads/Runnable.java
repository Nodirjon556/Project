package Threads;

public class Runnable {
    public static void main(String[] args) throws InterruptedException {
        java.lang.Runnable runnable = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i = " + i);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        };
        var thr1 = new Thread(runnable, "Nodirjon's Thread");
        thr1.start();
        thr1.join();

        MyRunnable myRunnable = new MyRunnable();
        var thr2 = new Thread(myRunnable,"Xushnid's Thread");
        thr2.start();
    }
}

class MyRunnable implements java.lang.Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "i-" + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}