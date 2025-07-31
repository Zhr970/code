package myList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
    public static void main(String[] args) {

        /*
        List系列集合独有的方法：
        void add(int index,E element)  在此集合中的指定位置插入指定的元素
        E remove(int index)  删除指定索引处的元素,返回被删除的元素
        E set(int index,E element)  修改指定索引处的元素,返回被修改的元素
        E get(int index)    返回指定索引处的元素
         */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            String str = it.next();
            if("aaa".equals(str)) {
                it.add("ccc");
            }
            System.out.println(str);
        }
        System.out.println(list);
    }
}
