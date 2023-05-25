package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By Loginwithpwd=By.xpath("//p[text()='Login With Email & Password']");
    private By email_Txt=By.name("email");
    private By continueTosign= By.xpath( "//button[@type='submit']");
    private By  pwdText=By.name("otp");
    private By continueTosign1= By.xpath("//button[@type='submit']");
    private By SignOut=By.xpath("//*[@id=\"__next\"]/div/header/div/div/div[2]/div/div[2]/div/span[1]");
    private By Click_signOut=By.xpath("//span[@class='Button__TiButton-sc-13q748v-0 eFZKgt light-btn']");
    private By LoginB=By.xpath("//span[@class='d-none d-md-inline-block']");
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Click_Loginwithpwd()
    {
        driver.findElement(Loginwithpwd).click();
    }

    public void sendEmail(String value)
    {
        driver.findElement(email_Txt).sendKeys(value);
    }

    public void click_continueToSign()
    {
        driver.findElement(continueTosign).click();
    }

    public void sendPWD(String value)
    {
        driver.findElement(pwdText).sendKeys(value);
    }
    public void clickContinueTosign2()
    {
        driver.findElement(continueTosign1).click();
    }
    public void click_userNameText()
    {
        driver.findElement(SignOut).click();
    }
    public void click_SignOut_Button()
    {
        driver.findElement(Click_signOut).click();
    }
    public void click_Login_Button()
    {
        driver.findElement(LoginB).click();
    }
}
