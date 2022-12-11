package user;

import java.util.Optional;

public class UserService {

    private final UserModel userModel= new UserModel();

    public String getUserName() {
        return userModel.getUserData();
    }



};





