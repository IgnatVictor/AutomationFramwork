package applitools;

import actions.AppliToolsObject;
import common.ChromeSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class AppliToolsTestTableSortArtist extends ChromeSetup {

    @Test
    public void sortTableByArtistAscending() {

        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);
        List<String> tableRowData = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(applyToolsRepositoryApplication.sortListByArtistAscending());
        appliToolsObject.clickConsent();
        executor.executeScript("arguments[0].click();", appliToolsObject.getArtistElement());
        for (int i = 0; i < tableRowData.size(); i++) {
            Assert.assertEquals(appliToolsObject.getTableRowsToStrings().get(i), tableRowData.get(i));
        }
    }

    @Test
    public void sortTableByArtistDescending() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);
        List<String> tableRowData = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(applyToolsRepositoryApplication.sortListByArtistDescending());
        appliToolsObject.clickConsent();
        executor.executeScript("arguments[0].click();", appliToolsObject.getArtistElement());
        executor.executeScript("arguments[0].click();", appliToolsObject.getArtistElement());

        for (int i = 0; i < tableRowData.size(); i++) {
            Assert.assertEquals(appliToolsObject.getTableRowsToStrings().get(i), tableRowData.get(i));
        }
    }
}
