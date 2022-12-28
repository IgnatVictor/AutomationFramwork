package applitools;

import actions.AppliToolsObject;
import common.ChromeSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppliToolsTestTableSortName extends ChromeSetup {

    @Test
    public void tableSortNameAscendingCheck() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        appliToolsObject.clickConsent();
        appliToolsObject.sortAscendingNameElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedByNameAscendingTabelRowsString());
    }


    @Test
    public void tableSortNameDescendingCheck() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        appliToolsObject.clickConsent();
        appliToolsObject.sortDescendingNameElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedListByNameDescendingTableRowsString());

    }

}
