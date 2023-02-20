package team8_testngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import team8_testngproject.utilities.Driver;
import team8_testngproject.utilities.ReusableMethods;

public class P09_CartPage {
    public P09_CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }






    // 20.Satır --> Ali





























    // 50.Satır --> Esra





























    // 80.Satır --> Gonca





























    // 110.Satır --> Gürkay





























    // 140.Satır --> Hüseyin





























    // 170.Satır --> Mehmet





























    // 200.Satır --> Meryem





























    // 230.Satır --> Zeliha





























    // 260.Satır --> Nurullah





























    // 290.Satır --> Ramazan





























    // 320.Satır --> Sevda





























    // 350.Satır --> Mustafa

    @FindBy (css = "td[class='product-thumbnail']")
    public  WebElement productDisplayLoc;
    @FindBy (css = "button[title='Plus']")
    public  WebElement plusBtnLoc;
    @FindBy(css = "button[value='Update cart']")
    public  WebElement updateCartBtnLoc;
    @FindBy (css = "button[title='Minus']")
    public  WebElement minusBtnLoc;
    @FindBy (css = "div[role='alert']")
    public  WebElement popupUpdateCartLoc;

    public void checkPlusUpdate(){
        plusBtnLoc.click();
        ReusableMethods.jsClick(updateCartBtnLoc);
    }
    public void checkMinusUpdate(){
        ReusableMethods.waitFor(3);
        minusBtnLoc.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.jsClick(updateCartBtnLoc);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(popupUpdateCartLoc.isDisplayed());
    }



























}