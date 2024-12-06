package IO_NIOpackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        copyFile();
    }

    private static void copyFile() {
        Path path1 = Path.of("io/readme.txt");
        Path path2 = Path.of("io/copy.txt");
        try {
            Files.copy(path1,path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
