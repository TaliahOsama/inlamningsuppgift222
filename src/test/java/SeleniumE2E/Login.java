package SeleniumE2E;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseTest{
    By myAccountMenu = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'My account')]");
    By emailAddress = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//input[@type='submit' and @value='Login']");

    @Test
    @QaseTitle("test2_Login")
    @Step("Click MyAccount, fill in input fields and click on Login")

    public void test2_Login() {
        click(myAccountMenu);
        type(emailAddress, "abcdef@gmail.com");
        type(password, "GHIJKL");
        click(loginButton);



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
