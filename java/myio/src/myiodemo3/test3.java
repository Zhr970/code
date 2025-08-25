package myiodemo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test3 {
    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream("sc3.txt");
//        StringBuilder sb = new StringBuilder();
//
//        int b;
//        while((b = fis.read())!= -1){
//            sb.append((char)b);
//        }
//        fis.close();
//
//        String str = sb.toString();
//        String[] arrStr = str.split("-");
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (String s : arrStr) {
//            int i = Integer.parseInt(s);
//            list.add(i);
//        }
//
//        Collections.sort(list);
//
//        FileWriter fos = new FileWriter("sc3.txt");
//        for (int i = 0; i < list.size(); i++) {
//            if(i == list.size()-1){
//                fos.write(list.get(i) + " ");
//            }else{
//                fos.write(list.get(i)+"-");
//            }
//        }
//        fos.close();


        FileInputStream fis = new FileInputStream("sc3.txt");
        StringBuilder sb = new StringBuilder();

        int b;
        while((b = fis.read())!= -1){
            sb.append((char)b);
        }
        System.out.println(sb);
        fis.close();

        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        FileWriter fw = new FileWriter("sc3.txt");
        String s = Arrays.toString(arr).replace(", ","-");
        String result = s.substring(1,s.length() -1);
        fw.write(result);
        fw.close();

    }
}
