package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title: " + driver.getTitle());

        WebElement dropdown=driver.findElement(By.xpath("//select"));
        Select select=new Select(dropdown);
        List<WebElement> opt=select.getOptions();
        //second option(visible)
        select.selectByVisibleText("Two");

        //third option(index)
        select.selectByIndex(2);

        //fourth option(value)
        select.selectByValue("four");

        System.out.println("all options are:"+ opt);

        //selecting all
        for(int i=0; i<opt.size();i++){
            System.out.println(opt.get(i).getText());

        }
    }
}
