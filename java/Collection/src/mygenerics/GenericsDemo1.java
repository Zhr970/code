package mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(123);
        list.add(new Student("zhangsan", 22));

        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }


    }
}
