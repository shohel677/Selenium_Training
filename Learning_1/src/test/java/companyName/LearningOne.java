package companyName;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearningOne {


    public static void main(String [] args){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Locating by iD
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Locating by Name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //Locating by xpath
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }
}
