package Test5;

public class test {
    public static void main(String[] args) {

//        Person person = new Person("laowang",30);
//        Dog d =new Dog(2,"hei");
//        person.keepPet(d,"gutou");
//
//        Cat c = new Cat(3,"huang");
//        person.keepPet(c,"zhualaoshu");

        Person p = new Person("laowang",30);
        Dog d = new Dog(2,"hei");
        Cat c = new Cat(3,"huang");
        p.keepPet(d,"gutou");
        p.keepPet(d,"yu");
    }
}
