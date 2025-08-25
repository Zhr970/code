package myiodemo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("sc.txt");

        int ch;
        while((ch = fr.read())!= -1){
            System.out.print((char)ch);
        }
        System.out.println();
        fr.close();

        System.out.println();

        FileReader fr2 = new FileReader("sc.txt");
        char[] chars = new char[2];
        int len;
        while((len = fr2.read(chars))!= -1){
            System.out.print(new String(chars,0,len));
        }
        System.out.println();
        fr2.close();
    }

}
