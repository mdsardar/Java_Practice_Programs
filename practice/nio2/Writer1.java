package practice.nio2;

import java.io.File;
import java.io.IOException;

public class Writer1 {
    public static void main(String[] args) throws IOException {
        /*try {
            boolean newFile;
            File file = new File("fileWriter.txt");
            System.out.println(file.exists());
            newFile = file.createNewFile();
            System.out.println(newFile);
            System.out.println(file.exists());
            System.out.println();
        } catch (IOException e) {
        }*/

        doubleDivision();


    }

      static void doubleDivision(){

        System.out.println(1.0 == 2.0);

        System.out.println(2.0 == 3.0);

        double a = 1.1/0.0;

        System.out.println("a's value"+ a);

    }
}
