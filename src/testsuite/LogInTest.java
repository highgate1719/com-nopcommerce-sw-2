package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find the login line and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // collecting expected and actual text on login page
        String expectedText = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();

        //Verify expected and actual text
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //Find the login line and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the Email field and Type the email address // Valid Email: xyz@gmail.com
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("xyz@gmail.com");

        //Find the password field and type the password to password field // Valid password: Password12
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Password12");

        //Find the login button element and click
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        //Verify the ‘Log out’ text is display
        String expectedMessage = "Log in";
        WebElement actualMsg = driver.findElement(By.xpath("//A[@class='ico-login']"));
        String actualMessage = actualMsg.getText();

        //System.out.println(actualMessage); //for debugging purpose
        Assert.assertEquals("User is not able to login successfully",expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {

        //Find the login link and click on the login link
        WebElement loginLink = driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));
        loginLink.click();

        //Find the Email field and Type the email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Invalid@email.com");

        //Find the password field and type the password to password field
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Invalid777");

        //Find the login button element and click
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Find the errorMessage and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        //System.out.println(actualErrorMessage);
        Assert.assertEquals(expectedErrorMsg, actualErrorMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
