package Code_uz.IO_NIOpackage;

import java.io.File;
import java.util.logging.Filter;

public class WorkingWithFolders {
    public static void main(String[] args) {
        File file = new File("a");

        //System.out.println(file.exists());

       /* if (!file.exists()) {
            boolean res = file.mkdir();
            System.out.println(res);
        }*/

        //System.out.println(file.isDirectory());

        /*String[] subList = file.list();

        for (String s : subList) {
            File subFile = new File("a/" + s);

            if (subFile.isDirectory()) {
                System.out.println("This is Folder " + s);
            } else {
                System.out.println("This is File " + s);
            }
        }*/

        File[] subFileList = file.listFiles();

        for (File subFile : subFileList) {
            if (subFile.isFile()) {
                System.out.println("Bu file " + subFile.getName());
            } else {
               // System.out.println(subFile.isHidden());
                System.out.println("Bu Folder " + subFile.getName());
            }
        }


    }
}
