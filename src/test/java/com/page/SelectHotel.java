package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement checkBox;

	@FindBy(id = "continue")
	private WebElement click;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getClick() {
		return click;
	}

}
