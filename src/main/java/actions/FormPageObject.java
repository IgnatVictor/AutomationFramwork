package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPageObject {

    private final WebDriver driver;

    public FormPageObject(WebDriver webDriver) {
        this.driver = webDriver;
    }

    private WebElement getAutomationTesterBox() {
        return driver.findElement(By.cssSelector("input[id=profession-1]"));
    }

    private WebElement getConsent() {
        return driver.findElement(By.id("ez-accept-all"));
    }

    private WebElement getDateInputField() {
        return driver.findElement(By.cssSelector("input[id=datepicker]"));
    }

    private WebElement getFirstNameInputField() {
        return driver.findElement(By.cssSelector("input[name=firstname]"));
    }

    private WebElement getLastNameInputField() {
        return driver.findElement(By.cssSelector("input[name=lastname]"));
    }

    private WebElement getMaleObject() {
        return driver.findElement(By.cssSelector("input[id=sex-0]"));
    }

    public String getPageTitleText() {
        WebElement pageTitleText = driver.findElement(By.cssSelector("h3[class*=post-title]"));
        return pageTitleText.getText();
    }

    private WebElement getSeleniumWebDriverBoxElement() {
        return driver.findElement(By.cssSelector("input[id=tool-2]"));
    }

    private WebElement getSubmitFormButton() {
        return driver.findElement(By.cssSelector("button[id=submit]"));
    }

    private WebElement getYearsOfExperience(int numberOfYears) {
        return driver.findElement(By.cssSelector("input[id=exp-" + numberOfYears + "]"));
    }

    public void checkAutomationTesterBox() {
        getAutomationTesterBox().click();
    }

    public void clearInputElements() {
        getFirstNameInputField().clear();
        getLastNameInputField().clear();
        getDateInputField().clear();
    }

    public void clickConsentElement() {
        getConsent().click();
    }

    public void clickSubmitButtonForm() {
        getSubmitFormButton().click();
    }

    public void checkSeleniumWebDriverBox() {
        getSeleniumWebDriverBoxElement().click();
    }

    public WebElement findSeleniumWebDriverBox() {
        return getSeleniumWebDriverBoxElement();
    }

    public void selectMaleObject() {
        getMaleObject().click();
    }

    public void setSignInInputFields(String firstName, String lastName, String date) {
        getFirstNameInputField().sendKeys(firstName);
        getLastNameInputField().sendKeys(lastName);
        getDateInputField().sendKeys(date);
    }

    public void setYearsOfExperience(int years) {
        getYearsOfExperience(years).click();
    }

}
