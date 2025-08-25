package myiodemo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        //基本写法

//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try{
//            fis = new FileInputStream("a.txt");
//            fos = new FileOutputStream("c.txt");
//            byte[] bytes = new byte[1024];
//            int len;
//            while((len = fis.read(bytes))!=-1){
//                fos.write(bytes,0,len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fis!=null){
//                try{
//                    fis.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//            if(fos!=null){
//                try{
//                    fos.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//        }

        //jdk7写法

//        try (FileInputStream fis = new FileInputStream("a.txt");
//             FileOutputStream fos = new FileOutputStream("c.txt")) {
//            int len;
//            byte[] buf = new byte[1024];
//            while ((len = fis.read(buf)) != -1) {
//                fos.write(buf, 0, len);
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

        //jdk9写法

        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");
        try (fis;fos) {
            int len;
            byte[] buf = new byte[1024];
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
