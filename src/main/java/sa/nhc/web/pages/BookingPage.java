package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sa.nhc.web.objects.BookingPageObjects;
import sa.nhc.web.objects.CommonUtilityPageObjects;

import java.util.List;
import java.util.Map;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class BookingPage extends WebBasePage {

    public void BookingOffPlanMOHEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "شقة");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanMOHEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "شقة");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanMOHInEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanMOHInEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("المستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateInEligibleWithoutFee(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToSelectUnitWithoutPayment();
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }

    public void BookingOffPlanPrivateInEligible(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewOffPlanBooking();
        VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus("غير مستفيد", "فيلا");
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToNavigateToPaymentPage();
        VerifyUserAbleToPayUnitInvoiceSuccessfully(data);
        VerifyUserAbleToViewSuccessfulBookingMessage();
        VerifyUserAbleToReviewBookingDetails();
//        VerifyUserAbleToCancelBooking();
    }


    public void BookingLandMOHEligibleWithSignature(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewLandMOHEBooking();
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToCompleteLandBookingWithSignature();
        VerifyUserAbleToViewSuccessfulBookingLandMessage();
        VerifyUserAbleToReviewLandBookingDetails();
//        VerifyUserAbleToCancelLandBooking();
    }

    public void BookingLandMOHEligibleWithoutSignature(Map<String, String> data) throws Exception {
        VerifyUserAbleToStartNewLandMOHEBooking();
        VerifyUserAbleToSelectFromAvailabilityUnits(data);
        VerifyUserAbleToCompleteLandBookingWithoutSignature();
        VerifyUserAbleToNeviagteToActivityInProfilePage();
    }

    public void VerifyUserAbleToStartNewLandMOHEBooking() throws Exception {
        logger.info("Switch view form map to list to view all available lands");
        Browser.waitForSeconds(5);
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.displayAsList());
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void SearchForProject(Map<String, String> data) throws Exception {
        logger.info("Neviagte to Home page , Click on filter button , search for project");
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.filterButton());
        Browser.waitForSeconds(3);
        Browser.setText(BookingPageObjects.inputSearch(), data.get("Project_Name"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("Enter project name");
        Browser.waitForSeconds(5);
        Browser.click(BookingPageObjects.optionSearch());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.displayButton());
        if (Browser.isElementPresent(BookingPageObjects.projectTitle())) {
            Browser.waitForSeconds(2);
            String ProjectName = Browser.getWebElement(BookingPageObjects.projectTitle()).getText();
            Browser.waitForSeconds(2);
            Assert.assertTrue(ProjectName.contains(data.get("Project_Name")));
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
            Browser.waitForSeconds(2);
            Browser.click(BookingPageObjects.projectTitle());
            Browser.waitForSeconds(3);
            Browser.executeJSScroll(700);
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
            Browser.waitForSeconds(2);
        } else {
            Browser.waitForSeconds(2);
            Browser.takeScreenshot();
            Browser.waitForSeconds(2);
            String ProjectName = Browser.getWebElement(BookingPageObjects.projectTitle()).getText();
            Browser.waitForSeconds(2);
            Assert.assertTrue(ProjectName.contains(data.get("Project_Name")));
            Browser.waitForSeconds(2);
        }
    }


    public void VerifyUserAbleToStartNewOffPlanBooking() throws Exception {
        logger.info("Click to start new booking");
        Browser.waitForSeconds(4);
        Browser.click(BookingPageObjects.unitList());
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(100);
        Browser.waitForSeconds(4);
        if (Browser.isElementPresent(BookingPageObjects.startBookingButton())) {
            Browser.click(BookingPageObjects.startBookingButton());
            Browser.waitForSeconds(5);
        } else
            Browser.click(BookingPageObjects.selectUnitTab());
        Browser.waitForSeconds(3);
    }

    public void VerifyUserAbleToFilterUnitBasedOnUnitTypeAndEligibilityStatus(String Status, String UnitType) throws Exception {
        logger.info("filter units based on beneficiary/not beneficiary & Unit type");
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.filterArrowForEligibleOrNotEligible(), 45);
        Browser.click(BookingPageObjects.filterArrowForEligibleOrNotEligible());
        Browser.waitForSeconds(2);
        String SelectEligibilityStatus = "//span[@class='form-check-label mb-n2'][contains(text(),'" + Status + "')]";
        Browser.click(By.xpath(SelectEligibilityStatus)); //beneficiary-option
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.searchButton());
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.filterArrowTypeUnit());
        Browser.waitForSeconds(2);
        String SelectUnitType = "//span[contains(text(),'" + UnitType + "')]";
        Browser.click(By.xpath(SelectUnitType));
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.searchButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToSelectFromAvailabilityUnits(Map<String, String> data) throws Exception {
        logger.info("User should able to Select from Available Unit");
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(200);
        Browser.click(BookingPageObjects.selectFirstAvailableUnit());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToCompleteLandBookingWithSignature() throws Exception {
        logger.info("User should able to enter otp after click on booking agreement");
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.bookingLandButton());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 250);

        Browser.waitForSeconds(15);

        Browser.click(BookingPageObjects.SignatureOptionButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(4);
        for (int i = 1; i <= 1; i++) {
            Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "1234");
        }
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(CommonUtilityPageObjects.BTNVerify());
        Browser.waitForSeconds(5);
    }


    public void VerifyUserAbleToCompleteLandBookingWithoutSignature() throws Exception {
        logger.info("User should be able to booking and apply Signature later");
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.bookingLandButton());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 250);

        Browser.waitForSeconds(15);
        Browser.click(BookingPageObjects.SignatureLaterOptionButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToNeviagteToActivityInProfilePage() throws Exception {
        Browser.click(BookingPageObjects.selectUserMenu());
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.selectUserProfile());
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.selectUserActivity(), 20);
        Browser.click(BookingPageObjects.selectUserActivity());
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.myBookingPage(), 20);
        Browser.click(BookingPageObjects.myBookingPage());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToNavigateToPaymentPage() throws Exception {
        logger.info("After user check booking agreement , Booking Fee will displayed");
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.bookingUnit());
        Browser.waitForSeconds(5);
        Browser.click(BookingPageObjects.agreementLabel());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.confirmButton());
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(700);
        String PriceFee = Browser.getWebElement(BookingPageObjects.feeTitle()).getText();
        Assert.assertTrue(PriceFee.contains("رسوم"));
        logger.info("PriceFee : " + PriceFee);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(5);
        Browser.click(BookingPageObjects.payFeeButton());
    }

    public void VerifyUserAbleToSelectUnitWithoutPayment() throws Exception {
        logger.info("User should not pay any fee and no fee price will displayed");
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.bookingUnit());
        Browser.waitForSeconds(10);
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.confirmButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToNeviagteToPaymentPage() throws Exception {
        logger.info("User will Neviagte to payment page and pay the invoice");
        Browser.waitForSeconds(5);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.invoiceTitle(), 35);
        String InvoicePage = Browser.getWebElement(BookingPageObjects.invoiceTitle()).getText();
        Assert.assertTrue(InvoicePage.contains("الفاتورة"));
    }

    public void VerifyUserAbleToSelectPaymentMethod() throws Exception {
        Browser.executeJSScroll(700);
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.SelectMada(), 20);
        Browser.click(BookingPageObjects.SelectMada());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Select payment method - Mada");
    }

    public void VerifyUserAbleToFillPaymentDetails(String cardNumber, String holderName, String expiryDate, String cvv) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.payNowTitle(), 30);
        String PaymentPage = Browser.getWebElement(BookingPageObjects.payNowTitle()).getText();
        Assert.assertTrue(PaymentPage.contains("اللحظي"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        WebElement iframe = driver.findElement(BookingPageObjects.CardNumberIframe());
        Browser.waitForSeconds(1);
        driver.switchTo().frame(iframe);
        Browser.waitForSeconds(1);
        WebElement CardNumber = driver.findElement(BookingPageObjects.cardNumberInputTxt());
//        Browser.waitForSeconds(2);
        CardNumber.sendKeys(cardNumber);
//        Browser.waitForSeconds(2);
        driver.switchTo().defaultContent();
//        Browser.waitForSeconds(2);
        Browser.setText(BookingPageObjects.holderNameInputTxt(), holderName);
//        Browser.waitForSeconds(2);
        Browser.setText(BookingPageObjects.expiryDateInputTxt(), expiryDate);
//        Browser.waitForSeconds(2);
        WebElement iframe2 = driver.findElement(BookingPageObjects.cvvIframe());
//        Browser.waitForSeconds(2);
        driver.switchTo().frame(iframe2);
//        Browser.waitForSeconds(2);
        WebElement Cvv = driver.findElement(BookingPageObjects.cvvInputTxt());
//        Browser.waitForSeconds(2);
        Cvv.sendKeys(cvv);
//        Browser.waitForSeconds(2);
        driver.switchTo().defaultContent();
//        Browser.waitForSeconds(2);
        logger.addScreenshot("");
//        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.payNowButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
//        Browser.waitForSeconds(12);
    }

    public void VerifyUserAbleToConfirmPayment() throws Exception {
        Browser.waitUntilInvisibilityOfElement(BookingPageObjects.payNowButton(), 20);
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(2);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
//        Browser.waitForSeconds(1);
        actions.sendKeys(Keys.TAB).perform();
//        Browser.waitForSeconds(1);
        actions.sendKeys(Keys.TAB).perform();
//        Browser.waitForSeconds(1);
        actions.sendKeys(Keys.TAB).perform();
//        Browser.waitForSeconds(1);
        actions.sendKeys(Keys.TAB).perform();
        Browser.waitForSeconds(1);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void VerifyUserAbleToPayUnitInvoiceSuccessfully(Map<String, String> data) throws Exception {
        VerifyUserAbleToNeviagteToPaymentPage();
        VerifyUserAbleToSelectPaymentMethod();
        VerifyUserAbleToFillPaymentDetails(data.get("Card_number"), data.get("Holder_name"), data.get("Expiry_date"), data.get("CVV_number"));
        VerifyUserAbleToConfirmPayment();
    }

    public void VerifyUserAbleToViewSuccessfulBookingMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.closeReview(), 30);
        Browser.waitUntilElementToBeClickable(BookingPageObjects.closeReview(), 20);
        Browser.waitForSeconds(7);
        Browser.click(BookingPageObjects.closeReview());
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.successfulBookingMsg(), 30);
        String BookingMsg = Browser.getWebElement(BookingPageObjects.successfulBookingMsg()).getText();
        Assert.assertTrue(BookingMsg.contains("الحجز بنجاح"));
        Browser.waitForSeconds(1);
        logger.addScreenshot("user should view successful Booking Msg: " + BookingMsg);
    }

    public void VerifyUserAbleToViewSuccessfulBookingLandMessage() throws Exception {
        Browser.waitForSeconds(5);
        Browser.click(BookingPageObjects.closeReview());
        Browser.waitForSeconds(5);
        String BookingMsg = Browser.getWebElement(BookingPageObjects.successfulBookingLandMsg()).getText();
        Assert.assertTrue(BookingMsg.contains("الحجز بنجاح"));
        logger.info("user should view successful Booking Msg :" + BookingMsg);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToReviewBookingDetails() throws Exception {
        logger.info("User should be able to view booking details");
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.viewBookingButton(), 20);
        Browser.click(BookingPageObjects.viewBookingButton());
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
    }

    public void VerifyUserAbleToReviewLandBookingDetails() throws Exception {
        logger.info("User should be able to view booking details");
        Browser.click(BookingPageObjects.viewLandBookingButton());
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.viewLandBookingDetails());
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void VerifyUserAbleToCancelBooking() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.cancelBooking());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
        Browser.waitForSeconds(7);
        if (Browser.isElementPresent(BookingPageObjects.continueCancellationButton())) {
            Browser.click(BookingPageObjects.continueCancellationButton());
            Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
            Browser.waitForSeconds(9);
            Browser.click(BookingPageObjects.otherOption());
            Browser.waitForSeconds(3);
            Browser.setText(BookingPageObjects.cancellationReasonInput(), "Test By Automation");
            Browser.waitForSeconds(3);
            Browser.click(BookingPageObjects.confirmCancellationButton());
            Browser.waitForSeconds(3);
            Browser.click(BookingPageObjects.confirmCancellationButtonYes());
            Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 100);
            Browser.waitForSeconds(5);
            String CancelMsg = Browser.getWebElement(BookingPageObjects.successfulCancelTxt()).getText();
            Assert.assertTrue(CancelMsg.contains("تم إلغاء"));
        }

        Browser.waitForSeconds(9);
        Browser.click(BookingPageObjects.otherOption());
        Browser.waitForSeconds(3);
        Browser.setText(BookingPageObjects.cancellationReasonInput(), "Test By Automation");
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.confirmCancellationButton());

        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.displayBookingAfterCancel());
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(550);
        String CancelBookingMsg = Browser.getWebElement(
                BookingPageObjects.successfulBookingCancel()).getText();
        Assert.assertTrue(CancelBookingMsg.contains("تم إلغاء هذا الحجز"));
        Browser.waitForSeconds(5);
    }

    public void VerifyUserAbleToCancelLandBooking() throws Exception {
        Browser.click(BookingPageObjects.cancelBooking());
        Browser.waitForSeconds(3);
        String CancelContract = Browser.getWebElement
                (BookingPageObjects.cancellationContractButton()).getText();
        Assert.assertTrue(CancelContract.contains("إلغاء العقد"));
        Browser.waitForSeconds(3);
        Browser.click(BookingPageObjects.cancellationDropdown());
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.cancellationReason());
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.saveAndContinueButton());
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.disclaimerButton());
        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.continueCancellationLand());
        Browser.waitForSeconds(5);
        for (int i = 1; i <= 1; i++) {
            Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "1234");
        }
        Browser.waitForSeconds(5);
        Browser.waitForSeconds(3);
        String CancelMsg = Browser.getWebElement(BookingPageObjects.successfulCancelTxt()).getText();
        Assert.assertTrue(CancelMsg.contains("تم الإلغاء"));
        Browser.waitForSeconds(3);
    }

    public void clickPayBookingFeesButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.payFeeButton(), 20);
        Browser.moveToElement(BookingPageObjects.payFeeButton());
        Browser.click(BookingPageObjects.payFeeButton());
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

}
