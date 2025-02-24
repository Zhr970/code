package Test1;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {

        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("!"+s2+"!");

        String s3 = new String("abc");
        System.out.println(s3);

        char[] s4 = {'a', 'b', 'c'};
        System.out.println(s4);

        byte[] bytes ={97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);

        String a1 = "abc";
        String a2 = "abc";
        boolean result1=a1.equals(a2);
        System.out.println(result1);

        String a3 = "abc";
        String a4 = "ABC";
        boolean result2=a3.equalsIgnoreCase(a4);
        System.out.println(result2);


        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//abc

        String aa = "abc";

        System.out.println(a==aa);//false



    }
}
