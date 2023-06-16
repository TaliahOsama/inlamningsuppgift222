package SeleniumE2E;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProductPurchase extends BaseTest{
    By myAccountMenu = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'My account')]");
    By emailAddress = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//input[@type='submit' and @value='Login']");
    By searchField = By.xpath("//div[@id='entry_217822']//input[@aria-label='Search For Products']");
    By searchButton = By.xpath("//div[@id='search']//button[text()='Search']");
    By SonyVAIO = By.xpath("//div[@id='entry_212469']//a[text()='Sony VAIO']");
    //By addToCartButton = By.xpath("//div[@id='entry_216826']//button[text()")
    By buyNowButton = By.xpath("//div[@id='entry_216843']//button[text()='Buy now']");
    @Test
    @QaseTitle("test4_ProductPurchase")
    @Step("Login to account, search for Sony VAIO, Click on Buy now button")
    public void test4_ProductPurchase(){
        click(myAccountMenu);
        type(emailAddress, "abcdefgh@gmail.com");
        type(password, "efghijkl");
        click(loginButton);
        type(searchField, "Sony VAIO");
        click(searchButton);
        click(SonyVAIO);
        click(buyNowButton);

    }

    private WebElement find(By locator) {

        return driver.findElement(locator);
    }

    private void click(By locator) {

        find(locator).click();
    }


    private void type(By locator, String text) {

        find(locator).sendKeys(text);
    }
}
