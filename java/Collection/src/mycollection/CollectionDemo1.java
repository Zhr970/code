package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo1 {
    public static void main(String[] args) {

//        public boolean add(E e) 添加
//        public void clear ()  清空
//        public boolean remove (E e) 删除
//        public boolean contains （Object obj）判断是否包含
//        public boolean isEmpty()  判断是否为空
//        public int size ()  集合长度

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        Iterator<String> it = coll.iterator();
//        while(it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }

        Collection<String> coll2 = new ArrayList<>();
        coll2.add("zhangsan");
        coll2.add("lisi");
        coll2.add("wangwu");

//        for(String s : coll2){
//            System.out.println(s);
//        }

        coll2.forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll2.forEach(s -> System.out.println(s));


    }
}
