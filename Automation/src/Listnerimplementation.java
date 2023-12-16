import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class ListenerImplementation extends BaseClass implements ITestListener{
	@Override
	public void onTestStart(ITestresult result) {
	}@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getNameS();
		Reporter.Log(res+" has got passed",true);
	}@Override
	public void onTestFailure(ITestResult result) {
	   String res = result.getNameS();
	   TakeScreenshot ts=(TakeScreenshot)driver;
	   File src = ts.ScreenshotAs(OutputType.FILE);
	   File dest=new File("./screenshots/"+res+".png");
	   try {
		   FileUtils.copyFile(src, dest);
	   } catch (IOException e) {}
	}
}