package Code_uz.IO_NIOpackage.CharacterStreams;

import java.io.*;
import java.util.Scanner;

public class PrintWriterClass {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter out = new FileWriter("bir.txt",true);
        PrintWriter printWriter = new PrintWriter(out);
        System.out.println("Type text:");
        printWriter.println(scanner.nextLine());
        printWriter.println("I am " + 19 + " years old");
        printWriter.println("I am from Uzbekistan");


        printWriter.flush();
        printWriter.close();
    }
}
