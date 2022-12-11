package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.common.ApplicationConfig;
import user.UserApplication;


public class UserApplicationTest extends ApplicationConfig {

    private UserApplication userApplication= new UserApplication();
    private final String userName = "Victor.ignat@sensidev.com";




    @Test
    public void CheckIfTheFieldsFilledCorrectly() {
        WebElement signInInput = driver.findElement(By.id("identifierId"));
        signInInput.sendKeys(userName);
        Assert.assertEquals(userName,userApplication.getUserName());
    }
}
