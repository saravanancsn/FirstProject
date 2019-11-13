package org.pom2;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LaunchBrowser extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser("https://adactin.com/HotelAppBuild2/");
		AdactinLocator a = new AdactinLocator();
		type(a.getName(), "saravanan4896");
		type(a.getPass(), "Csn@4896");
		click(a.getLogin());
		selectByText(a.getLocation(), "London");
		selectByText(a.getHotel(), "Hotel Creek");
		selectByText(a.getRoomtype(), "Double");
		type(a.getCheckin(), "08/11/2019");
		type(a.getCheckout(), "09/11/2019");
		selectByText(a.getAdult(), "2 - Two");
		screenShot("F:\\SS\\Adactin\\1.jpeg");
		click(a.getSearch());
		click(a.getRadio());
		screenShot("F:\\SS\\Adactin\\2.jpeg");
		click(a.getBtncontinue());
		type(a.getFirstname(), "Jack");
		type(a.getLastname(), "Sparrow");
		type(a.getBilladd(), "234-Fourth cross street,Beacon Hills");
		type(a.getCardno(), "4844343291867543");
		selectByText(a.getCardtype(), "VISA");
		selectByText(a.getMonth(), "May");
		selectByText(a.getYear(), "2021");
		type(a.getCvv(), "4398");
		screenShot("F:\\SS\\Adactin\\3.jpeg");
		click(a.getBook());
		Thread.sleep(10000);
		screenShot("F:\\SS\\Adactin\\4.jpeg");
		click(a.getMyitibtn());
		click(a.getOrderid());
		screenShot("F:\\SS\\Adactin\\5.jpeg");
		click(a.getCancelsel());
		alert();
		Thread.sleep(10000);
		screenShot("F:\\SS\\Adactin\\6.jpeg");
		click(a.getLogout());
		Thread.sleep(10000);
		screenShot("F:\\SS\\Adactin\\7.jpeg");
		closeBrowser();
	}

}
