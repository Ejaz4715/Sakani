package sa.nhc.sakani.web.login;

import sa.nhc.sakani.web.base.NHSSakaniWebTest;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginFeature extends NHSSakaniWebTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_7-Login to Sakani using invalid credentials",
            description = "Verify The Validation Message of User Login")
    public void verifyLoginUserWithInvalidData(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Open Sakani Website and Switch to Arabic");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Enter NationalID/Iqama Number, Password and click on login Button");
        app.loginPage.enterIDNumber(data);
        app.loginPage.enterPassword(data);
        app.loginPage.clickOnLoginButton();
        logger.info("Step 03: Verify The Validation Message");
        app.loginPage.verifyTheValidationMessage();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_8-Login to Sakani using invalid data",
            description = "Verify User Login Enter Wrong ID or Password Message")
    public void verifyLoginUserWithWrongIDOrPassword(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Open Sakani Website and Switch to Arabic");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Enter NationalID/Iqama Number, Password and click on login Button");
        app.loginPage.enterIDNumber(data);
        app.loginPage.enterPassword(data);
        app.loginPage.clickOnLoginButton();
        logger.info("Step 03: Verify The Validation Message");
        app.loginPage.verifyTheValidationMessageOfWrongIDOrPassword();
    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_9-Login to Sakani using invalid OTP",
            description = " Verify The Validation Message of OTP Number is Wrong")
    public void verifyOTPNumberWithInvalidDataInLogin(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Open Sakani Website and Switch to Arabic");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Enter NationalID/Iqama Number, Password and click on login Button");
        app.loginPage.enterIDNumber(data);
        app.loginPage.enterPassword(data);
        app.loginPage.clickOnLoginButton();
        logger.info("Step 03: Verify The Validation Message");
        app.commonUtilityPage.verifyTheValidationMessageOTP();

    }

    /*@Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_10-Login to Sakani using valid credentials",
            description = "Verify User Login Successfully")
    public void verifyUserLoginSuccessfully(Map<String, String> data) throws Exception {
        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Click on Login button in Home page");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 03: Enter NationalID/Iqama Number");
        app.loginPage.enterIDNumber(data);
        logger.info("Step 04: Enter Password");
        app.loginPage.enterPassword(data);
        logger.info("Step 05: Click on Login Button After fill data");
        app.loginPage.clickOnLoginButton();
        logger.info("Step 06: Enter OTP number (1234)");
        app.commonUtilityPage.enterOTPNumber();
        logger.info("Step 07: Click on Verify button");
        app.commonUtilityPage.clickOnVerifyButton();
//        app.loginPage.clickOnUpdateButton();
        logger.info("Step 08: Check to navigate next page after login");
//        app.homePage.clickOnXButton();
//        app.loginPage.closeWindow();
        app.homePage.checkPopUpWindows();
        app.basicMethodsPage.HoverOnUserProfileButton();
        app.homePage.checkSuccessfulLogin();

    }
*/

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_10-Login to Sakani using valid credentials",
            description = "Verify User Login Successfully")
    public void verifyUserLoginSuccessfully(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Open Sakani Website and Switch to Arabic");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Enter NationalID/Iqama Number, Password and click on login Button");
        app.loginPage.enterIDNumber(data);
        app.loginPage.enterPassword(data);
        app.loginPage.clickOnLoginButton();
        logger.info("Step 03: Enter OTP number (1234)");
        app.commonUtilityPage.enterOTPNumber();
        logger.info("Step 04: Click on Verify button");
        app.commonUtilityPage.clickOnVerifyButton();
//        app.loginPage.clickOnUpdateButton();
        logger.info("Step 05: Check to navigate next page after login");
//        app.homePage.clickOnXButton();
//        app.loginPage.closeWindow();
        app.homePage.checkPopUpWindows();
        app.basicMethodsPage.HoverOnUserProfileButton();
        app.homePage.checkSuccessfulLogin();

    }
}