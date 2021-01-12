package Page;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class Book {

    private String name;
    private String author;
    private String price;
    private boolean bestSeller;

    private final List <Book> books = new ArrayList<>();

    public String findBookInList(String name){
        for (Book book : books) {
            if (book.name.equals(name)) {
                return book.name;
            }
        }
        return null;
    }

    public void setBooksToList(){
        for (int i = 1;i<17; i++){

            books.add(new Book(i));
        }
    }

    public Book(int i) {
        this.name = $(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])["+i+"]")).getText();
        this.author = $(By.xpath("(//*[@class='a-size-base a-link-normal'])["+i+"]")).getText();
        this.price = $(By.xpath("(//*[@class='a-price-whole'])["+i+"]")).getText();
        this.bestSeller = !$(By.xpath("(//*[@class='a-size-base a-color-secondary'])["+i+"]")).getText().equals("|");
    }

    public Book() {
    }

    public void writeList(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price +"$" +'\'' +
                ", bestSeller=" + bestSeller;
    }
}
