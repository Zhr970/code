package AgainTest3;

/**
 * 用户实体类，存储用户基本信息
 * 包含用户名、密码、身份证号、手机号字段
 */
public class User {
    // 用户属性
    private String name;        // 用户名（3-15位字母数字组合）
    private String password;    // 密码（需两次验证）
    private String personID;    // 身份证号（18位，末位可数字/X）
    private String phoneNumber; // 手机号（11位非0开头数字）

    // 构造方法
    public User() {}

    /**
     * 全参数构造方法
     * @param name 用户名
     * @param password 密码
     * @param personID 身份证号
     * @param phoneNumber 手机号
     */
    public User(String name, String password, String personID, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.personID = personID;
        this.phoneNumber = phoneNumber;
    }

    // Getter & Setter 方法
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getPersonID() { return personID; }
    public void setPersonID(String personID) { this.personID = personID; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

