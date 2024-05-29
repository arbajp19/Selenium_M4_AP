package com.shoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
	public MyAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement AddAddressBtn;
	public WebElement getAddAddressBtn() {
		return AddAddressBtn;
	}

}
