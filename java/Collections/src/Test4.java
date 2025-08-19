import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("11");
        list1.add("111");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("22");
        list2.add("222");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("3");
        list3.add("33");
        list3.add("333");

        map.put("01", list1);
        map.put("02", list2);
        map.put("03", list3);

        Set<Map.Entry<String,ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String,ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner joiner = new StringJoiner(",","","");
            for (String number : value) {
                joiner.add(number);
            }
            System.out.println(key + " = " + joiner);
        }



    }
}
