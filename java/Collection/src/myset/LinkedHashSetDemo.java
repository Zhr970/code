package myset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",23);
        Student s3 = new Student("zhangsan",23);

        LinkedHashSet<Student> hs = new LinkedHashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));

        System.out.println(hs);
    }
}
