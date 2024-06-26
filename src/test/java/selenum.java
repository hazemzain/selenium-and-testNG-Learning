import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class selenum {
   //public static WebDriver driver=new InternetExplorerDriver();

 public static WebDriver driver=new EdgeDriver() ;
    public static void main(String[] args) throws IOException {


        // WebDriver driver=new InternetExplorerDriver();
        //Open_Browser("https://the-internet.herokuapp.com/dynamic_loading/1");
        //HandleDrobDown();
        //RightClickAction();
        //DragAndDropAction();
       // HandleWindows();
        //alarts();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.findElement(By.tagName("button")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id=finish]>h4")));
       // WebDriverWait x =new WebDriverWait(driver,Duration.ofSeconds(5));
       // x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id=finish]>h4")));
        //String result= driver.findElement(By.cssSelector("div[id=finish]>h4")).getText();
        //System.out.println(result);
       // Manage_wabSiteAsFullscreen();
        //Manage_wabSiteSetDimension();
       // driver.findElement(By.id("username")).sendKeys("tomsmith");
        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();
        //String Result=driver.findElement(By.cssSelector("div#flash")).getText();
        //System.out.println(Result);
        //TakeScreenShot("screen1");


        //String x=GetURL();
    }
    public  static  void TakeScreenShot(String ImageName) throws IOException {
        Open_Browser("https://the-internet.herokuapp.com/javascript_alerts");
        String path="D:\\4 year eng\\selunim_session\\src\\main\\resources";
       File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File target=new File(path+ImageName+".png");
        FileUtils.copyFile(scr,target);

    }
    public static void alarts()
    {
        Open_Browser("https://the-internet.herokuapp.com/javascript_alerts");
        By alartElment=By.cssSelector("[onclick=\"jsPrompt()\"]");
        driver.findElement(alartElment).click();
        driver.switchTo().alert().sendKeys("hazem");
        driver.switchTo().alert().accept();



    }

    public static void HandleWindows()
    {
        Open_Browser("https://the-internet.herokuapp.com/windows");
        By OPen= By.xpath("//a[@href=\"/windows/new\"]");
        String Tab1=driver.getWindowHandle();
        String Tab2="";
        driver.findElement(OPen).click();
        System.out.println(driver.getCurrentUrl());
        //get handles for open taps
        Set<String> handles=driver.getWindowHandles();
        for (String handle : handles)
        {
            if(!handle.equals(Tab1))
            {
                Tab2=handle;
            }

        }
        driver.switchTo().window(Tab2);
        System.out.println(driver.getCurrentUrl());
        System.out.println("handle for frist page="+Tab1);
        System.out.println("handle for second page="+Tab2);


    }
    public static void DragAndDropAction()
    {
        Open_Browser("https://the-internet.herokuapp.com/drag_and_drop");

        By DragDropActions=By.id("column-a");
        By DragDropActions_1=By.id("column-b");
        WebElement x=driver.findElement(DragDropActions);
        WebElement y=driver.findElement(DragDropActions_1);

        Actions action=new Actions(driver);
        action.dragAndDrop(x,y).perform();



    }
    public static void RightClickAction()
    {
        Open_Browser("https://the-internet.herokuapp.com/context_menu");

        By RightClickActions=By.id("hot-spot");
        WebElement x=driver.findElement(RightClickActions);

        Actions action=new Actions(driver);
        action.contextClick(x).perform();



    }
    public static void HandleDrobDown()
    {
        Open_Browser("https://the-internet.herokuapp.com/dropdown");

        By DrobDownElement=By.cssSelector("div>select");
        WebElement x=driver.findElement(DrobDownElement);
        new Select(x).selectByIndex(2);


    }

    public static void Open_Browser(String URL)
    {
        driver.get(URL);

    }

    public static void Open_BrowserUsingNavigation(String URL)
    {
        driver.navigate().to(URL);

    }
    public static void RefreshUsingNavigation()
    {
        driver.navigate().refresh();

    }
    public  static void Manage_wabSiteAsMax()
    {
        driver.manage().window().maximize();
    }
    public  static void Manage_wabSiteAsFullscreen()
    {
        driver.manage().window().fullscreen();
    }
    public  static void Manage_wabSiteSetDimension()
    {
        Dimension dim=new Dimension(430,932);
        driver.manage().window().setSize(dim);
    }
    public  static  String GetURL()
    {
        System.out.println(driver.getCurrentUrl());
      return   driver.getCurrentUrl();
    }
}
