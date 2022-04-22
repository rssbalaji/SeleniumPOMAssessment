package SeleniumWebPages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void user_navigates_to_zomato_webpage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//img[contains(@alt,'Dining')]")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[contains(text(), 'Delivery')]")).click();

    }

    public void user_verifies_the_web_elements_actual(String webElement) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement mcDonald = driver.findElement(By.xpath("//div[@class='sc-isBZXS bSrxqy']/h6[contains(text(),'McDonald')]"));
        String actualText = mcDonald.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(webElement, actualText);

        softAssert.assertAll();

        driver.close();
    }


}
