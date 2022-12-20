package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLoginFormObject {

    private final WebDriver driver;

    private WebElement usernameInputElement;
    private WebElement passwordInputElement;
    private WebElement submitButtonElement;

    public UserLoginFormObject(WebDriver webDriver) {
        this.driver = webDriver;
    }

    private WebElement getUsernameInputElement() {
        usernameInputElement = driver.findElement(By.cssSelector("input[name=username]"));
        return usernameInputElement;
    }

    private WebElement getPasswordInputElement() {
        passwordInputElement = driver.findElement(By.cssSelector("input[name=password]"));
        return passwordInputElement;
    }

    private WebElement getSubmitButtonElement() {
        submitButtonElement = driver.findElement(By.cssSelector("input[value=login]"));
        return submitButtonElement;
    }

    public void clickLoginButton() {
        getSubmitButtonElement().click();
    }

    public void setUsernameInputElement(String text) {
        getUsernameInputElement().sendKeys(text);
    }

    public void setPasswordInputElement(String text) {
        getPasswordInputElement().sendKeys(text);
    }
}
