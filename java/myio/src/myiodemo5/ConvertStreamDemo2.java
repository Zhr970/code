package myiodemo5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("sc.txt", Charset.forName("GBK"));
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine())!= null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}
