import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"1","2","3","4","5","6","7","8","9");
        for (int i = 0; i <= 5; i++) {
            System.out.println("第"+ (i+1) +"轮循环");

            int count = list1.size();
            Random r = new Random();

            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }

    }
}
