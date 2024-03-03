package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.*;

import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;


public class BookUnitPage extends WebBasePage {

    public void navigateToNewBookingPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.NewBookingButton(), 35);
        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.NewBookingButton());
        logger.addScreenshot("");
    }
    public void navigateToBookingManagement() throws Exception{
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.BookingManagementOption(), 35);
        Browser.click(BookUnitPageObjects.BookingManagementOption());
    }

    public void enterNationalIDAndSearch(String nationalId) throws Exception {
        Browser.waitUntilInvisibilityOfElement(BookUnitPageObjects.LoadingIcon(), 30);
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.NationalIDInput(), 35);
        Browser.waitForSeconds(2);
        Browser.setText(BookUnitPageObjects.NationalIDInput(), nationalId);
        Browser.click(BookUnitPageObjects.SearchButton());
    }
    public void clickOnStartBookingButton() throws Exception{
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.StartBookingButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.StartBookingButton(), 30);
        Browser.click(BookUnitPageObjects.StartBookingButton());
    }

    public void searchForProject(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.SearchByDropdown(), 35);
        Browser.waitForSeconds(3);
        Browser.click(BookUnitPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(BookUnitPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains("اسم المشروع")) {
                options.click();
                break;
            }
        }
        Browser.waitForSeconds(3);
        Browser.click(BookUnitPageObjects.ProjectNameInput());
        Browser.setText(BookUnitPageObjects.ProjectNameInput(), projectName);
        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.SelectProjectFromDropdown());
        Browser.click(BookUnitPageObjects.SearchProjectButton());
        logger.addScreenshot("Project name to select: " + projectName);
    }

    public void clickSelectProjectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.SelectProjectButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.SelectProjectButton(), 30);
        Browser.click(BookUnitPageObjects.SelectProjectButton());
    }


    public void SearchUnit(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.SearchByDropdown(), 35);
        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(BookUnitPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains("رمز الوحدة")) {
                options.click();
                break;
            }
        }
        Browser.waitForSeconds(3);
        Browser.click(BookUnitPageObjects.UnitCodeInput());
        Browser.setText(BookUnitPageObjects.UnitCodeInput(), unitCode);
        Browser.click(BookUnitPageObjects.SearchProjectButton());
        logger.addScreenshot("");
    }


    public void clickOnViewUnitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ViewUnitButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.ViewUnitButton(), 30);
        Browser.click(BookUnitPageObjects.ViewUnitButton());
    }

    public void clickSelectAndContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.SelectAndContinueButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.SelectAndContinueButton(), 30);
        Browser.click(BookUnitPageObjects.SelectAndContinueButton());
        Browser.waitForSeconds(2);
        if (Browser.isElementPresent(BookUnitPageObjects.BookingFeesPopUp())) {
            Browser.click(BookUnitPageObjects.BookingFeesPopUp());
        }
    }

    public void clickContiueBookingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ContinueBookingButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.ContinueBookingButton(), 30);
        Browser.click(BookUnitPageObjects.ContinueBookingButton());
        logger.addScreenshot("");
    }

    public void selectBankName(String bankName) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.SearchByDropdown(), 35);
        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.SearchByDropdown());
        List<WebElement> list = Browser.getWebElements(BookUnitPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            if (options.getText().contains(bankName)) {
                Browser.waitForSeconds(1);
                options.click();
                break;
            }
        }
    }


    public void clickConfirmAndBookButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ConfirmAndBookButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.ConfirmAndBookButton(), 30);
        Browser.click(BookUnitPageObjects.ConfirmAndBookButton());
    }

    public void assertConfirmationPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ConfirmationPopUp(), 30);
        Assert.assertTrue(Browser.isElementDisplayed(BookUnitPageObjects.ConfirmationPopUp()));
        logger.addScreenshot("");
    }

    public void clickConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ConfirmButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.ConfirmButton(), 30);
        Browser.click(BookUnitPageObjects.ConfirmButton());
    }

    public void assertBookingCofirmedText() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.BookingConfirmedText(), 30);
        Assert.assertTrue(Browser.isElementDisplayed(BookUnitPageObjects.BookingConfirmedText()));
        logger.addScreenshot("");
    }

    public void verifyUserIsEligible(String eligibility) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.EligibilityStatusText(), 30);
        WebElement element = Browser.getWebElement(BookUnitPageObjects.EligibilityStatusText());
        boolean status = false;
        String actualStatus = element.getText();
        if(actualStatus.contains(eligibility)){
            status = true;
        }
        Assert.assertTrue(status, "The user is not eligible");
        Browser.waitForSeconds(2);
        logger.addScreenshot("User eligibility status is: " + actualStatus);
    }

    public void clickOnCancelBookingButton() throws Exception{
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.CancelBookingButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.CancelBookingButton(), 30);
        Browser.click(BookUnitPageObjects.CancelBookingButton());
    }

    public void clickOnViewBookingDetails() throws Exception{
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ViewBookingDetailsButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.ViewBookingDetailsButton(), 30);
        Browser.click(BookUnitPageObjects.ViewBookingDetailsButton());
    }

    public void selectReasonOfCancellation(String reason) throws Exception{
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.ReasonOfCancellationDropdown(), 35);
        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.ReasonOfCancellationDropdown());
        List<WebElement> list = Browser.getWebElements(BookUnitPageObjects.ReasonOfCancellationDropdownOptions());
        for (WebElement options : list) {
            if (options.getText().contains(reason)) {
                options.click();
                break;
            }
        }
    }

    public void clickNoButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.NoButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.NoButton(), 30);
        Browser.click(BookUnitPageObjects.NoButton());
    }

    public void clickYesButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.YesButton(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.YesButton(), 30);
        Browser.click(BookUnitPageObjects.YesButton());
    }


    public void enterVerificationOTP(String otp) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.InputOTP(), 30);
        Browser.waitUntilElementToBeClickable(BookUnitPageObjects.InputOTP(), 30);
        Browser.setText(BookUnitPageObjects.InputOTP(), otp);
        logger.addScreenshot("");
    }

    public void clickOnVerifyOTPButton() throws Exception{
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.VerifyOTPButton(), 30);
        Browser.waitUntilElementToBeClickable(RegistrationAndLoginPageObjects.VerifyOTPButton(), 30);
        Browser.click(RegistrationAndLoginPageObjects.VerifyOTPButton());
    }

    public void assertCancellationText() throws Exception{
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.BookingCancelledText(), 30);
        Assert.assertTrue(Browser.isElementDisplayed(BookUnitPageObjects.BookingCancelledText()), "Booking Cancelled pop up is not appearing");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Cancelled Booking message");
    }

    public void verifyBookingIsNotAvailable() throws Exception{
        Browser.waitForSeconds(2);
        boolean status = false;
        if(!(Browser.isElementPresent(BookUnitPageObjects.ViewBookingDetailsButton()))){
            status = true;
        }
        Assert.assertTrue((status), "Booking is not cancelled");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Booking has been cancelled successfully");
    }

}
