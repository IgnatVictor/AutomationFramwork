package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPageObject {

    private final WebDriver driver;
    private WebElement automationTesterBox;
    private WebElement consent;

    private WebElement dateInputField;
    private WebElement firstNameInputField;
    private WebElement lastNameInputField;
    private WebElement maleInput;
    private WebElement pageTitleElement;
    private WebElement seleniumWebDriverBoxElement;
    private WebElement submitFormButton;
    private WebElement yearsOfExperience;

    public FormPageObject(WebDriver webDriver) {
        this.driver = webDriver;
    }

    private WebElement getAutomationTesterBox() {
        automationTesterBox = driver.findElement(By.cssSelector("input[id=profession-1]"));
        return automationTesterBox;
    }

    private WebElement getConsent() {
        consent = driver.findElement(By.id("ez-accept-all"));
        return consent;
    }

    private WebElement getDateInputField() {
        dateInputField = driver.findElement(By.cssSelector("input[id=datepicker]"));
        return dateInputField;
    }

    private WebElement getFirstNameInputField() {
        firstNameInputField = driver.findElement(By.cssSelector("input[name=firstname]"));
        return firstNameInputField;
    }

    private WebElement getLastNameInputField() {
        lastNameInputField = driver.findElement(By.cssSelector("input[name=lastname]"));
        return lastNameInputField;
    }

    private WebElement getMaleObject() {
        maleInput = driver.findElement(By.cssSelector("input[id=sex-0]"));
        return maleInput;
    }

    private WebElement getPageTitleElement() {
        pageTitleElement = driver.findElement(By.cssSelector("h3[class*=post-title]"));
        return pageTitleElement;
    }

    private WebElement getSeleniumWebDriverBoxElement() {
        seleniumWebDriverBoxElement = driver.findElement(By.cssSelector("input[id=tool-2]"));
        return seleniumWebDriverBoxElement;
    }

    private WebElement getSubmitFormButton() {
        submitFormButton = driver.findElement(By.cssSelector("button[id=submit]"));
        ;
        return submitFormButton;
    }

    private WebElement getYearsOfExperience(int numberOfYears) {
        yearsOfExperience = driver.findElement(By.cssSelector("input[id=exp-" + numberOfYears + "]"));
        return yearsOfExperience;
    }

    public void checkAutomationTesterBox() {
        getAutomationTesterBox().click();
    }

    public void clearFirstNameInputField() {
        getFirstNameInputField().clear();
    }

    public void clearLastNameInputField() {
        getLastNameInputField().clear();
    }

    public void clearDateInputField() {
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

    public String getPageTitleText() {
        return getPageTitleElement().getText();
    }

    public WebElement findSeleniumWebDriverBox() {
        return getSeleniumWebDriverBoxElement();
    }

    public void selectMaleObject() {
        getMaleObject().click();
    }

    public void setFirstNameInputField(String firstName) {
        getFirstNameInputField().sendKeys(firstName);
    }

    public void setLastNameInputField(String lastName) {
        getLastNameInputField().sendKeys(lastName);
    }

    public void setDateInputField(String date) {
        getDateInputField().sendKeys(date);
    }

    public void setYearsOfExperience(int years) {
        getYearsOfExperience(years).click();
    }

}
