package user;

public  class UserModel {

        private UserData userData;
    public UserModel() {
        this.userData = new UserData();
    }

    public String getUserData() {
        return userData.LOGIN_INFO;
    }
}
