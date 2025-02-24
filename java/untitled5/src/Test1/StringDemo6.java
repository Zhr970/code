package Test1;

public class StringDemo6 {
    public static void main(String[] args) {

//        String phoneNumber = "100861111111";
//
//        String start = phoneNumber.substring(0,3);
//
//        String end = phoneNumber.substring(7);
//
//        String result = start+"****"+end;
//
//        System.out.println(result);

        String id = "130921202510101010";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);

        System.out.println("出生年月日为"+year+"."+month+"."+day);

        char gender = id.charAt(16);
        int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("性别为：female");
        }else{
            System.out.println("性别为：male");
        }
    }

}
