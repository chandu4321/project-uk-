package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestngImplementation extends BaseClassIT implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase Exceution Startred",true);
	}
	
	LocalDateTime dateTime= LocalDateTime.now();
	String date= dateTime.toString().replace(":", "-");
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestCase Exceution Failed",true);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target= new File("errorScreenShot//"+date+"pic.png");
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase Exceution Passed",true);
	}	
}
