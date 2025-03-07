package Test1;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("001","zhangsan","12345");
        User u2 = new User("002","lisi","123456");
        User u3 = new User("003","wangwu","1234567");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(list.size());

        boolean flag = contain(list,"001");
        System.out.println(flag);

    }
    public static boolean contain(ArrayList<User> list, String id) {
        return contains(list,id) >=0;
    }
    public static int contains(ArrayList<User> list, String id) {

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uid = user.getId();
            if(id.equals(uid)) {
                return i;
            }
        }
        return -1;
    }

}
