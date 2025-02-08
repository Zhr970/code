package test1;

//public class GIrlFriend {
//    //属性
//    String name;
//    int age;
//    String gender;
//
//    //行为
//    public void sleep(){
//        System.out.println("sleep");
//    }
//    public void eat(){
//        System.out.println("eat");
//    }
//
//}

public class GIrlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量，提供get和set方法

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //行为

    public void sleep(){
        System.out.println("sleep");
    }

    public void eat(){
        System.out.println("eat");
    }
}