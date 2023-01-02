package common;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import repository.*;

public abstract class ChromeSetup {


    protected WebDriver driver;

    protected RepositoryApplication userApplication;
    protected RepositoryFormApplication repositoryFormApplication;
    protected UserLoginRepository userLoginRepository;
    protected PhpTravelUserRepositoryApplication phpTravelUserRepositoryApplication;
    protected ApplyToolsRepositoryApplication applyToolsRepositoryApplication;

    protected Actions actions;
    protected JavascriptExecutor executor;
    protected StringBuilderFromList stringBuilderFromList;

    private String getUrlFromList(int urlIndex) {

        String[] urlList = new String[5];
        urlList[0] = "https://accounts.google.com/";
        urlList[1] = "https://www.techlistic.com/p/selenium-practice-form.html";
        urlList[2] = "https://www.stealmylogin.com/demo.html";
        urlList[3] = "https://phptravels.com/demo";
        urlList[4] = "https://applitools.com/blog/advanced-tools-for-testing-tables/";
        return urlList[urlIndex];
    }

    private final String appUrl = getUrlFromList(4);

    @BeforeSuite()
    public void startTime() {}

    @BeforeMethod
    public void setUp() {

        applyToolsRepositoryApplication= new ApplyToolsRepositoryApplication();
        stringBuilderFromList= new StringBuilderFromList();
        repositoryFormApplication = new RepositoryFormApplication();
        userApplication = new RepositoryApplication();
        userLoginRepository = new UserLoginRepository();
        phpTravelUserRepositoryApplication = new PhpTravelUserRepositoryApplication();

        driver = new ChromeDriver();
        executor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        driver.get(appUrl);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
