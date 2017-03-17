package tests; /**
 * Created by o_knyazeva on 3/16/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by o_knyazeva on 3/16/17.
 */
public class OpenSiteTest {


    //@BeforeTest
    //public void SetUp() {
        //WebDriver driver;
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        //driver = new ChromeDriver();
        //driver.get("https://tut.by/");
    //}

    @Test

    public void gosite() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://tut.by/");

        WebElement menu = driver.findElement(By.xpath(".//*[@id='mainmenu']//a[contains(@title, 'Работа')]"));
                menu.click();
        WebElement search = driver.findElement(By.name("text"));
        search.sendKeys("Специалист по тестированию");
        search.submit();
        WebElement list;
        List<WebElement> elements = driver.findElements(By.xpath(".//div[@class='search-result']//a[contains(.,'Специалист по тестированию')]"));
        Assert.assertTrue(elements.size()==0);
        //assertTrue(elements.getText().contaiins("Специалист по тестированию"));
                }



}

