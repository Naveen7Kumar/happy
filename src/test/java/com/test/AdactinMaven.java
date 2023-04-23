package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinMaven {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("abinesh1990");

		String un = userName.getAttribute("value");
		System.out.println("Username data is : " + un);

		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("Abinesh123");

		String pw = passWord.getAttribute("value");
		System.out.println("Password data is : " + pw);

		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();

		Thread.sleep(5000);

		WebElement header1 = driver.findElement(By.className("login_title"));
		String hd = header1.getText();
		System.out.println(hd);

		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);

		s.selectByValue("New York");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(hotel);
		h.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		Select r = new Select(room);
		r.selectByVisibleText("Deluxe");

		WebElement number = driver.findElement(By.id("room_nos"));
		Select n = new Select(number);
		n.selectByIndex(5);

		WebElement adltroom = driver.findElement(By.id("adult_room"));
		Select a = new Select(adltroom);
		a.selectByVisibleText("4 - Four");

		WebElement chldroom = driver.findElement(By.id("child_room"));
		Select c = new Select(chldroom);
		c.selectByVisibleText("3 - Three");

		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

		WebElement header2 = driver.findElement(By.xpath("(//td[@class='login_title'])[2]"));
		String hd1 = header2.getText();
		System.out.println(hd1);

		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Hello Java");

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("World");

		driver.findElement(By.id("address")).sendKeys("123..........");

		driver.findElement(By.id("cc_num")).sendKeys("4545445544944411");

		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select type = new Select(ccType);
		type.selectByIndex(2);

		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select exp = new Select(expMonth);
		exp.selectByIndex(9);

		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select exp1 = new Select(expYear);
		exp1.selectByValue("2015");

		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		driver.findElement(By.id("book_now")).click();

		WebElement print = driver.findElement(By.id("process_span"));
		String p = print.getText();
		System.out.println(p);

		WebElement limit = driver.findElement(By.id("cc_num_tip"));
		String l = limit.getText();
		System.out.println("The CC limit:" + l);

		Thread.sleep(5000);

		WebElement header3 = driver.findElement(By.xpath("(//td[@class='login_title'])[1]"));
		String hd3 = header3.getText();
		System.out.println(hd3);

		Thread.sleep(8000);

		WebElement orderid = driver.findElement(By.id("order_no"));
		String order = orderid.getAttribute("value");
		System.out.println(order);

		driver.quit();

	}

}
