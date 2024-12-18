package Threads;

public class ThreadPriorities {
    public static void main(String[] args) {
        Thread thr1 = new MyThread();
        Thread thr2 = new MyThread();
        Thread thr3 = new MyThread();
        thr1.setPriority(Thread.NORM_PRIORITY);
        thr2.setPriority(Thread.MAX_PRIORITY);
        thr3.setPriority(Thread.MIN_PRIORITY);


        thr1.start();
        thr2.start();
        thr3.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "->"+Thread.currentThread().getPriority());
    }
}
