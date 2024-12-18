package Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceCondition {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RaceCondition raceCondition = new RaceCondition();
        Lock lock = new ReentrantLock();

        Thread thr1 = new Thread(() -> {
            try {
                lock.lock();
                for (int i = 0; i < 10; i++) {
                    raceCondition.increment();
                }
            } finally {
                lock.unlock();
            }
        });

        Thread thr2 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    raceCondition.increment();
                }
            } finally {
                lock.unlock();
            }
        });

        thr1.start();
        thr1.join();
        thr2.start();
    }
}
