package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends Helping {

	public Page1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement user;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement loginbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
