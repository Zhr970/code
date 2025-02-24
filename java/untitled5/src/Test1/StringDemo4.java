package Test1;

import java.util.Scanner;

public class StringDemo4 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        String str = arrToString(arr);
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = reverse(str1);
        System.out.println(str2);
    }


    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                result += arr[i];
            }else{
                result += arr[i]+",";
            }
        }
        result = result+"]";
        return result;
    }


    public static String reverse(String str) {
        String result = "";
        for(int i = str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
