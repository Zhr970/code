package Test5;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public void keepPet(Dog dog,String something){
//        System.out.println(age+" "+name+" "+dog.getColor()+" "+dog.getAge());
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat,String something){
//        System.out.println(age+" "+name+" "+cat.getColor()+" "+cat.getAge());
//        cat.eat(something);
//    }
    public void keepPet(Animal a,String something) {
        if (a instanceof Dog d) {
            System.out.println(age + " " + name + " " + d.getColor() + " " + d.getAge() +" "+ "dog");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println(age + " " + name + " " + c.getColor() + " " + c.getAge() + "cat");
            c.eat(something);
        } else {
            System.out.println("没有这种动物");
        }

    }
}
