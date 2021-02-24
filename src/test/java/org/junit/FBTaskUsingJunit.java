package org.junit;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBTaskUsingJunit {
	static WebDriver driver;

	LibGlobal l = new LibGlobal();

	@BeforeClass
	public static void open() {
		System.out.println("Facebook Open");
	}

	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void launchBrowser() {
		driver = l.getDriver();
		driver.get("https://www.facebook.com/");
		l.maxWindow(driver);
	}

	@Test
	public void passValues() throws IOException {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\FBExcel.xlsx",
				"Sheet1", 0, 0));
//		l.type(txtEmail, l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\FBExcel.xlsx",
//				"Sheet1", 0, 0));

		
		l.excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\FBExcelWrite.xlsx",
				0, 0,  l.getAttribute(txtEmail));
		WebElement txtPass = driver.findElement(By.id("pass"));
		l.type(txtPass, l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\FBExcel.xlsx",
				"Sheet1", 1, 0));
		
		


		l.excelUpdate("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\FBExcelWrite.xlsx",
				1, 0, l.getAttribute(txtPass));
	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

}
