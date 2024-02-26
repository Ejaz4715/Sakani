package sa.nhc.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.commons.collections.functors.WhileClosure;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.RegistrationAndLoginPageObjects;
import sa.nhc.web.objects.UnitBookingPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.driver;


public class RegistrationAndLoginPage {

    /*
     * Login through Sakani alert box
     * */
    public void loginToSakani() throws AWTException {
        TCRobot robot = new TCRobot();
        robot.setText("sakani");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_TAB);
        Browser.waitForSeconds(1);
        robot.setText("together we build Vision 2030");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitForSeconds(8);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
    }

    /**
     * Method to Log in to Sakani Partners
     *
     * @param id       - user national id
     * @param password - user password
     */
    public void loginToSakaniPartners(String id, String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.LoginButton(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.UserNameInput(), id);
        Browser.setText(RegistrationAndLoginPageObjects.UserPasswordInput(), password);
        Browser.click(RegistrationAndLoginPageObjects.LoginButton());
    }

    public void inputOTP() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.OTPInput(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.OTPInput(), "1234");
        Browser.click(RegistrationAndLoginPageObjects.VerifyOTPButton());
    }

    /**
     * Method to verify homepage is appearing after user login
     */
    public void verifyHomePageIsAppearing() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.SakaniLogo(), 20);
        Browser.waitForSeconds(2);
        Assert.assertTrue(Browser.isElementDisplayed(RegistrationAndLoginPageObjects.SakaniLogo()), "Login Successful");
        logger.addScreenshot("Login to Sakani Partners");
    }

    /**
     * Method to read and edit the update unit template file
     *
     * @param projectCode   - Project code of the unit
     * @param productCode   - Unit code that needs to be updated
     * @param newUnitStatus - New status to be given to the unit
     */
    public void editTemplateFile(String projectCode, String productCode, String newUnitStatus) throws IOException {
        String home = System.getProperty("user.home");
        String filePath = home + "\\Downloads\\update_unit_template_inactive.xlsx";
        FileInputStream fileRead = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileRead);
        System.out.println("File is opened");
        Sheet sheet = workbook.getSheetAt(0);

        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);


        Row row = sheet.createRow(lastRowNum - 7);
        for (int i = 0; i < 3; i++) {
            Cell cell = row.createCell(i);

            switch (i) {
                case 0:

                    cell.setCellValue(projectCode);
                    break;
                case 1:
                    cell.setCellValue(productCode);
                    break;
                case 2:
                    cell.setCellValue(newUnitStatus);
                    break;
                default:
                    System.out.println("Error occurred while writing to excel template ");
            }
        }
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
    }


    public void clickOnRegisterButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.RegisterButton(), 20);
        Browser.click(RegistrationAndLoginPageObjects.RegisterButton());
    }

    public void clickOnIndividual() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.IndividualRegistration(), 20);
        Browser.click(RegistrationAndLoginPageObjects.IndividualRegistration());
    }

    public void enterCRNumber(String CR_Number) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.CRNumberInputField(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.CRNumberInputField(), CR_Number);
        Browser.waitForSeconds(2);
        logger.addScreenshot("Entered CR number: " + CR_Number);
    }

    public void clickOnNextButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.NextButton(), 20);
        Browser.click(RegistrationAndLoginPageObjects.NextButton());
    }


    public void clickOnDelegate() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.DelegateRegistration(), 20);
        Browser.click(RegistrationAndLoginPageObjects.DelegateRegistration());
    }

    public void enterNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.NationalIdInput(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.NationalIdInput(), nationalId);
    }

    public void enterDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.DOBInput(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.DOBInput(), DOB);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void uploadAttachment(String attachmentPDF) throws Exception {
        Browser.waitForSeconds(5);
        WebElement attachment = Browser.getWebElement(RegistrationAndLoginPageObjects.AttachmentInput());
        String filepath = System.getProperty("user.dir") + attachmentPDF;
        attachment.sendKeys(filepath);
    }

    public void enterMobileNumber(String mobNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.MobileNumberInput(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.MobileNumberInput(), mobNumber);
    }

    public void enterEmail() throws Exception {
        // random string of length 8 composed of alphabetic characters
        String email = RandomStringUtils.randomAlphabetic(8) + "@email.com";
        Browser.setText(RegistrationAndLoginPageObjects.EmailInput(), email);
    }

    public void enterPasswordAndVerifyPassword(String password) throws Exception {
        Browser.setText(RegistrationAndLoginPageObjects.UserPasswordInput(), password);
        Browser.setText(RegistrationAndLoginPageObjects.VerifyPasswordInput(), password);
    }

    public void clickOnCheckBox() throws Exception {
//        Browser.click(RegistrationAndLoginPageObjects.TermsAndConditionsCheckbox());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('label.form-check-label', 'before').click();");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void assertCongratulationsMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.CongratulationText(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RegistrationAndLoginPageObjects.CongratulationText()));
        String message = Browser.getWebElement(RegistrationAndLoginPageObjects.CongratulationText()).getText();
        logger.addScreenshot("Registration message: " + message);
    }

    public void clickOnUserManagement() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.UserManagementOption(), 20);
        Browser.click(RegistrationAndLoginPageObjects.UserManagementOption());
    }

    public void searchForUser(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(UnitBookingPageObjects.SearchByDropdown(), 30);
        Browser.waitForSeconds(2);
        Browser.click(UnitBookingPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(UnitBookingPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains("رقم الهوية")) {
                options.click();
                break;
            }
        }

        Browser.waitForSeconds(2);
        Browser.click(UnitBookingPageObjects.NationalIdSearchInput());
        Browser.setText(UnitBookingPageObjects.NationalIdSearchInput(), nationalId);
    }

    public void clickOnSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.SearchButton(), 20);
        Browser.click(RegistrationAndLoginPageObjects.SearchButton());
    }

    public void clickOnUserDetailsIcon() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.UserDetailsIcon(), 20);
        Browser.click(RegistrationAndLoginPageObjects.UserDetailsIcon());
    }

    public void clickOnStatusDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.StatusDropdown(), 50);
        WebElement element = Browser.getWebElement(RegistrationAndLoginPageObjects.StatusDropdown());
        Browser.waitForSeconds(1);
        element.click();
    }

    public void selectActiveStatusFromDropdown(String status) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.StatusDropdownOptions(), 50);
        List<WebElement> list = Browser.getWebElements(RegistrationAndLoginPageObjects.StatusDropdownOptions());
        for (WebElement options : list) {
            if (options.getText().contains(status)) {
                options.click();
                break;
            }
        }

    }


    public void clickOnCompanyAdminRadioButton() throws Exception {
//        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.AdminRadioButton(), 20);
//        Browser.click(RegistrationAndLoginPageObjects.AdminRadioButton());
        Browser.waitForSeconds(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('label.switch').click();");
        Browser.waitForSeconds(2);
        logger.addScreenshot("Admin role is given to the user and up");
    }

    public void clickOnApplyRoleButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.ApplyRoleButton(), 20);
        Browser.click(RegistrationAndLoginPageObjects.ApplyRoleButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Account is Activated");
    }

    public void verifyStatusOfAccount(String status) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.AccountStatusText(), 20);
        WebElement element = Browser.getWebElement(RegistrationAndLoginPageObjects.AccountStatusText());
        boolean st = false;
        String actualStatus = element.getText();
        if (actualStatus.contains(status)) {
            st = true;
        }
        Assert.assertTrue(st, "Account status is: " + actualStatus);
        Browser.waitForSeconds(2);
        logger.addScreenshot("Account status is: " + actualStatus);
    }


    public void closeUpdatesPopUp() throws Exception{
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.SakaniLogo(), 30);
        if(Browser.isElementPresent(RegistrationAndLoginPageObjects.UpdatesPopUp())){
            Browser.click(RegistrationAndLoginPageObjects.UpdatesPopUp());
        }
    }
}

