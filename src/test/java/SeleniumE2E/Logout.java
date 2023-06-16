package SeleniumE2E;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Logout extends BaseTest {

    By myAccountMenu = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'My account')]");
    By emailAddress = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//input[@type='submit' and @value='Login']");
    By Logout = By.xpath("//*[@id=\"column-right\"]/div/a[14]");


    @Test
    @QaseTitle("test3_Logout")
    @Step("Login to account and then Logout")
    public void test3_Logout() {
        click(myAccountMenu);
        type(emailAddress, "abcdefgh@gmail.com");
        type(password, "efghijkl");
        click(loginButton);
        Actions act = new Actions(driver);
        act.moveToElement(find(myAccountMenu)).perform();
        click(Logout);


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

