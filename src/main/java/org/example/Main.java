package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //problem_1() ;
        //problem_sample_solution();
        WorkingWithTextLink();
       /* WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ashraaf7.github.io/AA-Practice-Test-Automation/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("Username")).sendKeys("admin"); //username
        driver.findElement(By.id("inputPassword")).sendKeys("admin"); //password
        driver.findElement(By.id("loginButton")).click(); //login

        */


    }
    public static void WorkingWithTextLink()
    {
        //we will click in text link and read the message which apper in the page
        String Url="https://the-internet.herokuapp.com/notification_message_rendered";
        String ReturnMessageBeforeAction;
        String ReturnMessageAfterAction;
        WebDriver driver=new FirefoxDriver();
        driver.get(Url);   //open the page in firefox search engine
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //print the massege appear after i click in the link text
        //ReturnMessageBeforeAction= driver.findElement(By.xpath("//div[@id=\"flash\"]")).getText();
        //System.out.println("step 1="+ReturnMessageBeforeAction);
        //find the  Locator for textLink
        for (int i=0;i<4;i++) {
            driver.findElement(By.linkText("Click here")).click();
            ReturnMessageAfterAction = driver.findElement(By.xpath("//div[@id=\"flash\"]")).getText();
            System.out.println("Click number " +i+" is = "+ ReturnMessageAfterAction);
        }
    }
    public static   void problem_1() {
        String URl = "https://rahulshettyacademy.com/seleniumPractise/#/";
        WebDriver driver = new FirefoxDriver();
        driver.get(URl);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String productName=products.get(i).getText();
            if(productName.equals("Brocolli - 1 Kg")){
                System.out.println(productName);
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }


        }

    }
    public  static void problem_sample_solution()
    {
        String URl = "https://rahulshettyacademy.com/seleniumPractise/#/";
        WebDriver driver = new FirefoxDriver();
        driver.get(URl);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
    }
}