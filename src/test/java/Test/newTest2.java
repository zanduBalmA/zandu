package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pageObject.Loginpage;
import com.testBase.DriverFactory;
import com.testBase.ExtentFactory;
import com.testBase.MyLogger;
import com.testBase.TestBase;
import com.utility.ActionEngine;
import com.utility.ListenersImplementation;

public class newTest2 extends TestBase {
	 WebDriver driver;
	@Test(retryAnalyzer=ListenersImplementation.class)
	@Parameters({ "testcaseid" })
	public void loginTest3(String testcaseid ) throws Throwable  {
	try{
		System.out.println("Third test case");
	setTestCaseId(testcaseid);
	dat = getDetails(testcaseid);
	MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
	MyLogger.info("Test3");
	Loginpage loginpage=new Loginpage(DriverFactory.getInstance().getDriver());
	loginpage.ragisterNewUserS(getData(dat,"name"),getData(dat,"lastname"),getData(dat,"add"),getData(dat,"cityname"),getData(dat,"statename"),getData(dat,"code"),getData(dat,"number"),getData(dat,"ssncode"),getData(dat,"uname"),getData(dat,"pass"),getData(dat,"cpassword"));
	
	ExtentFactory.getInstance().getExtent().log(Status.PASS, "<b><span style='color:MidnightBlue'></span></b>");
	} catch (Exception e) {
		// log failure in extent
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "<b><span style='color:red' exception:"+e+"></span></b>");
		ActionEngine.logEventInfoToReportForTestSteps(driver, "Fail", testcaseid);
	}
	
            }
	@Test(retryAnalyzer=ListenersImplementation.class)
	@Parameters({ "testcaseid" })
	public void loginTest4(String testcaseid ) throws Throwable
	{
		System.out.println("Fourth test case");
		setTestCaseId(testcaseid);
		dat = getDetails(testcaseid);
		System.out.println(getData(dat,"name"));
		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
		MyLogger.info("Test4");
		Loginpage loginpage=new Loginpage(DriverFactory.getInstance().getDriver());
		loginpage.ragisterNewUserS(getData(dat,"name"),getData(dat,"lastname"),getData(dat,"add"),getData(dat,"cityname"),getData(dat,"statename"),getData(dat,"code"),getData(dat,"number"),getData(dat,"ssncode"),getData(dat,"uname"),getData(dat,"pass"),getData(dat,"cpassword"));
	
	}
	
	
	@Test(retryAnalyzer = ListenersImplementation.class)
	@Parameters({ "testcaseid" })
	public void loginTest5(String testcaseid) throws Throwable {
	    try {
	        System.out.println("five  test case");
	        setTestCaseId(testcaseid);
	        dat = getDetails(testcaseid);
	        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
	        MyLogger.info("Test5");
	        
	        Loginpage loginpage = new Loginpage(DriverFactory.getInstance().getDriver());
	        loginpage.ragisterNewUserS(
	            getData(dat, "name"),
	            getData(dat, "lastname"),
	            getData(dat, "add"),
	            getData(dat, "cityname"),
	            getData(dat, "statename"),
	            getData(dat, "code"),
	            getData(dat, "number"),
	            getData(dat, "ssncode"),
	            getData(dat, "uname"),
	            getData(dat, "pass"),
	            getData(dat, "cpassword")
	        );

	        ExtentFactory.getInstance().getExtent().log(Status.PASS, "<b><span style='color:Green'>Test Case: loginTest5 Passed</span></b>");
	    } catch (Exception e) {
	        ExtentFactory.getInstance().getExtent().log(Status.FAIL, "<b><span style='color:red'>Test Case: loginTest5 Failed. Exception: " + e.getMessage() + "</span></b>");
	        ActionEngine.logEventInfoToReportForTestSteps(driver, "Fail", testcaseid);
	    }
	}

	@Test(retryAnalyzer = ListenersImplementation.class)
	@Parameters({ "testcaseid" })
	public void loginTest6(String testcaseid) throws Throwable {
	    try {
	        System.out.println("six test case");
	        setTestCaseId(testcaseid);
	        dat = getDetails(testcaseid);
	        MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
	        MyLogger.info("Test6");

	        Loginpage loginpage = new Loginpage(DriverFactory.getInstance().getDriver());
	        loginpage.ragisterNewUserS(
	            getData(dat, "name"),
	            getData(dat, "lastname"),
	            getData(dat, "add"),
	            getData(dat, "cityname"),
	            getData(dat, "statename"),
	            getData(dat, "code"),
	            getData(dat, "number"),
	            getData(dat, "ssncode"),
	            getData(dat, "uname"),
	            getData(dat, "pass"),
	            getData(dat, "cpassword")
	        );

	        ExtentFactory.getInstance().getExtent().log(Status.PASS, "<b><span style='color:Green'>Test Case: loginTest2 Passed</span></b>");
	    } catch (Exception e) {
	        ExtentFactory.getInstance().getExtent().log(Status.FAIL, "<b><span style='color:red'>Test Case: loginTest2 Failed. Exception: " + e.getMessage() + "</span></b>");
	        ActionEngine.logEventInfoToReportForTestSteps(driver, "Fail", testcaseid);
	    }
	}

}
