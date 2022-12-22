package repository;

import repository.phpTravelUser.PhpTravelUserService;

public class PhpTravelUserRepositoryApplication {

    private final PhpTravelUserService phpTravelUserService = new PhpTravelUserService();

    public String getPageSubtitleText() {
        String pageSubTitle = "Test drive online the demo product available with complete features";
        return pageSubTitle;
    }

    public String getPageTitleText() {
        String pageTitle = "PHPTRAVELS Demo";
        return pageTitle;
    }

    public String getFirstName() {
        return phpTravelUserService.getFirstName();
    }

    public String getLastName() {
        return phpTravelUserService.getLastName();
    }

    public String getBusinessName() {
        return phpTravelUserService.getBusinessName();
    }

    public String getEmail() {
        return phpTravelUserService.getEmail();
    }
}
