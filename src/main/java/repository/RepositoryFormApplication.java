package repository;

import repository.formUser.FormUserModel;
import repository.formUser.FormUserService;
import repository.formUser.UserList;

public class RepositoryFormApplication {

    private final FormUserService formUserService= new FormUserService();



    public String getWebPageTitle() {
        String webPageTitle = "Demo Sign-Up Selenium Automation Practice Form";
        return webPageTitle;
    }

    public FormUserModel returnUser(int userNumber) {
        return formUserService.getUser(userNumber);
    }


}
