import actions.AccountsPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.ChromeSetup;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;


public class UserApplicationTest extends ChromeSetup {




    @Test
    public void checkIfTheFieldsFilledCorrectly() {
        AccountsPageObject accountsPageObject = new AccountsPageObject(driver);

        accountsPageObject.setSignInInputField(userApplication.getUserName());

        Assert.assertEquals(accountsPageObject.getSignInInputText(), userApplication.getUserName());
    }
}
