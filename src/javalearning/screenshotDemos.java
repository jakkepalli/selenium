package javalearning;


//import org.apache.commons.io.FileUtils;
//org.apache.commons.io.jar;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class screenshotDemos {
    public static void main(String[] args) throws IOException {
        //set the location of chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        
        // Locate the web element
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        
        // capture screenshot with getScreenshotAs() of the WebElement class
        File f = logo.getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(f, new File("D:\\AWS Devops Learning\\homePageScreenshot.png"));
        
        driver.close();
        System.out.println("comment for screenshot");
    }
}