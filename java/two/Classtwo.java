public class Classtwo {
    public static void main(String[] args) {
        int days = 59;
        int weeks = days / 7;
        int leftdays = days % 7;
        System.out.println("周：" + weeks + " 天：" + leftdays);

        double huashi = 234.5;
        double sheshi=5/9 *(huashi-100);
        System.out.println("华氏温度"+huashi+"摄氏温度"+sheshi);
    }
}