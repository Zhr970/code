package demo1;

public class idea_one {
    public static void main(String[] args) {
        System.out.println("hello");

        char one = '\n';
        char two = '\t';
        char three = '\r';
        char fore = '\\';
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(fore);

        String book1 = "book1";
        String book2 = "book2";
        System.out.println(book1 + book2);
        String name1 = "张三";
        String name2 = "李四";
        System.out.println(name1 + name2);
        int age = 10;
        String sex = "男";
        String hobby = "羽毛球";
        System.out.println("姓名\t年龄\t性别\t爱好");
        System.out.println(name1 + "\t" + age + "\t" + sex + "\t" + hobby);

    }
}
