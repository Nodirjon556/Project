package Code_uz.IO_NIOpackage.Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Exercise {
    public static void main(String[] args) throws IOException {
        // a.txt va b.txt dagi ma'lumotlarni c.txt ga ko'chirib yozing
        Path bir = Path.of("bir.txt");
        Path ikki = Path.of("ikki.txt");
        Path uch = Path.of("uch.txt");

        appendFile(bir,uch);
        appendFile(ikki,uch);
    }

    private static void appendFile(Path source, Path target){
        try (BufferedReader reader = Files.newBufferedReader(source);
        BufferedWriter writer = Files.newBufferedWriter(target, StandardOpenOption.CREATE,StandardOpenOption.APPEND)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
