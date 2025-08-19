import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);

        Collections.shuffle(list);
        Random random = new Random();
        int index = random.nextInt(list.size());
        int number = list.get(index);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list1,"1","2","3","4","5","6","7");
        Collections.addAll(list2,"-1","-2","-3");
        if(number == 1){
            int index1 = random.nextInt(list1.size());
            String name = list1.get(index1);
            System.out.println(name);
        }else{
            int index2 = random.nextInt(list2.size());
            String name = list2.get(index2);
            System.out.println(name);
        }
    }
}
