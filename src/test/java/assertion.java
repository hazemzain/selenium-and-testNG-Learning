import net.bytebuddy.build.Plugin;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class assertion {
    public WebDriver driver;
    @BeforeMethod(groups = {"Smoke Group"})
    public void BeforeTestCase()
    {
        driver=new FirefoxDriver();;
        //driver.manage().window().maximize();
        //driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/index.html");
        //driver = new FirefoxDriver();
        //System.out.println("kossmkk");


        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

  @Test(priority=1,groups = {"Smoke Group"})
    public void TestCase_1_invalid()
    {

       // driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/index.html");
        driver.findElement(By.id("inputUsername")).sendKeys("admin"); //username
        driver.findElement(By.id("inputPassword")).sendKeys("admi"); //password
        driver.findElement(By.id("loginButton")).click(); //login
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(),"https://ashraaf7.github.io/AA-Practice-Test-Automation/Pages/main.html");



    }
    @Test(priority = 2)
    public void TestCase_2_valid()
    {


        driver.manage().window().maximize();
        driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/index.html");
        driver.findElement(By.id("inputUsername")).sendKeys("admin"); //username
        driver.findElement(By.id("inputPassword")).sendKeys("admin"); //password
        driver.findElement(By.id("loginButton")).click(); //login
       // driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(),"https://ashraaf7.github.io/AA-Practice-Test-Automation/Pages/main.html");



    }
    @Test(groups = {"Smoke Group"})
    public void  TestCase_3()
    {
        System.out.println("Test CASE Excute");
    }
    @AfterMethod
    public void out()
    {

    }
}
