package com.page;

import com.base.BaseClass;

public class Execute extends BaseClass {

	public static void main(String[] args) {

		browserLaunch("https://adactinhotelapp.com/index.php");

		AdactinLoginPage a = new AdactinLoginPage();
		inputText(a.getUser(), "abinesh1990");
		inputText(a.getPass(), "Abinesh123");
		btnClick(a.getLoginbtn());

		SearchHotel s = new SearchHotel();
		drpDown(s.getLoc(), "Brisbane");
		drpDown(s.getHotel(), "Hotel Hervey");
		drpDown(s.getRoomType(), "Deluxe");
		drpDown(s.getNoOfRooms(), "2");
		drpDown(s.getAdultRoom(), "2");
		drpDown(s.getChildPerRoom(), "2");
		btnClick(s.getSearch());

		SelectHotel h = new SelectHotel();
		btnClick(h.getCheckBox());
		btnClick(h.getClick());

		BookAHotel b = new BookAHotel();
		inputText(b.getFirstName(), "Naveen");
		inputText(b.getLastName(), "Kumar");
		inputText(b.getBillingAddress(), "No.29 gisdgyadsgy");
		inputText(b.getCardNumber(), "1234123412341234");
		drpDown(b.getCardType(), "VISA");
		drpDown(b.getExpiryMonth(), "5");
		drpDown(b.getExpiryYear(), "2020");
		inputText(b.getCardCvv(), "123");
		btnClick(b.getBookIt());
		
		quitBrowser();

	}

}
