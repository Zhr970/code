package myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        boolean result = s.add("name1");
        boolean result2 = s.add("name1");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(s);

        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        for (String str : s) {
            System.out.println(str);
        }

        s.forEach(str -> System.out.println(str));
        s.forEach(System.out::println);

    }
}
