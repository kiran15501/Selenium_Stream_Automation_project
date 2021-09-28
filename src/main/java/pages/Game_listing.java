package pages;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.SortedMap;

public class Game_listing {
    WebDriver driver;

    @FindBy(xpath = "(//*[@data-loc='Adventure'])[2]")
    WebElement click_filter_adventure;

    @FindBy(xpath = "(//*[@data-loc='Action'])[2]")
    WebElement click_filter_action;

    @FindBy(id = "price_range")
    WebElement slider;

    @FindBy(xpath = "(//*[@data-loc='Special Offers'])[2]")
    WebElement special_offer;

    @FindBy(id="sort_by_trigger")
    WebElement sortBy;

    @FindBy(xpath = "(//*[@class='inactive_selection'])[3]")
    WebElement sortByName;

    @FindBy(xpath = "(//*[@id='search_resultsRows']/a)[1]")
    WebElement game1;

    @FindBy(xpath = "(//*[@id='search_resultsRows']/a)[2]")
    WebElement game2;

    @FindBy(xpath = "(//*[@class='searchtag tag_dynamic'])[1]")
    WebElement check_search;

    @FindBy(xpath = "(//*[@class='searchtag tag_dynamic'])[2]")
    WebElement check_filter1;

    @FindBy(xpath = "(//*[@class='searchtag tag_dynamic'])[3]")
    WebElement check_filter2;

    @FindBy(id = "price_range_display")
    WebElement check_slider;

    public void click_filter(WebDriver driver)
    {
        this.driver=driver;
        click_filter_adventure.click();
        click_filter_action.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)","");
    }
    public void slide_click()  {
        Actions action=new Actions(driver);
        action.dragAndDropBy(slider,-20,0).build().perform();
        special_offer.click();

    }
    public  void sortBy()
    {
        sortBy.click();
        sortByName.click();
    }
    public  void togame_click() throws InterruptedException {
        Thread.sleep(2000);
       game1.click();
    }
    public void click_another_game()
    {
        driver.navigate().back();
        game2.click();
    }
    public void get_list()
    {
        List<WebElement>list=driver.findElements(By.xpath("//*[@id='search_resultsRows']/a"));
        System.out.println(list.size());
//        for (int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i).getText());
//        }
    }
    public void checkSearchAndFilter()
    {
        Assert.assertEquals("\"Adventure\"",check_search.getText());
        Assert.assertEquals("Adventure",check_filter1.getText());
        Assert.assertEquals("Action",check_filter2.getText());
    }
    public void checkSliderAndSpecialOffer(){
            Assert.assertEquals("Under ₹ 1,250",check_slider.getText());
            Assert.assertEquals("Special offer is not enabled",true,special_offer.isEnabled());
    }
    public void checkName()
    {
        Assert.assertEquals("Name",sortBy.getText());
    }
}
