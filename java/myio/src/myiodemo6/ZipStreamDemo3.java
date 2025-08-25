package myiodemo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {

        File src = new File("myio/");
        File destParent = src.getParentFile();
        File dest = new File(destParent, src.getName()+"zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        tozip(src,zos,src.getName());
        zos.close();
    }
    public static void tozip(File src, ZipOutputStream zos,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry ze = new ZipEntry(name+"/"+file.getName());
                zos.putNextEntry(ze);
                FileInputStream in = new FileInputStream(file);
                int b;
                while( (b = in.read()) != -1) {
                    zos.write(b);
                }
                in.close();
                zos.closeEntry();

            }else{
                tozip(file, zos, name+"/"+file.getName());
            }
        }

    }
}
