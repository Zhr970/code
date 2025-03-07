package Test1;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //add
        boolean result = list.add("a");
        System.out.println(result);

        list.add("b");
        list.add("c");

        //remove
        boolean result1 = list.remove("a");
        String str = list.remove(0);
        System.out.println(result1);
        System.out.println(str);
        System.out.println(list);

        //set
        String result2 = list.set(0,"d");
        System.out.println(result2);
        System.out.println(list);

        //get
        String s = list.get(0);
        System.out.println(s);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if(i == list1.size() - 1){
                System.out.print(list1.get(i));
            }else{
                System.out.print(list1.get(i) + ",");
            }
        }
        System.out.println("]");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.print("[");
        for (int i = 0; i < list2.size(); i++) {
            if(i == list2.size() - 1){
                System.out.print(list2.get(i));
            }else{
                System.out.print(list2.get(i) + ",");
            }
        }
        System.out.println("]");
        System.out.println(list2);

    }

}
