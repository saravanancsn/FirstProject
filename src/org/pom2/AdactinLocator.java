package org.pom2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLocator extends BaseClass {
	public AdactinLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='login_input'][1]")
	private WebElement name;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement numberofrooms;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement search;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement btncontinue;
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billadd;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardno;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myitibtn;
	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement orderid;
	@FindBy(name = "cancelall")
	private WebElement cancelsel;
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;
	@FindBy(xpath = "//input[@value='Book Now']")
	private WebElement book;
	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement odin;

	public WebElement getOdin() {
		return odin;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilladd() {
		return billadd;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getMyitibtn() {
		return myitibtn;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getCancelsel() {
		return cancelsel;
	}

	public WebElement getLogout() {
		return logout;
	}

}
