package Test2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        // 键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();

        // 打乱字符串
        String shuffledString = shuffle(input);
        System.out.println("打乱后的字符串为：" + shuffledString);
    }

    // 打乱字符串
    public static String shuffle(String input) {
        // 将字符串转换为字符列表
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }

        // 使用 Collections.shuffle 打乱列表
        Collections.shuffle(characters);

        // 将字符列表转换回字符串
        StringBuilder shuffledString = new StringBuilder();
        for (char c : characters) {
            shuffledString.append(c);
        }

        return shuffledString.toString();
    }
}

