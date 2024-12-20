package Code_uz.IO_NIOpackage.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        // a.txt va b.txt dan ma'lumotlar bitta qatordan o'qib olinsin va c.txt ga yozilsin.
        // shu jarayon a va b file tugagunha davom etsin

        PrintWriter printWriter = new PrintWriter("uch.txt");

        BufferedReader buffered_bir = new BufferedReader(new FileReader("bir.txt"));
        BufferedReader buffered_ikki = new BufferedReader(new FileReader("ikki.txt"));

        String lineBir = buffered_bir.readLine();
        String lineIkki = buffered_ikki.readLine();

        while (lineBir != null || lineIkki != null) {

            if (lineBir != null) {
                printWriter.println(lineBir);
                lineBir = buffered_bir.readLine();
            }

            if (lineIkki != null) {
                printWriter.println(lineIkki);
                lineIkki = buffered_ikki.readLine();
            }
        }

        buffered_bir.close();
        buffered_ikki.close();

        printWriter.flush();
        printWriter.close();
    }
}
