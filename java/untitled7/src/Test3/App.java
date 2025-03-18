package Test3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登陆 2.注册 3.忘记密码");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch(choose){
                case 1-> login(list);
                case 2-> register(list);
                case 3-> forgetPassword(list);
                default -> System.out.println("选择错误，请重新输入");
            }
        }

    }

    private static void login(ArrayList<User> list) {

    }

    private static void register(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        //用户名
        while(true){
            System.out.println("请输入用户名");
            String username = scanner.next();
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名格式不满足条件，请重新输入");
                continue;
            }
            boolean flag2  = contains(list,username);
            if(flag2){
                System.out.println("用户名"+username+"已存在，请重新输入");
            }else{
                System.out.println("用户名"+username+"可用");
                break;
            }
        }
        //密码
        while(true){
            System.out.println("请输入密码");
            String password = scanner.next();
            System.out.println("请再次输入密码");
            String againpassword = scanner.next();
            if(!password.equals(againpassword)){
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }else{
                System.out.println("两次密码一致，继续录用其他数据");
                break;
            }
        }
        //身份证
        while(true){
            System.out.println("请输入身份证号");
            String personID = scanner.next();
            boolean flag = checkPersonID(personID);
            if(flag){
                System.out.println("身份证号码满足要求");
                break;
            }else{
                System.out.println("身份证号码不满足要求，请重新输入");
                continue;
            }
        }
        //手机号
        while(true){
            System.out.println("请输入手机号");
            String phoneNumber = scanner.next();
            boolean flag = checkPhoneBumber(phoneNumber);
            if (flag) {
                System.out.println("手机号满足要求");
                break;
            } else {
                System.out.println("手机号格式错误，请重新输入");
                continue;
            }
        }
    }

    private static boolean checkPhoneBumber(String phoneNumber){
        if(phoneNumber.length() != 11){
            return false;
        }
        if(phoneNumber.startsWith("0")){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }

    private static boolean checkPersonID(String personID){
        if(personID.length()!=18){
            return false;
        }
        if(personID.startsWith("0")){
            return false;
        }
        for (int i = 0; i < personID.length()-1; i++) {
            char c = personID.charAt(i);
                if(!(c >= '0' && c <= '9')){
                    return false;
                }
        }
        char endChar = personID.charAt(personID.length()-1);
        if((endChar >= '0' && endChar <= '9')||(endChar == 'x' )|| (endChar == 'X')){
            return true;
        }else{
            return false;
        }
    }


    private static void forgetPassword(ArrayList<User> list) {

    }

    private static boolean checkUsername(String username) {
        int len = username.length();
        if(len < 3 || len > 15){
            return false;
        }
        for(int i = 0; i<username.length(); i++){
            char c = username.charAt(i);
            if(!((c >= 'a'&& c <= 'z')||(c >= 'A'&& c <= 'Z')||(c >= '0'&& c <= '9'))){
                return false;
            }

        }
        int count = 0;
        for(int i = 0; i<username.length(); i++){
            char c = username.charAt(i);
            if((c >= 'a'&& c <= 'z')||(c >= 'A' && c <= 'Z')){
                count++;
                break;
            }
        }
        return count > 0;

    }

    private static boolean contains(ArrayList<User> list , String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getName();
            if(username.equals(rightUsername)){
                return true;
            }

        }
        return false;
    }
}
