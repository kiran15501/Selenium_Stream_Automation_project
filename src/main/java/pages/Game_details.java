package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Game_details {
    WebDriver driver;

    @FindBy(xpath="//*[@class='btn_green_steamui btn_medium']")
    WebElement addcart;

    @FindBy(xpath = "//*[@class='btn_green_steamui btn_medium']/span")
    WebElement check_addcart;

    @FindBy(xpath = "//*[@class='btn_medium btnv6_blue_hoverfade']")
    WebElement click_continue;

    @FindBy(xpath = "//*[@class='btn_green_steamui btn_medium']")
    WebElement addcart2;

    @FindBy(xpath = "(//*[@class='price'])[1]")
    WebElement game1_price;

    @FindBy(xpath = "(//*[@class='price'])[2]")
    WebElement game2_price;

    @FindBy(xpath = "(//*[@class='price'])[3]")
    WebElement total_price;

    @FindBy(xpath = "(//*[@class='price'])[2]")
    WebElement total_price2;

    @FindBy(xpath = "(//*[@class='remove_link'])[1]")
    WebElement remove;

    public void addcart(){
        addcart.click();
    }
    public void click_continue(WebDriver driver) {
        this.driver=driver;
       // Thread.sleep(2000);
        click_continue.click();
    }

    public void addcarttwo()
    {
        addcart2.click();
    }

    public void remove(){
        remove.click();
    }
    public void check_addcart()
    {
        Assert.assertEquals("In Cart",check_addcart.getText());
    }
    public void verfiy_total()
    {
        Assert.assertEquals("₹ 2,181",total_price.getText());
        String game1=game1_price.getText();
        String game2=game2_price.getText();
        String total=total_price.getText();
        total=total.replaceAll("[^0-9]", "");
        game1 = game1.replaceAll("[^0-9]", "");
        game2 = game2.replaceAll("[^0-9]", "");
        Assert.assertEquals(Integer.parseInt(game1)+Integer.parseInt(game2),Integer.parseInt(total));
    }
    public void verfiytotal()
    {
        Assert.assertEquals("₹ 1,203",total_price2.getText());
    }


}
