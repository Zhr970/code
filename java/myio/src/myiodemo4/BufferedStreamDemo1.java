package myiodemo4;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {

//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sc.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sc4.txt"));
//
//        int len;
//        while ((len = bis.read()) != -1) {
//            bos.write(len);
//        }
//        bos.close();
//        bis.close();


        BufferedReader br = new BufferedReader(new FileReader("sc.txt"));

//        String line;
//        while((line = br.readLine())!= null){
//            System.out.println(line);
//        }

        String line;
        BufferedWriter bw = new BufferedWriter(new FileWriter("sc4.txt",true));
        while((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
        }


        bw.close();
        br.close();

    }
}
