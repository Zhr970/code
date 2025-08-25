package myiodemo3;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {

        File src = new File("a");
        File dest = new File("b");

        copydir(src,dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while((len = fis.read(bytes))!= -1){
                    fos.write(bytes,0,len);
                }
                fis.close();
                fos.close();
            }else{
                copydir(file,new File(dest,file.getName()));
            }

        }
    }
}
