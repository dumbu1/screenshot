package module;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {
	
	@Test
	public void TakingScreenShot() {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("http://the-internet.herokuapp.com/");
		
		//taking screenshot
		//add commons-io dependency
		
		TakesScreenshot obj_TakesScreenshot=(TakesScreenshot)wd;
		File sourceFile=obj_TakesScreenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile=new File(System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+"1.png");
		
		
		try {
			FileUtils.copyFile(sourceFile,destinationFile);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
