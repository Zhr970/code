import java.util.Random;

public class method2 {

    public static void main(String[] args) {
        Verification();
        Scoring();

    }
    public static void Verification(){
        char[] chs=new char[52];
        for(int i=0;i<chs.length;i++){
            if(i<=25){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }
        StringBuilder a= new StringBuilder();
        Random r=new Random();
        for(int i=0;i<4;i++){
            int random=r.nextInt(chs.length);
            a.append(chs[random]);
        }
        int num=r.nextInt(10);
        a.append(num);
        System.out.println(a);
    }
    public static void Scoring(){
        int[] score=new int[6];
        Random r=new Random();
        for(int i=0;i<6;i++){
            score[i]=r.nextInt(101);
            System.out.println(score[i]);
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                if(score[j]>score[j+1]){
                    int temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }
        }
        double sum=0;
        for(int i=1;i<5;i++)
        {
            sum+=score[i];
        }
        System.out.println("平均分为："+sum/4);
    }

}
