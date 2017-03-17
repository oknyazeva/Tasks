package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPage {
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;
    public void search() {
        WebElement search = driver.findElement(By.name("text"));
        search.sendKeys("Специалист по тестированию");
        search.submit();
    }
}
