package AgainTest3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 学生管理系统主程序
 * 功能包含：登录、注册、忘记密码
 */
public class App {
    // 最大登录尝试次数
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner mainScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 学生管理系统 ===");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 忘记密码");
            System.out.println("0. 退出");
            System.out.print("请选择操作：");

            int choice = mainScanner.nextInt();
            switch (choice) {
                case 1 -> login(userList);
                case 2 -> register(userList);
                case 3 -> forgetPassword(userList);
                case 0 -> {
                    System.out.println("感谢使用，再见！");
                    System.exit(0);
                }
                default -> System.out.println("无效选项，请重新输入");
            }
        }
    }

    /**
     * 用户登录功能
     * @param userList 用户数据集合
     */
    private static void login(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= MAX_LOGIN_ATTEMPTS; attempt++) {
            System.out.println("\n--- 登录 (尝试 " + attempt + "/" + MAX_LOGIN_ATTEMPTS + ") ---");

            // 用户名验证
            System.out.print("请输入用户名：");
            String username = scanner.next();
            if (!isUserExists(userList, username)) {
                System.out.println("用户未注册，请先注册");
                return;
            }

            // 密码验证
            System.out.print("请输入密码：");
            String password = scanner.next();

            // 验证码校验
            if (!validateVerificationCode()) {
                continue;
            }

            // 用户信息校验
            if (validateCredentials(userList, username, password)) {
                System.out.println("\n登录成功！");
                enterSystem();
                return;
            }

            System.out.println("用户名或密码错误");
            if (attempt == MAX_LOGIN_ATTEMPTS) {
                System.out.println("错误次数过多，账户已锁定");
                lockAccount(username);
            }
        }
    }

    /**
     * 用户注册功能
     * @param userList 用户数据集合
     */
    private static void register(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- 注册新用户 ---");

        // 用户名校验
        String username;
        while (true) {
            System.out.print("请输入用户名（3-15位字母数字）：");
            username = scanner.next();
            if (validateUsernameFormat(username) && !isUserExists(userList, username)) {
                break;
            }
        }

        // 密码校验
        String password;
        while (true) {
            System.out.print("请输入密码：");
            password = scanner.next();
            System.out.print("请再次输入密码：");
            if (password.equals(scanner.next())) break;
            System.out.println("两次输入的密码不一致");
        }

        // 身份证校验
        String personID;
        while (true) {
            System.out.print("请输入身份证号：");
            personID = scanner.next();
            if (validatePersonID(personID)) break;
        }

        // 手机号校验
        String phoneNumber;
        while (true) {
            System.out.print("请输入手机号：");
            phoneNumber = scanner.next();
            if (validatePhoneNumber(phoneNumber)) break;
        }

        // 创建用户对象
        User newUser = new User(username, password, personID, phoneNumber);
        userList.add(newUser);
        System.out.println("\n注册成功！");
    }

    /**
     * 密码找回功能
     * @param userList 用户数据集合
     */
    private static void forgetPassword(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- 密码找回 ---");

        // 用户名验证
        System.out.print("请输入用户名：");
        String username = scanner.next();
        if (!isUserExists(userList, username)) {
            System.out.println("用户不存在");
            return;
        }

        // 身份验证
        System.out.print("请输入身份证号：");
        String personID = scanner.next();
        System.out.print("请输入手机号：");
        String phoneNumber = scanner.next();

        User targetUser = getUser(userList, username);
        if (targetUser == null || !targetUser.getPersonID().equals(personID)
                || !targetUser.getPhoneNumber().equals(phoneNumber)) {
            System.out.println("身份验证失败");
            return;
        }

        // 设置新密码
        String newPassword;
        while (true) {
            System.out.print("请输入新密码：");
            newPassword = scanner.next();
            System.out.print("请再次输入：");
            if (newPassword.equals(scanner.next())) break;
            System.out.println("两次输入不一致");
        }

        targetUser.setPassword(newPassword);
        System.out.println("密码修改成功！");
    }

    //================ 工具方法 ================

    /**
     * 验证用户名格式
     * @param username 待验证的用户名
     * @return 是否符合格式要求
     */
    private static boolean validateUsernameFormat(String username) {
        // 长度检查
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("用户名长度需为3-15位");
            return false;
        }

        // 字符组成检查
        boolean hasLetter = false;
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("只能包含字母和数字");
                return false;
            }
            if (Character.isLetter(c)) hasLetter = true;
        }

        if (!hasLetter) {
            System.out.println("必须包含至少一个字母");
            return false;
        }
        return true;
    }

    /**
     * 验证身份证格式
     * @param personID 身份证号码
     * @return 是否有效
     */
    private static boolean validatePersonID(String personID) {
        if (personID.length() != 18) {
            System.out.println("身份证号必须为18位");
            return false;
        }

        // 前17位必须是数字
        for (int i = 0; i < 17; i++) {
            if (!Character.isDigit(personID.charAt(i))) {
                System.out.println("前17位必须为数字");
                return false;
            }
        }

        // 最后一位校验
        char lastChar = personID.charAt(17);
        if (!(Character.isDigit(lastChar) || lastChar == 'X' || lastChar == 'x')) {
            System.out.println("最后一位应为数字或X");
            return false;
        }
        return true;
    }

    /**
     * 验证手机号格式
     * @param phoneNumber 手机号码
     * @return 是否有效
     */
    private static boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11 || phoneNumber.charAt(0) == '0') {
            System.out.println("手机号应为11位且不能以0开头");
            return false;
        }

        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("必须为纯数字");
                return false;
            }
        }
        return true;
    }

    /**
     * 生成随机验证码（4字母+1数字）
     * @return 生成的验证码
     */
    private static String generateVerificationCode() {
        ArrayList<Character> chars = new ArrayList<>();
        // 添加字母
        for (char c = 'a'; c <= 'z'; c++) chars.add(c);
        for (char C = 'A'; C <= 'Z'; C++) chars.add(C);

        Random rand = new Random();
        StringBuilder code = new StringBuilder();

        // 生成4个随机字母
        for (int i = 0; i < 4; i++) {
            code.append(chars.get(rand.nextInt(chars.size())));
        }

        // 添加1个随机数字
        code.append(rand.nextInt(10));

        // 随机打乱顺序
        char[] arr = code.toString().toCharArray();
        int swapIndex = rand.nextInt(arr.length);
        char temp = arr[swapIndex];
        arr[swapIndex] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        return new String(arr);
    }

    /**
     * 验证用户身份信息
     * @param userList 用户列表
     * @param username 用户名
     * @param password 密码
     * @return 验证是否成功
     */
    private static boolean validateCredentials(ArrayList<User> userList,
                                               String username, String password) {
        for (User user : userList) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 检查用户是否存在
     */
    private static boolean isUserExists(ArrayList<User> userList, String username) {
        return userList.stream().anyMatch(u -> u.getName().equals(username));
    }

    /**
     * 验证码校验流程
     */
    private static boolean validateVerificationCode() {
        Scanner scanner = new Scanner(System.in);
        String correctCode = generateVerificationCode();
        System.out.println("验证码：" + correctCode);
        System.out.print("请输入验证码（不区分大小写）：");
        String inputCode = scanner.next();

        if (!inputCode.equalsIgnoreCase(correctCode)) {
            System.out.println("验证码错误");
            return false;
        }
        return true;
    }

    /**
     * 获取用户对象
     */
    private static User getUser(ArrayList<User> userList, String username) {
        return userList.stream()
                .filter(u -> u.getName().equals(username))
                .findFirst()
                .orElse(null);
    }

    /**
     * 锁定账户（示例方法）
     */
    private static void lockAccount(String username) {
        // 实现账户锁定逻辑（如添加到锁定列表）
        System.out.println("账户 " + username + " 已被锁定");
    }

    /**
     * 进入系统后的操作（示例）
     */
    private static void enterSystem() {
        System.out.println("\n=== 系统功能 ===");
        System.out.println("1. 查询学生信息");
        System.out.println("2. 修改个人信息");
        System.out.println("3. 退出登录");
        // 实际系统功能实现...
    }
}

