package sa.nhc.sakani.web.login;

import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;

import java.util.Map;

public class RegistrationAndLoginPartners extends NHSSakaniWebTest {

    @Test(dataProvider = "testDataProvider")
    public void RegisterAsAnIndividualDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
//        //app.registrationAndLoginPartners.loginToSakani();
        logger.info("Step 01: Navigate to Registration page > Select Individual");
        app.registrationAndLoginPartners.clickOnRegisterButton();
        app.registrationAndLoginPartners.clickOnIndividual();
        logger.info("Step 02: Input valid CR number > click Next and select Delegate");
        app.registrationAndLoginPartners.enterCRNumber(data.get("CR_number"));
        app.registrationAndLoginPartners.clickOnNextButton();
        app.registrationAndLoginPartners.clickOnDelegate();
        logger.info("Step 03: Enter National ID and DOB");
        app.registrationAndLoginPartners.enterNationalId(data.get("National_id"));
        app.registrationAndLoginPartners.enterDOB(data.get("DOB"));
        app.registrationAndLoginPartners.clickOnNextButton();
        logger.info("Step 04: Upload attachment");
        app.registrationAndLoginPartners.uploadAttachment(data.get("AttachmentPDF"));
        app.registrationAndLoginPartners.clickOnNextButton();
        app.registrationAndLoginPartners.inputOTP();
        logger.info("Step 05: Fill information form");
        app.registrationAndLoginPartners.enterMobileNumber(data.get("Mob_number"));
        app.registrationAndLoginPartners.enterEmail();
        app.registrationAndLoginPartners.enterPasswordAndVerifyPassword(data.get("Password"));
        app.registrationAndLoginPartners.clickOnCheckBox();
        logger.info("Step 06: Click Register button");
        app.registrationAndLoginPartners.clickOnRegisterButton();
        app.registrationAndLoginPartners.assertCongratulationsMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void ActivateIndividualAccount(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.verifyHomePageIsAppearing();
        logger.info("Step 02: Navigate to User Management page");
        app.registrationAndLoginPartners.clickOnUserManagement();
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 03: Search for the user with national id");
        app.registrationAndLoginPartners.searchForUser(data.get("National_id"));
        app.registrationAndLoginPartners.clickOnSearchButton();
        app.registrationAndLoginPartners.verifyStatusOfAccount("غير نشط");
        logger.info("Step 04: Navigate to details of the user");
        app.registrationAndLoginPartners.clickOnUserDetailsIcon();
        logger.info("Step 05: Change the status to Active");
        app.registrationAndLoginPartners.clickOnStatusDropdown();
        app.registrationAndLoginPartners.selectActiveStatusFromDropdown("نشط");
        logger.info("Step 06: Give Company Admin role");
        app.registrationAndLoginPartners.clickOnCompanyAdminRadioButton();
        app.registrationAndLoginPartners.clickOnApplyRoleButton();
        app.registrationAndLoginPartners.clickOnUserManagement();
        app.registrationAndLoginPartners.searchForUser(data.get("National_id"));
        app.registrationAndLoginPartners.clickOnSearchButton();
        logger.info("Step 06: Verify status has been changed to Active");
        app.registrationAndLoginPartners.verifyStatusOfAccount("نشط");
    }

    @Test(dataProvider = "testDataProvider")
    public void LoginAsAnIndividual(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 02: Verify Homepage is visible to the user");
        app.registrationAndLoginPartners.verifyHomePageIsAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void RegisterAsACompanyDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
//        //app.registrationAndLoginPartners.loginToSakani();
        logger.info("Step 01: Navigate to Registration page > Select Individual");
        app.registrationAndLoginPartners.clickOnRegisterButton();
        app.registrationAndLoginPartners.clickOnCompany();
        logger.info("Step 02: Input valid CR number > click Next and select Delegate");
        app.registrationAndLoginPartners.enterCRNumber(data.get("CR_number"));
        app.registrationAndLoginPartners.clickOnNextButton();
        app.registrationAndLoginPartners.clickOnDelegate();
        logger.info("Step 03: Enter National ID and DOB");
        app.registrationAndLoginPartners.enterNationalId(data.get("National_id"));
        app.registrationAndLoginPartners.enterDOB(data.get("DOB"));
        app.registrationAndLoginPartners.clickOnNextButton();
        logger.info("Step 04: Upload attachment");
        app.registrationAndLoginPartners.uploadAttachment(data.get("AttachmentPDF"));
        app.registrationAndLoginPartners.clickOnNextButton();
        app.registrationAndLoginPartners.inputOTP();
        logger.info("Step 05: Select Company Partner type");
        app.registrationAndLoginPartners.selectCompanyPartnerType();
        app.registrationAndLoginPartners.clickOnNextButton();
        logger.info("Step 06: Fill information form");
        app.registrationAndLoginPartners.enterMobileNumber(data.get("Mob_number"));
        app.registrationAndLoginPartners.enterEmail();
        app.registrationAndLoginPartners.enterPasswordAndVerifyPassword(data.get("Password"));
        app.registrationAndLoginPartners.clickOnCheckBox();
        logger.info("Step 07: Click Register button");
        app.registrationAndLoginPartners.clickOnRegisterButton();
        app.registrationAndLoginPartners.assertCongratulationsMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void ActivateCompanyAccountDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.newMethods.LoginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to Companies page");
        app.registrationAndLoginPartners.navigateToCompaniesUnderPartners();
        logger.info("Step 03: Navigate to Delegators page");
        app.registrationAndLoginPartners.navigateToDelegators();
        logger.info("Step 04: Input CR number and verify approval status is Pending");
        app.registrationAndLoginPartners.enterCompanyCRNumber(data.get("CR_number"));
        app.registrationAndLoginPartners.verifyApprovalStatus("قيد الانتظار");
        logger.info("Step 05: Approve the request");
        app.registrationAndLoginPartners.clickOnApprovalStatus();
        app.registrationAndLoginPartners.clickOnApproveButton();
        app.registrationAndLoginPartners.clickOnConfirmButton();
        logger.info("Step 05: Verify approval status is Approved");
        app.registrationAndLoginPartners.enterCompanyCRNumber(data.get("CR_number"));
        app.registrationAndLoginPartners.verifyApprovalStatus("وافق");
    }

    @Test(dataProvider = "testDataProvider", testName = "TC_2_login to Sakani Partners as a Company ")
    public void LoginAsACompanyDelegate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
//        //app.registrationAndLoginPartners.loginToSakani();
        app.registrationAndLoginPartners.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLoginPartners.inputOTP();
        logger.info("Step 02: Select the Developer role for the user");
        app.registrationAndLoginPartners.closePopUp();
        app.registrationAndLoginPartners.selectRole("شركة تطوير عقارية");
        app.registrationAndLoginPartners.closePopUp();
        logger.info("Step 03: Verify Homepage is visible to the user");
        app.registrationAndLoginPartners.verifyHomePageIsAppearing();
    }
}
