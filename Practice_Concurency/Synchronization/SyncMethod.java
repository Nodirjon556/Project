package Synchronization;

public class SyncMethod {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public synchronized void count() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        SyncMethod syncMethod = new SyncMethod();


        Thread thr1 = new Thread();
        Thread thr2 = new Thread();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " i-" + i);
            syncMethod.count();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
        thr1.start();
        thr1.join();
        thr2.start();

        System.out.println("Counter:" + syncMethod.getCounter());
    }
}
