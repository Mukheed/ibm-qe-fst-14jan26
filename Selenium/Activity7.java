package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("page title: " + driver.getTitle());

        WebElement text = driver.findElement(By.id("textInput"));

        System.out.println(""+text.isEnabled());
        driver.findElement(By.id("textInputButton")).click();
        System.out.println(""+text.isEnabled());

        text.sendKeys("Example");
        System.out.println(text.getText());
    }
    
}
