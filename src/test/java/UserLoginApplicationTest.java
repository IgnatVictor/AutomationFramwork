import actions.UserLoginFormObject;
import org.testng.annotations.Test;
import common.ChromeSetup;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

public class UserLoginApplicationTest extends ChromeSetup {



    @Test
    public void checkSubmitFormLogin() {
        UserLoginFormObject userLoginFormObject = new UserLoginFormObject(driver);

        userLoginFormObject.setUsernameInputElement(userLoginRepository.getUsername());
        userLoginFormObject.setPasswordInputElement(userLoginRepository.getPassword());
        userLoginFormObject.clickLoginButton();
    }
}
