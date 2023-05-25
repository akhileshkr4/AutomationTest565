package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TopCategoryHp {
   WebDriver driver;
   private By EarthingElectrode= By.xpath("//a[text()='Earthing Electrode']");
   private By HealtCare=By.xpath("//a[text()='Healthcare & Hygiene Products']");
   private By Cleaning_Chemicals=By.xpath("//a[text()='Cleaning Chemicals']");
   private By more=By.xpath("//span[text()='more']");
   private By LEDProduct=By.xpath("//a[text()='LED Products']");

  public  TopCategoryHp(WebDriver driver)
  {
     this.driver=driver;
  }
  public void click_EarthingElectrode()
  {
     driver.findElement(EarthingElectrode).click();
  }
  public void click_HealthCare()
  {
      driver.findElement(HealtCare).click();
  }
  public void click_cleaningChemicals()
  {
      driver.findElement(Cleaning_Chemicals).click();
  }
  public void click_more()
  {
      driver.findElement(more).click();
  }
  public void click_LEDProduct()
  {
      driver.findElement(LEDProduct).click();
  }

}
