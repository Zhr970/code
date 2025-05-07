package Test2;

public class Outer {
//    String name;

//    public class Inner{
//        static int a = 10;
//    }

//    public Inner getInstance(){
//        return new Inner();
//    }
    private int a = 10;
    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }

}
