package sa.nhc.sakani.web.login;

import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;

import java.util.Map;

public class BookUnit extends NHSSakaniWebTest {

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromMOHLandAsEligibleUserWithBookingFees(Map<String, String> data) throws Exception   {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.bookUnitPage.navigateToBookingManagement();
        app.bookUnitPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.verifyUserIsEligible("هذا المستفيد مستحق للحجز");
        app.bookUnitPage.clickOnStartBookingButton();
        app.bookUnitPage.searchForProject(data.get("Project_name"));
        app.bookUnitPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.bookUnitPage.SearchUnit(data.get("Unit_code"));
        app.bookUnitPage.clickOnViewUnitButton();
        app.bookUnitPage.clickSelectAndContinueButton();
        app.bookUnitPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.bookUnitPage.selectBankName(data.get("Bank_name"));
        app.bookUnitPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
        app.bookUnitPage.assertConfirmationPopUp();
        app.bookUnitPage.clickConfirmButton();
        app.bookUnitPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void PayUnitBookingPriceMOHLandAsEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Housing");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.newMethods.userLoginNew(data.get("Username"), data.get("Password"));
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
        app.newMethods.FillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        logger.info("Step 05: Verify payment and booking is successful");
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromMOHLandAsNonEligibleUserWithoutBookingFees(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.bookUnitPage.navigateToBookingManagement();
        app.bookUnitPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.verifyUserIsEligible("هذا المستفيد مؤهل للحصول على حجز غير المستفيد");
        app.bookUnitPage.clickOnStartBookingButton();
        app.bookUnitPage.searchForProject(data.get("Project_name"));
        app.bookUnitPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.bookUnitPage.SearchUnit(data.get("Unit_code"));
        app.bookUnitPage.clickOnViewUnitButton();
        app.bookUnitPage.clickSelectAndContinueButton();
        app.bookUnitPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.bookUnitPage.selectBankName(data.get("Bank_name"));
        app.bookUnitPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
//        app.bookUnitPage.assertConfirmationPopUp();
//        app.bookUnitPage.clickConfirmButton();
        app.bookUnitPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyTheBookingMOHLandAsNonEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Housing");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.newMethods.userLoginNew(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to My Activity Page");
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        logger.info("Step 03: Verify Booking is available Project Name and unit code");
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        logger.info("Step 04: Verify view booking details");
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
//        app.bookingPage.clickPayBookingFeesButton();
//        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
//        logger.info("Step 04: Enter card details");
//        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
//        app.bookingPage.VerifyUserAbleToConfirmPayment();
//        logger.info("Step 05: Verify payment and booking is successful");
//        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void CancelMOHBookingFirstUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Navigate to Booking Management > Cancel Booking");
        app.bookUnitPage.navigateToBookingManagement();
        app.bookUnitPage.clickOnCancelBookingButton();
        logger.info("Step 03: Input user's national id and search > View booking details");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.clickOnViewBookingDetails();
        logger.info("Step 04: Select reason of Cancellation");
        app.bookUnitPage.selectReasonOfCancellation("الانتقال لمشروع آخر");
        app.bookUnitPage.clickOnCancelBookingButton();
        app.bookUnitPage.clickNoButton();
        app.bookUnitPage.clickYesButton();
        logger.info("Step 05: Confirm Cancellation");
        app.bookUnitPage.enterVerificationOTP("1234");
        app.bookUnitPage.clickOnVerifyOTPButton();
        app.bookUnitPage.assertCancellationText();
        app.bookUnitPage.clickYesButton();
        logger.info("Step 06: Verify Booking has been cancelled");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.verifyBookingIsNotAvailable();
    }

    @Test(dataProvider = "testDataProvider")
    public void CancelMOHBookingSecondUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Navigate to Booking Management > Cancel Booking");
        app.bookUnitPage.navigateToBookingManagement();
        app.bookUnitPage.clickOnCancelBookingButton();
        logger.info("Step 03: Input user's national id and search > View booking details");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.clickOnViewBookingDetails();
        logger.info("Step 04: Select reason of Cancellation");
        app.bookUnitPage.selectReasonOfCancellation("الانتقال لمشروع آخر");
        app.bookUnitPage.clickOnCancelBookingButton();
        app.bookUnitPage.clickNoButton();
        app.bookUnitPage.clickYesButton();
        logger.info("Step 05: Confirm Cancellation");
        app.bookUnitPage.enterVerificationOTP("1234");
        app.bookUnitPage.clickOnVerifyOTPButton();
        app.bookUnitPage.assertCancellationText();
        app.bookUnitPage.clickYesButton();
        logger.info("Step 06: Verify Booking has been cancelled");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.verifyBookingIsNotAvailable();
    }

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromPrivateLandAsNonEligibleUserWithBookingFees(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.bookUnitPage.navigateToBookingManagement();
        app.bookUnitPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.verifyUserIsEligible("هذا المستفيد مؤهل للحصول على حجز غير المستفيد");
        app.bookUnitPage.clickOnStartBookingButton();
        app.bookUnitPage.searchForProject(data.get("Project_name"));
        app.bookUnitPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.bookUnitPage.SearchUnit(data.get("Unit_code"));
        app.bookUnitPage.clickOnViewUnitButton();
        app.bookUnitPage.clickSelectAndContinueButton();
        app.bookUnitPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.bookUnitPage.selectBankName(data.get("Bank_name"));
        app.bookUnitPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is done and confirmed");
        app.bookUnitPage.assertConfirmationPopUp();
        app.bookUnitPage.clickConfirmButton();
        app.bookUnitPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void PayUnitBookingPricePrivateLandAsNonEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        //app.registrationAndLoginPartners.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.newMethods.userLoginNew(data.get("Username"), data.get("Password"));
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
        app.newMethods.FillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        app.bookingPage.VerifyUserAbleToConfirmPayment();
        logger.info("Step 05: Verify payment and booking is successful");
        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void BookUnitFromPrivateLandAsEligibleUserWithoutBookingFees(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Navigate to Booking Management and start new booking");
        app.bookUnitPage.navigateToBookingManagement();
        app.bookUnitPage.navigateToNewBookingPage();
        logger.info("Step 03: Input Beneficiary National ID > Search for the project");
        app.bookUnitPage.enterNationalIDAndSearch(data.get("National_ID"));
        app.bookUnitPage.verifyUserIsEligible("هذا المستفيد مستحق للحجز");
        app.bookUnitPage.clickOnStartBookingButton();
        app.bookUnitPage.searchForProject(data.get("Project_name"));
        app.bookUnitPage.clickSelectProjectButton();
        logger.info("Step 04: Select unit to book and confirm");
        app.bookUnitPage.SearchUnit(data.get("Unit_code"));
        app.bookUnitPage.clickOnViewUnitButton();
        app.bookUnitPage.clickSelectAndContinueButton();
        app.bookUnitPage.clickContiueBookingButton();
        logger.info("Step 05: Select bank name and continue");
        app.bookUnitPage.selectBankName(data.get("Bank_name"));
        app.bookUnitPage.clickConfirmAndBookButton();
        logger.info("Step 06: Verify booking is confirmed");
//        app.bookUnitPage.assertConfirmationPopUp();
//        app.bookUnitPage.clickConfirmButton();
        app.bookUnitPage.assertBookingCofirmedText();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyBookingPrivateLandAsEligibleUser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Housing");
        //app.registrationAndLoginPartners.loginToSakani();
        app.commonUtilityPage.closePopUpWindows();
        app.newMethods.userLoginNew(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to My Activity Page");
        app.homePage.clickOnMyProfileButton();
        app.bookingPage.VerifyUserAbleToNeviagteToActivityInProfilePage();
        logger.info("Step 03: Verify Booking is available Project Name and unit code");
        app.bookingPage.assertProjectName(data.get("Project_name"));
        app.bookingPage.assertUnitCode(data.get("Unit_code"));
        logger.info("Step 04: Verify view booking details");
        app.bookingPage.VerifyUserAbleToReviewBookingDetails();
//        app.bookingPage.clickPayBookingFeesButton();
//        app.bookingPage.VerifyUserAbleToSelectPaymentMethod();
//        logger.info("Step 04: Enter card details");
//        app.bookingPage.VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
//        app.bookingPage.VerifyUserAbleToConfirmPayment();
//        logger.info("Step 05: Verify payment and booking is successful");
//        app.bookingPage.VerifyUserAbleToViewSuccessfulBookingMessage();
    }
}
