package repository;

import repository.google.user.UserService;

public class RepositoryApplication {

    private final UserService userService = new UserService();

    public String getUserName() {
        return userService.getUserName();
    }

}
