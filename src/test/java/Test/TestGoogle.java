package Test;


import Page.GooglePage;
import Page.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.util.Properties;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestGoogle {

    WebDriver webDriver;
    GooglePage obgGoogle;
    String text = "Java";
    @BeforeClass
    public void start() {
      //  webDriver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       // webDriver.get("https://www.google.com.ua/");
    }

    @Test
    public void testGoogle() {

//        WebElement input = webDriver.findElement(By.name("q"));
//
//        input.click();
//        input.sendKeys("Java");
//
//        WebElement BtnSearch = webDriver.findElement(By.xpath("(//*[@name='btnK'])[1]"));
//        WebElement firstResult = new WebDriverWait(webDriver, 5)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@name='btnK'])[1]")));
//        BtnSearch.click();
        ;
        obgGoogle = new GooglePage(webDriver);
        obgGoogle.setRequest(text);
        obgGoogle.clickSearch();
        SearchEngine.findWord(webDriver,text);
    }

    @AfterClass
    public void finish() {
   //     webDriver.quit();
    }

    @Test
    public void user_can_search_everything_in_google() {

        SearchResultsPage searchResultsPage = new SearchResultsPage();

        searchResultsPage.setRequest(text);
        searchResultsPage.clickSearch();
        searchResultsPage.checkResults(text);
    }
}
