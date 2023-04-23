package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Helping {

	public Page3() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement loc;
	@FindBy(id = "hotels")
	private WebElement Hotel;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id ="room_nos")
	private WebElement noOfRooms;
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

}
