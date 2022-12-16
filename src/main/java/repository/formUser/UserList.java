package repository.formUser;

public class UserList {

    private FormUserModel[] userList = new FormUserModel[3];

    public UserList() {
        userList[0]= new FormUserModel("Ignat","Victor",0,"12.02.1987");
        userList[1]=new FormUserModel("Mircea","Andrei",1,"14.01.1986");
        userList[2] = new FormUserModel("Calin","Sandu",2,"15.02.1989");
    }

    public FormUserModel getUser(int userNumber) {
        return userList[userNumber];
    }
    public FormUserModel[] getUserList() {
        return  userList;
    }



}
