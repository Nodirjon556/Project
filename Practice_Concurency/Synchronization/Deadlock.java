package Synchronization;

public class Deadlock {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 - lock1 locked");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1 - lock2 locked");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
           synchronized (lock2){
               System.out.println("Thread 2 - lock2 locked");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("Waiting for lock1");
               synchronized (lock1){
                   System.out.println("Thread 2- lock1 locked");
               }
           }
        });

        thread1.start();
        thread2.start();

    }
}
