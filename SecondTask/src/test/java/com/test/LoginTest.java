package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by o_knyazeva on 3/12/17.
 */
public class LoginTest {
    String username;
    String password;

    //@Parameters({"username", "password"})

    @BeforeMethod
    public void setUp() {
        username = "o.knyazeva";
        password = "123456";
    }

    @Test
    public void Login() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://webmail.itransition.com/");
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys(username);
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys(password);
        Password.submit();
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver d) {
                return d.findElement(By.id("primaryHeaderView"));
            }
        });
        driver.quit();
    }
}
