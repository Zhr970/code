package Test2;
import java.util.Scanner;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();

        // 打乱字符串
        String shuffledString = shuffle(input);
        System.out.println("打乱后的字符串为：" + shuffledString);
    }
    // 打乱字符串
    public static String shuffle(String input) {
        // 将字符串转换为字符数组
        char[] characters = input.toCharArray();

        // 使用 Random 类生成随机索引
        Random random = new Random();

        // 打乱字符数组
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length); // 生成随机索引
            // 交换当前字符和随机索引处的字符
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }

        // 将字符数组转换回字符串
        return new String(characters);
    }

}
