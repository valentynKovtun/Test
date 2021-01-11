package Test;


import Page.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Properties;

public class TestGoogle {

    WebDriver webDriver;
    GooglePage obgGoogle;

    @BeforeClass
    public void start() {
        webDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver.get("https://www.google.com.ua/");
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

        String text = "Java";
        obgGoogle = new GooglePage(webDriver);
        obgGoogle.setRequest(text);
        obgGoogle.clickSearch();
        SearchEngine.findWord(webDriver,text);
        System.getProperty("searchString","Java");
    }

    @AfterClass
    public void finish() {
        webDriver.quit();
    }


}
