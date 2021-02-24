package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinGetOrder extends LibGlobal{
	
	public AdactinGetOrder() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="order_no")
	private WebElement txtOrderNo;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	

}
