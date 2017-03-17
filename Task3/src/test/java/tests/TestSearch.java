package tests;

import Pages.MainPage;
import Pages.SearchPage;
import Pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSearch {
    WebDriver driver;
    MainPage mainPage;
    SearchPage searchPage;
    SearchResultsPage srResults;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tut.by/");
        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver);
        srResults = new SearchResultsPage(driver);
    }

    @Test
    public void test() {
        mainPage.menu();
        searchPage.search();
        Assert.assertFalse(srResults.list().isEmpty());
    }

   @AfterTest
           public void quit() {
       driver.quit();
   }
}