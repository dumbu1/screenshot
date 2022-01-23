package module;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {

	@Test
	public void takingScreenShot() {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("http://the-internet.herokuapp.com/");
		
		CommonMethods obj_CommonMethods=new CommonMethods();
		
		//obj_CommonMethods.getScreenshot(wd, "takingScreenShot");
		
		
		
	}

}
