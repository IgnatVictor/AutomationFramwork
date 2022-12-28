package phpTravels;

import actions.PhpTravelPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.ChromeSetup;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.logging.Logger;

public class TravelPhpHeaderCheckTest extends ChromeSetup {



    @Test
    public void checkPageTitle() throws InterruptedException {
        PhpTravelPageObject phpTravelPageObject = new PhpTravelPageObject(driver);
        Thread.sleep(2000);
        Assert.assertEquals(phpTravelPageObject.getPageTitleText(),phpTravelUserRepositoryApplication.getPageTitleText());
    }
}
