import java.util.ArrayList;
import java.util.Arrays;

public class Function2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));

        String[] NameAge = list.stream().map(Student::NameAge).toArray(String[]::new);

        System.out.println(Arrays.toString(NameAge));



    }
}
