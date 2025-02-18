package test3;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[2];

        Phone p1 = new Phone("xiaomi","write",1999);
        Phone p2 = new Phone("iPhone","blue",5999);

        phones[0] = p1;
        phones[1] = p2;

        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
            Phone phone = phones[i];
            sum+=phone.getPrice();
        }
        int avg = sum/phones.length;
        System.out.println(avg);
    }
}
