package edu.aiite.fb;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentHtmlReporter  reporter;
	public static ExtentReports extent;

	
	
@BeforeClass
public static void browserLunch() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	reporter= new ExtentHtmlReporter("./NewReport.html");
	extent= new ExtentReports();
	extent.attachReporter(reporter);

}


public static   void fbPage(WebElement element, String data) {
	element.sendKeys(data);
	
	
}

}
