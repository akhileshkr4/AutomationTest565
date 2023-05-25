package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class PBRInquiry {
    WebDriver  driver;
    private By PBRButton= By.xpath("//button[@class='Button__TiButton-sc-13q748v-0 dkdLFR cardBtn card-hover']");
    private By productName=By.name("product_name");
    private By continue2=By.xpath("//button[@type='submit'][1]");
    private By Quantity=By.xpath("//input[@placeholder='Enter Quantity']");
    private By QuantityUnit=By.xpath("//div[@class='input-wrapper']");//dropdown list
    private By Qunit=By.xpath("//li[text()='Pieces']");
    private By Amount=By.xpath("//input[@placeholder='INR']");
    private By sendInquiry=By.xpath("//button[@type='submit'][1]");
    private By userMobileNo=By.name("mobile");//used for notloggedin case
    private By continueButton=By.xpath("//button[@type='submit']");
    private By BackHome=By.xpath("//button[text()='Back To Home']");

    private By country_code=By.xpath("//div[@class='country-drop']");
    private By Select_country_Code=By.xpath("//span[text()='United States']");
    private By Email=By.name("email");
    //pbr inqiuiry footer section
    private By PBRFooterSection=By.xpath("//a[text()='Post Your Requirement']");
    //pbr inquiry from top Ti Products & services section
    private By PBRAtTop=By.xpath("//span[@class='popover_btn p-1']");
    private By PBRButton23=By.xpath("//span[text()='Post Buy Requirement']");
    //pbr inquiry from free user crm demo
    private By search_crm_demo=By.xpath("//input[@placeholder='Search for a product, category or service']");
    private  By searchCompany=By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div/div[2]/form/span/button/span");
    private By sendInquiry_Button=By.xpath("//span[text()='Send Inquiry'][1]");
    private By Product_name= By.name("product_name");
    private By Continue_Button=By.xpath("//button[@type='submit']");


    public PBRInquiry(WebDriver driver)
    {
        this.driver=driver;
    }
    public  void click_PostBuyRequirement()
    {
      driver.findElement(PBRButton).click();
    }
    public void send_product_name(String value)
    {
        driver.findElement(productName).sendKeys(value);
    }
    public void click_continue_button()
    {
        driver.findElement(continue2).click();
    }
    public void send_quantity(String value)
    {
        driver.findElement(Quantity).sendKeys(value);
    }
    public void select_QuantityUnit()
    {
        driver.findElement(QuantityUnit).click();
        driver.findElement(Qunit).click();
    }
    public void send_Amount(String value)
    {
        driver.findElement(Amount).sendKeys(value);
    }
    public void click_submit_button()
    {
        driver.findElement(sendInquiry).click();
    }
    public void send_MobNo(String value)
    {
        driver.findElement(userMobileNo).sendKeys(value);
    }
    public void click_Continue_Button()
    {
        driver.findElement(continueButton).click();
    }
    public void click_Back_To_Home_Button()
    {
        driver.findElement(BackHome).click();
    }
    public void click_countryCode_dropdown()
    {
        driver.findElement(country_code).click();
    }
    public void select_country_code()
    {
        driver.findElement(Select_country_Code).click();
    }
    public void send_UserEmail(String value)
    {
        driver.findElement(Email).sendKeys(value);
    }
    public void click_PBR_Footer_Section()
    {
        driver.findElement(PBRFooterSection).click();
    }
    public void click_PBR_TiProductServcies()
    {
        driver.findElement(PBRAtTop).click();
    }
    public void click_PBR_Button44()
    {
        driver.findElement(PBRButton23).click();
    }

    //pbr inquiry from free user crm demo
    public void send_Company_name(String value)
    {
        driver.findElement(search_crm_demo).sendKeys(value);
    }
    public void click_search_button()
    {
        driver.findElement(searchCompany).click();
    }
    public void click_sendInquiry_Button()
    {
        driver.findElement(sendInquiry_Button).click();
    }
    public void send_productName(String value)
    {
        driver.findElement(productName).sendKeys(value);
    }
    public void click_continueButton()
    {
        driver.findElement(Continue_Button).click();
    }

}
