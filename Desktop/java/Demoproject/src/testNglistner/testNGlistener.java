package testNglistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGlistener implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		
	}

	@Override
	public void onStart(ITestContext  result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult  result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult  result) {
		
	System.out.println("test case failed and details are"+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult  result) {
		
		System.out.println("test case skipped and details are"+result.getName());	
	}

	@Override
	public void onTestStart(ITestResult  result) {
		System.out.println("test case started and details are"+result.getName());	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test case Success*- and details are"+result.getName());
	}

}
