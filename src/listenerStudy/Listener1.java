package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC successfully run...", true);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("Tc fail bcoz of timeout...", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Tc skipped..", true);
	}

}
