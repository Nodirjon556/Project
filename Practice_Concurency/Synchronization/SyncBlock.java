package Synchronization;

public class SyncBlock {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public  void count() {
        synchronized (this) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncBlock syncBlock = new SyncBlock();


        Thread thr1 = new Thread();
        Thread thr2 = new Thread();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " i-" + i);
            syncBlock.count();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        thr1.start();
        thr1.join();
        thr2.start();

        System.out.println("Counter:" + syncBlock.getCounter());
    }
}
