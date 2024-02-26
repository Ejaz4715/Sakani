package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class RegistrationAndLogin extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void RegisterAsAnIndividualDelegate(Map<String, String> data) throws Exception{
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
    public void ActivateIndividualAccount(Map<String, String> data) throws Exception{
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
        app.registrationAndLogin.clickOnUserManagement();
        app.registrationAndLogin.searchForUser(data.get("National_id"));
        app.registrationAndLogin.clickOnSearchButton();
        logger.info("Step 06: Verify status has been changed to Active");
        app.registrationAndLogin.verifyStatusOfAccount("نشط");
//        app.registrationAndLogin.clickOnApplyRoleButton();
    }


    @Test(dataProvider = "testDataProvider", testName = "TC_1_login to Sakani Partners as an Individual ")
    public void LoginAsAnIndividual(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        app.registrationAndLogin.verifyHomePageIsAppearing();
    }

    @Test(dataProvider = "testDataProvider", testName = "TC_2_login to Sakani Partners as a Company ")
    public void LoginAsACompany(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.closeUpdatesPopUp();
        app.registrationAndLogin.verifyHomePageIsAppearing();
    }
}
