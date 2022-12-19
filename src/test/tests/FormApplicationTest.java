package tests;

import actions.FormPageObject;
import actions.scenarios.CompleteFormScenario;
import common.MouseActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.common.ChromeSetup;

public class FormApplicationTest extends ChromeSetup {

    @Test(priority = 1)
    public void fillUpForm() {
        final MouseActions mouseActionsObject = new MouseActions(actions);
        CompleteFormScenario completeFormScenario = new CompleteFormScenario();
        FormPageObject formPageObject = new FormPageObject(driver);
        formPageObject.clickConsentElement();
        formPageObject.checkAutomationTesterBox();
        mouseActionsObject.scrollToElement(formPageObject.findSeleniumWebDriverBox());
        formPageObject.checkSeleniumWebDriverBox();
        completeFormScenario.completeFormMultipleTimes(formPageObject, repositoryFormApplication,3);

        Assert.assertEquals(formPageObject.getPageTitleText(), repositoryFormApplication.getWebPageTitle());
    }

}
