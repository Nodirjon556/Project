package Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceCondition {
    private int counter;

    public RaceCondition() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public  void increment(){
        synchronized (this) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceLock = new RaceCondition();
        Lock lock = new ReentrantLock();

        Thread thr1 = new Thread(() -> {
            try {
                lock.lock();
                for (int i = 0; i < 50; i++) {
                    raceLock.increment();
                }
            } finally {
                lock.unlock();
            }
        });

        Thread thr2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                raceLock.increment();
            }
        });

        thr1.start();
        thr1.join();
        thr2.start();
        thr2.join();
        System.out.println("Count -> " + raceLock.getCounter());
    }
}
