package companyName;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SessionTwo {

    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Locating by ID
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Locating by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //Locating by xpath
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        WebElement firstProduct = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        firstProduct.click();
        Thread.sleep(3000);
        //Locating by css selector
        driver.findElement(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']")).click();
        Thread.sleep(3000);
        //Locating by css selector tagName[attribute='value']
        boolean isRemoveButton = driver.findElement(By.cssSelector("button[class='btn btn_secondary btn_small btn_inventory']")).isDisplayed();
        System.out.println(isRemoveButton);
        //Locating by class name
        driver.findElement(By.className("shopping_cart_link")).click();
        //Locating by id
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        //Locating by link text
        driver.findElement(By.linkText("About")).click();
        //Locating by partial text
        driver.findElement(By.partialLinkText("Ims")).click();
    }
}
