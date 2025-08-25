package myiodemo5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {

        Student s1 = new Student("zhangsan", 18);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sc11.txt"));

        oos.writeObject(s1);
        oos.close();

    }
}
