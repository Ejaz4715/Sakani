package sa.nhc.sakani.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.BookingPageObjects;
import sa.nhc.sakani.web.objects.CommonUtilityPageObjects;

import java.util.List;
import java.util.Map;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class BookingPage {
    public BookingPage(){

    }

    public void BookingOffPlanMOHEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "شقة");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanMOHEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "شقة");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanMOHInEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanMOHInEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateInEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateInEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
        VerifyUserAbleToCancelBooking();
    }


    public void BookingLandMOHEligibleWithSignature(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewLandMOHEBooking();
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToCompleteLandBookingWithSignature();
        VerifyUserAbleToViewSuccessfulBookingLandMessage();
        VerifyUserAbleToReviewLandBookingDetails();
        VerifyUserAbleToCancelLandBooking();
    }

    public void BookingLandMOHEligibleWithoutSignature(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewLandMOHEBooking();
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToCompleteLandBookingWithoutSignature();
        VerifyUserAbleToNeviagteToActivityInProfilePage();
    }

    public void VerifyUserAbleToStartNewLandMOHEBooking() throws Exception {
        logger.info("Switch view form map to list to view all available lands");
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.displayAsList());
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void SearchForProject(Map<String, String> data) throws Exception {
        logger.info("Neviagte to Home page , Click on filter button , search for project");
        Browser.click(BookingPageObjects.filterButton());
        Browser.setText(BookingPageObjects.inputSearch(), data.get("Project_Name"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("Enter project name");
        Browser.click(BookingPageObjects.optionSearch());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(BookingPageObjects.displayButton());
        if (Browser.isElementPresent(BookingPageObjects.projectTitle())) {
            Browser.waitForSeconds(2);
            String ProjectName = Browser.getWebElement(BookingPageObjects.projectTitle()).getText();
            Browser.waitForSeconds(2);
            Assert.assertTrue(ProjectName.contains(data.get("Project_Name")));
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
            Browser.click(BookingPageObjects.projectTitle());
            Browser.executeJSScroll(700);
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
        } else {
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
            String ProjectName = Browser.getWebElement(BookingPageObjects.projectTitle()).getText();
            Browser.waitForSeconds(2);
            Assert.assertTrue(ProjectName.contains(data.get("Project_Name")));
        }
    }


    public void VerifyUserAbleToStartNewOffPlanBooking() throws Exception {
        logger.info("Click to start new booking");
        Browser.click(BookingPageObjects.unitList());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.executeJSScroll(120);
        if (Browser.isElementPresent(BookingPageObjects.startBookingButton())) {
            Browser.waitForSeconds(1);
            Browser.click(BookingPageObjects.startBookingButton());
        } else
            Browser.click(BookingPageObjects.selectUnitTab());
    }

    public void VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus(String Status, String UnitType) throws Exception {
        logger.info("filter units based on beneficiary/not beneficiary & Unit type");
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.filterArrowForEligibleOrNotEligible(), 45);
        Browser.click(BookingPageObjects.filterArrowForEligibleOrNotEligible());
        String SelectEligibilityStatus = "//span[@class='form-check-label mb-n2'][contains(text(),'" + Status + "')]";
        Browser.click(By.xpath(SelectEligibilityStatus)); //beneficiary-option
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(BookingPageObjects.searchButton());
        Browser.click(BookingPageObjects.filterArrowTypeUnit());
        String SelectUnitType = "//span[contains(text(),'" + UnitType + "')]";
        Browser.click(By.xpath(SelectUnitType));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(BookingPageObjects.searchButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToSelectFromAvailabilityUnits(Map<String, String> data) throws Exception {
        logger.info("User should able to Select from Available Unit");
        Browser.executeJSScroll(230);
        Browser.waitForSeconds(1);
        Browser.click(BookingPageObjects.selectFirstAvailableUnit());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToCompleteLandBookingWithSignature() throws Exception {
        logger.info("User should able to enter otp after click on booking agreement");
        Browser.click(BookingPageObjects.bookingLandButton());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 250);

        Browser.click(BookingPageObjects.SignatureOptionButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(4);
        for (int i = 1; i <= 1; i++) {
            Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "1234");
        }
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(CommonUtilityPageObjects.BTNVerify());
    }


    public void VerifyUserAbleToCompleteLandBookingWithoutSignature() throws Exception {
        logger.info("User should be able to booking and apply Signature later");
        Browser.click(BookingPageObjects.bookingLandButton());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 250);

        Browser.click(BookingPageObjects.SignatureLaterOptionButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToNeviagteToActivityInProfilePage() throws Exception {
        Browser.click(BookingPageObjects.selectUserMenu());
        Browser.click(BookingPageObjects.selectUserProfile());
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.selectUserActivity(), 20);
        Browser.click(BookingPageObjects.selectUserActivity());
        Browser.click(BookingPageObjects.myBookingPage());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToNavigateToPaymentPage() throws Exception {
        logger.info("After user check booking agreement , Booking Fee will displayed");
        Browser.click(BookingPageObjects.bookingUnit());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(),35);
        Browser.click(BookingPageObjects.agreementLabel());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(BookingPageObjects.confirmButton());
        Browser.executeJSScroll(700);
        String PriceFee = Browser.getWebElement(BookingPageObjects.feeTitle()).getText();
        Assert.assertTrue(PriceFee.contains("رسوم"));
        logger.info("PriceFee : " + PriceFee);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(BookingPageObjects.payFeeButton());
    }

    public void VerifyUserAbleToSelectUnitWithoutPayment() throws Exception {
        logger.info("User should not pay any fee and no fee price will displayed");
        Browser.click(BookingPageObjects.bookingUnit());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(),35);
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(1);
        Browser.click(BookingPageObjects.confirmButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToNeviagteToPaymentPage() throws Exception {
        logger.info("User will Neviagte to payment page and pay the invoice");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.invoiceTitle(), 35);
        String InvoicePage = Browser.getWebElement(BookingPageObjects.invoiceTitle()).getText();
        Assert.assertTrue(InvoicePage.contains("الفاتورة"));
    }

    public void VerifyUserAbleToSelectPaymentMethod() throws Exception {
        Browser.executeJSScroll(700);
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.SelectMada());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Select payment method - Mada");

    }

    public void VerifyUserAbleToFillPaymentDetails(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.payNowTitle(), 35);
        String PaymentPage = Browser.getWebElement(BookingPageObjects.payNowTitle()).getText();
        Assert.assertTrue(PaymentPage.contains("اللحظي"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        WebElement iframe = driver.findElement(BookingPageObjects.CardNumberIframe());
        Browser.waitForSeconds(2);
        driver.switchTo().frame(iframe);
        Browser.waitForSeconds(2);
        WebElement CardNumber = driver.findElement(BookingPageObjects.cardNumberInputTxt());
        CardNumber.sendKeys(data.get("Card_Number"));
        driver.switchTo().defaultContent();
        Browser.setText(BookingPageObjects.holderNameInputTxt(), data.get("Holder_Name"));
        Browser.setText(BookingPageObjects.expiryDateInputTxt(), data.get("Expiry_Date"));
        WebElement iframe2 = driver.findElement(BookingPageObjects.cvvIframe());
        driver.switchTo().frame(iframe2);
        WebElement Cvv = driver.findElement(BookingPageObjects.cvvInputTxt());
        Cvv.sendKeys(data.get("CVV"));
        driver.switchTo().defaultContent();
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(BookingPageObjects.payNowButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");

    }

    public void VerifyUserAbleToConfirmPayment() {
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(2);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
        Browser.waitForSeconds(2);
        actions.sendKeys(Keys.TAB).perform();
        Browser.waitForSeconds(2);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void VerifyUserAbleToPayUnitInvoiceSuccessfully(Map<String, String> data) throws Exception {
        VerifyUserAbleToNeviagteToPaymentPage();
        VerifyUserAbleToSelectPaymentMethod();
        VerifyUserAbleToFillPaymentDetails(data);
        VerifyUserAbleToConfirmPayment();
    }

    public void VerifyUserAbleToViewSuccessfulBookingMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.closeReview(),35);
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(),35);
        Browser.click(BookingPageObjects.closeReview());
        String BookingMsg = Browser.getWebElement(BookingPageObjects.successfulBookingMsg()).getText();
        Assert.assertTrue(BookingMsg.contains("الحجز بنجاح"));
        logger.info("user should view successful Booking Msg :" + BookingMsg);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToViewSuccessfulBookingLandMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.closeReview(),35);
        Browser.click(BookingPageObjects.closeReview());
        String BookingMsg = Browser.getWebElement(BookingPageObjects.successfulBookingLandMsg()).getText();
        Assert.assertTrue(BookingMsg.contains("الحجز بنجاح"));
        logger.info("user should view successful Booking Msg :" + BookingMsg);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToReviewBookingDetails() throws Exception {
        logger.info("User should be able to view booking details");
        Browser.click(BookingPageObjects.viewBookingButton());
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(350);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToReviewLandBookingDetails() throws Exception {
        logger.info("User should be able to view booking details");
        Browser.click(BookingPageObjects.viewLandBookingButton());
        Browser.click(BookingPageObjects.viewLandBookingDetails());
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToCancelBooking() throws Exception {
        Browser.click(BookingPageObjects.cancelBooking());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 100);
        if (Browser.isElementPresent(BookingPageObjects.continueCancellationButton())) {
            Browser.click(BookingPageObjects.continueCancellationButton());
            Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 100);
            Browser.click(BookingPageObjects.otherOption());
            Browser.setText(BookingPageObjects.cancellationReasonInput(), "Test By Automation");
            Browser.click(BookingPageObjects.confirmCancellationButton());
            Browser.click(BookingPageObjects.confirmCancellationButtonYes());
            Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 100);
            String CancelMsg = Browser.getWebElement(BookingPageObjects.successfulCancelTxt()).getText();
            Assert.assertTrue(CancelMsg.contains("تم إلغاء"));
        }
//
//        Browser.click(BookingPageObjects.otherOption());
//        Browser.setText(BookingPageObjects.cancellationReasonInput(), "Test By Automation");
//        Browser.click(BookingPageObjects.confirmCancellationButton());
//
//        Browser.click(BookingPageObjects.displayBookingAfterCancel());
//        Browser.executeJSScroll(550);
//        String CancelBookingMsg = Browser.getWebElement(
//                BookingPageObjects.successfulBookingCancel()).getText();
//        Assert.assertTrue(CancelBookingMsg.contains("تم إلغاء هذا الحجز"));
    }

    public void VerifyUserAbleToCancelLandBooking() throws Exception {
        Browser.click(BookingPageObjects.cancelBooking());
        String CancelContract = Browser.getWebElement
                (BookingPageObjects.cancellationContractButton()).getText();
        Assert.assertTrue(CancelContract.contains("إلغاء العقد"));
        Browser.click(BookingPageObjects.cancellationDropdown());
        Browser.click(BookingPageObjects.cancellationReason());
        Browser.click(BookingPageObjects.saveAndContinueButton());
        Browser.click(BookingPageObjects.disclaimerButton());
        Browser.click(BookingPageObjects.continueCancellationLand());
        for (int i = 1; i <= 1; i++) {
            Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "1234");
        }
        String CancelMsg = Browser.getWebElement(BookingPageObjects.successfulCancelTxt()).getText();
        Assert.assertTrue(CancelMsg.contains("تم الإلغاء"));
    }


    public void assertProjectName(String expectedProjectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.ProjectName(), 30);
        List<WebElement> projectNameList = Browser.getWebElements(BookingPageObjects.ProjectName());
        String actualProjectName = "";

        for (WebElement name : projectNameList) {
            actualProjectName = name.getText();
            if (actualProjectName.contains(expectedProjectName)) {
                break;
            }
        }
        Assert.assertEquals(actualProjectName, expectedProjectName,"Unit code does not match");
        logger.addScreenshot("Project name is: " + actualProjectName);
    }

    public void assertUnitCode(String expectedUnitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.UnitCode(), 30);
        List<WebElement> untiCodeList = Browser.getWebElements(BookingPageObjects.UnitCode());
        String actualUnitCode = "";
        for (WebElement name : untiCodeList) {
            actualUnitCode = name.getText();
            if (actualUnitCode.equalsIgnoreCase(expectedUnitCode)) {
                break;
            }
        }
        Assert.assertEquals(actualUnitCode, expectedUnitCode, "Unit code does not match");
        logger.addScreenshot("Project name is: " + actualUnitCode);
    }

    public void clickPayBookingFeesButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.payFeeButton(), 20);
        Browser.moveToElement(BookingPageObjects.payFeeButton());
        Browser.click(BookingPageObjects.payFeeButton());
    }
}
