package applitools;

import actions.AppliToolsObject;
import common.ChromeSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppliToolsTestTableSortCategory extends ChromeSetup {

    @Test
    public void tableSortCategoryAscendingCheck() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        appliToolsObject.clickConsent();
        appliToolsObject.sortAscendingCategoryElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedListByCategoryAscendingString());
    }

    @Test
    public void tableSortCategoryDescendingCheck() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        appliToolsObject.clickConsent();
        appliToolsObject.sortDescendingCategoryElements();
        Assert.assertEquals(appliToolsObject.getTableRowsText(), applyToolsRepositoryApplication.getSortedListByCategoryDescendingString());
    }
}
