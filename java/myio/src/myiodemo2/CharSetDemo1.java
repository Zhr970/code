package myiodemo2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "abc啊";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));

        String str2 = new String(bytes1);
        System.out.println(str2);
        String str3 = new String(bytes1, "GBK");
        System.out.println(str3);

    }
}
