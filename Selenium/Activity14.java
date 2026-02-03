package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/tables");
        System.out.println("Page title: " + driver.getTitle());

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        WebElement fifthbook = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]"));
        System.out.println("Book name before sorting: " + fifthbook.getText());

        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th[5]")).click();

        WebElement fifthbook1 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]"));
        System.out.println("Book name After sorting: " + fifthbook1.getText());
    }
}