package applitools;

import actions.AppliToolsObject;
import common.ChromeSetup;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.applyTools.MusicModelRow;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTableSortNameAppliTools extends ChromeSetup {

    @Test
    public void sortTableByArtistAscending() {

        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);
        List<MusicModelRow> tableRowData = applyToolsRepositoryApplication.getTableRows()
                .stream()
                .sorted(Comparator.comparing(MusicModelRow::getName)).collect(Collectors.toList());

        List<String> tableRowDataString = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(tableRowData);
        appliToolsObject.clickConsent();
        executor.executeScript("arguments[0].click();", appliToolsObject.getNameElement());
        for (int i = 0; i < tableRowData.size(); i++) {
            Assert.assertEquals(appliToolsObject.getTableRowsToStrings().get(i), tableRowDataString.get(i));
        }
    }

    @Test
    public void sortTableByArtistDescending() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);
        List<MusicModelRow> tableRowData = applyToolsRepositoryApplication.getTableRows()
                .stream()
                .sorted(Comparator.comparing(MusicModelRow::getName)).collect(Collectors.toList())
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getName))).collect(Collectors.toList());
        ;
        List<String> tableRowDataString = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(tableRowData);
        appliToolsObject.clickConsent();
        executor.executeScript("arguments[0].click();", appliToolsObject.getNameElement());
        executor.executeScript("arguments[0].click();", appliToolsObject.getNameElement());

        for (int i = 0; i < tableRowData.size(); i++) {
            Assert.assertEquals(appliToolsObject.getTableRowsToStrings().get(i), tableRowDataString.get(i));
        }
    }
}
