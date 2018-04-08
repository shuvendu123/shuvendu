package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case staretd  and detaild are"+"  "+result.getName());

	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case TestSuccess and detaild are"+"  "+result.getName());

	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case failled and detaild are"+"  "+result.getName());
        
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case skipped and detaild are"+"  "+result.getName());

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		

	}
	@Override
	public void onStart(ITestContext context) 
	{
		

	}
	@Override
	public void onFinish(ITestContext context) 
	{
		

	}
}
