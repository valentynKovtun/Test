package Test;

import Page.AmazonPage;
import Page.Book;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon {

    @Test
    public void TestBookSearch(){
        AmazonPage amazonPage = new AmazonPage();
        Book book = new Book();

        amazonPage.setRequestAndSearch("Java");
        book.setBooksToList();
        book.writeList();
        Assert.assertEquals(book.findBookInList("Head First Java, 2nd Edition"), "Head First Java, 2nd Edition");

    }
}
