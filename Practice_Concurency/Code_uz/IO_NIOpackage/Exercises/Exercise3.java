package Code_uz.IO_NIOpackage.Exercises;

import java.io.IOException;
import java.io.*;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        // test folder dagi file larni ma'lumotlarini o'qib output.txt ga yozing

        PrintWriter printWriter = new PrintWriter("output.txt");

        File file = new File("test");

        String[] list = file.list();

        for (String s : list) {
            File subFile = new File("test/" + s);
            if (subFile.isFile()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(subFile));
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    printWriter.println(line);
                }
                bufferedReader.close();
            }
        }
        printWriter.flush();
        printWriter.close();
    }
}
