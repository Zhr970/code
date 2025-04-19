package Test5;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+" "+getColor()+" "+something);
    }
    public void lookHome(){
        System.out.println("看家");
    }

}
