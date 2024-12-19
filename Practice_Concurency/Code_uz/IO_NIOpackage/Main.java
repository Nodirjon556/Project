package Code_uz.IO_NIOpackage;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("123.txt");
       // System.out.println(file.exists());  // check

        /*if (!file.exists()){
           boolean answer =  file.createNewFile();  // create a file()
            System.out.println(answer);
        }*/

        /*boolean res = file.delete();      // delete()
        System.out.println(res);*/

        System.out.println(file.isFile());
    }
}
