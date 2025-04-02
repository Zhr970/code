package Test1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.teacher = "san";
        s1.setName("zhangsan");
        s1.setAge(23);
        s1.setGender("nan");
        s1.study();
        s1.show();


        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(22);
        s2.setGender("nan");
        s2.study();
        s2.show();

    }
}
