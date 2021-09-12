package StepDefinitions;

import Pages.BookingPage;
import Utils.BrowserUtils;
import Utils.ConfigurationReader;
import Utils.Driver;
import Utils.Helpers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class booking_StepDefs extends BookingPage {
    Helpers helpers=new Helpers();
    Actions actions=new Actions(Driver.get());

    @Given("user navigates to Emirates booking page")
    public void user_navigates_to_emirates_booking_page() throws InterruptedException {
        helpers.get(ConfigurationReader.get("bookingPageUrl"));
       // BrowserUtils.waitForVisibility((By) AcceptCookies,3000);
        Thread.sleep(3000);
        actions.moveToElement(AcceptCookies).click().perform();
    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String string) {
       String actualTitle=helpers.Title();
       String expectedTitle=string;
       Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Then("system should display the Emirates logo")
    public void system_should_display_the_emirates_logo() {

        Assert.assertTrue(EmiratesLogo.isDisplayed());
    }
    @When("user clicks on Emirates logo")
    public void user_clicks_on_emirates_logo() {
        EmiratesLogo.click();
    }
    @Then("system should navigate to Emirates home page")
    public void system_should_navigate_to_emirates_home_page() {
        String actualUrl=helpers.CurrentUrl();
        String expectedUrl="https://www.emirates.com/englsh";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
