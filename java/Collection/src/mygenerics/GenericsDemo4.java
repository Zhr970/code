package mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {

        MyArrayList2 list = new MyArrayList2();
        list.add("aa");
        list.add("bb");

        System.out.println(list);

        MyArrayList3<String> list2 = new MyArrayList3<>();
        list2.add("cc");
        list2.add("dd");
        System.out.println(list2);

    }
}
