package repository.formUser;

import repository.google.user.UserModel;

public class FormUserService {

    private UserList userList =new UserList();


    public FormUserModel getUser(int userNumber) {
        return  userList.getUser(userNumber);
    }



}
