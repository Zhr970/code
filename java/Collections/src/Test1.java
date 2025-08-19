import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"1","2","3","4","5","6","7","8","9");

        Random r = new Random();
        int index = r.nextInt(list.size());
        String name1 = list.get(index);
        System.out.println(name1);

        Collections.shuffle(list);
        String name2 = list.get(0);
        System.out.println(name2);
    }
}
