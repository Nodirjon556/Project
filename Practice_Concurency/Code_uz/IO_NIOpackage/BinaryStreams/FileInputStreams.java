package Code_uz.IO_NIOpackage.BinaryStreams;

import java.io.*;

public class FileInputStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("bir.txt");

        int a;
        while ((a = fileInputStream.read()) != -1) {
            System.out.println((char) a);
        }

        fileInputStream.close();
    }
}
