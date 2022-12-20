package tests;

import actions.UserLoginFormObject;
import org.testng.annotations.Test;
import tests.common.ChromeSetup;

public class UserLoginApplicationTest extends ChromeSetup {

    @Test
    public void checkSubmitFormLogin() {
        UserLoginFormObject userLoginFormObject = new UserLoginFormObject(driver);

        userLoginFormObject.setUsernameInputElement(userLoginRepository.getUsername());
        userLoginFormObject.setPasswordInputElement(userLoginRepository.getPassword());
        userLoginFormObject.clickLoginButton();
    }
}
