package SeleniumE2E;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Random;

public class Register extends BaseTest {

    By myAccountMenu = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'My account')]");
    By continueButton = By.xpath("//div[@id='content']//a[text()='Continue']");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By agreeCheckbox = By.xpath("//label[@for='input-agree']");
    By continueRegistrationButton = By.xpath("//input[@type='submit' and @value='Continue']");
    By logout = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'Logout')]");
    @Test
    @QaseTitle("test1_Register")
    @Step("Click on my account and the continue button, fill in all input fields, click on continue button to register")

    public void test1_Register() {
        //driver.findElement(By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'My account')]")).click();

        click(myAccountMenu);
        click(continueButton);
        type(firstName, "ABC");
        type(lastName, "DEF");
       // type(email, "abcdef@gmail.com");
        type(email, generateRandomEmail());
        type(telephone, "0123456789");
        type(password, "GHIJKL");
        type(confirmPassword, "GHIJKL");
        click(agreeCheckbox);
        click(continueRegistrationButton);

        Actions act = new Actions(driver);
        act.moveToElement(find(myAccountMenu)).perform();
        click(logout);
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

    private String generateRandomEmail(){

        return RandomStringUtils.random( 4, true, true) + "@gmail.com";
    }
}

