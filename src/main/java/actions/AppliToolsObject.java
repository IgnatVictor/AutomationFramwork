package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppliToolsObject {

    private final WebDriver driver;
    private final JavascriptExecutor executor;

    private WebElement artist;
    private WebElement category;
    private WebElement consent;
    List<WebElement> tableRows;
    private WebElement name;

    public AppliToolsObject(WebDriver webDriver) {
        this.driver = webDriver;
        executor = (JavascriptExecutor) driver;
    }

    private List<WebElement> getTableRowsElements() {
        tableRows = driver.findElements(By.cssSelector("tbody[class='row-hover']"));
        return tableRows;
    }

    private WebElement getConsentElement() {
        consent = driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']"));
        return consent;
    }

    private WebElement getArtistElement() {
        artist = driver.findElement(By.cssSelector("th[class*='column-3']"));
        return artist;
    }

    private WebElement getCategoryElement() {
        category = driver.findElement(By.cssSelector("th[class*='column-4']"));
        return category;
    }

    private WebElement getNameElement() {
        name = driver.findElement(By.cssSelector("th[class*='column-2']"));
        return name;
    }

    public void clickConsent() {
        getConsentElement().click();
    }

    public String getTableRowsText() {
        return getTableRowsElements().get(0).getText();
    }

    public void sortAscendingArtistElements() {
        executor.executeScript("arguments[0].click();", getArtistElement());
    }

    public void sortDescendingArtistElements() {
        sortAscendingArtistElements();
        executor.executeScript("arguments[0].click();", getArtistElement());
    }

    public void sortAscendingCategoryElements() {
        executor.executeScript("arguments[0].click();", getCategoryElement());
    }

    public void sortDescendingCategoryElements() {
        sortAscendingCategoryElements();
        executor.executeScript("arguments[0].click();", getCategoryElement());
    }

    public void sortAscendingNameElements() {
        executor.executeScript("arguments[0].click();", getNameElement());
    }

    public void sortDescendingNameElements() {
        sortAscendingNameElements();
        executor.executeScript("arguments[0].click();", getNameElement());
    }
}
