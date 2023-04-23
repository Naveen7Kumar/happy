package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookAHotel extends BaseClass {
	public BookAHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement billingAddress;
	@FindBy(id = "cc_num")
	private WebElement cardNumber;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement cardCvv;
	@FindBy(id = "book_now")
	private WebElement bookIt;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCardCvv() {
		return cardCvv;
	}

	public WebElement getBookIt() {
		return bookIt;
	}

}
