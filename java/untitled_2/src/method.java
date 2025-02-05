import java.util.Scanner;

public class method {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int[] copyarr=copy(arr,0,9);
//
//        for(int i=0;i<copyarr.length;i++){
//            System.out.println(copyarr[i]);
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int mouth=sc.nextInt();
        System.out.println("请输入舱段：头等舱：1；经济舱：2");
        int ticket=sc.nextInt();
        double price=mode(mouth,ticket);
        System.out.println("价格为"+price);
    }
//    public static int[] copy(int[] arr,int from,int to){
//        int[] newarr=new int[to-from];
//        int index=0;
//        for(int i=from;i<to;i++){
//            newarr[index++]=arr[i];
//        }
//        return newarr;
//    }
    public static double mode(int mouth,int ticket){
        int head=200;
        int economy=100;
        if(mouth>=5 && mouth<=10){
            if(ticket==1){
                return 0.9*head;
            }else{
                return 0.85*economy;
            }
        }else if((mouth>10 && mouth<=12) || (mouth>=1 && mouth<=4)){
            if(ticket==1){
                return 0.7*head;
            }else{
                return 0.65*economy;
            }
        }else{
            if(ticket==1){
                return head;
            }else{
                return economy;
            }
        }
    }
}