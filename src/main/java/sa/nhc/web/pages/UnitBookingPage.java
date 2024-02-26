package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.UnitBookingPageObjects;

import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;


public class UnitBookingPage extends WebBasePage {

    public void navigateToNewBookingPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.BookingManagementOption(), 35);
        Browser.click(UnitBookingPageObjects.BookingManagementOption());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.NewBookingButton(), 35);
        Browser.click(UnitBookingPageObjects.NewBookingButton());
        logger.addScreenshot("");
    }

    public void enterNationalIDAndSearch(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.NationalIDInput(), 35);
        Browser.setText(UnitBookingPageObjects.NationalIDInput(), nationalId);
        Browser.click(UnitBookingPageObjects.SearchButton());
    }
    public void clickOnStartBookingButton() throws Exception{
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.StartBookingButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.StartBookingButton(), 30);
        Browser.click(UnitBookingPageObjects.StartBookingButton());
    }

    public void searchForProject(String projectName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.SearchByDropdown(), 35);
        Browser.waitForSeconds(3);
        Browser.click(UnitBookingPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(UnitBookingPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains("اسم المشروع")) {
                options.click();
                break;
            }
        }
        Browser.waitForSeconds(3);
        Browser.click(UnitBookingPageObjects.ProjectNameInput());
        Browser.setText(UnitBookingPageObjects.ProjectNameInput(), projectName);
        Browser.waitForSeconds(2);
        Browser.click(UnitBookingPageObjects.SelectProjectFromDropdown());
        Browser.click(UnitBookingPageObjects.SearchProjectButton());
        logger.addScreenshot("Project name to select: " + projectName);
    }

    public void clickSelectProjectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.SelectProjectButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.SelectProjectButton(), 30);
        Browser.click(UnitBookingPageObjects.SelectProjectButton());
    }


    public void SearchUnit(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.SearchByDropdown(), 35);
        Browser.waitForSeconds(2);
        Browser.click(UnitBookingPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(UnitBookingPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains("رمز الوحدة")) {
                options.click();
                break;
            }
        }
        Browser.waitForSeconds(3);
        Browser.click(UnitBookingPageObjects.UnitCodeInput());
        Browser.setText(UnitBookingPageObjects.UnitCodeInput(), unitCode);
        Browser.click(UnitBookingPageObjects.SearchProjectButton());
        logger.addScreenshot("");
    }


    public void clickOnViewUnitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.ViewUnitButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.ViewUnitButton(), 30);
        Browser.click(UnitBookingPageObjects.ViewUnitButton());
    }

    public void clickSelectAndContinueButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.SelectAndContinueButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.SelectAndContinueButton(), 30);
        Browser.click(UnitBookingPageObjects.SelectAndContinueButton());
        Browser.waitForSeconds(2);
        if (Browser.isElementPresent(UnitBookingPageObjects.BookingFeesPopUp())) {
            Browser.click(UnitBookingPageObjects.BookingFeesPopUp());
        }
    }

    public void clickContiueBookingButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.ContinueBookingButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.ContinueBookingButton(), 30);
        Browser.click(UnitBookingPageObjects.ContinueBookingButton());
        logger.addScreenshot("");
    }

    public void selectBankName(String bankName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.SearchByDropdown(), 35);
        Browser.waitForSeconds(2);
        Browser.click(UnitBookingPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(UnitBookingPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains(bankName)) {
                options.click();
                break;
            }
        }
    }


    public void clickConfirmAndBookButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.ConfirmAndBookButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.ConfirmAndBookButton(), 30);
        Browser.click(UnitBookingPageObjects.ConfirmAndBookButton());
    }

    public void assertConfirmationPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.ConfirmationPopUp(), 30);
        Assert.assertTrue(Browser.isElementDisplayed(UnitBookingPageObjects.ConfirmationPopUp()));
        logger.addScreenshot("");
    }

    public void clickConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.ConfirmButton(), 30);
        Browser.waitUntilElementToBeClickable(UnitBookingPageObjects.ConfirmButton(), 30);
        Browser.click(UnitBookingPageObjects.ConfirmButton());
    }

    public void assertBookingCofirmedText() throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.BookingConfirmedText(), 30);
        Assert.assertTrue(Browser.isElementDisplayed(UnitBookingPageObjects.BookingConfirmedText()));
        logger.addScreenshot("");
    }

    public void verifyUserIsEligible(String eligibility) throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.EligibilityStatusText(), 30);
        WebElement element = Browser.getWebElement(UnitBookingPageObjects.EligibilityStatusText());
        boolean status = false;
        String actualStatus = element.getText();
        if(actualStatus.contains(eligibility)){
            status = true;
        }
        Assert.assertTrue(status, "The user is not eligible");
        Browser.waitForSeconds(2);
        logger.addScreenshot("User eligibility status is: " + actualStatus);
    }
}
