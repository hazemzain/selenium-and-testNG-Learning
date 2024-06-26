import net.bytebuddy.implementation.bytecode.Throw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestNG {
   public WebDriver driver;
    @BeforeMethod
    public void BeforeTestCase()
    {
         driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/index.html");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    public void TestCase_1()
        {

            driver.findElement(By.id("inputUsername")).sendKeys("admin"); //username
            driver.findElement(By.id("inputPassword")).sendKeys("admi"); //password
            driver.findElement(By.id("loginButton")).click(); //login
            driver.switchTo().alert().accept();
            Assert.assertEquals(driver.getCurrentUrl(),"https://ashraaf7.github.io/AA-Practice-Test-Automation/Pages/main.html");



        }
        @Test(dataProvider = "GetData")
        public void TestDataProvider(String userName,String Password)
        {
            System.out.println("this is username = "+userName+" and the password for this user name is = "+Password);

        }
        @AfterMethod
    public void out()
        {

        }
        @DataProvider
    public Object[][] GetData()
        {
            //if i want to pass many data for the same test case
            Object[][] Data=new Object[3][2];
            Data[0][0]="hazem";
            Data[0][1]="p1";

            Data[1][0]="mohamed";
            Data[1][1]="p2";

            Data[2][0]="saif";
            Data[2][1]="p3";
            return Data;

        }


}
