package phpTravels;

import actions.PhpTravelPageObject;
import org.testng.annotations.Test;
import common.ChromeSetup;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

public class TravelPhpFillInputTest extends ChromeSetup {



    @Test
        public void fillInputForm() {
            PhpTravelPageObject phpTravelPageObject = new PhpTravelPageObject(driver);

            phpTravelPageObject.setFirstNameInput(phpTravelUserRepositoryApplication.getFirstName());
            phpTravelPageObject.setLastNameInput(phpTravelUserRepositoryApplication.getLastName());
            phpTravelPageObject.setBusinessNameInput(phpTravelUserRepositoryApplication.getBusinessName());
            phpTravelPageObject.setEmailInput(phpTravelUserRepositoryApplication.getEmail());
        }
}
