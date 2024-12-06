package TimeAPI;

import java.time.LocalTime;
import java.util.Scanner;

public class TimeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds amount:");
        int seconds = scanner.nextInt();
        boolean loop = true;
        try {
           while (loop){
               LocalTime localTime =LocalTime.now();
               Thread.sleep(1000);
               System.out.println(localTime);
           }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
