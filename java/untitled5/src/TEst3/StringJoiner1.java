package TEst3;

public class StringJoiner {
    public static void main(String[] args) {
        //
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb");
        System.out.println(sj);
    }
}
