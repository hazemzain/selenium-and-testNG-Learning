import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T01_LoginTest {
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
    public void ValidLoginTestCase()
    {
        String ExpectUrl="https://ashraaf7.github.io/AA-Practice-Test-Automation/Pages/main.html";
        new P01_LoginPage(driver).EnterUserName("admin")
                .EnterPassword("admin")
                .ClickLoginButton();


       // LoginPage.EnterUserName("admin");
        //LoginPage.EnterPassword("admin");
        //LoginPage.ClickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(),ExpectUrl);

    }

}
