package repository.google.user;

public class UserService {

    private UserModel userModelObject;


    public String getUserName() {
        userModelObject = new UserModel(UserData.LOGIN_INFO);
        return userModelObject.getUser();
    }


};





