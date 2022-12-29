package applitools;

import actions.AppliToolsObject;
import common.ChromeSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppliToolsTestTableSortArtist extends ChromeSetup {

    @Test
    public void tableSortArtistAscendingCheck() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        appliToolsObject.clickConsent();
        appliToolsObject.sortAscendingArtistElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedByArtistAscendingString());
    }

    @Test
    public void tableSortArtistDescendingCheck() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        appliToolsObject.clickConsent();
        appliToolsObject.sortDescendingArtistElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedByArtistDescendingString());
    }
}
