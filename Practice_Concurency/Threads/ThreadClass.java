package Threads;

public class ThreadClass {
    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        thread1.start();
    }
}

class MyThread1 extends Thread {
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