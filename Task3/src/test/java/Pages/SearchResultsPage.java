package Pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.List;

public class SearchResultsPage {
    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;
    public List<WebElement> list() {
        return driver.findElements(By.xpath(".//div[@class='search-result']//a[contains(.,'Специалист по тестированию')]"));
    }
}
