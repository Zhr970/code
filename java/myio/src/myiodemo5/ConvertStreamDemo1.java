package myiodemo5;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //jdk11以前
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("sc.txt"),"GBK");
//
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.println((char)ch);
//        }
//        isr.close();
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("sc5.txt"), "utf-8");
//        osw.write("Hello World");
//        osw.close();


        FileReader fr = new FileReader("sc.txt", Charset.forName("GBK"));
        int ch;
        while( (ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();

        FileWriter fw = new FileWriter("sc.txt",Charset.forName("GBK"));
        fw.write("Hello World");
        fw.close();



    }
}
