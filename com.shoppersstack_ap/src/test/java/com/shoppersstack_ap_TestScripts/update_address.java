package com.shoppersstack_ap_TestScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.shoppersStack.Pom.AddressFrom_Page;
import com.shoppersStack.Pom.MyProfile_Page;
import com.shoppersStack.Pom.Update_Address_Page;
import com.shoppersStack.genericutility.BaseTest;

public class update_address extends BaseTest {
	@Test
	public void  updateAdd() throws IOException, InterruptedException{
	 
	homePage.getAccountSettingBtn().click();
	homePage.getMyProfileBtn().click();
	MyProfile_Page myProfile=new MyProfile_Page(driver);
	myProfile.getMyAddressBtn().click();
	
	Update_Address_Page updateaddress=new Update_Address_Page(driver);
	updateaddress.getUpdateiconBtn().click();
	Thread.sleep(2000);
	
	AddressFrom_Page myaddress=new AddressFrom_Page(driver);
	myaddress.getNameTf().sendKeys(Keys.CLEAR);
	Thread.sleep(2000);
	myaddress.getNameTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 0));
	Thread.sleep(2000);
	updateaddress.getUpdateaddressBtn().click();
	
	}
}





