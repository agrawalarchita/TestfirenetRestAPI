package utilities;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class testBaseClass {
	
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./CustomReports//TestfirenetAPI_Report.html");		
		reporter.config().setDocumentTitle("API Automation");
		reporter.config().setReportName("API Automation Test Case");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company Name", "Brillio");
		extent.setSystemInfo("Project Name", "API Automation with Rest-Assured");
		
      }
	
	


}
