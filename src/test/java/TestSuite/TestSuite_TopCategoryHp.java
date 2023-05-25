package TestSuite;

import PageObjectModel.TopCategoryHp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuite_TopCategoryHp {
    WebDriver driver;
    @BeforeSuite
    public void launchWebBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tradeindia.com/");
    }
    @Test
    public void  verify_TopCategory() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)", "");
        TopCategoryHp T = new TopCategoryHp(driver);
        T.click_EarthingElectrode();
        Thread.sleep(2000);
        String s = driver.getCurrentUrl();
        Assert.assertEquals(s, "https://www.tradeindia.com/seller/electronics-electrical-supplies/earthing-electrodes/");
        WebElement ele = driver.findElement(By.xpath("//h1[@color='#265C81']"));
        Assert.assertEquals(ele.getText(), "Earthing Electrodes");
        driver.navigate().back();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,6000)", "");
        T.click_HealthCare();
        String s1=driver.getCurrentUrl();
        Thread.sleep(2000);
        Assert.assertEquals(s1,"https://www.tradeindia.com/seller/health-beauty/healthcare-hygiene-products/");
        WebElement ele1=driver.findElement(By.xpath("//h1[@color='#265C81']"));
        Assert.assertEquals(ele1.getText(),"Healthcare & Hygiene Products");
        driver.navigate().back();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,6000)", "");
        T.click_cleaningChemicals();
        Thread.sleep(1000);
        String s2=driver.getCurrentUrl();
        Assert.assertEquals(s2,"https://www.tradeindia.com/seller/chemicals/cleaning-chemicals/");
        WebElement ele2=driver.findElement(By.xpath("//h1[@color='#265C81']"));
        Assert.assertEquals(ele2.getText(),"Cleaning Chemicals");
        driver.navigate().back();
        WebElement ele3=driver.findElement(By.xpath("//span[text()='more'][1]"));
        Point p=ele3.getLocation();
        js.executeScript("window.scrollBy"+p);
        ele3.click();
        driver.findElement(By.xpath("//a[text()='LED Products']")).click();
        String s3=driver.getCurrentUrl();
        Assert.assertEquals(s3,"https://www.tradeindia.com/seller/electronics-electrical-supplies/led-products/");

    }
    @AfterSuite
    public void closeApp()
    {
        driver.quit();
    }
}
