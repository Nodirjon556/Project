package Code_uz.IO_NIOpackage.CharacterStreams;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("bir.txt")) {
            int character = fileReader.read();
            while (character != -1) {
                System.out.println((char) character);
                character = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
