package mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(122);
        list.add(222);
        list.add(333);

        int i = list.get(0);
        System.out.println(i);
        System.out.println(list);
    }
}
