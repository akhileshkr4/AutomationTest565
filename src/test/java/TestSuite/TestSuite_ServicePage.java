package TestSuite;

import PageObjectModel.LoginPage;
import PageObjectModel.ServicePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class TestSuite_ServicePage {
    WebDriver driver;
    @BeforeSuite
    public void Launch_WebBrowser()
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
    @Test
    public void PBR_InquiryLoggedInCase() throws InterruptedException {
        ServicePage s=new ServicePage(driver);
        s.click_viewAllCategory();
        s.click_CadCAMDesign();
        s.click_PBRButton();
        driver.findElement(By.xpath("//*[@id=\"rfq\"]/div/div/div[1]")).click();
        driver.navigate().refresh();
        driver.navigate().refresh();
        s.click_PBRButton();
        s.send_ProductName("mango","this is testing inquiry please ignore it");
        s.send_Quantity("30");
        WebElement e= driver.findElement(By.name("rfq_popup_units"));
        e.click();
        Select s1=new Select(e);
        s1.selectByVisibleText("Kilogram");
        WebElement e1=driver.findElement(By.name("rfq_popup_order_value_inr"));
        e1.click();
        Select s2=new Select(e1);
        s2.selectByVisibleText("20001 to 50000");
        s.click_PBR1();
        Thread.sleep(1000);
    }
    @AfterSuite
    public void close_App()
    {
        //driver.quit();
    }


}
