package Synchronization;

public class CounterClass {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        System.out.println("Counter value:" +counter.getCounter());
    }
}

class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }
}
