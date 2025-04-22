package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageObject.Loginpage;
import com.testBase.DriverFactory;
import com.testBase.MyLogger;
import com.testBase.TestBase;
import com.utility.ListenersImplementation;
import com.aventstack.extentreports.Status;
import com.testBase.ExtentFactory;

public class newTest extends TestBase {

    @Test(retryAnalyzer = ListenersImplementation.class)
    public void loginTest1() throws Throwable {
        MyLogger.startTestCase("loginTest1");
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "<b><span style='color:#00BFFF;'>Executing loginTest1 for user: Raju</span></b>");

        Loginpage loginpage = new Loginpage(DriverFactory.getInstance().getDriver());

        try {
            loginpage.ragisterNewUser(
                "ram", "dhok", "abcd", "pune", "Maharashra", "456",
                "8823455675", "456", "Raju", "Raju123", "Raju123"
            );

            MyLogger.info("loginTest1 - User registration completed for: Raju");
            ExtentFactory.getInstance().getExtent().log(Status.PASS,
                "<b><span style='color:#28a745;'>PASS: loginTest1 - User 'Raju' registered successfully.</span></b>");

        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,
                "<b><span style='color:#dc3545;'>FAIL: loginTest1 - Exception: " + e.getMessage() + "</span></b>");
            throw e;
        }
    }

    @Test(retryAnalyzer = ListenersImplementation.class)
    public void loginTest2() throws Throwable {
        MyLogger.startTestCase("loginTest2");
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "<b><span style='color:#00BFFF;'>Executing loginTest2 for user: Prash</span></b>");

        Loginpage loginpage = new Loginpage(DriverFactory.getInstance().getDriver());

        try {
            loginpage.ragisterNewUser(
                "Prashant", "Dar", "rtf", "Nagpur", "Maharashra", "256",
                "8523455675", "985", "Prash", "Prasha123@", "Prasha123@"
            );

            MyLogger.info("loginTest2 - User registration completed for: Prashant");
            ExtentFactory.getInstance().getExtent().log(Status.PASS,
                "<b><span style='color:#28a745;'>PASS: loginTest2 - User 'Prashant' registered successfully.</span></b>");

        } catch (Exception e) {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,
                "<b><span style='color:#dc3545;'>FAIL: loginTest2 - Exception: " + e.getMessage() + "</span></b>");
            throw e;
        }
    }
}
