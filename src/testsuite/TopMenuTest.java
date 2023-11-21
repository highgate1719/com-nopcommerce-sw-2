package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * <p>
 * click on the ‘Computers’ Tab
 * Verify the text ‘Computers’
 * <p>
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * <p>
 * click on the ‘Electronics’ Tab
 * Verify the text ‘Electronics’
 * <p>
 * 3. userShouldNavigateToApparelPageSuccessfully
 * <p>
 * click on the ‘Apparel’ Tab
 * Verify the text ‘Apparel’ 4.
 * <p>
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * click on the ‘Digital downloads’ Tab
 * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * <p>
 * click on the ‘Books’ Tab
 * Verify the text ‘Books’
 * <p>
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * <p>
 * click on the ‘Jewelry’ Tab
 * Verify the text ‘Jewelry’
 * <p>
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * click on the ‘Gift Cards’ Tab
 * Verify the text ‘Gift Cards’
 */

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully()throws InterruptedException {

        //Verify the text 'Computers'
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[1]//a[text()='Computers ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

        //click on 'computers' tab and verify that user successfully navigate
        driver.findElement(By.linkText("Computers")).click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() throws InterruptedException {

        //click on Electronics tab and verify that user can successfully navigate
        driver.findElement(By.linkText("Electronics")).click();
        Thread.sleep(5000);
        //verify the text Electronics
        String expectedMessage1 = "Electronics";
        WebElement message1 = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[2]//a[text()='Electronics ']"));
        String actualMessage1 = message1.getText();
    }

    @Test

    public void userShouldNavigateToTApparelPageSuccessfully()throws InterruptedException {
        //click on 'Apparel' tab and verify that user successfully navigate
        driver.findElement(By.linkText("Apparel")).click();
        Thread.sleep(5000);
        //Verify the text 'Apparel'
        String expectedMessage = "Apparel";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[3]//a[text()='Apparel ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToDigitalDownloadPageSuccessfully()throws InterruptedException {
        //click on 'Digital Download' tab and verify that user successfully navigate
        driver.findElement(By.linkText("Digital downloads")).click();
        Thread.sleep(5000);

        //Verify the text 'Digital downloads'
        String expectedMessage = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[4]//a[text()='Digital downloads ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()throws InterruptedException {
        //click on 'Books' tab and verify that user successfully navigate
        driver.findElement(By.linkText("Books")).click();
        Thread.sleep(5000);

        //Verify the text 'Books'
        String expectedMessage = "Books";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[5]//a[text()='Books ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToJewlryPageSuccessfully() throws InterruptedException{
        //click on 'Jewelry ' tab and verify that user successfully navigate
        driver.findElement(By.linkText("Jewelry")).click();
        Thread.sleep(5000);

        //Verify the text 'Jewelry '
        String expectedMessage = "Jewelry";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[6]//a[text()='Jewelry ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToGiftCardPageSuccessfully()throws InterruptedException {
        //click on 'Gift Cards  ' tab and verify that user successfully navigate
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(5000);

        //Verify the text 'Gift Cards'
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[7]//a[text()='Gift Cards ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method
    }

    @After
    public void closeBar() {
        driver.quit();
    }

}
