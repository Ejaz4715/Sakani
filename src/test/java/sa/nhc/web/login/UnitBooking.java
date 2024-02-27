package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class UnitBooking extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromMOHLandAsEligibleUser(Map<String, String> data) throws Exception   {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToBookingManagement();
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
        logger.info("Step 01: Login to Sakani Housing");
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to My Activity Page");
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        logger.info("Step 03: Navigate to Pay booking fees");
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        logger.info("Step 04: Enter card details");
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        logger.info("Step 05: Verify payment and booking is successful");
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromMOHLandAsNonEligibleUser(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToBookingManagement();
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
        logger.info("Step 01: Login to Sakani Housing");
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to My Activity Page");
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        logger.info("Step 03: Navigate to Pay booking fees");
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        logger.info("Step 04: Enter card details");
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        logger.info("Step 05: Verify payment and booking is successful");
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void CancelMOHBookingFirstUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management > Cancel Booking");
        app.unitBookingPage.navigateToBookingManagement();
        app.unitBookingPage.clickOnCancelBookingButton();
        logger.info("Step 03: Input user's national id and search > View booking details");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.clickOnViewBookingDetails();
        logger.info("Step 04: Select reason of Cancellation");
        app.unitBookingPage.selectReasonOfCancellation("الانتقال لمشروع آخر");
        app.unitBookingPage.clickOnCancelBookingButton();
        app.unitBookingPage.clickNoButton();
        app.unitBookingPage.clickYesButton();
        logger.info("Step 05: Confirm Cancellation");
        app.unitBookingPage.enterVerificationOTP("1234");
        app.unitBookingPage.clickOnVerifyOTPButton();
        app.unitBookingPage.assertCancellationText();
        app.unitBookingPage.clickYesButton();
        logger.info("Step 06: Verify Booking has been cancelled");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.verifyBookingIsNotAvailable();
    }

    @Test(dataProvider = "testDataProvider")
    public void CancelMOHBookingSecondUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management > Cancel Booking");
        app.unitBookingPage.navigateToBookingManagement();
        app.unitBookingPage.clickOnCancelBookingButton();
        logger.info("Step 03: Input user's national id and search > View booking details");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.clickOnViewBookingDetails();
        logger.info("Step 04: Select reason of Cancellation");
        app.unitBookingPage.selectReasonOfCancellation("الانتقال لمشروع آخر");
        app.unitBookingPage.clickOnCancelBookingButton();
        app.unitBookingPage.clickNoButton();
        app.unitBookingPage.clickYesButton();
        logger.info("Step 05: Confirm Cancellation");
        app.unitBookingPage.enterVerificationOTP("1234");
        app.unitBookingPage.clickOnVerifyOTPButton();
        app.unitBookingPage.assertCancellationText();
        logger.info("Step 06: Verify Booking has been cancelled");
        app.unitBookingPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.unitBookingPage.verifyBookingIsNotAvailable();
    }

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromPrivateLandAsNonEligibleUser(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToBookingManagement();
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
        logger.info("Step 02: Navigate to My Activity Page");
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        logger.info("Step 03: Navigate to Pay booking fees");
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        logger.info("Step 04: Enter card details");
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        logger.info("Step 05: Verify payment and booking is successful");
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromPrivateLandAsEligibleUser(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.unitBookingPage.navigateToBookingManagement();
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
        logger.info("Step 01: Login to Sakani Housing");
        app.registrationAndLogin.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.loginPage.userLogin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to My Activity Page");
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        logger.info("Step 03: Navigate to Pay booking fees");
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
        app.bookingPage.clickPayBookingFeesButton();
        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
        logger.info("Step 04: Enter card details");
        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        logger.info("Step 05: Verify payment and booking is successful");
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }
}
