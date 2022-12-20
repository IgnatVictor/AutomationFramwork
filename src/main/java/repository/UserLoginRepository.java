package repository;

import repository.userLogin.UserLoginService;

public class UserLoginRepository {

    private final UserLoginService userLoginService = new UserLoginService();

    public String getUsername() {
        return userLoginService.getUsername();
    }

    public String getPassword() {
        return userLoginService.getPassword();
    }


}
