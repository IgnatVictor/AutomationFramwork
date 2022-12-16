package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPageObject {


    private WebDriver driver;

    private WebElement signInInputField;

    public AccountsPageObject(WebDriver driver) {
        this.driver = driver;
    }


    private WebElement getSignInInputField() {
        signInInputField = driver.findElement(By.id("identifierId"));
        return signInInputField;
    }

    public void setSignInInputField(String userName) {
        getSignInInputField().sendKeys(userName);
    }

    public String getSignInInputText() {
        return getSignInInputField().getAttribute("value");
    }
}
