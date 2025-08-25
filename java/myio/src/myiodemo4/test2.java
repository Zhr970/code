package myiodemo4;

import java.io.*;
import java.util.*;

public class test2 {
    public static void main(String[] args) throws IOException {

        //方法1
//        BufferedReader br = new BufferedReader(new FileReader("sc.txt"));
//        String line;
//        ArrayList<String> list = new ArrayList<>();
//        while((line = br.readLine())!= null){
//            list.add(line);
//        }
//        br.close();
//
//        Collections.sort(list,new Comparator<String>() {
//
//            @Override
//            public int compare(String o1, String o2) {
//                int i1 = Integer.parseInt(o1.split("\\.")[0]);
//                int i2 = Integer.parseInt(o2.split("\\.")[0]);
//                return i1 - i2;
//            }
//        });
//
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("sc4.txt"));
//        for (String s : list) {
//            bw.write(s);
//            bw.newLine();
//        }
//        bw.close();



        //方法2
        BufferedReader br = new BufferedReader(new FileReader("sc.txt"));
        String line;
        TreeMap<Integer,String> map = new TreeMap<>();
        while((line = br.readLine())!= null){
            String[] str = line.split("\\.");
            map.put(Integer.parseInt(str[0]),line);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("sc4.txt"));
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();

    }
}
