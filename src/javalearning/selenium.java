package javalearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("selenium");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkat Jakkepalli\\Downloads\\Drivers\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
    WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-handling-drop-downs");   
  
	}

}
