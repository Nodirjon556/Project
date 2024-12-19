package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("bir.txt");
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
