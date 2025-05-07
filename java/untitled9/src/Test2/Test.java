package Test2;

public class Test {
    public static void main(String[] args) {

//        Outer.Inner oi = new Outer().new Inner();
//        Outer o =new Outer();
//        System.out.println(o.getClass().getName());

        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
