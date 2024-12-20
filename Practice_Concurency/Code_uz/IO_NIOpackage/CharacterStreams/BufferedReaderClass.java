package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.*;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        File file = new File("bir.txt");
        FileReader in = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(in);

        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}
