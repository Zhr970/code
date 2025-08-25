package myiodemo6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("sc11.txt"));
        ps.println(666);
        ps.print("123");
        ps.printf("%d %s",666,"zhangsan");
        ps.close();

        PrintWriter pw = new PrintWriter(new FileOutputStream("sc11.txt"));
        pw.println(666);
        pw.print(1);
        pw.printf("%d %s",666,"zhangsan");
        pw.close();
    }
}
