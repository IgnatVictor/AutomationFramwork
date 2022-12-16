package repository.formUser;

public class FormUserModel extends  FormUserData {

    private FormUserData formUserData ;

    public FormUserModel(String firstName, String lastName, int yearsOfExp, String date) {
        super(firstName, lastName, yearsOfExp, date);
    }


    public FormUserData getFormUserData() {
        return formUserData;
    }
}
