package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AppliToolsObject {

    private final WebDriver driver;

    private JavascriptExecutor executor;

    List<WebElement> tableRows;
    private WebElement name;
    private WebElement consent;
    private WebElement artist;
    private WebElement category;

    public AppliToolsObject(WebDriver webDriver) {
        this.driver = webDriver;
        executor = (JavascriptExecutor) driver;
    }

    private List<WebElement> getTableRowsElement() {
        tableRows = driver.findElements(By.cssSelector("tbody[class='row-hover']"));
        return tableRows;
    }

    private WebElement getConsentElement() {
        consent = driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']"));
        return consent;
    }

    private WebElement getNameElement() {
        name = driver.findElement(By.cssSelector("th[class*='column-2']"));
        return name;
    }

    private WebElement getArtistElement() {
        artist = driver.findElement(By.cssSelector("th[class*='column-3']"));
        return artist;
    }

    private WebElement getCategoryElement() {
        category = driver.findElement(By.cssSelector("th[class*='column-4']"));
        return category;
    }

    public void clickConsent() {
        getConsentElement().click();
    }

    public String getTableRowsText() {
        return getTableRowsElement().get(0).getText().toString();
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
