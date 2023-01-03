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

public class TestTableSortCategoryAppliTools extends ChromeSetup {

    @Test
    public void sortTableByArtistAscending() {

        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);

        List<MusicModelRow> tableRowData = applyToolsRepositoryApplication.getTableRows()
                .stream()
                .sorted(Comparator.comparing(MusicModelRow::getCategory)).collect(Collectors.toList());
        List<String> tableRowDataStringActual = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(tableRowData);

        executor.executeScript("arguments[0].click();", appliToolsObject.getCategoryElement());
        List<String> tableRowDataExpected= stringBuilderFromList.getTableRowsToStrings(appliToolsObject.getTableRows());
        for (int i = 0; i < tableRowData.size(); i++) {
            Assert.assertEquals(tableRowDataExpected.get(i), tableRowDataStringActual.get(i));
        }
    }

    @Test
    public void sortTableByArtistDescending() {
        AppliToolsObject appliToolsObject = new AppliToolsObject(driver);
        List<MusicModelRow> tableRowData = applyToolsRepositoryApplication.getTableRows()
                .stream()
                .sorted(Comparator.comparing(MusicModelRow::getCategory)).collect(Collectors.toList())
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(MusicModelRow::getCategory))).collect(Collectors.toList());
        List<String> tableRowDataStringActual = stringBuilderFromList.transformTableOfRowsIntoListOfStrings(tableRowData);

        executor.executeScript("arguments[0].click();", appliToolsObject.getCategoryElement());
        executor.executeScript("arguments[0].click();", appliToolsObject.getCategoryElement());
        List<String> tableRowDataExpectedExpected= stringBuilderFromList.getTableRowsToStrings(appliToolsObject.getTableRows());
        for (int i = 0; i < tableRowData.size(); i++) {
            Assert.assertEquals(tableRowDataExpectedExpected.get(i), tableRowDataStringActual.get(i));
        }
    }
}
