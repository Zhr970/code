package Test2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一组字母");
        String s1 = sc.nextLine();
        System.out.println("请输入第二组字母");
        String s2 = sc.nextLine();

        boolean b = conRotateToMatch(s1,s2);
        System.out.println("s1能否通过旋转变成s2:"+b);
    }
    public static boolean conRotateToMatch(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        if(s1.equals(s2)) {
            return true;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
