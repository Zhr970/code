package Test3;

public class Outer {

//    static class Inner{
//
//        public void show1(){
//            System.out.println("非静态方法被调用");
//        }
//
//        public static void show2(){
//            System.out.println("静态的方法被调用");
//        }
//
//    }


    int b = 20;
    public void show(){
        int a  =10;

        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的方法");
            }
            public static void method2(){
                System.out.println("局部内部类中的静态方法");
            }

        }
    }

}
