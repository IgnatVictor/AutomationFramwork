package user;

import user.UserService;

public class UserApplication {

    UserService userService = new UserService();
    public String getUserName() {
        return userService.getUserName();
    }



}
