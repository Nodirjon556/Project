package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.*;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("bir.txt");
        FileReader in = new FileReader(file);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(in);

        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}
