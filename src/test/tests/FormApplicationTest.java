package tests;

import actions.FormPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.common.ChromeSetup;

public class FormApplicationTest extends ChromeSetup {
    @Test(priority = 1)
    public void fillUpForm() {

        FormPageObject formPageObject = new FormPageObject(driver);
        formPageObject.clickConsentElement();
        formPageObject.checkAutomationTesterBox();
        formPageObject.checkSeleniumWebDriverBox();
        for (int i = 0; i < 3; i++) {
            System.out.println(repositoryFormApplication.returnUser(i).getFirstName());
            formPageObject.setSignInInputFields(repositoryFormApplication.returnUser(i).getFirstName(), repositoryFormApplication.returnUser(i).getLastName(), repositoryFormApplication.returnUser(i).getDate());
            formPageObject.selectMaleObject();
            formPageObject.setYearsOfExperience(repositoryFormApplication.returnUser(i).getYearsOfExp());
            formPageObject.clickSubmitButtonForm();
            if (i < 2) {
                formPageObject.clearInputElements();
            }
        }

        Assert.assertEquals(formPageObject.getPageTitleText(), repositoryFormApplication.getWebPageTitle());
    }

}
