package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println("Page title: " + driver.getTitle());

        WebElement football=driver.findElement(By.id("ball"));
        WebElement drop1=driver.findElement(By.id("dropzone1"));
        WebElement drop2=driver.findElement(By.id("dropzone2"));

        builder.clickAndHold(football).moveToElement(drop1).pause(1000).release().build().perform();
        if(drop1.findElement(By.xpath("//*[@id=\"dropzone1\"]")).getText().equals("dropped!")){
            System.out.println("Ball is dropped to zone-1");
        }
        
        builder.clickAndHold(football).moveToElement(drop2).pause(1000).release().build().perform();
        if(drop1.findElement(By.id("//*[@id=\"dropzone2\"]")).getText().equals("dropped!")){
            System.out.println("Ball is dropped to zone-2");
        }
    }
}
