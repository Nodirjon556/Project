package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new java.io.FileWriter("bir.txt",true); // 1-constructor
        String line = System.getProperty("line.separator");

        fileWriter.write("Hello");
        fileWriter.write(line);
        fileWriter.write(12);
        fileWriter.write(line);
        fileWriter.write('A');


        fileWriter.flush();
        fileWriter.close();
    }
}