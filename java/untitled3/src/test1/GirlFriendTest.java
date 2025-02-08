package test1;

//public class GirlFriendTest {
//    public static void main(String[] args) {
//        //创建女朋友的对象
//        GIrlFriend gf1 = new GIrlFriend();
//        gf1.name ="mi";
//        gf1.age=20;
//        gf1.gender="m";
//
//        System.out.println(gf1.name);
//        System.out.println(gf1.age);
//        System.out.println(gf1.gender);
//
//        gf1.eat();
//        gf1.sleep();
//
//        System.out.println("================");
//
//        GIrlFriend gf2 = new GIrlFriend();
//        gf2.name ="mimi";
//        gf2.age=23;
//        gf2.gender="mm";
//
//        System.out.println(gf2.name);
//        System.out.println(gf2.age);
//        System.out.println(gf2.gender);
//
//        gf2.eat();
//        gf2.sleep();
//    }
//}

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GIrlFriend gf1 = new GIrlFriend();
        gf1.setName("mimi");
        gf1.setAge(18);
        gf1.setGender("m");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
