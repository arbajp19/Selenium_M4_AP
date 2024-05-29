package com.shoppersstack_ap_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.shoppersStack.Pom.AddressFrom_Page;
import com.shoppersStack.Pom.MyAddress_Page;
import com.shoppersStack.Pom.MyProfile_Page;
import com.shoppersStack.genericutility.BaseTest;

public class Verify_User_Is_Able_To_Addaddress_or_not_Test extends BaseTest {
		   @Test
           public void addAddress() throws IOException {

                        homePage.getAccountSettingBtn().click();
                        homePage.getMyProfileBtn().click();

                        MyProfile_Page myprofile=new MyProfile_Page(driver);
                        myprofile.getMyAddressBtn().click();
                        
                        MyAddress_Page myaddPage=new MyAddress_Page(driver);
                        myaddPage.getAddAddressBtn().click();

                       

                       

                        AddressFrom_Page addressformPage=new AddressFrom_Page(driver);

                        //addressformPage.getOfficebtn().click();

                        addressformPage.getNameTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 0, 1));

                        addressformPage.getHouseInfoTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 1));

                         addressformPage.getStreetInfoTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 2));

                         addressformPage.getLandmarkTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1,3));

                       

                         webdriverutil.selectByValue(addressformPage.getCountryDD(),utility.readDataFromPropertyFile("country"));

                         webdriverutil.selectByValue(addressformPage.getStateDD(), utility.readDataFromPropertyFile("state"));

                         webdriverutil.selectByValue(addressformPage.getCityDD(), utility.readDataFromPropertyFile("city"));

                       

                       

                         addressformPage.getPincodeTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 4));

                         addressformPage.getPhoneNumberTF().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 5));

                       

                        addressformPage.getAddAddressBtn().click();
	}

}
