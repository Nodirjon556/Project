package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("bir.txt");
        FileWriter out = new FileWriter(file);
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(out);

        bufferedWriter.write(65);
        bufferedWriter.newLine();
        bufferedWriter.write("abcd");
        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'A','B'});
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
