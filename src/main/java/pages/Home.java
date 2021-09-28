package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    @FindBy (id = "store_nav_search_term")
    WebElement search;

     @FindBy (id = "cart_link")
     WebElement cart_check;
    public void search_click(String word)
    {
        search.sendKeys(word+ Keys.ENTER);
    }
    public void checkCart(){
        System.out.println(cart_check.getText());
        Assert.assertEquals("CART (1)",cart_check.getText());
    }
}
