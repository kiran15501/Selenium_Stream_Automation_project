package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Game_listing;

public class Action_game_listing {
    WebDriver driver;
    Game_listing game_list;
    public Action_game_listing(WebDriver driver)
    {
        this.driver=driver;
        game_list= PageFactory.initElements(driver,Game_listing.class);
    }
    public  void click_filter()
    {
        game_list.click_filter(driver);
    }
    public void slide_click()  {
        game_list.slide_click();
    }
    public void sortby()
    {
        game_list.sortBy();
    }
    public void  togame() throws InterruptedException {
        game_list.togame_click();
    }
    public void  click_another_game()
    {
        game_list.click_another_game();
    }
    public void checkSearchAndFilter(){
        game_list.checkSearchAndFilter();
    }
    public void get_list()
    {
        game_list.get_list();
    }
    public void checkSliderAndSpecialOffer()
    {
        game_list.checkSliderAndSpecialOffer();
    }
    public void checkName()
    {
        game_list.checkName();
    }
}
