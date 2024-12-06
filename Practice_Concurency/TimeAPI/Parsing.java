package TimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parsing {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddmmyy");
        String parsing = "090305";
        Date parse = simpleDateFormat.parse(parsing);
        System.out.println(parse);
    }
}
