package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchEngine {

    public static void findWord(WebDriver webDriver, String text) {
        List<WebElement> list = webDriver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
    }

    public static void findWord(String text) {

    }
}
