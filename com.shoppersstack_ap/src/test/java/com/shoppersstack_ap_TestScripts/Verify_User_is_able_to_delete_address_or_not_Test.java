package com.shoppersstack_ap_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.shoppersStack.Pom.AddressFrom_Page;
import com.shoppersStack.Pom.MyProfile_Page;
import com.shoppersStack.genericutility.BaseTest;

public class Verify_User_is_able_to_delete_address_or_not_Test extends BaseTest {
	  @Test

      public void addAddress() throws IOException, InterruptedException {

                   homePage.getAccountSettingBtn().click();

                   homePage.getMyProfileBtn().click();

                  

                  

                   MyProfile_Page myprofile=new MyProfile_Page(driver);

                   myprofile.getMyAddressBtn().click();

                  
                   //driver.switchTo().alert().accept();
                   //MyAddress_Page myaddPage=new MyAddress_Page(driver);
                   AddressFrom_Page myaddPage=new AddressFrom_Page(driver);
               

                   myaddPage.getDelAddressBtn().click();
                   
                   Thread.sleep(2000);

                   myaddPage.getYesBtn().click();
                   Thread.sleep(2000);
                   driver.switchTo().alert().accept();


                  

                   

                  

                  

	  }

}
