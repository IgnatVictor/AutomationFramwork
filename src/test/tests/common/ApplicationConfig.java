package tests.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class ApplicationConfig {



    protected WebDriver driver;
    private final String url = "https://accounts.google.com/";

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
