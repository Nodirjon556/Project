package Threads;

public class Thread_Runnnable {
    public static void main(String[] args) throws InterruptedException {
        java.lang.Runnable runnable = () -> {
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + "i-" + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        };
        Thread thread1 = new Thread(runnable, "Runnable Thread");
        thread1.start();
        thread1.join();

        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + "i-" + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }, "Thread of thread").start();
    }
}
