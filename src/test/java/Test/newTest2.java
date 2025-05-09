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
import com.utility.ListenersImplementation;

public class newTest2 extends TestBase {

    WebDriver driver;

    @Test(retryAnalyzer = ListenersImplementation.class)
    @Parameters({ "testcaseid" })
    public void loginTest3(String testcaseid) throws Throwable {
        try {
            setTestCaseId(testcaseid);
            dat = getDetails(testcaseid);

            MyLogger.startTestCase("loginTest3");
            MyLogger.info("loginTest3 - Starting user registration");

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

            ExtentFactory.getInstance().getExtent().log(Status.PASS,
                    "<b><span style='color:#28a745;'>PASS: loginTest_3 Passed: User "+ getData(dat, "name")+" registered successfully.</span></b>");
        
        
        } catch (Exception e) {
        	
        	
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,
                "<b><span style='color:red'>loginTest_3 Failed: " + e.getMessage() + "</span></b>");
            throw e;
        }
    }

    @Test(retryAnalyzer = ListenersImplementation.class)
    @Parameters({ "testcaseid" })
    public void loginTest4(String testcaseid) throws Throwable {
        try {
            setTestCaseId(testcaseid);
            dat = getDetails(testcaseid);

            MyLogger.startTestCase("loginTest4");
            MyLogger.info("loginTest4 - Starting user registration");

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

            ExtentFactory.getInstance().getExtent().log(Status.PASS,
                    "<b><span style='color:#28a745;'>PASS: loginTest_4 Passed: User "+ getData(dat, "name")+" registered successfully.</span></b>");
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,
                "<b><span style='color:red'>loginTest_4 Failed: " + e.getMessage() + "</span></b>");
            throw e;
        }
    }

    @Test(retryAnalyzer = ListenersImplementation.class)
    @Parameters({ "testcaseid" })
    public void loginTest5(String testcaseid) throws Throwable {
        try {
            setTestCaseId(testcaseid);
            dat = getDetails(testcaseid);

            MyLogger.startTestCase("loginTest5");
            MyLogger.info("loginTest5 - Starting user registration");

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

            ExtentFactory.getInstance().getExtent().log(Status.PASS,
                    "<b><span style='color:#28a745;'>PASS: loginTest_5 Passed: User "+ getData(dat, "name")+" registered successfully.</span></b>");
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,
                "<b><span style='color:red'>loginTest_5 Failed: " + e.getMessage() + "</span></b>");
            throw e;
        }
    }

    @Test(retryAnalyzer = ListenersImplementation.class)
    @Parameters({ "testcaseid" })
    public void loginTest6(String testcaseid) throws Throwable {
        try {
            setTestCaseId(testcaseid);
            dat = getDetails(testcaseid);

            MyLogger.startTestCase("loginTest6");
            MyLogger.info("loginTest6 - Starting user registration");

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

            ExtentFactory.getInstance().getExtent().log(Status.PASS,
                    "<b><span style='color:#28a745;'>PASS: loginTest_6 Passed: User "+ getData(dat, "name")+" registered successfully.</span></b>");
        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,
                "<b><span style='color:red'>loginTest_6 Failed: " + e.getMessage() + "</span></b>");
            throw e;
        }
    }
}
