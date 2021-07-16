package tests;

import org.testng.annotations.*;

import com.aventstack.extentreports.Status;

import pageObject.accontDetails;
import pageObject.logOut;
import pageObject.login;
import pageObject.transferFunds;
import pageObject.verifyLogin;
import utilities.testBaseClass;


public class TestfirenetDemo extends testBaseClass {
	
	
	login login = new login();
	verifyLogin verifyLogin = new verifyLogin();
	logOut logout = new logOut();
	accontDetails accontDetail = new accontDetails();
	transferFunds transferFund = new transferFunds();
	
	@Test(priority = 1)
	public void post_login() {	
		test = extent.createTest("Perform Login");			
		login.postLogin();			
		test.log(Status.PASS, "Perform Login Successfully");
	}

	@Test(priority = 2)
	public void get_verifyLogin() {
		test = extent.createTest("Verify Login");		
		verifyLogin.getLogin();
		test.log(Status.PASS, "Verify Login Successfully");		
	}

	@Test(priority = 3)
	public void get_Logout() {
		test = extent.createTest("Perform Logout");		
		logout.getLogout();
		test.log(Status.PASS, "Logout Successfully");
		extent.flush();
	}

	@Test(priority = 4)
	public void get_AccountDetails() {
		test = extent.createTest("Verify account details");		
		accontDetail.getAccountDetails();
		test.log(Status.PASS, "Verify account details");		
	}

	@Test(priority = 5)
	public void post_Transferfunds() {
		test = extent.createTest("Verify funds transfer");		
		transferFund.postTransferfunds();
		test.log(Status.PASS, "Funds transferred Successfully");		
	}
	
	@Test(priority = 6)
	public void verifyStatusCode() {
		test = extent.createTest("Verify the various response codes for each request");	
		
		login.postinvalidLogin();
		test.log(Status.PASS, "Invalid User Credential");
		
		verifyLogin.getInvalidLogin();
		test.log(Status.PASS, "Unauthorized User");
		
		transferFund.postinvalidTransferfunds();
		test.log(Status.PASS, "Internal Server Error in Transfer Funds");	
		extent.flush();
	}	
	
	

}
