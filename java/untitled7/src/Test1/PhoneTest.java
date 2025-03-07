package Test1;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        Phone s1 = new Phone("xiaomi",1000);
        Phone s2 = new Phone("huawei",6000);
        Phone s3 = new Phone("vivo",3000);
        phones.add(s1);
        phones.add(s2);
        phones.add(s3);
        ArrayList<Phone> phone = getBrand(phones);

        for (int i = 0; i < phone.size(); i++) {
            Phone p = phone.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }

    }
    public static ArrayList<Phone> getBrand(ArrayList<Phone> phones) {
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            Phone p = phones.get(i);
            int price = p.getPrice();
            if (price < 6000) {
                result.add(p);
            }
        }
        return result;
    }
}
