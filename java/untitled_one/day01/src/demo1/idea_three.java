package demo1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import java.util.Random;

public class idea_three {
    public static void main(String[] args) {

          //回文数
//        int x=121;
//        int temp=x;
//        int num=0;
//        while(x!=0){
//            int i = x % 10;
//            x /= 10;
//            num = num * 10 + i;
//        }
//        if(num==temp){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//        int dividend = 100;
//        int divisor = 2;
//        int count = 0;
//        while(dividend>=divisor){
//            dividend=dividend-divisor;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(dividend);

          //逢7过
//        int i=0;
//        for(i=0;i<=100;i++){
//            if(i%10==7 || i/10%10==7 || i%7==0){
//                System.out.println("过");
//                continue;
//            }
//            System.out.println(i);
//        }

          //求平方根
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int num=sc.nextInt();
//        for(int i=1;i<=num;i++) {
//            if(i*i==num) {
//                System.out.println(i+"就是"+num+"的平方根");
//                break;
//            }else if(i*i>num){
//                System.out.println((i-1)+"就是"+num+"平方根的整数部分");
//                break;
//            }
//        }

          //求质数
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=2;i<=n;i++) {
//            if(n%i==0) {
//                System.out.println(n+"不是质数");
//                break;
//            }else{
//                System.out.println(n+"是质数");
//                break;
//            }
//        }

          //猜数字
//        Random random = new Random();
//        int number = random.nextInt(101);
//        int my=0;
//        System.out.println("请输入你要猜的数字");
//        while(number!=my){
//            Scanner sc = new Scanner(System.in);
//            my=sc.nextInt();
//            if(my==number){
//                System.out.println("恭喜你猜对了 是"+number);
//                break;
//            }
//            if(my>number){
//                System.out.println("猜大了");
//            }else{
//                System.out.println("猜小了");
//            }
//        }

    }
}
