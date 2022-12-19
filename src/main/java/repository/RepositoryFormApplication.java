package repository;

import repository.formUser.FormUserService;

public class RepositoryFormApplication {

    private final FormUserService formUserService= new FormUserService();

    public String getWebPageTitle() {
        String webPageTitle = "Demo Sign-Up Selenium Automation Practice Form";
        return webPageTitle;
    }

    public String getDate(int index) {return formUserService.getDate(index);}
    public String getFirstName(int index) {
        return formUserService.getFirstName(index);
    }
    public String getLastName(int index) {return formUserService.getLastName(index);}

}
