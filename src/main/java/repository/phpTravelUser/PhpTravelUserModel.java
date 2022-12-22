package repository.phpTravelUser;

public class PhpTravelUserModel {

    private final String firstName;
    private final String lastName;
    private final String businessName;
    private final String email;

    public PhpTravelUserModel(String firstName, String lastName, String businessName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getEmail() {
        return email;
    }
}
