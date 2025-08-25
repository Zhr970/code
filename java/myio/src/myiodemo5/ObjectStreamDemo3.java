package myiodemo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException {

        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 24);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sc11.txt"));
        oos.writeObject(list);
        oos.close();


    }
}
