package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.common.ChromeSetup;


public class UserApplicationTest extends ChromeSetup {


    @Test
    public void checkIfTheFieldsFilledCorrectly() {
        WebElement signInInput = driver.findElement(By.id("identifierId"));
        signInInput.sendKeys(userApplication.getUserName());
        Assert.assertEquals("userName", userApplication.getUserName());
    }
}
