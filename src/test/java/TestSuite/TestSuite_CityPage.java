package TestSuite;

import PageObjectModel.CityPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuite_CityPage
{
     WebDriver driver;
     @Test
     public void verifyCityPage()
     {
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.tradeindia.com/");
         CityPage c= new CityPage(driver);
         c.send_ProductName("Green Tea");
         c.click_SearchButton();
         c.click_BengaluruCity();
         //validate1
         String Actual=driver.getCurrentUrl();
         String Expected="https://www.tradeindia.com/search.html?keyword=Green+Tea&city=bengaluru";
         Assert.assertEquals(Actual,Expected);
         //validate2
         WebElement ele=driver.findElement(By.xpath("//h2[text()='Brown Joules Honey Lemon Front']"));
         Assert.assertEquals(ele.getText(),"Brown Joules Honey Lemon Front");
         //Assert.assertEquals(c.VerifyBenguluruCity(),"true");
         driver.quit();
     }
}
