package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String filepath="C:\\Users\\Dell\\eclipse-workspace\\DSS_BatchDEC\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Test Reports DSS");
		reporter.config().setReportName("DSS Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("ProjectName", "DSS");
		extent.setSystemInfo("QA", "govin");
		return extent;
		
	}
}
