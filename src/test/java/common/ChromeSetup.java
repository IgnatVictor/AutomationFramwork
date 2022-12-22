package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import repository.PhpTravelUserRepositoryApplication;
import repository.RepositoryApplication;
import repository.RepositoryFormApplication;
import repository.UserLoginRepository;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ChromeSetup {


    protected WebDriver driver;
    protected RepositoryApplication userApplication;
    protected RepositoryFormApplication repositoryFormApplication;
    protected UserLoginRepository userLoginRepository;
    protected PhpTravelUserRepositoryApplication phpTravelUserRepositoryApplication;
    protected Actions actions;

    private GetDateTime timeNow = new GetDateTime();

    private String time = "dss";



    private String getUrlFromList(int urlIndex) {
        String[] urlList = new String[4];
        urlList[0]= "https://accounts.google.com/";
        urlList[1]= "https://www.techlistic.com/p/selenium-practice-form.html";
        urlList[2]= "https://www.stealmylogin.com/demo.html";
        urlList[3]= "https://phptravels.com/demo";
        return urlList[urlIndex];
    }

    private String appUrl = getUrlFromList(3);



    @DataProvider(name="searchTime")
    public Object[][] createDate() {
        return new Object[][] {
                { timeNow.getDate() }
        };
    }

    @BeforeSuite()
    public  setDate(String time){


    }



    @BeforeMethod
    public void setUp() {
        repositoryFormApplication = new RepositoryFormApplication();
        userApplication = new RepositoryApplication();
        userLoginRepository = new UserLoginRepository();
        phpTravelUserRepositoryApplication= new PhpTravelUserRepositoryApplication();

        driver = new ChromeDriver();
        actions= new Actions(driver);
        driver.get(appUrl);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
