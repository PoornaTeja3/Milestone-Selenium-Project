package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class FlightBookingPage {

    WebDriver driver;

    public FlightBookingPage(WebDriver driver) {

        this.driver = driver;
    }

    public void bookFlight() {

        driver.get("https://blazedemo.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Select from = new Select(driver.findElement(By.name("fromPort")));

        from.selectByVisibleText("Boston");

        Select to = new Select(driver.findElement(By.name("toPort")));

        to.selectByVisibleText("London");

        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Choose This Flight'])[1]")));

        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();

        driver.findElement(By.id("inputName")).sendKeys("Teja");

        driver.findElement(By.id("address")).sendKeys("Hyderabad");

        driver.findElement(By.id("city")).sendKeys("Hyderabad");

        driver.findElement(By.id("state")).sendKeys("TS");

        driver.findElement(By.id("zipCode")).sendKeys("500001");

        driver.findElement(By.id("creditCardNumber")).sendKeys("123456789");

        driver.findElement(By.id("creditCardMonth")).clear();
        driver.findElement(By.id("creditCardMonth")).sendKeys("12");

        driver.findElement(By.id("creditCardYear")).clear();
        driver.findElement(By.id("creditCardYear")).sendKeys("2026");

        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
    }
}