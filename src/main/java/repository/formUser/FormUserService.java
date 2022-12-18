package repository.formUser;

public class FormUserService {

    private FormUserModel[] userList;

    private void generateFormUserList() {
        userList = new FormUserModel[3];

        userList[0]= new FormUserModel(FormUserData.FIRST_NAME,FormUserData.LAST_NAME,FormUserData.DATE);
        userList[1]= new FormUserModel(FormUserDataSecond.FIRST_NAME,FormUserDataSecond.LAST_NAME,FormUserDataSecond.DATE);
        userList[2]= new FormUserModel(FormUserDataThird.FIRST_NAME,FormUserDataThird.LAST_NAME,FormUserDataThird.DATE);
    }

    public  String getDate(int index) {
        return userList[index].getDate();
    }

    public String getFirstName(int index) {
        if(userList == null) {
            generateFormUserList();
        }
        return userList[index].getFirstName();
    }

    public String getLastName(int index) {
        return userList[index].getLastName();
    }

}
