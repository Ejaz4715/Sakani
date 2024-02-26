package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class UpdateUnit extends NHCWebTest {
        @Test(dataProvider = "testDataProvider", testName = "TC_5_Update Unit and Verify The Status Is Active")
        public void VerifyTheStatusIsActive (Map<String, String> data) throws Exception{
            logger.info("Step 00: Test Data : " + data.toString());
            app.openApplication(data);
            logger.info("Step 01: Login to Sakani Partners");
            app.registrationAndLogin.loginToSakani();
            app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
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
            app.updateUnitPage.clickOnUpdateUnitsButton();
            app.updateUnitPage.clickOnNewUpdateButton();
        }
}
