package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. user ShouldRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 */
public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //find Register link and verify that user should navigate successfully

        //  driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.xpath("//div[@class='header-links']//ul[1]//li[1]//a[text()='Register']")).click();


        //User should select one radio button
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        //Enter first name
        driver.findElement(By.name("FirstName")).sendKeys("Chintan");
        //Enter value in last name filed
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //Select date of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("28");
        //Enter month in month field
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("August");
        //Enter year
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1980");
        //Enter email in Email field
        driver.findElement(By.xpath("//input[@id='Email' and @name='Email'] ")).sendKeys("test6789@gmail.com");
        //Enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test1234");
        //Enter confirm password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword'] ")).sendKeys("test1234");

        //user should click Register button
        driver.findElement(By.xpath("//div[@class='buttons']//button[@name='register-button']")).click();

        //Verify the text  Your registration completed

        String expectedMessage = "Your registration completed";
        WebElement message = driver.findElement(By.xpath("//div[@class ='result' and text()='Your registration completed']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals("Registration is not successful", expectedMessage, actualMessage);//verifying using the assert method


    }

    @After
    public void TearDown() {
        closeBrowser();

    }


}
