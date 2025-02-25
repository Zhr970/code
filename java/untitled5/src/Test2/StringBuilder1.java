package Test2;

import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder();
//
//        sb.append("Hello");
//        sb.append(1);
//        sb.append(2.3);
//        System.out.println(sb);
//
//        sb.reverse();
//        int len = sb.length();
//        System.out.println(sb);
//        System.out.println(len);

        int len  = getString().substring(1).replace("A","Q").length();
        System.out.println(len);

        StringBuilder sb = new StringBuilder();
        sb.append("1").append("2").append("3").append("4").append("5").append("6").append("7");
        System.out.println(sb);


    }
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }

}
