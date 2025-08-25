package myiodemo4;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("count.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        count++;

        if(count <=3){
            System.out.println("这是第"+count+"次使用");
        }else{
            System.out.println("最多只能使用三次");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
        bw.write(count+"");
        bw.close();

    }
}
