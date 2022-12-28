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

public class TravelPhpSubHeaderCheckTest extends ChromeSetup {



    @Test
    public void checkPageSubTitle() {
        PhpTravelPageObject phpTravelPageObject = new PhpTravelPageObject(driver);
        Assert.assertEquals(phpTravelPageObject.getPageSubTitleText(),phpTravelUserRepositoryApplication.getPageSubtitleText());
    }
}
