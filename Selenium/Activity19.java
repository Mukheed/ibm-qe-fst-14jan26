package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        WebElement open=driver.findElement(By.id("confirmation"));
        open.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        // System.out.println("Accept--:--");
        // alert.accept();
        // WebElement res=driver.findElement(By.id("result"));
        // System.out.println(res.getText());

        System.out.println("Cancel --:--");
        alert.dismiss();
        WebElement res1=driver.findElement(By.id("result"));
        System.out.println(res1.getText());
    }
}
