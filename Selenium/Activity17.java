package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title: " + driver.getTitle());

        WebElement dropdown=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
        Select select=new Select(dropdown);
        

        //HTML option(visible)
        select.selectByVisibleText("HTML ");

        //4,5,6 option(index)
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);

        //fourth option(value)
        select.selectByValue("nodejs");

        //deselect 5th
        select.deselectByIndex(4);

        List<WebElement> opt=select.getAllSelectedOptions();

        //selecting all
        for(int i=0; i<opt.size();i++){
            System.out.println(opt.get(i).getText());

        }
    }
}
