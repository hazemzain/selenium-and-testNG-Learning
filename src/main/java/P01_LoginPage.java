import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {
    //Find Te Locator That We Will Use It
    private WebDriver driver;
    public P01_LoginPage(WebDriver Driver){
        this.driver=Driver;
    }
    private final By UserName=By.id("inputUsername");
    private final By Password=By.id("inputPassword");
    private final By LoginButton=By.id("loginButton");

    public P01_LoginPage EnterUserName(String UserNameValue )
    {
        driver.findElement(UserName).sendKeys(UserNameValue);
        return this;
    }
    public P01_LoginPage EnterPassword(String PasswordValue )
    {
        driver.findElement(Password).sendKeys(PasswordValue);
        return this;
    }
    public P02_HomePage ClickLoginButton()
    {
        driver.findElement(LoginButton).click();
        return new P02_HomePage(driver);


    }
}
