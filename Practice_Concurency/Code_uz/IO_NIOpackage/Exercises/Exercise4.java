package Code_uz.IO_NIOpackage.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        // a.txt file dan b.txt file da bor bo'lgan qatorlarni o'chiring

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("Test/b.txt"));

        String line;
        Set<String> container = new HashSet<>();
        while ((line = bufferedReader1.readLine()) != null) {
            container.add(line);
        }
        bufferedReader1.close();

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("Test/a.txt"));

        Set<String> result = new HashSet<>();

        while ((line = bufferedReader2.readLine()) != null) {
            if (!container.contains(line)) {
                result.add(line);
            }
        }
        bufferedReader2.close();

        PrintWriter printWriter = new PrintWriter("Test/a.txt");
        for(String s : result){
            printWriter.println(s);
        }

        printWriter.flush();
        printWriter.close();
    }
}
