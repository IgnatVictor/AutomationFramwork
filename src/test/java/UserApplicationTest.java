import actions.AccountsPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.ChromeSetup;


public class UserApplicationTest extends ChromeSetup {


    @Test
    public void checkIfTheFieldsFilledCorrectly() {
        AccountsPageObject accountsPageObject = new AccountsPageObject(driver);

        accountsPageObject.setSignInInputField(userApplication.getUserName());

        Assert.assertEquals(accountsPageObject.getSignInInputText(), userApplication.getUserName());
    }
}
