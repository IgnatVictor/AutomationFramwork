package tests;

import actions.FormPageObject;
import common.MouseActions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.common.ChromeSetup;

public class FormApplicationTest extends ChromeSetup {



    @Test(priority = 1)
    public void fillUpForm() {
        final MouseActions mouseActionsObject= new MouseActions(actions);
        FormPageObject formPageObject = new FormPageObject(driver);
        formPageObject.clickConsentElement();
        formPageObject.checkAutomationTesterBox();
        mouseActionsObject.scrollToElement(formPageObject.findSeleniumWebDriverBox());

        formPageObject.checkSeleniumWebDriverBox();
        completeFormThreeTimes(formPageObject);

        Assert.assertEquals(formPageObject.getPageTitleText(), repositoryFormApplication.getWebPageTitle());
    }

    private void completeFormThreeTimes(FormPageObject formPageObject) {
        for (int i = 0; i < 3; i++) {
            formPageObject.setSignInInputFields(repositoryFormApplication.getFirstName(i), repositoryFormApplication.getLastName(i), repositoryFormApplication.getDate(i));
            formPageObject.selectMaleObject();
            formPageObject.setYearsOfExperience(i);
            formPageObject.clickSubmitButtonForm();
            if (i < 2) {
                formPageObject.clearInputElements();
            }
        }
    }

}
