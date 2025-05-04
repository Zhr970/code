package Test1;

public class Basketball extends Sporter{
    public Basketball() {
    }

    public Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("；篮球运动员在学习打篮球");
    }
}
