package Code_uz.IO_NIOpackage.BinaryStreams;

import java.io.*;

public class FileOutputStreams {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("ikki.txt");
        fileOutputStream.write(67);

        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
