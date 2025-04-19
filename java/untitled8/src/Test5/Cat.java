package Test5;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+" "+getColor()+" "+something);
    }
    public void catMouse(){
        System.out.println("猫捉老鼠");
    }
}
