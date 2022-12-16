package tests.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import repository.RepositoryApplication;
import repository.RepositoryFormApplication;
import repository.formUser.UserList;

import java.time.Duration;

public abstract class ChromeSetup {



    protected WebDriver driver;

    protected RepositoryApplication userApplication;
    protected RepositoryFormApplication repositoryFormApplication;

    @BeforeMethod
    public void setUp() {
        repositoryFormApplication= new RepositoryFormApplication();

        userApplication= new RepositoryApplication();
        driver = new ChromeDriver();
        String url = "https://accounts.google.com/";
        String url2 = "https://www.techlistic.com/p/selenium-practice-form.html";
        driver.get(url2);
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
