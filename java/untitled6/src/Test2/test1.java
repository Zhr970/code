package Test2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个0-9的数字字符串");
        String str = sc.nextLine();
        if(str.length()>9 || !str.matches("\\d+")){
            System.out.println("输入不合法");
            return;
        }
        String result = convertToRoman(str);
        System.out.println("转换后的罗马数字为"+result);

    }
    public static String convertToRoman(String str){
        if(str.contains("0")){
            return "";
        }
        String[] strs = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            int digit = Character.getNumericValue(c);
            if(digit >=1 && digit <=9){
                sb.append(strs[digit-1]);
            }
        }
        return sb.toString();
    }
}
