package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    private By userIcon = By.xpath("//img[@alt='user image']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isVisible_ProfileIcon()
    {
        return  driver.findElements(userIcon).size()>0;
    }
}
