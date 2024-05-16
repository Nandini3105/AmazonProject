package project1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit {
	ChromeDriver driver;
@BeforeMethod
public void launch()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.co.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@AfterMethod
public void quit() throws IOException, InterruptedException
{
	TakesScreenshot t=driver;
	File source=t.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(source,new File("C:\\Users\\NANDINI\\eclipse-workspace\\project1\\Screenshot\\"+Math.random()+".png"));
	Thread.sleep(5000);
	driver.close();
}
}
