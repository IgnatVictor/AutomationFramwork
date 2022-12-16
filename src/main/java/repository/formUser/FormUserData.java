package repository.formUser;

public abstract class FormUserData {

    private final String firstName;
    private final String lastName;
    private final int yearsOfExp;
    private final String date;

    public FormUserData(String firstName, String lastName, int yearsOfExp, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExp = yearsOfExp;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public String getDate() {
        return date;
    }
}
