package Code_uz.IO_NIOpackage;

import java.io.File;

public class FileConstructors {
    public static void main(String[] args) {
       /* File file = new File("a/12/123.txt");      // 1-constructor
        System.out.println(file.isFile());*/

       /* File file = new File("a","a.txt");         // 2-constructor
        System.out.println(file.isFile());
        System.out.println(file.getName());*/

        /*File file = new File("a");                 // 3-constructor
        for (String s : file.list()) {
            File subFile = new File(file, s);
            System.out.println(subFile.getName());
            if (subFile.isDirectory()) {
                for (String f : subFile.list()) {
                    System.out.println("    "+f);
                }
            }
        }*/

        File file = new File("a");

        System.out.println(file.getFreeSpace());
        System.out.println(file.getAbsolutePath());

        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("___________");

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


    }
}
