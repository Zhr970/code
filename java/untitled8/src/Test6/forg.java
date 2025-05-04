package Test6;

public class forg extends Animal {

    public forg() {
    }

    public forg(String name,int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
