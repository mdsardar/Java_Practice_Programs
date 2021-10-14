package practice.nio2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Writer3 {
    public static void main(String[] args) {
        byte[] in = new byte[50];
        int size = 0;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        File file = new File("fileWriter3.txt");
        try {
            fos = new FileOutputStream(file);
            String s = "howdy\nfolks\n";
            fos.write(s.getBytes(StandardCharsets.UTF_8));
            fos.flush();
            fos.close();

            fis = new FileInputStream(file);
            size = fis.read(in);
            System.out.println(size + " ");
            for (byte b : in) {
                System.out.println((char) b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
