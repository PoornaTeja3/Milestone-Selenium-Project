package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GUIElementsPage {

    WebDriver driver;

    public GUIElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm() {

        driver.get("https://testautomationpractice.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Teja");

        driver.findElement(By.id("email")).sendKeys("teja@test.com");

        driver.findElement(By.id("phone")).sendKeys("9999999999");

        driver.findElement(By.id("textarea")).sendKeys("Hyderabad");

        driver.findElement(By.id("male")).click();

        driver.findElement(By.id("monday")).click();

        driver.findElement(By.id("country")).sendKeys("India");

        driver.findElement(By.id("datepicker")).sendKeys("06/20/2026");
    }
}