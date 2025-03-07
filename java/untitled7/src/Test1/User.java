package Test1;

public class User {
    private String id;
     private String ueername;
     private String password;

    public User() {
    }

    public User(String id, String username, String password) {
        this.ueername = ueername;
        this.password = password;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUeername() {
        return ueername;
    }

    public void setUeername(String ueername) {
        this.ueername = ueername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
