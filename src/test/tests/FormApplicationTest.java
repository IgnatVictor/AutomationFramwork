package tests;

import actions.FormPageObject;
import scenarios.CompleteFormScenario;
import common.MouseActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.common.ChromeSetup;

public class FormApplicationTest extends ChromeSetup {

    private final static int THREE_TIMES= 3;

    @Test
    public void checkTheTitleAfterFillingTheFormThreeTimes() {
        final MouseActions mouseActionsObject = new MouseActions(actions);
        FormPageObject formPageObject = new FormPageObject(driver);
        CompleteFormScenario completeFormScenario = new CompleteFormScenario(formPageObject,repositoryFormApplication);

        formPageObject.clickConsentElement();
        formPageObject.checkAutomationTesterBox();
        mouseActionsObject.scrollToElement(formPageObject.findSeleniumWebDriverBox());
        formPageObject.checkSeleniumWebDriverBox();
        completeFormScenario.completeFormMultipleTimes(THREE_TIMES);

        Assert.assertEquals(formPageObject.getPageTitleText(), repositoryFormApplication.getWebPageTitle());
    }

}
