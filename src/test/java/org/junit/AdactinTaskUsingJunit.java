package org.junit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinTaskUsingJunit {

	public static WebDriver driver;

	LibGlobal l = new LibGlobal();

	@Test
	public void tc0() {
		driver = l.getDriver();
		l.launchUrl(driver, "http://www.adactin.com/HotelApp/");
		l.maxWindow(driver);
	}

	@Test
	public void tc1() throws IOException {
		WebElement txtUser = driver.findElement(By.id("username"));
		l.type(txtUser,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 0, 0));

		WebElement txtPass = driver.findElement(By.id("password"));
		l.type(txtPass,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 1, 0));

		WebElement btnLogin = driver.findElement(By.id("login"));
		l.btnClick(btnLogin);

	}

	@Test
	public void tc2() throws IOException {
		WebElement dropLocation = driver.findElement(By.id("location"));
		l.selectByValue(dropLocation, "New York");

		WebElement dropHotel = driver.findElement(By.id("hotels"));
		l.selectByVisibleText(dropHotel, "Hotel Cornice");

		WebElement dropRoomType = driver.findElement(By.id("room_type"));
		l.selectByValue(dropRoomType, "Super Deluxe");

		WebElement dropRoomNos = driver.findElement(By.id("room_nos"));
		l.selectByVisibleText(dropRoomNos, "5 - Five");

		WebElement txtCheckin = driver.findElement(By.id("datepick_in"));
		l.type(txtCheckin,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 2, 0));

		WebElement txtCheckout = driver.findElement(By.id("datepick_out"));
		l.type(txtCheckout,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 3, 0));

		WebElement dropAdults = driver.findElement(By.id("adult_room"));
		l.selectByValue(dropAdults, "4");

		WebElement dropChild = driver.findElement(By.id("child_room"));
		l.selectByVisibleText(dropChild, "4 - Four");

		WebElement btnSearch = driver.findElement(By.id("Submit"));
		l.btnClick(btnSearch);
	}

	@Test
	public void tc3() {
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		l.btnClick(btnRadio);

		WebElement btnContinue = driver.findElement(By.id("continue"));
		l.btnClick(btnContinue);

	}

	@Test
	public void tc4() throws IOException, InterruptedException {
		WebElement txtFirst = driver.findElement(By.id("first_name"));
		l.type(txtFirst,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 4, 0));

		WebElement txtLast = driver.findElement(By.id("last_name"));
		l.type(txtLast,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 5, 0));

		WebElement txtAddress = driver.findElement(By.id("address"));
		l.type(txtAddress,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 6, 0));

		WebElement txtCCNum = driver.findElement(By.name("cc_num"));
		l.type(txtCCNum,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 7, 0));

		WebElement dropCCType = driver.findElement(By.id("cc_type"));
		l.selectByValue(dropCCType, "AMEX");

		WebElement dropExpMonth = driver.findElement(By.name("cc_exp_month"));
		l.selectByVisibleText(dropExpMonth, "August");

		WebElement dropExpYear = driver.findElement(By.name("cc_exp_year"));
		l.selectByVisibleText(dropExpYear, "2020");

		WebElement txtCCV = driver.findElement(By.name("cc_cvv"));
		l.type(txtCCV,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 8, 0));

		WebElement btnBook = driver.findElement(By.id("book_now"));
		l.btnClick(btnBook);

		l.sleep(6000);
		WebElement txtOrderNo = driver.findElement(By.name("order_no"));

		String attribute = txtOrderNo.getAttribute("value");

		l.excelWrite("Sheet1",
				"C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelWrite.xlsx", 0, 0,
				"Order No. is: " + attribute);

		System.out.println("Order No. is: " + attribute);

	}

	}
