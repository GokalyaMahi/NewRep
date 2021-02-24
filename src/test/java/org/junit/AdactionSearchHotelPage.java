package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactionSearchHotelPage extends LibGlobal{
	
	public AdactionSearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dropLocation;
	
	@FindBy(id="hotels")
	private WebElement dropHotels;
	
	@FindBy(id="room_type")
	private WebElement dropRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dropRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckin;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckout;
	
	@FindBy(id="adult_room")
	private WebElement dropAdults;
	
	@FindBy(id="child_room")
	private WebElement dropChild;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getDropHotels() {
		return dropHotels;
	}

	public WebElement getDropRoomType() {
		return dropRoomType;
	}

	public WebElement getDropRoomNos() {
		return dropRoomNos;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getDropAdults() {
		return dropAdults;
	}

	public WebElement getDropChild() {
		return dropChild;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
	
}
