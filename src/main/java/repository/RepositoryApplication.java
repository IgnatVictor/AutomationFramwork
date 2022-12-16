package repository;

import repository.user.UserService;

public class RepositoryApplication {

    private final UserService userService = new UserService();

    public String getUserName() {
        return userService.getUserName();
    }


}
