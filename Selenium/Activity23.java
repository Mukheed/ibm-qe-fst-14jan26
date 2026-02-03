package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity23 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/nested-iframes");
        System.out.println("Title is:"+driver.getTitle());

        WebElement frame = driver.findElement(By.xpath("/html"));
        driver.switchTo().frame(frame);



    }
    
}
