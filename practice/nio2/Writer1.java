package practice.nio2;

import java.io.File;
import java.io.IOException;

public class Writer1 {
    public static void main(String[] args) throws IOException {
        try {
            boolean newFile;
            File file = new File("fileWriter.txt");
            System.out.println(file.exists());
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
        } catch (IOException e) {
        }
    }
}
