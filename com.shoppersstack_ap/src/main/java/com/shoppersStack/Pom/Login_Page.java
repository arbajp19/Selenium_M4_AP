package com.shoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

		
		
	}
	
	@FindBy(id="Email")
	private WebElement EmailTF;
	
	@FindBy(id="Password")
	private WebElement PasswordTF;
	
	@FindBy(id="Login")
	private WebElement LoginBtn;

	public WebElement getEmail() {
		return EmailTF;
	}

	public WebElement getPassword() {
		return PasswordTF;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	

}
