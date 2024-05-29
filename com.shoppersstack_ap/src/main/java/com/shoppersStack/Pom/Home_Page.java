package com.shoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Home_Page {
		public Home_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);

			
			
		}
		@FindBy(xpath = "//div[contains(@class,'MuiAvatar-root')]")
		private WebElement AccountSettingBtn;
		
		@FindBy(xpath = "//li[contains(text(),'My Profile')]")
		private WebElement MyProfileBtn;
		
		@FindBy(xpath = "//li[text()='Logout']")
		private WebElement LogOutBtn;

		public WebElement getAccountSettingBtn() {
			return AccountSettingBtn;
		}

		public WebElement getMyProfileBtn() {
			return MyProfileBtn;
		}

		public WebElement getLogOutBtn() {
			return LogOutBtn;
		}
		

}
