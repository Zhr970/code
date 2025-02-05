import java.util.Random;


public class method3 {
    public static void main(String[] args) {
        encryption();
        lottery();
    }
    public  static void encryption(){
        int number=1983;
        int a=(number%10 +5)%10;
        int b=(number/10%10 +5)%10;
        int c=(number/100%10 +5)%10;
        int d=(number/1000%10 +5)%10;
        int new_number=a*1000+b*100+c*10+d;
        System.out.println(new_number);
    }
    public static void lottery(){
        int[] arr={2,588,888,1000,10000};
        int[] newArr=new int[arr.length];
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int rand=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[rand];
            arr[rand]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
