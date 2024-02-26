package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import sa.nhc.web.pages.UpdateUnitPage;

import java.util.Map;

public class UpdateUnit extends NHCWebTest {
        @Test(dataProvider = "testDataProvider", testName = "TC_5_Update Unit and Verify The Status Is Active")
        public void VerifyTheStatusIsActive (Map<String, String> data) throws Exception{
            logger.info("Step 00: Test Data : " + data.toString());
            app.openApplication(data);
            logger.info("Step 01: Login to Sakani Partners");
            app.registrationAndLogin.loginToSakani();
            app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
            app.registrationAndLogin.inputOTP();
            app.updateUnitPage.clickOnTheProjectsButton();
            logger.info("Step 02: Search For Project");
            app.updateUnitPage.clickOnAdvancedSearchRadioButton();
            app.updateUnitPage.clickOnProjectCode();
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
            app.updateUnitPage.editTemplateFile("01-01-0108", "01-01-0108-11-303", "active");
            app.updateUnitPage.clickOnUploadTemplateButton();
            app.updateUnitPage.clickOnAnalyzeTheFileButton();
            app.updateUnitPage.clickOnShowTheResultButton();
            app.updateUnitPage.clickOnCommitButton();
            logger.info("Step 06: Verify The Unit Status After Update It");
            app.updateUnitPage.clickOnTheProjectsButton();
            app.updateUnitPage.clickOnAdvancedSearchRadioButton();
            app.updateUnitPage.clickOnProjectCode();
            app.updateUnitPage.clickOnSearchButton();
            app.updateUnitPage.clickOnDetailsButton();
            app.updateUnitPage.clickOnUnitsDetailsButton();
            app.updateUnitPage.clickOnSearchBy();
            app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
            app.updateUnitPage.clickOnSearchButton();
            app.updateUnitPage.checkUnitStatusActiveUpdate();
            app.updateUnitPage.deleteFile();

        }

    @Test(dataProvider = "testDataProvider", testName = "TC_6_Update Unit and Verify The Status Is Inactive")
    public void VerifyTheStatusIsInactive (Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.updateUnitPage.clickOnTheProjectsButton();
        logger.info("Step 02: Search For Project");
        app.updateUnitPage.clickOnAdvancedSearchRadioButton();
        app.updateUnitPage.clickOnProjectCode();
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
        app.updateUnitPage.editTemplateFile("01-01-0108", "01-01-0108-11-303", "inactive");
        app.updateUnitPage.clickOnUploadTemplateButton();
        app.updateUnitPage.clickOnAnalyzeTheFileButton();
        app.updateUnitPage.clickOnShowTheResultButton();
        app.updateUnitPage.clickOnCommitButton();
        logger.info("Step 06: Verify The Unit Status After Update It");
        app.updateUnitPage.clickOnTheProjectsButton();
        app.updateUnitPage.clickOnAdvancedSearchRadioButton();
        app.updateUnitPage.clickOnProjectCode();
        app.updateUnitPage.clickOnSearchButton();
        app.updateUnitPage.clickOnDetailsButton();
        app.updateUnitPage.clickOnUnitsDetailsButton();
        app.updateUnitPage.clickOnSearchBy();
        app.updateUnitPage.enterUnitCode(data.get("Unit_Code"));
        app.updateUnitPage.clickOnSearchButton();
        app.updateUnitPage.checkUnitStatusInactiveUpdate();
        app.updateUnitPage.deleteFile();

    }


    @Test(dataProvider = "testDataProvider", testName = "TC_7_Update Unit and Verify The Status Can Not Be Change")
    public void VerifyTheStatusCanNotBeChange (Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.inputOTP();
        app.updateUnitPage.clickOnTheProjectsButton();
        logger.info("Step 02: Search For Project");
        app.updateUnitPage.clickOnAdvancedSearchRadioButton();
        app.updateUnitPage.clickOnProjectCode();
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
        app.updateUnitPage.editTemplateFile("01-01-0108", "01-01-0108-55-804", "inactive");
        app.updateUnitPage.clickOnUploadTemplateButton();
        app.updateUnitPage.clickOnAnalyzeTheFileButton();
        app.updateUnitPage.clickOnShowTheResultButton();
        logger.info("Step 05: Verify The Unit Status Can Not Be Update It");
        app.updateUnitPage.checkTheErrorMessage();
        app.updateUnitPage.deleteFile();

    }
}
