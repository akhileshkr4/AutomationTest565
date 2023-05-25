package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CityPage {
    private WebDriver driver;

    private By send_product_name=By.xpath("//input[@placeholder='Search for a product, category or service']");
    private  By searchProduct=By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[3]/div/div[2]/form/span/button/span");

    private By click_City1=By.xpath("//span[text()='Bengaluru']");

    private By verify_cityPage=By.xpath("//h2[text()='Brown Joules Honey Lemon Front']");
    public CityPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void send_ProductName(String value)
    {
        driver.findElement(send_product_name).sendKeys(value);
    }
    public void click_SearchButton()
    {
        driver.findElement(searchProduct).click();
    }
    public void click_BengaluruCity()
    {
        driver.findElement(click_City1).click();
    }
    public boolean VerifyBenguluruCity()
    {
        return driver.findElement(verify_cityPage).isDisplayed();
    }


}
