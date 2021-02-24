package org.junit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinTaskUsingPOM extends LibGlobal {

	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal l = new LibGlobal();

		driver = l.getDriver();

		l.launchUrl(driver, "http://adactinhotelapp.com/");

		l.maxWindow(driver);

		l.sleep(3000);

		AdactinLoginPage a = new AdactinLoginPage();

		WebElement txtUser = a.getTxtUser();
		l.type(txtUser,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 0, 0));

		WebElement txtPass = a.getTxtPass();
		l.type(txtPass,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 1, 0));

		WebElement btnLogin = a.getBtnLogin();
		l.btnClick(btnLogin);

		AdactionSearchHotelPage a1 = new AdactionSearchHotelPage();

		WebElement dropLocation = a1.getDropLocation();
		l.selectByValue(dropLocation, "New York");

		WebElement dropHotels = a1.getDropHotels();
		l.selectByVisibleText(dropHotels, "Hotel Cornice");

		WebElement dropRoomType = a1.getDropRoomType();
		l.selectByValue(dropRoomType, "Super Deluxe");

		WebElement dropRoomNos = a1.getDropRoomNos();
		l.selectByVisibleText(dropRoomNos, "5 - Five");

		WebElement txtCheckin = a1.getTxtCheckin();
		txtCheckin.clear();
		l.type(txtCheckin,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 2, 0));

		WebElement txtCheckout = a1.getTxtCheckout();
		l.type(txtCheckout,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 3, 0));

		WebElement dropAdults = a1.getDropAdults();
		l.selectByValue(dropAdults, "4");

		WebElement dropChild = a1.getDropChild();
		l.selectByVisibleText(dropChild, "4 - Four");

		WebElement btnSearch = a1.getBtnSearch();
		l.btnClick(btnSearch);

		AdactinSelectHotelPage a2 = new AdactinSelectHotelPage();

		WebElement btnRadio = a2.getBtnRadio();
		l.btnClick(btnRadio);

		WebElement btnContinue = a2.getBtnContinue();
		l.btnClick(btnContinue);

		AdactinBookHotelPage a3 = new AdactinBookHotelPage();

		WebElement txtFirst = a3.getTxtFirst();
		l.type(txtFirst,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 4, 0));

		WebElement txtLast = a3.getTxtLast();
		l.type(txtLast,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 5, 0));

		WebElement txtAddress = a3.getTxtAddress();
		l.type(txtAddress,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 6, 0));

		WebElement txtCCNum = a3.getTxtCCNum();
		l.type(txtCCNum,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 7, 0));

		WebElement dropCCType = a3.getDropCCType();
		l.selectByValue(dropCCType, "AMEX");

		WebElement dropExpMonth = a3.getDropExpMonth();
		l.selectByVisibleText(dropExpMonth, "August");

		WebElement dropExpYear = a3.getDropExpYear();
		l.selectByVisibleText(dropExpYear, "2020");

		WebElement txtCCV = a3.getTxtCCV();
		l.type(txtCCV,
				l.excelRead("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\AdactinExcelRead.xlsx",
						"Sheet1", 8, 0));

		WebElement btnBook = a3.getBtnBook();
		l.btnClick(btnBook);

		l.sleep(6000);

		AdactinGetOrder a4 = new AdactinGetOrder();

		WebElement txtOrderNo = a4.getTxtOrderNo();

		String attribute = l.getAttribute(txtOrderNo);

		System.out.println("Order No. is " + attribute);

	}

}
