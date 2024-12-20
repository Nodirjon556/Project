package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) throws IOException {
        File file = new File("bir.txt");
        FileWriter out = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(out);

        bufferedWriter.write(65);
        bufferedWriter.newLine();
        bufferedWriter.write("abcd");
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'A', 'B'});
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
