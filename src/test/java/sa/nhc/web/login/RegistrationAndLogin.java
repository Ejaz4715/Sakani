package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class RegistrationAndLogin extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void RegisterAsAnIndividualDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.registrationAndLogin.loginToSakani();
        logger.info("Step 01: Navigate to Registration page > Select Individual");
        app.registrationAndLogin.clickOnRegisterButton();
        app.registrationAndLogin.clickOnIndividual();
        logger.info("Step 02: Input valid CR number > click Next and select Delegate");
        app.registrationAndLogin.enterCRNumber(data.get("CR_number"));
        app.registrationAndLogin.clickOnNextButton();
        app.registrationAndLogin.clickOnDelegate();
        logger.info("Step 03: Enter National ID and DOB");
        app.registrationAndLogin.enterNationalId(data.get("National_id"));
        app.registrationAndLogin.enterDOB(data.get("DOB"));
        app.registrationAndLogin.clickOnNextButton();
        logger.info("Step 04: Upload attachment");
        app.registrationAndLogin.uploadAttachment(data.get("AttachmentPDF"));
        app.registrationAndLogin.clickOnNextButton();
        app.registrationAndLogin.inputOTP();
        logger.info("Step 05: Fill information form");
        app.registrationAndLogin.enterMobileNumber(data.get("Mob_number"));
        app.registrationAndLogin.enterEmail();
        app.registrationAndLogin.enterPasswordAndVerifyPassword(data.get("Password"));
        app.registrationAndLogin.clickOnCheckBox();
        logger.info("Step 06: Click Register button");
        app.registrationAndLogin.clickOnRegisterButton();
        app.registrationAndLogin.assertCongratulationsMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void ActivateIndividualAccount(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        app.registrationAndLogin.verifyHomePageIsAppearing();
        logger.info("Step 02: Navigate to User Management page");
        app.registrationAndLogin.clickOnUserManagement();
        logger.info("Step 03: Search for the user with national id");
        app.registrationAndLogin.searchForUser(data.get("National_id"));
        app.registrationAndLogin.clickOnSearchButton();
        app.registrationAndLogin.verifyStatusOfAccount("غير نشط");
        logger.info("Step 04: Navigate to details of the user");
        app.registrationAndLogin.clickOnUserDetailsIcon();
        logger.info("Step 05: Change the status to Active");
        app.registrationAndLogin.clickOnStatusDropdown();
        app.registrationAndLogin.selectActiveStatusFromDropdown("نشط");
        logger.info("Step 06: Give Company Admin role");
        app.registrationAndLogin.clickOnCompanyAdminRadioButton();
        app.registrationAndLogin.clickOnApplyRoleButton();
        app.registrationAndLogin.clickOnUserManagement();
        app.registrationAndLogin.searchForUser(data.get("National_id"));
        app.registrationAndLogin.clickOnSearchButton();
        logger.info("Step 06: Verify status has been changed to Active");
        app.registrationAndLogin.verifyStatusOfAccount("نشط");
    }

    @Test(dataProvider = "testDataProvider")
    public void LoginAsAnIndividual(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 02: Verify Homepage is visible to the user");
        app.registrationAndLogin.verifyHomePageIsAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void RegisterAsACompanyDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.registrationAndLogin.loginToSakani();
        logger.info("Step 01: Navigate to Registration page > Select Individual");
        app.registrationAndLogin.clickOnRegisterButton();
        app.registrationAndLogin.clickOnCompany();
        logger.info("Step 02: Input valid CR number > click Next and select Delegate");
        app.registrationAndLogin.enterCRNumber(data.get("CR_number"));
        app.registrationAndLogin.clickOnNextButton();
        app.registrationAndLogin.clickOnDelegate();
        logger.info("Step 03: Enter National ID and DOB");
        app.registrationAndLogin.enterNationalId(data.get("National_id"));
        app.registrationAndLogin.enterDOB(data.get("DOB"));
        app.registrationAndLogin.clickOnNextButton();
        logger.info("Step 04: Upload attachment");
        app.registrationAndLogin.uploadAttachment(data.get("AttachmentPDF"));
        app.registrationAndLogin.clickOnNextButton();
        app.registrationAndLogin.inputOTP();
        logger.info("Step 05: Select Company Partner type");
        app.registrationAndLogin.selectCompanyPartnerType();
        app.registrationAndLogin.clickOnNextButton();
        logger.info("Step 06: Fill information form");
        app.registrationAndLogin.enterMobileNumber(data.get("Mob_number"));
        app.registrationAndLogin.enterEmail();
        app.registrationAndLogin.enterPasswordAndVerifyPassword(data.get("Password"));
        app.registrationAndLogin.clickOnCheckBox();
        logger.info("Step 07: Click Register button");
        app.registrationAndLogin.clickOnRegisterButton();
        app.registrationAndLogin.assertCongratulationsMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void ActivateCompanyAccountDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.registrationAndLogin.loginToSakani();
        app.loginPage.userLoginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to Companies page");
        app.registrationAndLogin.navigateToCompaniesUnderPartners();
        logger.info("Step 03: Navigate to Delegators page");
        app.registrationAndLogin.navigateToDelegators();
        logger.info("Step 04: Input CR number and verify approval status is Pending");
        app.registrationAndLogin.enterCompanyCRNumber(data.get("CR_number"));
        app.registrationAndLogin.verifyApprovalStatus("قيد الانتظار");
        logger.info("Step 05: Approve the request");
        app.registrationAndLogin.clickOnApprovalStatus();
        app.registrationAndLogin.clickOnApproveButton();
        app.registrationAndLogin.clickOnConfirmButton();
        logger.info("Step 05: Verify approval status is Approved");
        app.registrationAndLogin.enterCompanyCRNumber(data.get("CR_number"));
        app.registrationAndLogin.verifyApprovalStatus("وافق");
    }

    @Test(dataProvider = "testDataProvider", testName = "TC_2_login to Sakani Partners as a Company ")
    public void LoginAsACompanyDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        logger.info("Step 02: Select the Developer role for the user");
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        logger.info("Step 03: Verify Homepage is visible to the user");
        app.registrationAndLogin.verifyHomePageIsAppearing();
    }
}
