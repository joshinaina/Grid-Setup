package Gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		
		cap.setPlatform(Platform.WINDOWS);
		
		  
		ChromeOptions options =new ChromeOptions();
		
		options.merge(cap);
		
		String hubUrl ="http://localhost:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://littlemonkey.co.nz");
		
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		
		
		
	
		
	}

}
