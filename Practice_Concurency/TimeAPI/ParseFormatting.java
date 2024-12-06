package TimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class ParseFormatting {
    public static void main(String[] args) throws ParseException {
        //formatting();
        //parsing();
    }

    private static void parsing() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddmmyy");
        String parsed = "09032005";
        Date date = simpleDateFormat.parse(parsed);
        System.out.println(date);
    }

    private static void formatting() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String formatted = simpleDateFormat.format(date);
        System.out.println(formatted);
    }
}
