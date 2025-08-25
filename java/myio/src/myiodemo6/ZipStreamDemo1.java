package myiodemo6;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {

        File src = new File("scc.zip");
        File dest = new File("/");
        unzip(src,dest);

    }

    private static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while((entry = zip.getNextEntry())!= null){
            if(entry.isDirectory()){
                File dir = new File(dest,entry.toString());
                dir.mkdirs();
            }else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zip.read()) != -1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
