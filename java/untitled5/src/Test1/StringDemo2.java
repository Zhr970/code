package Test1;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {

        String rightname = "zhangsan";
        String rightpassword ="123456";

        for(int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String password = sc.nextLine();

            if(rightname.equals(name) && rightpassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户名或密码错误");
                System.out.println("还剩"+(2-i)+"次输入机会");
            }
        }

    }
}
