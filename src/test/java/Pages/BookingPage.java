package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
    public BookingPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (id = "ctl00_IBEHeader_NEW_EK_LOGO")
    public WebElement EmiratesLogo;

    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement AcceptCookies;
}
