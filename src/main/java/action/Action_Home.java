package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.Home;

public class Action_Home {
    WebDriver driver;
    Home home;
    public  Action_Home(WebDriver driver){
        this.driver=driver;
        home= PageFactory.initElements(driver,Home.class);
    }

    public  void  search_click(String word)
    {
        home.search_click(word);
    }
    public void checkCart()
    {
        home.checkCart();
    }
}
