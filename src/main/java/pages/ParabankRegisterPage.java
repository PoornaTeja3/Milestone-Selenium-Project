package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParabankRegisterPage {

    WebDriver driver;

    public ParabankRegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    public void registerUser() {

        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String username = "user" + System.currentTimeMillis();

        driver.findElement(By.id("customer.firstName")).sendKeys("Teja");

        driver.findElement(By.id("customer.lastName")).sendKeys("K");

        driver.findElement(By.id("customer.address.street")).sendKeys("Hyderabad");

        driver.findElement(By.id("customer.address.city")).sendKeys("Hyderabad");

        driver.findElement(By.id("customer.address.state")).sendKeys("Telangana");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("500001");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9999999999");

        driver.findElement(By.id("customer.ssn")).sendKeys("12345");

        driver.findElement(By.id("customer.username")).sendKeys(username);

        driver.findElement(By.id("customer.password")).sendKeys("password");

        driver.findElement(By.id("repeatedPassword")).sendKeys("password");

        driver.findElement(By.xpath("//input[@value='Register']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));

        driver.findElement(By.linkText("Log Out")).click();

        driver.findElement(By.name("username")).sendKeys(username);

        driver.findElement(By.name("password")).sendKeys("password");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}