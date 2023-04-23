package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends Helping {

		public Page4() {
			PageFactory.initElements(driver, this);

		}

		@FindBy(xpath ="//*[@id = 'radiobutton_0']")           
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


