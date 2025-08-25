package myiodemo6;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {

        File src = new File("scc.zip");
        File dest = new File("myio/");
        tozip(src,dest);
    }

    private static void tozip(File src, File dest) throws IOException {

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        ZipEntry ze = new ZipEntry("a.txt");
        zos.putNextEntry(ze);
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        fis.close();


    }
}
