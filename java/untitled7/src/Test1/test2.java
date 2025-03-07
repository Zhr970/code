package Test1;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("wangwu", 22);
        Student s3 = new Student("lisan", 18);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+","+student.getAge());
        }


    }
}
