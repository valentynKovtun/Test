package Page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPage {

    public void setRequest(String request){
        open("http://google.com/ncr");
        $(By.name("q")).val(request);
    }

    public void clickSearch(){
        $(By.xpath("(//*[@name='btnK'])[1]")).click();
    }

    public void checkResults(String text){
        $$(withText(text));
    }
}