package myiodemo5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectStreamDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sc11.txt"));
        ArrayList<Object> list = (ArrayList<Object>) ois.readObject();
        list.forEach(System.out::println);
        ois.close();
    }
}
