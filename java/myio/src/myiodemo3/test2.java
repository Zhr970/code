package myiodemo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("sc2.txt");//sc2.txt
        FileOutputStream fos = new FileOutputStream("sc.txt");//sc..txt

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b^2);
        }

        fos.close();
        fis.close();

    }
}
