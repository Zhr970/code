package myset;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",23);
        Student s3 = new Student("zhangsan",23);

        HashSet<Student> hs = new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));

        System.out.println(hs);

    }

}
