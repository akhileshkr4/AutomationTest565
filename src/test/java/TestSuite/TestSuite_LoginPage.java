package TestSuite;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class TestSuite_LoginPage
{
    @BeforeSuite
    public void LaunchWebBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    WebDriver driver;
    @Test
    public void TC_001_ValidateSucessFullLogin()
    {
        driver.get("https://www.tradeindia.com/login/login.html");
        LoginPage l = new LoginPage(driver);
        l.Click_Loginwithpwd();
        l.sendEmail("akhilesh1997india@gmail.com");
        l.click_continueToSign();
        l.sendPWD("Akhi1997@");
        l.clickContinueTosign2();
    }
    @AfterTest
    public void closeApp()
    {
        driver.quit();
    }
}
