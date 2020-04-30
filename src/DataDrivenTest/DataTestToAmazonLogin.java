package DataDrivenTest;

import ExcelLibrary.ExcelDataConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTestToAmazonLogin {
    WebDriver driver;

    @Test(dataProvider = "amazon")
    public void TestLoginMdata (String UN, String PW) throws InterruptedException {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://developer.amazon.com/?");
        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/div[1]/a\n")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//input[@id='ap_email']")).sendKeys(UN);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(PW);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        Thread.sleep(3000);

        Assert.assertTrue(driver.getTitle().contains("console"));
        System.out.println("verified the login");
    }
    @AfterMethod
    public void teardown (){
        driver.quit();
    }

    @DataProvider(name = "amazon")
    public Object[][] datadriven (){
        ExcelDataConfig configg = new ExcelDataConfig("C:\\Users\\harsh\\IdeaProjects\\SeleniumPractice\\TestData\\dataExcel.xlsx");
        int rowss = configg.getRowCount(0);
        Object[][] data2 = new Object[3][2];

       for(int i=0; i<rowss; i++){
           data2[0][0]=configg.getdata(0,0,0);
           data2[0][1]=configg.getdata(0,0,1);
           data2[1][0]=configg.getdata(0,1,0);
           data2[1][1]=configg.getdata(0,1,1);
       }
       return data2;

    }
}
