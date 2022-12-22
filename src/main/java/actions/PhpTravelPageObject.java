package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpTravelPageObject {

    private final WebDriver driver;
    private WebElement titleElement;
    private WebElement subTitleElement;
    private WebElement firstNameInput;
    private WebElement lastNameInput;
    private WebElement businessNameInput;
    private WebElement emailInput;

    public PhpTravelPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getFirstNameInput() {
        firstNameInput = driver.findElement(By.cssSelector("input[name=first_name]"));
        return firstNameInput;
    }

    private WebElement getLastNameInput() {
        lastNameInput = driver.findElement(By.cssSelector("input[name=last_name]"));
        return lastNameInput;
    }

    private WebElement getBusinessNameInput() {
        businessNameInput = driver.findElement(By.cssSelector("input[name=business_name]"));
        return businessNameInput;
    }

    private WebElement getEmailInput() {
        emailInput = driver.findElement(By.cssSelector("input[name*=email]"));
        return emailInput;
    }

    private WebElement getTitleElement() {
        titleElement = driver.findElement(By.cssSelector("h1[class=mb-0]"));
        return titleElement;
    }

    private WebElement getSubTitleElement() {
        subTitleElement = driver.findElement(By.cssSelector("p[class=mt0]"));
        return subTitleElement;
    }

    public String getPageTitleText() {
        return getTitleElement().getText();
    }

    public String getPageSubTitleText() {
        return getSubTitleElement().getText();
    }

    public void setFirstNameInput(String text) {
        getFirstNameInput().sendKeys(text);
    }

    public void setLastNameInput(String text) {
        getLastNameInput().sendKeys(text);
    }

    public void setBusinessNameInput(String text) {
        getBusinessNameInput().sendKeys(text);
    }

    public void setEmailInput(String text) {
        getEmailInput().sendKeys(text);
    }
}
