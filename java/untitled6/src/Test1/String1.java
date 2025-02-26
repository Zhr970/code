package Test1;

public class String1 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2+"c";
        System.out.println(s1==s3);//false

        String s4 = "a"+"b"+"c";
        System.out.println(s1==s4);//ture

        StringBuffer sb = new StringBuffer();
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println();
        sb.append("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println();
        sb.append("---abcdefghijklmn");
        System.out.println(sb.capacity());
        System.out.println(sb.length());



    }
}
