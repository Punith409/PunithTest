package LoginTestCase;

import AmazonCommon.AmazonCommonPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Date;

public class AmazonLogintestcase {
    WebDriver driver;
    @Test
    public void VerifyLoginTest () throws InterruptedException {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://developer.amazon.com/?");

        AmazonCommonPages LogTest = new AmazonCommonPages(driver);
        LogTest.ActionMethod("ckpunith@gmail.com","Bcc@9902");
        Thread.sleep(3000);

        Date d = new Date(System.currentTimeMillis());
        driver.findElement(By.xpath("//input[@id='app_title']")).sendKeys("PTest" + d);



    }
}
