package Test1;

public class Test {
    public static void main(String[] args) {
        PingPang pp = new PingPang("001",22);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.study();
        pp.speakEnglish();
    }
}
