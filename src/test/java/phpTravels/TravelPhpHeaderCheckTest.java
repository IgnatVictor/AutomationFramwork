package phpTravels;

import actions.PhpTravelPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.ChromeSetup;

public class TravelPhpHeaderCheckTest extends ChromeSetup {

    @Test
    public void checkPageTitle() {
        PhpTravelPageObject phpTravelPageObject = new PhpTravelPageObject(driver);
        Assert.assertEquals(phpTravelPageObject.getPageTitleText(),phpTravelUserRepositoryApplication.getPageTitleText());
    }
}
