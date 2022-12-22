package phpTravels;

import actions.PhpTravelPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.ChromeSetup;

public class TravelPhpSubHeaderCheckTest extends ChromeSetup {

    @Test
    public void checkPageSubTitle() {
        PhpTravelPageObject phpTravelPageObject = new PhpTravelPageObject(driver);
        Assert.assertEquals(phpTravelPageObject.getPageSubTitleText(),phpTravelUserRepositoryApplication.getPageSubtitleText());
    }
}
