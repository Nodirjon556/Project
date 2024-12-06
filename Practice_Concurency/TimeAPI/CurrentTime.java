package TimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Instant now = Instant.now();
        System.out.println(now);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate);
    }
}
