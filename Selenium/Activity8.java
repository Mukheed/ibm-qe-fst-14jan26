package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        Actions builder=new Actions(driver);
        driver.get(" https://training-support.net/webelements/mouse-events");
        System.out.println("Page title: " + driver.getTitle());

        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcBtn = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetBtn = driver.findElement(By.xpath("//h1[text()='target']"));

        builder.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(5000).click(cargoToml).build().perform();


        System.out.println(driver.findElement(By.id("result")).getText());


        builder.doubleClick(srcBtn).pause(3000).pause(5000).contextClick(targetBtn).pause(3000).build().perform();
        builder.click(driver.findElement(By.xpath("//p[@id='result']"))).pause(5000).build().perform();
        System.out.println(driver.findElement(By.id("result")).getText());

    }
    
}
