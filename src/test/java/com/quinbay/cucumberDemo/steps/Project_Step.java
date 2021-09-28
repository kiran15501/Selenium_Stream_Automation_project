package com.quinbay.cucumberDemo.steps;

import action.Action_Home;
import action.Action_game_details;
import action.Action_game_listing;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class Project_Step {
    WebDriver driver;
    Action_Home actHome;
    Action_game_listing game_list;
    Action_game_details details;
    String str;
    @Given("I am on Stream page")
    public void IamonStreampage(){
        System.setProperty("webdriver.chrome.driver","/Users/kiransubramanian/IdeaProjects/Demo_project/src/main/resources/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://store.steampowered.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        actHome=new Action_Home(driver);
        game_list=new Action_game_listing(driver);
        details=new Action_game_details(driver);

    }

    @When("search {string}")
    public void search(String arg0) {
        str=arg0;
        actHome.search_click(arg0);

    }

    @And("click fliter ACTION and ADVENTURE")
    public void clickFliterACTIONAndADVENTURE() {
        game_list.click_filter();
    }

    @And("slide to {string}and click Special Offer")
    public void slideToAndClickSpecialOffer(String arg0) throws InterruptedException {
        game_list.slide_click();
    }

    @And("SortBy name")
    public void sortbyName() throws InterruptedException {
        game_list.sortby();
        Thread.sleep(2000);
        game_list.get_list();
    }

    @And("TO game details page")
    public void toGameDetailsPage() throws InterruptedException {
        game_list.togame();
    }

    @And("Add to cart")
    public void addToCart() {
        details.addcart();
    }

    @And("Click continue")
    public void clickContinue()  {
        details.click_continue();
    }



    @Then("Repate first five steps and check")
    public void repateFirstFiveStepsAndCheck() throws InterruptedException {
        actHome.search_click(str);
        game_list.click_filter();
        game_list.slide_click();
        game_list.sortby();
        game_list.togame();
        details.check_addcart();
    }

    @And("Navigate back and click another product")
    public void navigateBackAndClickAnotherProduct() {
        game_list.click_another_game();
    }



    @Then("Add to carttwo and verify total")
    public void addToCarttwoAndVerifyTotal() {
        details.addcarttwo();
        details.verfiy_total();
    }

    @And("remove a product")
    public void removeAProduct() {
        details.remove_Product();

    }

    @Then("verfy total")
    public void verfyTotal() {
        details.verfiytotal();
    }

    @And("check search and filter")
    public void checkSearchAndFilter() {
        game_list.checkSearchAndFilter();
    }


    @And("check slider and special offer")
    public void checkSliderAndSpecialOffer() {
        game_list.checkSliderAndSpecialOffer();
    }
    @And("Check name")
    public void checkName() {
        game_list.checkName();
    }
    @And("Check cart")
    public void checkCart() {
        actHome.checkCart();
    }

    @And("close")
    public void close() {
        driver.close();
    }



}
