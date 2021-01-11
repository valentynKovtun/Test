package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {

    private final WebDriver driver;

    public GooglePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void setRequest(String request) {
        driver.findElement(By.name("q")).sendKeys(request);

    }
    public void clickSearch(){
        WebElement btnSearch =  driver.findElement(By.xpath("(//*[@name='btnK'])[1]"));
        WebElement wait = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@name='btnK'])[1]")));
        btnSearch.click();
    }
}
