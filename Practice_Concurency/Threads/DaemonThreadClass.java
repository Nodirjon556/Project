package Threads;

public class DaemonThreadClass {
    public static void main(String[] args) throws InterruptedException {
        java.lang.Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " i-" + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(runnable,"Daemon Thread");
        thread.setDaemon(true); //true bu Daemon thread ga utqazish
        thread.start();
        System.out.println("Daemon Thread starts");
        Thread.sleep(1000);
    }
}
