package Page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AmazonPage {

    public void setRequestAndSearch(String request){
        open("https://www.amazon.com/");
        $(By.name("url")).click();
        $(By.xpath("(//*[@value='search-alias=stripbooks-intl-ship'])")).click();
        $(By.xpath("//*[@id='twotabsearchtextbox']")).val(request).pressEnter();
    }



}
