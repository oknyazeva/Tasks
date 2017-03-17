package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;


    public void menu() {
        WebElement menu = driver.findElement(By.xpath(".//*[@id='mainmenu']//a[contains(@title, 'Работа')]"));
        menu.click();
    }
}
