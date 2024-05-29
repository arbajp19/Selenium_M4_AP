package com.shoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_Address_Page {
	public Update_Address_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[1]")
	private WebElement updateiconBtn;
	
	@FindBy(id = "Update Address")
	private WebElement UpdateaddressBtn;

	public WebElement getUpdateiconBtn() {
		return updateiconBtn;
	}

	public WebElement getUpdateaddressBtn() {
		return UpdateaddressBtn;
	}

}
