package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        WebElement open=driver.findElement(By.id("prompt"));
        open.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.sendKeys("Awesome!");
        alert.accept();
        WebElement res=driver.findElement(By.id("result"));
        System.out.println(res.getText());
    }
}
