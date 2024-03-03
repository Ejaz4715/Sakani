package sa.nhc.sakani.web.login;

import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;


import java.util.Map;


public class RegistrationFeature extends NHSSakaniWebTest {


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_1-Register to Sakani using invalid credentials",
            description = " Verify The Validation Message of User Registration in First Step ")
    public void verifyUserRegisterFirstStepWithInvalidData(Map<String, String> data) throws Exception {
        logger.info("Step 1: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 2: Click on Login button");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 3: Click on No account? Create a new account link");
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 4: Verify The Validation Message");
        app.registrationPage.verifyTheValidationMessageOfFirstStep();

    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_2-Register to Sakani using invalid OTP",
            description = " Verify The Validation Message of OTP Number is Wrong ")
    public void verifyOTPNumberWithInvalidData(Map<String, String> data) throws Exception {
        logger.info("Step 1: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 2: Click on Login button");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 3: Click on No account? Create a new account link");
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 4: Enter NationalID");
        app.registrationPage.enterIDNumber(data);
        logger.info("Step 5: Enter Birth Date");
        app.registrationPage.enterBirthOfDate(data);
        logger.info("Step 6: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 7: Verify The Validation Message");
        app.commonUtilityPage.verifyTheValidationMessageOTP();
    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_3-Register to Sakani using valid credentials",
            description = " Verify User Registration in First Step")
    public void verifyUserRegisterFirstStep(Map<String, String> data) throws Exception {
        logger.info("Step 1: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 2: Click on Login button");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 3: Click on No account? Create a new account link");
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 4: Enter NationalID");
        app.registrationPage.enterIDNumber(data);
        logger.info("Step 5: Enter Birth Date");
        app.registrationPage.enterBirthOfDate(data);
        logger.info("Step 6: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 7: Enter OTP number (1234)");
        app.commonUtilityPage.enterOTPNumber();
        logger.info("Step 8: Click on verify button");
        app.commonUtilityPage.clickOnVerifyButton();
        logger.info("Step 9: Verify User Complete First Step");
        app.registrationPage.checkSuccessfulRegisterInFirstStep();

    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_4-Register to Sakani using invalid credentials",
            description = " Verify The Validation Message of User Registration in Second Step")
    public void verifyUserRegisterSecondStepWithInvalidData(Map<String, String> data) throws Exception {
        logger.info("Step 1: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 2: Click on Login button");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 3: Click on No account? Create a new account link");
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 4: Enter NationalID");
        app.registrationPage.enterIDNumber(data);
        logger.info("Step 5: Enter Birth Date");
        app.registrationPage.enterBirthOfDate(data);
        logger.info("Step 6: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 7: Enter OTP number (1234)");
        app.commonUtilityPage.enterOTPNumber();
        logger.info("Step 8: Click on verify button");
        app.commonUtilityPage.clickOnVerifyButton();
        logger.info("Step 9: Verify The Validation Message");
        app.registrationPage.verifyTheValidationMessageOfSecondStep();

    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_5-Register to Sakani using valid credentials",
            description = "Verify User Successfully Registered ")
    public void verifyUserSuccessfullyRegistered(Map<String, String> data) throws Exception {
        logger.info("Step 1: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 2: Click on Login button");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 3: Click on No account? Create a new account link");
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 4: Enter NationalID");
        app.registrationPage.enterIDNumber(data);
        logger.info("Step 5: Enter Birth Date");
        app.registrationPage.enterBirthOfDate(data);
        logger.info("Step 6: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 7: Enter OTP number (1234)");
        app.commonUtilityPage.enterOTPNumber();
        logger.info("Step 8: Click on verify button");
        app.commonUtilityPage.clickOnVerifyButton();
        logger.info("Step 9: Enter Phone number");
        app.registrationPage.enterPhoneNumber(data);
        logger.info("Step 10: Enter Email");
        app.registrationPage.enterEmail(data);
        logger.info("Step 11: Enter Password");
        app.registrationPage.clickOnContinueButton();
        app.registrationPage.enterPassword(data);
        logger.info("Step 12: Enter Password Confirmation");
        app.registrationPage.enterPasswordConfirmation(data);
        logger.info("Step 13: Click on agreement terms and conditions checkbox");
        app.commonUtilityPage.clickOnAgreeTermsOfConditions();
        logger.info("Step 14: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 15: Enter OTP number (1234)");
        app.commonUtilityPage.enterOTPNumber();
        logger.info("Step 16: Click on verify button");
        app.commonUtilityPage.clickOnVerifyButton();
        logger.info("Step 17: Check the Registered Successfully! message");
        app.registrationPage.checkSuccessfulRegisterMessage();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_6-Register to Sakani using existing data",
            description = " Verify That There is account for this ID")
    public void verifyTheAccountAlreadyCreated(Map<String, String> data) throws Exception {
        logger.info("Step 1: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 2: Click on Login button");
        app.commonUtilityPage.switchLanguage();
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 3: Click on No account? Create a new account link");
        app.registrationPage.clickOnRegisterLink();
        logger.info("Step 4: Enter NationalID");
        app.registrationPage.enterIDNumber(data);
        logger.info("Step 5: Enter Birth Date");
        app.registrationPage.enterBirthOfDate(data);
        logger.info("Step 6: Click on continue button");
        app.registrationPage.clickOnContinueButton();
        logger.info("Step 7: Verify The Validation Message");
        app.registrationPage.checkTheAccountIsAlreadyCreated();
    }


}















