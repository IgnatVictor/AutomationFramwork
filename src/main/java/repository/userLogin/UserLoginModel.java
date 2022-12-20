package repository.userLogin;

public class UserLoginModel {
    private final String userName;
    private final String password;

    public UserLoginModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
