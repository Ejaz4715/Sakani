package sa.nhc.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.CreateAndPublishProjectPageObjects;
import sa.nhc.web.objects.RegistrationAndLoginPageObjects;
import sa.nhc.web.objects.BookUnitPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;


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

    public void clickOnCompany() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.CompanyRegistration(), 20);
        Browser.click(RegistrationAndLoginPageObjects.CompanyRegistration());
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
//        while (!(Browser.isElementPresent(RegistrationAndLoginPageObjects.DelegateRegistration()))){
//            Browser.click(RegistrationAndLoginPageObjects.NextButton());
//            Browser.waitForSeconds(1);
//        }
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
        Browser.waitForSeconds(3);
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
        Browser.waitForSeconds(2);
        logger.addScreenshot("Registration message: " + message);
    }

    public void clickOnUserManagement() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.UserManagementOption(), 20);
        Browser.click(RegistrationAndLoginPageObjects.UserManagementOption());
    }

    public void searchForUser(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookUnitPageObjects.SearchByDropdown(), 30);
        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.SearchByDropdown());

        List<WebElement> list = Browser.getWebElements(BookUnitPageObjects.SearchByDropdownOptions());
        for (WebElement options : list) {
            System.out.println(options.getText());
            if (options.getText().contains("رقم الهوية")) {
                options.click();
                break;
            }
        }

        Browser.waitForSeconds(2);
        Browser.click(BookUnitPageObjects.NationalIdSearchInput());
        Browser.setText(BookUnitPageObjects.NationalIdSearchInput(), nationalId);
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
        Browser.waitForSeconds(2);
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


    public void closePopUp() throws Exception{
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.SakaniLogo(), 30);
        if(Browser.isElementPresent(RegistrationAndLoginPageObjects.UpdatesPopUp())){
            Browser.click(RegistrationAndLoginPageObjects.UpdatesPopUp());
        }
        else if (Browser.isElementPresent(RegistrationAndLoginPageObjects.WarningPopUp())) {
            Browser.click(RegistrationAndLoginPageObjects.WarningPopUp());
        }
        else if (Browser.isElementPresent(RegistrationAndLoginPageObjects.AcceptButton())){
            Browser.click(RegistrationAndLoginPageObjects.AcceptButton());
        }
    }

    public void selectCompanyPartnerType() throws Exception{
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.CompanyType(), 30);
        List<WebElement> typeList = Browser.getWebElements(RegistrationAndLoginPageObjects.CompanyType());
        for (WebElement element : typeList){
            element.click();
        }
    }

    public void navigateToCompaniesUnderPartners() throws Exception{
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.Hover(), 20);
        Browser.moveToElement(CreateAndPublishProjectPageObjects.Hover());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.PartnersOption(), 20);
        Browser.click(CreateAndPublishProjectPageObjects.PartnersOption());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.CompaniesOption(), 20);
        Browser.click(CreateAndPublishProjectPageObjects.CompaniesOption());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Companies page of Partners");
    }

    public void navigateToDelegators() throws Exception{
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DelegatorsTab(), 20);
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.DelegatorsTab());
    }


    public void enterCompanyCRNumber(String CR_number) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.CompanyCRNumberInput(), 20);
        Browser.waitForSeconds(3);
        Browser.setText(CreateAndPublishProjectPageObjects.CompanyCRNumberInput(), CR_number);
    }

    public void verifyApprovalStatus(String status) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.ApprovalStatus(), 20);
        Browser.waitForSeconds(2);

        WebElement ele = Browser.getWebElement(CreateAndPublishProjectPageObjects.ApprovalStatus());
        String actualStatus = ele.getText();
        boolean match = false ;
        if (actualStatus.contains(status)){
            match = true;
        }
        Assert.assertTrue(match, "Approval Status is: " + actualStatus);
        Browser.waitForSeconds(2);
        logger.addScreenshot("Approval status is: " + actualStatus);
    }

    public void clickOnApprovalStatus() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.ApprovalStatus(), 20);
        Browser.click(CreateAndPublishProjectPageObjects.ApprovalStatus());
    }


    public void clickOnApproveButton() throws Exception{
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.ApproveButton(), 20);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.ApproveButton());
    }

    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.ConfirmButton(), 20);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.ConfirmButton());
    }

    public void selectRole(String role) throws Exception{
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.RoleDropdown(), 20);
        Browser.click(RegistrationAndLoginPageObjects.RoleDropdown());
        List <WebElement> roleList =  Browser.getWebElements(RegistrationAndLoginPageObjects.RoleDropdownOptions());

        for (WebElement ele : roleList){
            String getRole = ele.getText();
            if(getRole.contains(role)){
                ele.click();
                break;
            }
        }
        logger.addScreenshot("Developer role has been selected");
    }

}

