package IO_NIOpackage;

import java.io.*;
import java.nio.file.StandardOpenOption;

public class BufferedReaderWriterClass {
    public static void main(String[] args) {
        File file = new File("io","readme.txt");
        bufferedRead(file);

       // bufferedWrite(file);
    }

    private static void bufferedWrite(File file) {
        try(FileWriter out = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(out)){
            bufferedWriter.write("Yo wassup fam?\nHow are you doin man?");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void bufferedRead(File file) {
        try(FileReader in = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(in)){
            while (bufferedReader.ready()){
                bufferedReader.lines().forEach(System.out::println);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
