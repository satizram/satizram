package org.JavaMain;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Summa2  extends BaseClassh{
	public ExtentHtmlReporter extentreport;
	public ExtentReports reports;
	public ExtentTest testing;
	@BeforeClass
	private void Exte() {
extentreport= new ExtentHtmlReporter("extent.html");
extentreport.config().setTheme(Theme.STANDARD);
extentreport.config().setDocumentTitle("sathish sample report");


reports= new ExtentReports();
reports.attachReporter(extentreport);

	}

	@Test(groups = {"sanity","strin"})
	private void syr() {
System.out.println("wonder");
	}
	
	@Test(groups = {"regression"})
	private void syr1() throws IOException {
		
		Assert.assertEquals(true, true);
		testing= reports.createTest("failed test");
		
		testing.log(Status.FAIL, "test execution failed");
		
System.out.println("chocolate");
	}
	
	@Test(groups = {"regression","strin"})
	private void syr2() throws IOException {
		openBrowser();
		driver.get("https://www.google.com/");
		
		testing= reports.createTest("Regression Test");
		testing.log(Status.PASS, "test execution sucessfull");
System.out.println("just");
testing.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("fail.png").build());
testing.addScreencastFromPath("fail.png");
testing.pass("tested sucessfully");
	}
	@AfterClass
	private void repo() {
reports.flush();
	}
	
}
