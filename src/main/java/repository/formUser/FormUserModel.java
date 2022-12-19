package repository.formUser;

public class FormUserModel {

    private final String firstName;
    private final String lastName;
    private final String date;

    public FormUserModel(String firstName, String lastName, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
