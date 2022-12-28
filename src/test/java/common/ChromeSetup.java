package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import repository.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

public abstract class ChromeSetup {


    protected WebDriver driver;

    protected RepositoryApplication userApplication;
    protected RepositoryFormApplication repositoryFormApplication;
    protected UserLoginRepository userLoginRepository;
    protected PhpTravelUserRepositoryApplication phpTravelUserRepositoryApplication;
    protected ApplyToolsRepositoryApplication applyToolsRepositoryApplication;
    protected Actions actions;

    private String time;

    private String getUrlFromList(int urlIndex) {

        String[] urlList = new String[5];
        urlList[0] = "https://accounts.google.com/";
        urlList[1] = "https://www.techlistic.com/p/selenium-practice-form.html";
        urlList[2] = "https://www.stealmylogin.com/demo.html";
        urlList[3] = "https://phptravels.com/demo";
        urlList[4] = "https://applitools.com/blog/advanced-tools-for-testing-tables/";
        return urlList[urlIndex];
    }

    private String appUrl = getUrlFromList(4);



    @BeforeSuite()
    public void startTime() {}

    @BeforeMethod
    public void setUp() {

        applyToolsRepositoryApplication= new ApplyToolsRepositoryApplication();
        repositoryFormApplication = new RepositoryFormApplication();
        userApplication = new RepositoryApplication();
        userLoginRepository = new UserLoginRepository();
        phpTravelUserRepositoryApplication = new PhpTravelUserRepositoryApplication();

        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.get(appUrl);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
