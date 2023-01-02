package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AppliToolsObject {

    private final WebDriver driver;
    private WebElement artist;
    private WebElement category;
    private WebElement consent;
    List<WebElement> tableRows;
    private WebElement name;

    public AppliToolsObject(WebDriver webDriver) {
        this.driver = webDriver;

    }

    private List<WebElement> getTableRows() {
        tableRows = driver.findElements(By.cssSelector("tbody[class='row-hover']"));
        return tableRows;
    }

    private WebElement getConsentElement() {
        consent = driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']"));
        return consent;
    }

    public WebElement getArtistElement() {
        artist = driver.findElement(By.cssSelector("th[class*='column-3']"));
        return artist;
    }

    public WebElement getCategoryElement() {
        category = driver.findElement(By.cssSelector("th[class*='column-4']"));
        return category;
    }

    public WebElement getNameElement() {
        name = driver.findElement(By.cssSelector("th[class*='column-2']"));
        return name;
    }

    public void clickConsent() {
        getConsentElement().click();
    }

    public List<String> getTableRowsToStrings() {
        List<String> tableRowsString = new ArrayList<>();
        List<WebElement> list = getTableRows();
        for (int i = 0; i < 10; i++) {
            tableRowsString.add(list.get(0).getText().split("\n")[i]);
        }
        return tableRowsString;
    }


}
