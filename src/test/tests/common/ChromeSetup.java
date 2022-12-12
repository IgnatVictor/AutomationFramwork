package tests.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import repository.RepositoryApplication;

import java.time.Duration;

public abstract class ChromeSetup {



    protected WebDriver driver;

    protected RepositoryApplication userApplication;

    @BeforeMethod
    public void setUp() {
        userApplication= new RepositoryApplication();
        driver = new ChromeDriver();
        String url = "https://accounts.google.com/";
        driver.get(url);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
