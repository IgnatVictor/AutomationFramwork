import actions.FormPageObject;
import org.xml.sax.SAXException;
import scenarios.CompleteFormScenario;
import common.MouseActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.ChromeSetup;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

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
