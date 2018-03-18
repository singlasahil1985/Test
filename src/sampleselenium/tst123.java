package sampleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class tst123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        
        capabilities.setCapability("chrome.binary", "");
        capabilities.setCapability("ACCEPT_SSL_CERTS", "TRUE");
        capabilities.setCapability("profile.default_content_settings.popups", 0);
        capabilities.setCapability("download.default_directory","d:\\scripts\\");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
       WebDriver driver = new ChromeDriver(capabilities);
       
    // Open APP to download application
    		driver.get("http://toolsqa.com/automation-practice-form/");
     
    		// Click to download 
    		driver.findElement(By.linkText("Test File to Download")).click();
     
    		//Halting the execution for 5 secs to donwload the file completely
    		Thread.sleep(5000);
    		
    		driver.quit();
       
	}

}
