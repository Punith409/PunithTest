package AmazonCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonCommonPages {
    WebDriver driver;
    By ClickSignIn = By.xpath("/html/body/div[1]/header/div[1]/div[2]/div[1]/a\n");
    By Email = By.xpath(".//input[@id='ap_email']");
    By Password = By.xpath("//input[@id='ap_password']");
    By ClickLoginSubmit = By.xpath("//input[@id='signInSubmit']");
    By clickDevConsole = By.xpath("/html/body/div[1]/header/div[1]/div[2]/a\n");
    By AddNewApp = By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/section[3]/div[1]/div[2]/div[2]/a[1]");
    By AddnewApp2 = By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/div/button\n");
    By AndroidApp = By.xpath("//div[@id='my-apps-root']//li[1]//a[1]");


    public AmazonCommonPages (WebDriver driver) {
        this.driver=driver;
    }
    public void ActionMethod (String UN, String PW) throws InterruptedException {
        driver.findElement(ClickSignIn).click();
        Thread.sleep(3000);
        driver.findElement(Email).sendKeys(UN);
        driver.findElement(Password).sendKeys(PW);
        driver.findElement(ClickLoginSubmit).click();
        driver.findElement(clickDevConsole).click();
        Thread.sleep(3000);
        driver.findElement(AddNewApp).click();
        Thread.sleep(3000);
        driver.findElement(AddnewApp2).click();
        Thread.sleep(3000);
        driver.findElement(AndroidApp).click();



    }
}
