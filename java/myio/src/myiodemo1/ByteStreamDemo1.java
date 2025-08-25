package myiodemo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /*
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);

        byte[] bytes = {97,98,99,100};
        fos.write(bytes);
        fos.write(bytes,1,2);

        fos.close();
        */

        FileOutputStream fos2 = new FileOutputStream("b.txt",true);

        String str2 = "\r";
        byte[] bytes2 = str2.getBytes();
        fos2.write(bytes2);

        String str1 = "abcdefghij";
        byte[] bytes1 = str1.getBytes();
        fos2.write(bytes1);

        fos2.write(bytes2);

        String str3 = "666";
        byte[] bytes3 = str3.getBytes();
        fos2.write(bytes3);

        fos2.close();

    }
}
