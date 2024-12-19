package Code_uz.IO_NIOpackage.CharacterStreams;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        File file = new File("bir.txt");
        FileReader fileReader = new FileReader(file);

       /* try  {
            int character = fileReader.read();
            while (character != -1) {
                System.out.println((char) character);
                character = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        char[] c = new char[(int) file.length()];  // uzunligigacha o'qib beradi

        int n = fileReader.read(c);
        while (n != -1) {
            System.out.println(c);
            System.out.println(n);
            n = fileReader.read();
        }


        fileReader.close();

    }
}
