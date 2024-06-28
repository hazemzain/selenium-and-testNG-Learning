import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_HomePage {
    private final WebDriver driver;
    public P02_HomePage(WebDriver driver) {
        this.driver=driver;
    }

    private final By LogOutButton=By.cssSelector("button[class='btn btn-primary logout']");


    public void ClickLogoutButton(){
        driver.findElement(LogOutButton).click();
    }

}
