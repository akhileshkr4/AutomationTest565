package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ServicePage {
    WebDriver driver;
    private By viewAllCategory= By.xpath("//span[text()='Categories']");
    private By CAD_CAMDesign=By.xpath("//span[text()='CAD CAM Design Services']");
    private By PBR_Button=By.xpath("//*[@id=\"rfq-btn\"]/span[2]");
    private By Product_Name=By.name("rfq_popup_subject");
    private By Product_Desp=By.name("rfq_popup_description");
    private By Quantity=By.id("rfq_popup_quantity_descr_home");
    private By PBR_Button1=By.id("rfq_popup_inq_submit");
    public ServicePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void click_viewAllCategory()
    {
        driver.findElement(viewAllCategory).click();
    }
  public void click_CadCAMDesign()
  {
      driver.findElement(CAD_CAMDesign).click();
  }
  public void click_PBRButton()
  {
      driver.findElement(PBR_Button).click();
  }
  public void send_ProductName(String value1, String value2)
  {
     driver.findElement(Product_Name).sendKeys(value1);
     driver.findElement(Product_Desp).sendKeys(value2);
  }
  public void send_Quantity(String value)
  {
      driver.findElement(Quantity).sendKeys(value);
  }
  public void click_PBR1()
  {
      driver.findElement(PBR_Button1).click();
  }

}
