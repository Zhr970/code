package Test3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil() {}

    public static int getMAxAgeStudent(ArrayList<Student> list) {

        int Max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge > Max) {
                Max = tempAge;
            }
        }
        return Max;
    }
}
