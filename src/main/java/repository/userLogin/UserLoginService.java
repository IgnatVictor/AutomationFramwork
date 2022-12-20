package repository.userLogin;

public class UserLoginService {

    private final UserLoginModel userLoginModel;

    public UserLoginService() {
        this.userLoginModel = new UserLoginModel(UserLoginData.USERNAME, UserLoginData.PASSWORD);
    }

    public String getUsername() {
        return userLoginModel.getUserName();
    }

    public String getPassword() {
        return userLoginModel.getPassword();
    }
}
