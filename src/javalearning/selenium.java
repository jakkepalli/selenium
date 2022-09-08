package javalearning;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.*;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("selenium");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkat Jakkepalli\\Downloads\\Drivers\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
    WebDriver driver=new ChromeDriver();  
  
    
        // Launch Website  
driver.navigate().to("https://www.apsrtconline.in/oprs-web/avail/services.do");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.findElement(By.xpath("li a[href='selenium-python'] img")).click();
//String print=driver.findElement(By.className(".entry-title")).getText();
//System.out.println(print2);
System.out.println(driver.getTitle());
String currentURL = driver.getCurrentUrl();
//String currentPageSource = driver.getPageSource();
System.out.println(currentURL);
//System.out.print(currentPageSource);
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().forward();
for(int i=0;i<10;i++) {
driver.navigate().refresh();
}
//driver.quit();

driver.navigate().to("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
//driver.pause(30000);
driver.findElement(By.xpath(".search #fromPlaceName")).sendKeys("Hyderabad");
driver.findElement(By.id("searchBtn")).click();
Alert alert = driver.switchTo().alert();

System.out.println(alert.getText());
alert.accept();


driver.navigate().to("https://demoqa.com/alerts");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
driver.findElement(By.id("confirmButton")).click();
alert.dismiss();
//driver.quit();
driver.navigate().to("https://demoqa.com/nestedframes");
//driver.switchTo().frame("#frame1");
//driver.quit();
driver.quit();
System.out.println("printing for Git2 checking purpose");

}

}
