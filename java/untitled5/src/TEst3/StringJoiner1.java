package TEst3;

import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        //
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb");
        System.out.println(sj);

        //
        StringJoiner sj2 = new StringJoiner("---","[","]");
        sj2.add("qqq").add("www").add("eee");
        System.out.println(sj2);

        int len = sj2.length();
        System.out.println(len);//17

        String str = sj2.toString();
        System.out.println(str);

    }
}
