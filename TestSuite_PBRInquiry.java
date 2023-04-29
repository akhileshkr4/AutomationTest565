package TestSuite;
import PageObjectModel.LoginPage;
import PageObjectModel.PBRInquiry;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestSuite_PBRInquiry
{
    WebDriver driver;
    @BeforeSuite
    public void LaunchWebBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tradeindia.com/");
    }
        @Test(priority=1)
        public void TC_001PBRInquiry_LoggedIn() throws InterruptedException {
        LoginPage l = new LoginPage(driver);
        l.click_Login_Button();
        l.Click_Loginwithpwd();
        l.sendEmail("akhilesh1997india@gmail.com");
        l.click_continueToSign();
        l.sendPWD("Akhi1997@");
        l.clickContinueTosign2();
        PBRInquiry p = new PBRInquiry(driver);
        p.click_PostBuyRequirement();
        p.send_product_name("Green tea");
        p.click_continue_button();
        p.send_quantity("34");
        p.select_QuantityUnit();
        p.send_Amount("54");
        p.click_submit_button();
        Thread.sleep(1000);
        WebElement ele=driver.findElement(By.xpath("//p[text()='Your requirement was successfully submitted']"));
        Assert.assertEquals(ele.getText(),"Your requirement was successfully submitted");
        if(ele.getText().equals("Your requirement was successfully submitted"))
        {
            System.out.println("Inquiry is posted");
        }
        else
        {
           System.out.println("Error");
        }
        p.click_Back_To_Home_Button();
        l.click_userNameText();
        l.click_SignOut_Button();
    }
        @Test(priority = 2)
        public void TC_002PBRInquiry_NotLoggedIn() throws InterruptedException {
        PBRInquiry p1 = new PBRInquiry(driver);
        p1.click_PostBuyRequirement();
        p1.send_product_name("Human Hair");
        p1.click_continue_button();
        p1.send_MobNo("8051610793");
        p1.click_continue_button();
        Thread.sleep(10000);
        p1.send_quantity("200");
        p1.select_QuantityUnit();
        p1.send_Amount("23426");
        p1.click_submit_button();
        Thread.sleep(1000);
        WebElement ele1=driver.findElement(By.xpath("//p[text()='Your requirement was successfully submitted']"));
        Assert.assertEquals(ele1.getText(),"Your requirement was successfully submitted");
        p1.click_Back_To_Home_Button();
        LoginPage l1=new LoginPage(driver);
        l1.click_userNameText();
        l1.click_SignOut_Button();
    }
      @Test(priority =3,enabled = false)
      public void TC_003PBRInquiry_Foreign_User() throws InterruptedException {
          PBRInquiry p2 = new PBRInquiry(driver);
          p2.click_PostBuyRequirement();
          p2.send_product_name("Mango");
          p2.click_continue_button();
          p2.click_countryCode_dropdown();
          p2.select_country_code();
          p2.send_UserEmail("smithdeven934@gmail.com");
          p2.click_continue_button();
          Thread.sleep(10000);
          p2.send_quantity("25");
          p2.select_QuantityUnit();
          p2.send_Amount("66");
          p2.click_submit_button();
          Thread.sleep(1000);
          WebElement ele2=driver.findElement(By.xpath("//p[text()='Your requirement was successfully submitted']"));
          Assert.assertEquals(ele2.getText(),"Your requirement was successfully submitted");
          p2.click_Back_To_Home_Button();
          LoginPage l2=new LoginPage(driver);
          l2.click_userNameText();
          l2.click_SignOut_Button();

      }
      @Test(priority=4)
      public void TC_004PBRInquiry_AtMiddle() throws InterruptedException {
          JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("window.scrollBy(0,1600)","");
          PBRInquiry p3=new PBRInquiry(driver);
          p3.send_product_name("Apple");
          p3.click_continue_button();
          p3.send_MobNo("8051610793");
          p3.click_continue_button();
          Thread.sleep(10000);
          p3.send_quantity("200");
          p3.select_QuantityUnit();
          p3.send_Amount("576");
          p3.click_submit_button();
          Thread.sleep(700);
          WebElement ele4=driver.findElement(By.xpath("//p[text()='Your requirement was successfully submitted']"));
          Assert.assertEquals(ele4.getText(),"Your requirement was successfully submitted");
          p3.click_Back_To_Home_Button();
          LoginPage l3=new LoginPage(driver);
          l3.click_userNameText();
          l3.click_SignOut_Button();
      }
      @Test(priority = 5)
      public void TC_005PBRInquiry_AtFooter() throws InterruptedException {
          Thread.sleep(500);
          JavascriptExecutor js2=(JavascriptExecutor)driver;
          js2.executeScript("window.scrollBy(0,15000)","");
          PBRInquiry p4=new PBRInquiry(driver);
          p4.click_PBR_Footer_Section();
          Thread.sleep(500);
          p4.send_product_name("Basmati Rice");
          p4.click_continue_button();
          p4.send_MobNo("8051610793");
          p4.click_continue_button();
          Thread.sleep(10000);
          p4.send_quantity("200");
          p4.select_QuantityUnit();
          p4.send_Amount("576");
          p4.click_submit_button();
          Thread.sleep(700);
          WebElement ele4=driver.findElement(By.xpath("//p[text()='Your requirement was successfully submitted']"));
          Assert.assertEquals(ele4.getText(),"Your requirement was successfully submitted");
          p4.click_Back_To_Home_Button();
      }
      @Test(priority = 6,enabled = false)
      public void TC_006PBRInquiry_TIProductSection()
      {
          PBRInquiry p5=new PBRInquiry(driver);
          p5.click_PBR_TiProductServcies();
          p5.click_PBR_Button44();
      }
      @Test(priority = 7)
      public void TC_007PBRInquiry_FreeUser() throws InterruptedException {
       PBRInquiry p5=new PBRInquiry(driver);
       p5.send_Company_name("crm demo");
       p5.click_search_button();
       Thread.sleep(1000);
       p5.click_sendInquiry_Button();
       p5.send_product_name("Mobile charger");
       p5.click_continue_button();
       p5.send_MobNo("8051610793");
       p5.click_continue_button();
       p5.send_quantity("200");
       p5.select_QuantityUnit();
       p5.send_Amount("576");
       p5.click_submit_button();
       Thread.sleep(700);
       WebElement ele5=driver.findElement(By.xpath("//p[text()='Your requirement was successfully submitted']"));
       Assert.assertEquals(ele5.getText(),"Your requirement was successfully submitted");
       p5.click_Back_To_Home_Button();
       LoginPage l5=new LoginPage(driver);
       l5.click_userNameText();
       l5.click_SignOut_Button();
      }
      @AfterSuite
      public void closeApp()
    {
       // driver.quit();
    }
}
