package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class UserTrackingPopup {
    WebDriver driver;
    private By CategoryProduct=By.xpath("//p[text()='Anti Allergic Medicine']");
    private By Buyer_RadioButton=By.xpath("//label[@for='Buyer']");
    private By submit_Button=By.xpath("//button[@type='submit']");
    private By Product_name=By.name("product_name");
    private By city=By.xpath("//span[text()='Mumbai']");
    private By search_keyword=By.xpath("//input[@placeholder='Search for a product, category or service']");
    private By click_searchButton=By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div/div[2]/form/span/button/span");
    private By TradeIndiaLogo=By.xpath("//img[@alt='logo']");
    private By viewAllCateogry=By.xpath("//span[text()='Categories']");
    private By AutoAccessories=By.xpath("//span[text()='Auto Accessories']");
    //Not loggedIN case
    private By userName=By.xpath("//*[@id=\"step1\"]/div/form/div/div[3]/div[1]/input");
    private By userMobileNo=By.name("mobile");
    private By city_Bangalore=By.xpath("//span[text()='Bengaluru']");
    private By sign_out=By.xpath("//span[@class='Typography__Body5R-sc-gkds4f-15 iuUdDj d-none d-md-inline-block Body3R mr-2 mr-md-2 ml-md-2']");
    private By sigggnout=By.xpath("//img[@alt='user image']");
    private By click_Signout=By.xpath("//p[text()='Sign Out']");
    public UserTrackingPopup(WebDriver driver)
    {
        this.driver=driver;
    }

    public void click_TopCategoryProduct()
    {
        WebElement ele= driver.findElement(By.xpath("//h2[text()='Health &  Beauty']"));
        Actions a=new Actions(driver);
        a.moveToElement(ele).perform();
        driver.findElement(CategoryProduct).click();
    }
    public void select_BuyerRadioButton()
    {
        driver.findElement(Buyer_RadioButton).click();
        driver.findElement(submit_Button).click();
    }
    public void select_BuyerRadio()
    {
        driver.findElement(Buyer_RadioButton).click();

    }

    public void send_productName(String value)
    {
        driver.findElement(Product_name).sendKeys(value);
        driver.findElement(submit_Button).click();
    }
    public void verify_softAssert()
    {
        WebElement e=driver.findElement(By.xpath("//h1[text()='You’re Done!']"));

        Assert.assertEquals(e.getText(),"You’re Done!");
    }
    public void click_city()
    {
        driver.findElement(city).click();
    }
    public void Search_product1(String value)
    {
        driver.findElement(search_keyword).sendKeys(value);
        driver.findElement(click_searchButton).click();
    }

    public void click_TradeIndiaLogo()
    {
        driver.findElement(TradeIndiaLogo).click();
    }
    public void click_ViewAllCategory()
    {
        driver.findElement(viewAllCateogry).click();
    }
    public void click_AutoAccessories()
    {
        driver.findElement(AutoAccessories).click();
    }
    public void send_userName(String value1)
    {
        driver.findElement(userName).sendKeys(value1);
    }
    public void send_userMobile(String value)
    {
        driver.findElement(userMobileNo).sendKeys(value);
    }
    public void click_submitButton()
    {
        driver.findElement(submit_Button).click();
    }
    public void click_cityBangalore()
    {
        driver.findElement(city_Bangalore).click();
    }
    public void click_SignOut2()
    {
        driver.findElement(sigggnout).click();
        //driver.findElement(sign_out).click();
        driver.findElement(click_Signout).click();
    }
}
