package Test2;

import java.util.Scanner;

public class StringBuilder2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();

        //反转字符串
        String result = new StringBuilder(str).reverse().toString();

        //比较
        if(str.equals(result)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
