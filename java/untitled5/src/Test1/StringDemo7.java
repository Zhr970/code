package Test1;

public class StringDemo7 {
    public static void main(String[] args) {

        String talk = "abcdef";

        String[] arr = {"a","b","c"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
