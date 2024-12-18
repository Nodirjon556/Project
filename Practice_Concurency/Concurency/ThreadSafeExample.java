package Concurency;

import java.util.Collections;
import java.util.HashMap;

public class ThreadSafeExample {
    public static void main(String[] args) {
        var set1 = new HashMap<Integer>();
        var set2 = Collections.synchronizedSet(set1);

    }
}
