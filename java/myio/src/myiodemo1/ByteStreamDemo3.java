package myiodemo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
//        FileOutputStream fos = new FileOutputStream("c.txt");
//
//        int b;
//        while((b = fis.read()) != -1){
//            fos.write(b);
//        }
//
//        fos.close();
//        fis.close();

//        byte[] bytes = new byte[2];
//        int len1 = fis.read(bytes);
//        String str = new String(bytes,0,len1);
//        System.out.println(str);
//
//
//        fis.close();

        FileOutputStream fos = new FileOutputStream("c.txt");

        long start = System.currentTimeMillis();

        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
