package myiodemo4;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

//        method1();
//        method2();
//        method3();
//        method4();


        long end = System.currentTimeMillis();
        System.out.println(end - start/1000.0+"秒");
    }

    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("sc4.txt");
        FileOutputStream fos = new FileOutputStream("sc.txt");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        fos.close();
        fis.close();



    }

    public static void method2() throws IOException {
        FileReader fr = new FileReader("sc4.txt");
        FileWriter fw = new FileWriter("sc.txt");

        int b;
        while((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sc4.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sc.txt"));
        int b;
        while((b = bis.read())!= -1){
            bos.write(b);
        }
        bos.close();
        bis.close();


    }

    public static void method4() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sc4.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sc.txt"));
        String line;
        while((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();


    }
}
