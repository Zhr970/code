package Test1;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {

        //1
        int money;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个金额");
            money = scanner.nextInt();

            if(money <0){
                System.out.println("金额错误");
            }else{
                break;
            }
        }

        //2
        String moneyStr = "";
        while(true){
            int ge = money % 10;
            String getNUmber = getNumber(ge);
            moneyStr = getNUmber+moneyStr;
            money /=10;
            if(money == 0){
                break;
            }
        }

        //3
        int count = 7-moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零"+moneyStr;
        }

        //4
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        //方法1
//        for (int i = 0; i < moneyStr.length(); i++) {
//            char c = moneyStr.charAt(i);
//            System.out.print(c);
//            System.out.print(arr[i]);
//        }
        //方法2
        String reslut = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            reslut = reslut + c + arr[i];
        }
        System.out.println(reslut);
    }


    public static String getNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

        return arr[number];

    }
}
