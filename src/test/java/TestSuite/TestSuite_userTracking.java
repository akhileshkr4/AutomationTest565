package TestSuite;

import PageObjectModel.LoginPage;
import PageObjectModel.UserTrackingPopup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuite_userTracking
{
    WebDriver driver;
    @BeforeSuite
    public void LaunchWebBrowserANDLoggedIn()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tradeindia.com/");
        LoginPage l = new LoginPage(driver);
        l.click_Login_Button();
        l.Click_Loginwithpwd();
        l.sendEmail("akhilesh1997india@gmail.com");
        l.click_continueToSign();
        l.sendPWD("Akhi1997@");
        l.clickContinueTosign2();
    }

    @Test(priority = 1)
    public void TC_001LoggedInManufacturesPage() throws InterruptedException {
        UserTrackingPopup u=new UserTrackingPopup(driver);
        u.click_TopCategoryProduct();
        Thread.sleep(20000);// waiting for userTracking popup
        u.select_BuyerRadioButton();
        u.send_productName("T-shirt");
        u.verify_softAssert();
        driver.navigate().refresh();
    }
    @Test(priority =2)
    public void TC_002LoggedInCityPage() throws InterruptedException {
        UserTrackingPopup u1=new UserTrackingPopup(driver);
        u1.click_city();
        Thread.sleep(20000);//waiting for user tracking popup
        u1.select_BuyerRadioButton();
        u1.send_productName("sunflower oil");
        u1.verify_softAssert();
        driver.navigate().refresh();
    }
    @Test(priority = 3)
    public void TC_003LoggedInSerchPage() throws InterruptedException {
        UserTrackingPopup u2=new UserTrackingPopup(driver);
        u2.Search_product1("mango");
        Thread.sleep(20000);// waiting for userTracking popup
        u2.select_BuyerRadioButton();
        u2.send_productName("mango juice");
        u2.verify_softAssert();
        driver.navigate().refresh();
    }
    @Test(priority = 4)
    public void TC_004LoggedInSellerListing() throws InterruptedException {
        UserTrackingPopup u3=new UserTrackingPopup(driver);
        u3.click_TradeIndiaLogo();
        u3.click_ViewAllCategory();
        u3.click_AutoAccessories();
        Thread.sleep(20000);//waiting for userTracking popup
        u3.select_BuyerRadioButton();
        u3.send_productName("coconut");
        u3.verify_softAssert();
        driver.navigate().refresh();
    }
   @Test(priority =5)
    public void TC_005CityPage() throws InterruptedException {
       UserTrackingPopup u4=new UserTrackingPopup(driver);
       u4.click_cityBangalore();
       Thread.sleep(2000);
       u4.click_SignOut2();
       driver.navigate().refresh();
       Thread.sleep(20000);
       u4.send_userMobile("8051610793");
       u4.send_userName("Akhilesh kumar");
       u4.select_BuyerRadio();
       u4.click_submitButton();
       u4.send_productName("coconut");
       Thread.sleep(10000);//waiting for otp
       u4.verify_softAssert();
   }
   @Test(priority = 6)
    public void TC_006NotLoggedSearchPage()
   {

   }
   @Test(priority = 7)
    public void TC_007NotLoggedSellerListingPage()
   {

   }
   @Test(priority = 8)
    public void TC_008NotLoggedCityPage()
   {

   }
   @AfterSuite
    public void closeApp()
   {
       driver.quit();
   }
}
