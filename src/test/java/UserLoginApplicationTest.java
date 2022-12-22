import actions.UserLoginFormObject;
import org.testng.annotations.Test;
import common.ChromeSetup;

public class UserLoginApplicationTest extends ChromeSetup {

    @Test
    public void checkSubmitFormLogin() {
        UserLoginFormObject userLoginFormObject = new UserLoginFormObject(driver);

        userLoginFormObject.setUsernameInputElement(userLoginRepository.getUsername());
        userLoginFormObject.setPasswordInputElement(userLoginRepository.getPassword());
        userLoginFormObject.clickLoginButton();
    }
}
