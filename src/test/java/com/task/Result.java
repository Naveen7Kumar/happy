package com.task;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Result extends Helping {

	@Test

	public void homePage1() {
		browserLaunch("https://adactinhotelapp.com/index.php");
	}

	@Test
	public void runPage1() throws IOException {
		Page1 p1 = new Page1();
		inputText(p1.getUser(), stringData(1, 0));
		inputText(p1.getPass(), stringData(1, 1));
		p1.getLoginbtn().click();

	}

	@Test
	public void runPage3() throws IOException {
		Page3 p3 = new Page3();
		dropDown(p3.getLoc(), stringData(1, 2));
		// Assert.assertEquals(p3.getLoc().getAttribute("value"), stringData(1, 2));
		dropDown(p3.getHotel(), stringData(1, 3));
		dropDown(p3.getRoomType(), stringData(1, 4));
		dropDown(p3.getNoOfRooms(), stringData(1, 5));
		dropDown(p3.getAdultRoom(), stringData(1, 6));
		dropDown(p3.getChildPerRoom(), stringData(1, 7));
		p3.getSearch().click();
	}

	@Test
	public void runPage4() throws InterruptedException {
		Page4 p4 = new Page4();
		p4.getCheckBox().click();
		p4.getClick().click();
		Thread.sleep(4000);
	}

	@Test
	public void runPage2() throws IOException {
		Page2 p2 = new Page2();

		inputText(p2.getFirstName(), stringData(1, 8));
		inputText(p2.getLastName(), stringData(1, 9));
		inputText(p2.getBillingAddress(), stringData(1, 10));
		inputText(p2.getCardNumber(), stringData(1, 11));
		dropDown(p2.getCardType(), stringData(1, 12));
		dropDown(p2.getExpiryMonth(), stringData(1, 13));
		dropDown(p2.getExpiryYear(), stringData(1, 14));
		dropDown(p2.getCardCvv(), stringData(1, 15));

		p2.getBookIt().click();

	}

}