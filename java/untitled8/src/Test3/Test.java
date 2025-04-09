package Test3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student stu1 = new Student("zhangsan",22,"male");
        Student stu2 = new Student("lisi",23,"female");
        Student stu3 = new Student("wangwu",24,"male");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int MaxAge = StudentUtil.getMAxAgeStudent(list);
        System.out.println(MaxAge);

    }
}
