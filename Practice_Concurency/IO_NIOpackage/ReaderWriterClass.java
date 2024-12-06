package IO_NIOpackage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReaderWriterClass {
    public static void main(String[] args) throws IOException {
        writeFile();
        //readFile();
    }

    private static void readFile() throws IOException {
        Path path = Path.of("io","readme.txt");
        String io = Files.readString(path);
        System.out.println(io);
    }

    private static void writeFile() throws IOException {
        Path path = Path.of("io","readme.txt");
        Path written = Files.writeString(path, "\nVa alekum assalom Nodirjon", StandardOpenOption.APPEND);
        System.out.println(written);
    }
}
