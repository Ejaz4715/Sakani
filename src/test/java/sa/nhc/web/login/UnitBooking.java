package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class UnitBooking extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void bookUnitFromMOHLandAsEligibleUser (Map<String, String> data) throws Exception   {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.verifyUserIsEligible("هذا المستفيد مستحق للحجز");
        app.unitBookingPage.clickOnStartBookingButton();
        app.unitBookingPage.searchForProject(data.get("Project_name"));
        app.unitBookingPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.unitBookingPage.SearchUnit(data.get("Unit_code"));
        app.unitBookingPage.clickOnViewUnitButton();
        app.unitBookingPage.clickSelectAndContinueButton();
        app.unitBookingPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.unitBookingPage.selectBankName(data.get("Bank_name"));
        app.unitBookingPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
        app.unitBookingPage.assertConfirmationPopUp();
        app.unitBookingPage.clickConfirmButton();
        app.unitBookingPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void PayUnitBookingPriceMOHLandAsEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void bookUnitFromMOHLandAsNonEligibleUser (Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.verifyUserIsEligible("هذا المستفيد مؤهل للحصول على حجز غير المستفيد");
        app.unitBookingPage.clickOnStartBookingButton();
        app.unitBookingPage.searchForProject(data.get("Project_name"));
        app.unitBookingPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.unitBookingPage.SearchUnit(data.get("Unit_code"));
        app.unitBookingPage.clickOnViewUnitButton();
        app.unitBookingPage.clickSelectAndContinueButton();
        app.unitBookingPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.unitBookingPage.selectBankName(data.get("Bank_name"));
        app.unitBookingPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
        app.unitBookingPage.assertConfirmationPopUp();
        app.unitBookingPage.clickConfirmButton();
        app.unitBookingPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void PayUnitBookingPriceMOHLandAsNonEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }


    @Test(dataProvider = "testDataProvider")
    public void bookUnitFromPrivateLandAsNonEligibleUser(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.verifyUserIsEligible("هذا المستفيد مؤهل للحصول على حجز غير المستفيد");
        app.unitBookingPage.clickOnStartBookingButton();
        app.unitBookingPage.searchForProject(data.get("Project_name"));
        app.unitBookingPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.unitBookingPage.SearchUnit(data.get("Unit_code"));
        app.unitBookingPage.clickOnViewUnitButton();
        app.unitBookingPage.clickSelectAndContinueButton();
        app.unitBookingPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.unitBookingPage.selectBankName(data.get("Bank_name"));
        app.unitBookingPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
        app.unitBookingPage.assertConfirmationPopUp();
        app.unitBookingPage.clickConfirmButton();
        app.unitBookingPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void PayUnitBookingPricePrivateLandAsNonEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void bookUnitFromPrivateLandAsEligibleUser(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.verifyUserIsEligible("هذا المستفيد مستحق للحجز");
        app.unitBookingPage.clickOnStartBookingButton();
        app.unitBookingPage.searchForProject(data.get("Project_name"));
        app.unitBookingPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.unitBookingPage.SearchUnit(data.get("Unit_code"));
        app.unitBookingPage.clickOnViewUnitButton();
        app.unitBookingPage.clickSelectAndContinueButton();
        app.unitBookingPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.unitBookingPage.selectBankName(data.get("Bank_name"));
        app.unitBookingPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
        app.unitBookingPage.assertConfirmationPopUp();
        app.unitBookingPage.clickConfirmButton();
        app.unitBookingPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void PayUnitBookingPricePrivateLandAsEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }
}
