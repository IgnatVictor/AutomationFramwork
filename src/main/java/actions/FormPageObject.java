package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FormPageObject {

    private WebDriver driver;

    private WebElement consent;
    private WebElement firstNameInputField;
    private WebElement lastNameInputField;
    private WebElement dateInputField;
    private WebElement yearsOfExpSelectInput;
    private WebElement maleObject;
    private WebElement automationTesterCheckBox;
    private WebElement seleniumWebDriverCheckBox;

    private WebElement submitFormButton;

    private WebElement pageTitleText;



    public FormPageObject(WebDriver webDriver) {
        this.driver = webDriver;
    }
    public WebElement getFirstNameInputField() {
        firstNameInputField = driver.findElement(By.cssSelector("input[name=firstname]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(firstNameInputField);
        actions.perform();
        return firstNameInputField;
    }

    private WebElement getConsent() {
        consent= driver.findElement(By.id("ez-accept-all"));
        return consent;
    }

    public String getPageTitleText(){
        pageTitleText= driver.findElement(By.cssSelector("h3[class*=post-title]"));
        return pageTitleText.getText();
    }

    private WebElement getLastNameInputField() {
        lastNameInputField = driver.findElement(By.cssSelector("input[name=lastname]"));
        return  lastNameInputField;
    }

    private WebElement getDateInputField() {
        dateInputField =  driver.findElement(By.cssSelector("input[id=datepicker]"));
        return  dateInputField;
    }

    private WebElement getMaleObject() {
        maleObject = driver.findElement(By.cssSelector("input[id=sex-0]"));
        return  maleObject;
    }

    private  WebElement getYearsOfExperience(int numberOfYears) {

        yearsOfExpSelectInput = driver.findElement(By.cssSelector("input[id=exp-"+numberOfYears+"]"));
        return  yearsOfExpSelectInput;
    }

    private WebElement getAutomationTesterBox() {
        automationTesterCheckBox = driver.findElement(By.cssSelector("input[id=profession-1]"));
        return automationTesterCheckBox;
    }

    private  WebElement getSeleniumWebDriverBoxElement() {
        seleniumWebDriverCheckBox= driver.findElement(By.cssSelector("input[id=tool-2]"));
        return seleniumWebDriverCheckBox;
    }

    private  WebElement getSubmitFormButton(){
        submitFormButton = driver.findElement(By.cssSelector("button[id=submit]"));
        return submitFormButton;
    }

    public void clickConsentElement() {
        getConsent().click();
    }
    public void setSignInInputFields(String firstName,String lastName, String date) {
        getFirstNameInputField().sendKeys(firstName);
        getLastNameInputField().sendKeys(lastName);
        getDateInputField().sendKeys(date);
    }

    private void moveToElement(WebElement webElement) {
        Actions actions= new Actions(driver);
        actions.moveToElement(webElement);
        actions.perform();
    }
    public void setYearsOfExperience(int years){
        moveToElement(getYearsOfExperience(years));
        getYearsOfExperience(years).click();
    }

    public void selectMaleObject(){
        moveToElement(getMaleObject());
        getMaleObject().click();
    }

    public void checkAutomationTesterBox(){
        moveToElement(getAutomationTesterBox());
        getAutomationTesterBox().click();
    }

    public void checkSeleniumWebDriverBox() {
        moveToElement(getSeleniumWebDriverBoxElement());
        getSeleniumWebDriverBoxElement().click();
    }

    public void clickSubmitButtonForm() {
        moveToElement(getSubmitFormButton());
        getSubmitFormButton().click();
    }

    public void clearInputElements() {
        getFirstNameInputField().clear();
        getLastNameInputField().clear();
        getDateInputField().clear();

    }

}
