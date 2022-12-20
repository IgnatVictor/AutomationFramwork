package tests.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import repository.RepositoryApplication;
import repository.RepositoryFormApplication;
import repository.UserLoginRepository;

public abstract class ChromeSetup {


    protected WebDriver driver;
    protected RepositoryApplication userApplication;
    protected RepositoryFormApplication repositoryFormApplication;
    protected UserLoginRepository userLoginRepository;
    protected Actions actions;



    private String getUrlFromList(int urlIndex) {
        String[] urlList = new String[3];
        urlList[0]= "https://accounts.google.com/";
        urlList[1]= "https://www.techlistic.com/p/selenium-practice-form.html";
        urlList[2]= "https://www.stealmylogin.com/demo.html";
        return urlList[urlIndex];
    }

    private String appUrl = getUrlFromList(2);


    @BeforeMethod
    public void setUp() {
        repositoryFormApplication = new RepositoryFormApplication();
        userApplication = new RepositoryApplication();
        userLoginRepository = new UserLoginRepository();
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
