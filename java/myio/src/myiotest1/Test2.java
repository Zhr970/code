package myiotest1;

import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/myiotest1/userinfo.txt")) ;

        String line = br.readLine();
        br.close();
        String[] userinfo = line.split("&");
        String[] arr1 = userinfo[0].split("=");
        String[] arr2 = userinfo[1].split("=");

        String rightUsername = arr1[1];
        String rightPassword = arr2[1];
        int count = 3;
        while(count>0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = scanner.nextLine();
            System.out.println("请输入密码");
            String password = scanner.nextLine();
            if(username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("yes");
            }else{
                System.out.println("wrong");
                System.out.println("你还有"+(count-1)+"次机会");
                count--;
            }
        }
        System.out.println("登录失败，账号已锁定");
        count = 3;


    }
}

