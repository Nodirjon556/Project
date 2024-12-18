package Concurency;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {
        var set = ConcurrentHashMap.<Integer>newKeySet();
        Runnable runnable1 = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    set.add(i);
                }
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
        };

        Runnable runnable2 = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    set.add(i);
                }
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(set.size());

    }
}
