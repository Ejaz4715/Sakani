package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class UpdateUnit extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void AddCompanyAsDeveloper(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.registrationAndLogin.loginToSakani();
        app.loginPage.userLoginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to Developers page, Add a developer");
        app.updateUnitPage.navigateToDevelopersPage();
        app.updateUnitPage.clickOnAddDeveloperButton();
        logger.info("Step 03: Enter Developers Name, Real Name, CR Number, Description and Select status");
        app.updateUnitPage.enterName(data.get("Company_Name"));
        app.updateUnitPage.enterRealName(data.get("Company_Name"));
        app.updateUnitPage.enterCrNumber(data.get("CR_Number"));
        app.updateUnitPage.enterDescription("Automation test");
        app.updateUnitPage.selectStatusOfDeveloper("نشط");
        logger.info("Step 04: Press Save button");
        app.updateUnitPage.clickOnSaveButton();
        logger.info("Step 05: Verify pop up confirmation message and developer name");
        app.updateUnitPage.verifyConfirmationPopUp();
        app.updateUnitPage.searchForDeveloper(data.get("Company_Name"));
        app.updateUnitPage.verifyDeveloperIsAdded(data.get("Company_Name"));
    }

    @Test(dataProvider = "testDataProvider")
    public void LinkProjectWithTheAddedDeveloper(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.registrationAndLogin.loginToSakani();
        app.loginPage.userLoginAsAdmin(data.get("Username"), data.get("Password"));
        logger.info("Step 02: Navigate to Projects page, search for the project and view details");
        app.updateUnitPage.NavigateToProjectsPage();
        app.updateUnitPage.enterProjectCode(data.get("Project_Code"));
        app.updateUnitPage.clickOnProjectSearchButton();
        app.updateUnitPage.viewDetailsOfProject();
        logger.info("Step 03: Change Developer name");
        app.updateUnitPage.changeDeveloperName(data.get("Company_Name"));
        logger.info("Step 04: Enter IBAN and Bank name");
        app.updateUnitPage.enterIBAN(data.get("IBAN"));
        app.updateUnitPage.selectBankName(data.get("Bank_Name"));
        logger.info("Step 05: Press Save button");
        app.updateUnitPage.clickOnSaveButton();
        logger.info("Step 06: Verify pop up confirmation message");
        app.updateUnitPage.verifyConfirmationPopUp();
    }

        @Test(dataProvider = "testDataProvider")
        public void VerifyTheStatusIsActive (Map<String, String> data) throws Exception{
            logger.info("Step 00: Test Data : " + data.toString());
            app.openApplication(data);
            logger.info("Step 01: Login to Sakani Partners");
            app.registrationAndLogin.loginToSakani();
            app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
            app.registrationAndLogin.inputOTP();
            app.registrationAndLogin.selectRole("شركة تطوير عقارية");
            app.registrationAndLogin.closeUpdatesPopUp();
            app.updateUnitPage.clickOnTheProjectsButton();
            logger.info("Step 02: Search For Project");
            app.updateUnitPage.clickOnAdvancedSearchRadioButton();
            app.updateUnitPage.clickOnProjectCode(data.get("Project_Code"));
            app.updateUnitPage.clickOnSearchButton();
            app.updateUnitPage.clickOnDetailsButton();
            app.updateUnitPage.clickOnUnitsDetailsButton();
            logger.info("Step 03: Search For Unit");
            app.updateUnitPage.clickOnSearchBy();
            app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
            app.updateUnitPage.clickOnSearchButton();
            logger.info("Step 04: Verify The Unit Status Before Update It");
            app.updateUnitPage.checkUnitStatusInactiveUpdate();
            app.updateUnitPage.clickOnUpdateUnitsButton();
            app.updateUnitPage.clickOnNewUpdateButton();
            logger.info("Step 05: Download The Unit Template And Upload It For Updating");
            app.updateUnitPage.clickOnDownloadTemplateButton();
            app.updateUnitPage.editTemplateFile(data.get("Project_Code"), data.get("Unit_Code"), data.get("Unit_Status"));
            app.updateUnitPage.clickOnUploadTemplateButton();
            app.updateUnitPage.clickOnAnalyzeTheFileButton();
            app.updateUnitPage.clickOnShowTheResultButton();
            app.updateUnitPage.clickOnCommitButton();
            logger.info("Step 06: Verify The Unit Status After Update It");
            app.updateUnitPage.clickOnTheProjectsButton();
            app.updateUnitPage.clickOnAdvancedSearchRadioButton();
            app.updateUnitPage.clickOnProjectCode(data.get("Project_Code"));
            app.updateUnitPage.clickOnSearchButton();
            app.updateUnitPage.clickOnDetailsButton();
            app.updateUnitPage.clickOnUnitsDetailsButton();
            app.updateUnitPage.clickOnSearchBy();
            app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
            app.updateUnitPage.clickOnSearchButton();
            app.updateUnitPage.checkUnitStatusActiveUpdate();
            app.updateUnitPage.deleteFile();

        }

    @Test(dataProvider = "testDataProvider")
    public void VerifyTheStatusIsInactive (Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        app.updateUnitPage.clickOnTheProjectsButton();
        logger.info("Step 02: Search For Project");
        app.updateUnitPage.clickOnAdvancedSearchRadioButton();
        app.updateUnitPage.clickOnProjectCode(data.get("Project_Code"));
        app.updateUnitPage.clickOnSearchButton();
        app.updateUnitPage.clickOnDetailsButton();
        app.updateUnitPage.clickOnUnitsDetailsButton();
        logger.info("Step 03: Search For Unit");
        app.updateUnitPage.clickOnSearchBy();
        app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
        app.updateUnitPage.clickOnSearchButton();
        logger.info("Step 04: Verify The Unit Status Before Update It");
        app.updateUnitPage.checkUnitStatusActiveUpdate();
        app.updateUnitPage.clickOnUpdateUnitsButton();
        logger.info("Step 05: Download The Unit Template And Upload It For Updating");
        app.updateUnitPage.clickOnNewUpdateButton();
        app.updateUnitPage.clickOnDownloadTemplateButton();
        app.updateUnitPage.editTemplateFile(data.get("Project_Code"), data.get("Unit_Code"), data.get("Unit_Status"));
        app.updateUnitPage.clickOnUploadTemplateButton();
        app.updateUnitPage.clickOnAnalyzeTheFileButton();
        app.updateUnitPage.clickOnShowTheResultButton();
        app.updateUnitPage.clickOnCommitButton();
        logger.info("Step 06: Verify The Unit Status After Update It");
        app.updateUnitPage.clickOnTheProjectsButton();
        app.updateUnitPage.clickOnAdvancedSearchRadioButton();
        app.updateUnitPage.clickOnProjectCode(data.get("Project_Code"));
        app.updateUnitPage.clickOnSearchButton();
        app.updateUnitPage.clickOnDetailsButton();
        app.updateUnitPage.clickOnUnitsDetailsButton();
        app.updateUnitPage.clickOnSearchBy();
        app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
        app.updateUnitPage.clickOnSearchButton();
        app.updateUnitPage.checkUnitStatusInactiveUpdate();
        app.updateUnitPage.deleteFile();

    }


    @Test(dataProvider = "testDataProvider")
    public void VerifyTheStatusCanNotBeChange (Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.registrationAndLogin.selectRole("شركة تطوير عقارية");
        app.registrationAndLogin.closeUpdatesPopUp();
        app.updateUnitPage.clickOnTheProjectsButton();
        logger.info("Step 02: Search For Project");
        app.updateUnitPage.clickOnAdvancedSearchRadioButton();
        app.updateUnitPage.clickOnProjectCode(data.get("Project_Code"));
        app.updateUnitPage.clickOnSearchButton();
        app.updateUnitPage.clickOnDetailsButton();
        app.updateUnitPage.clickOnUnitsDetailsButton();
        logger.info("Step 03: Search For Unit");
        app.updateUnitPage.clickOnSearchBy();
        app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
        app.updateUnitPage.clickOnSearchButton();
        logger.info("Step 04: Verify The Unit Status Before Update It");
        app.updateUnitPage.checkUnitStatusActiveUpdate();
        app.updateUnitPage.clickOnUpdateUnitsButton();
        app.updateUnitPage.clickOnNewUpdateButton();
        app.updateUnitPage.clickOnDownloadTemplateButton();
        app.updateUnitPage.editTemplateFile(data.get("Project_Code"), data.get("Unit_Code"), data.get("Unit_Status"));
        app.updateUnitPage.clickOnUploadTemplateButton();
        app.updateUnitPage.clickOnAnalyzeTheFileButton();
        app.updateUnitPage.clickOnShowTheResultButton();
        logger.info("Step 05: Verify The Unit Status Can Not Be Update It");
        app.updateUnitPage.checkTheErrorMessage();
        app.updateUnitPage.deleteFile();

    }
}
