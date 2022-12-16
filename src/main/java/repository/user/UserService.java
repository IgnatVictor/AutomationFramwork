package repository.user;

import repository.user.UserData;
import repository.user.UserModel;

public class UserService {

    private UserModel userModelObject;


    public String getUserName() {
        userModelObject = new UserModel(UserData.LOGIN_INFO);
        return userModelObject.getUser();
    }


};





