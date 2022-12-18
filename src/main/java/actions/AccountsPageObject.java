package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPageObject {

    private final WebDriver driver;

    public AccountsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getSignInInputField() {
        return driver.findElement(By.id("identifierId"));
    }

    public void setSignInInputField(String userName) {
        getSignInInputField().sendKeys(userName);
    }

    public String getSignInInputText() {
        return getSignInInputField().getAttribute("value");
    }
}
