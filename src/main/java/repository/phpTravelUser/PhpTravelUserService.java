package repository.phpTravelUser;

public class PhpTravelUserService {

    private PhpTravelUserModel phpTravelUser;

    public PhpTravelUserService() {
        this.phpTravelUser = new PhpTravelUserModel(PhpTravelUserData.FIRST_NAME, PhpTravelUserData.SECOND_NAME,
                PhpTravelUserData.BUSINESS_NAME, PhpTravelUserData.EMAIL);
    }

    public String getFirstName() {
        return phpTravelUser.getFirstName();
    }

    public String getLastName() {
        return phpTravelUser.getLastName();
    }

    public String getBusinessName() {
        return phpTravelUser.getBusinessName();
    }

    public String getEmail() {
        return phpTravelUser.getEmail();
    }
}
