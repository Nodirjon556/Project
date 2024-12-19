package Code_uz.IO_NIOpackage;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("ikki.txt");
       // System.out.println(file.exists());
        if (!file.exists()){
           boolean answer =  file.createNewFile();
            System.out.println(answer);
        }
    }
}
