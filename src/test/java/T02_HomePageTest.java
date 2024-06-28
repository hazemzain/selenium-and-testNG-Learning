import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T02_HomePageTest {
    private WebDriver driver;
    // P01_LoginPage LoginPage;
    @BeforeMethod
    public void SetUp()
    {
        driver=new FirefoxDriver();
        // LoginPage=new P01_LoginPage(driver);
        driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/");
        driver.manage().window().maximize();



    }
    @Test
    public void ValidLogoutTestCase()
    {
        String ExpectUrl="https://ashraaf7.github.io/AA-Practice-Test-Automation/index.html";
        new P01_LoginPage(driver).EnterUserName("admin")
                .EnterPassword("admin")
                .ClickLoginButton().ClickLogoutButton();



        Assert.assertEquals(driver.getCurrentUrl(),ExpectUrl);

    }

}
