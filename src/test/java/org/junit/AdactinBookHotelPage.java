package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookHotelPage extends LibGlobal{
	public AdactinBookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirst;
	
	@FindBy(id="last_name")
	private WebElement txtLast;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNum;
	
	@FindBy(id="cc_type")
	private WebElement dropCCType;
	
	@FindBy(name="cc_exp_month")
	private WebElement dropExpMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement dropExpYear;
	
	@FindBy(name="cc_cvv")
	private WebElement txtCCV;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirst() {
		return txtFirst;
	}

	public WebElement getTxtLast() {
		return txtLast;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getDropCCType() {
		return dropCCType;
	}

	public WebElement getDropExpMonth() {
		return dropExpMonth;
	}

	public WebElement getDropExpYear() {
		return dropExpYear;
	}

	public WebElement getTxtCCV() {
		return txtCCV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
	
	

}
