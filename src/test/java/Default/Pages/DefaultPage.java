package Default.Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultPage {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    public DefaultPage(WebDriver driver) {
        wait = new WebDriverWait(driver, 30);
        this.driver = driver;
        actions= new Actions(driver);
    }

    public By continueButtonDefault = By.xpath("//button[@class='continue-button next-button button']");
    public By continueButtonSlideshow = By.xpath("//button[@class='next-button button']");
    public By mediaCredits = By.className("articlecontent__mediacredit");
    public By pageCount = By.xpath("//span[@class='pagecountercurrent']");
    public By postTime = By.className("articlehead__posttime");

    public void clickContinueDefault(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButtonDefault));
        driver.findElement(continueButtonDefault).click();
    }

    public void clickContinueSlideShow(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButtonSlideshow));
        driver.findElement(continueButtonSlideshow).click();
    }

}