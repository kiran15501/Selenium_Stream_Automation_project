package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Game_details;

public class Action_game_details {
    WebDriver driver;
    Game_details details;
    public  Action_game_details(WebDriver driver)
    {
        this.driver=driver;
        details= PageFactory.initElements(driver,Game_details.class);
    }
    public void addcart()
    {
        details.addcart();
    }
    public void click_continue()  {


        details.click_continue(driver);
    }
    public void check_addcart()
    {
        details.check_addcart();
    }
    public void addcarttwo()
    {
        details.addcarttwo();
    }
    public void verfiy_total()
    {
        details.verfiy_total();
    }
    public void remove_Product()
    {
        details.remove();
    }
    public void verfiytotal(){
        details.verfiytotal();
    }
}
