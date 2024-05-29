package com.shoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFrom_Page {
	public AddressFrom_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "Name")
	private WebElement NameTf;
	
	@FindBy(id = "House/Office Info")
	private WebElement HouseInfoTF;
	
	@FindBy(id = "Street Info")
	private WebElement StreetInfoTF;
	
	@FindBy(id = "Landmark")
	private WebElement LandmarkTF;
	
	@FindBy(id = "Country")
	private WebElement CountryDD;
	
	@FindBy(id = "State")
	private WebElement StateDD;
	
	@FindBy(id = "City")
	private WebElement CityDD;
	
	@FindBy(id = "Pincode")
	private WebElement PincodeTF;
	
	@FindBy(id = "Phone Number")
	private WebElement PhoneNumberTF;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;
	
	@FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement DelAddressBtn;
	
	@FindBy(xpath= "(//button[text()='Yes'])[1]")
	private WebElement YesBtn;

	public WebElement getDelAddressBtn() {
		return DelAddressBtn;
	}

	public WebElement getYesBtn() {
		return YesBtn;
	}

	public WebElement getNameTf() {
		return NameTf;
	}

	public WebElement getHouseInfoTF() {
		return HouseInfoTF;
	}

	public WebElement getStreetInfoTF() {
		return StreetInfoTF;
	}

	public WebElement getLandmarkTF() {
		return LandmarkTF;
	}

	public WebElement getCountryDD() {
		return CountryDD;
	}

	public WebElement getStateDD() {
		return StateDD;
	}

	public WebElement getCityDD() {
		return CityDD;
	}

	public WebElement getPincodeTF() {
		return PincodeTF;
	}

	public WebElement getPhoneNumberTF() {
		return PhoneNumberTF;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}


}
