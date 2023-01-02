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
        List<String> tableRowData = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(applyToolsRepositoryApplication.sortListByNameDescending());
        appliToolsObject.clickConsent();
        appliToolsObject.sortAscendingArtistElements();
        for(int i=0; i<tableRowData.size();i++ )
        Assert.assertEquals(appliToolsObject.getTableRowsText(), tableRowData.get(i));
    }

    @Test
    public void sortTableByArtistDescending() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);
        List<String> tableRowData = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(applyToolsRepositoryApplication.getSortedListByArtistAscending());
        appliToolsObject.clickConsent();
        appliToolsObject.sortDescendingArtistElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedByArtistDescendingString());
    }
}
