package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface WebDriver {

    void get(String string);

    String getTitle();

    WebElement findElement(By id);

}
