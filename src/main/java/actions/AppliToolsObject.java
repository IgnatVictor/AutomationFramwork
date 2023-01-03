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

    public List<WebElement> getTableRows() {
        tableRows = driver.findElements(By.cssSelector("tbody[class='row-hover']"));
        return tableRows;
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
}
