package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.testBase.ExtentFactory;
import com.utility.ActionEngine;

public class Loginpage extends ActionEngine {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement ragister;
	@FindBy(xpath = "//a[text()='Regist']")
	private WebElement demoFail;
	@FindBy(xpath = "//b[text()='0']")
	private WebElement a;
	@FindBy(xpath = "//input[@id='customer.firstName']")
	private WebElement fname;
	@FindBy(xpath = "//input[@id='customer.lastName']")
	private WebElement lname;
	@FindBy(xpath = "//input[@id='customer.address.street']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='customer.address.city']")
	private WebElement city;
	@FindBy(xpath = "//input[@id='customer.address.state']")
	private WebElement state;
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	private WebElement zipcode;
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='customer.ssn']")
	private WebElement ssn;
	@FindBy(xpath = "//input[@id='customer.username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='customer.password']")
	private WebElement passwordold;
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	private WebElement conformPassword;
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement proced;
	@FindBy(xpath = "//input[@name='username']")

	private WebElement userName1;
	@FindBy(xpath = "//div[@id='rightPanel']")
	private WebElement message__sucess;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password1;
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement login;

	public void selectragister() {
		ragister.click();
	}

	public void enterFirstName() {
		fname.sendKeys("ram");
	}

	public void enterLastName() {
		lname.sendKeys("dhok");
	}

	public void enterAddress() {
		address.sendKeys("abcd");
	}

	public void entercity() {
		city.sendKeys("pune");
	}

	public void enterStsteName() {
		lname.sendKeys("dhok");
	}

	public void enterzipcode() {
		address.sendKeys("abcd");
	}

	public void enterPhoneNumber() {
		phoneNumber.sendKeys("8823455675");
	}

	public void enterssn() {
		ssn.sendKeys("456");
	}

	public void creatUserName() {
		userName.sendKeys("raju");
	}

	public void creatpassword() {
		passwordold.sendKeys("raju123");
	}

	public void enterconformPassword() {
		conformPassword.sendKeys("raju123");
	}

	public void selectProcead() {
		proced.click();
	}

	public void ragisterUser(String fnames, String lnames, String addres, String citys, String states, String zipcodes,
			String phoneNumbers, String ssns, String userNames, String passwords, String conformPasswords) throws Exception {
		click_custom(ragister, "Ragister");
		fname.sendKeys(fnames);
		lname.sendKeys(lnames);
		address.sendKeys(addres);
		city.sendKeys(citys);
		state.sendKeys(states);
		zipcode.sendKeys(zipcodes);
		phoneNumber.sendKeys(phoneNumbers);
		ssn.sendKeys(ssns);
		userName.sendKeys(userNames);
		passwordold.sendKeys(passwords);
		conformPassword.sendKeys(conformPasswords);
		proced.click();
	}
	public void ragisterNewUser(String name, String LastName, String add, String cityName, String stateName,
	        String code, String number, String ssnCode, String uname, String pass, String cPassword) throws Throwable {
	    try {
	        click_custom(ragister, "Ragister");

	        String names = getCharacterString(5);
	        String lName = getCharacterString(5);
	        String uName = getAlphaNumericString(8);
	        String passw = getAlphaNumericString(8);

	        System.out.println(names);
	        System.out.println(lName);
	        System.out.println(uName);
	        System.out.println(passw);

	        sendKeys_custom(fname, "FirstName", names);
	        sendKeys_custom(lname, "LastName", lName);
	        sendKeys_custom(address, "Address", add);
	        sendKeys_custom(city, "City", cityName);
	        sendKeys_custom(state, "State", stateName);
	        Thread.sleep(1000);
	        sendKeys_custom(zipcode, "ZipCode", code);
	        sendKeys_custom(phoneNumber, "Phone Number", number);
	        sendKeys_custom(ssn, "SSN", ssnCode);
	        sendKeys_custom(userName, "UserName", uName);
	        sendKeys_custom(passwordold, "Password", passw);
	        sendKeys_custom(conformPassword, "conformPassword", passw);
	        Thread.sleep(1000);
	        click_custom(proced, "Proced");

	        waitForElementPresence(message__sucess,20);
	        
	        // Verify registration success
	        String expectedMessage = "Welcome " + uName + " Your account was created successfully. You are now logged in.";
	        verifyElementText_custom(message__sucess, expectedMessage, "Success Message");

	        ExtentFactory.getInstance().getExtent().log(Status.PASS, "<b><span style='color:#AAFF00'>User registration successful</span></b>");

	       
	    } catch (Exception e) {
	        ExtentFactory.getInstance().getExtent().log(Status.FAIL, 
	            "<b><span style='color:red'>Exception occurred: " + e.getMessage() + "</span></b>");
	    }
	}

	

	public void ragisterNewUserS(String name, String lastName, String add, String cityName, String stateName,
            String code, String number, String ssnCode, String uname, String pass, String cPassword) throws Throwable {
try {
ExtentFactory.getInstance().getExtent().log(Status.INFO, "<b>Starting User Registration</b>");

click_custom(ragister, "Register");

// Generate random values if needed
String firstName = getCharacterString(5);
String lastNameGen = getCharacterString(5);
String username = getAlphaNumericString(8);
String password = getAlphaNumericString(8);

sendKeys_custom(fname, "First Name", firstName);
sendKeys_custom(lname, "Last Name", lastNameGen);
sendKeys_custom(address, "Address", add);
sendKeys_custom(city, "City", cityName);
sendKeys_custom(state, "State", stateName);
sendKeys_custom(zipcode, "Zip Code", code);
sendKeys_custom(phoneNumber, "Phone Number", number);
sendKeys_custom(ssn, "SSN", ssnCode);
sendKeys_custom(userName, "Username", username);
sendKeys_custom(passwordold, "Password", password);
sendKeys_custom(conformPassword, "Confirm Password", password);

Thread.sleep(1000);

click_custom(proced, "Proceed");
waitForElementPresence(message__sucess, 20);

String expectedMessage = "Welcome " + username + " Your account was created successfully. You are now logged in.";
verifyElementText_custom(message__sucess, expectedMessage, "Success Message");

ExtentFactory.getInstance().getExtent().log(Status.PASS,
"<b><span style='color:#AAFF00'>User registration successful</span></b>");

} catch (Exception e) {
ExtentFactory.getInstance().getExtent().log(Status.FAIL,
"<b><span style='color:#FF5733'>User registration failed: " + e.getMessage() + "</span></b>");
throw e; // Important for retry/reporting
}
}
	


	public void enteruserName() {
//		WebDriverWait wait=new WebDriverWait(20,TimeUnit.SECONDS);
//		wait.until("Exception".visibilityOfElementLocated(true),"userName1");
		userName1.sendKeys("Raju");
	}

	public void enterPassword() {
		password1.sendKeys("Raju123");
	}

	public void enterlogin() {
		login.click();
	}
}
