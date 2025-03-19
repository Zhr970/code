package Test3;

import java.util.ArrayList;
import java.util.Random;
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
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = scanner.next();
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户未注册，请先注册");
                return;
            }
            System.out.println("请输入密码");
            String password = scanner.next();

            while (true) {
                String rightcode = getCode();
                System.out.println("当前正确的验证码为："+rightcode);
                System.out.println("请输入验证码");
                String code = scanner.next();
                if (code.equalsIgnoreCase(rightcode)) {
                    System.out.println("验证码正确");
                    break;
                }else{
                    System.out.println("验证码错误");
                    continue;
                }
            }

            User userInfo = new User(username,password,null,null);
            boolean result = checkUserInfo(list,userInfo);
            if (result) {
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败，用户名或密码错误");
                if(i==2){
                    System.out.println("当前账号已被锁定，请稍后尝试");
                    return;
                }
            }

        }

    }

    private static boolean checkUserInfo(ArrayList<User> list,User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getName().equals(userInfo.getName()) && user.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }

    private static void register(ArrayList<User> list) {
        Scanner scanner = new Scanner(System.in);
        String username, password,personID,phoneNumber;
        //用户名
        while(true){
            System.out.println("请输入用户名");
            username = scanner.next();
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
            password = scanner.next();
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
            personID = scanner.next();
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
            phoneNumber = scanner.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号满足要求");
                break;
            } else {
                System.out.println("手机号格式错误，请重新输入");
                continue;
            }
        }
        //用户名，密码，身份证号，手机号存放到用户对象中
        User u = new User(username,password,personID,phoneNumber);
        list.add(u);
        System.out.println("注册成功");

    }

    private static void printList(ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getName()+","+u.getPassword()+","+u.getPersonID()+","+u.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber){
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.next();
        boolean flag = contains(list,username);
        if (!flag) {
            System.out.println("当前用户未注册");
            return;
        }
        System.out.println("请输入身份证号码");
        String personID = scanner.next();
        System.out.println("请输入手机号");
        String password = scanner.next();

        int index = findIndex(list,username);
        User user = list.get(index);

        if(!(password.equalsIgnoreCase(user.getPassword()) && personID.equals(user.getPersonID()))){
            System.out.println("身份证号或手机号错误");
            return;
        }
        String Password;
        while(true){
            System.out.println("请输入新的密码");
            Password = scanner.next();
            System.out.println("请再次输入密码");
            String againPassword = scanner.next();
            if(Password.equals(againPassword)){
                System.out.println("密码一致");
                break;
            }else{
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }
        }
        user.setPassword(Password);
        System.out.println("密码修改成功");


    }
    
    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(username.equals(user.getName())){
                return i;
            }
        }
        return -1;
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

    private static String getCode(){
        //创建一个集合，添加所有大写和小写字母
        ArrayList<Character>list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int  number = r.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return new String(arr);
    }

}
