package myset;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        Student3 s1 = new Student3("zhangsan",22,70,50,80);
        Student3 s2 = new Student3("lisi",24,80,69,87);
        Student3 s3 = new Student3("wangwu",21,74,59,85);
        Student3 s4 = new Student3("lihua",20,64,79,84);
        Student3 s5 = new Student3("zhangsan",22,70,50,80);

        TreeSet<Student3> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        ts.forEach(System.out::println);



    }
}
