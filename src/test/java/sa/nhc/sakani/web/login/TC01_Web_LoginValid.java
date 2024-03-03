package sa.nhc.sakani.web.login;

import sa.nhc.sakani.web.base.NHSSakaniWebTest;
import org.testng.annotations.Test;

import java.util.Map;

public class TC01_Web_LoginValid extends NHSSakaniWebTest {

    @Test(dataProvider = "testDataProvider")
    public void loginValid(Map<String, String> data) throws Exception {
        /*logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();

        logger.info("Step 02: Assert Side Menu 'My Info' displayed.");

        logger.info("Step 03: Open My Info Page.");

        logger.info("Step 04: Assert My Info Page displayed.");

        logger.info("Step 05: Enter/Select the following General Firstname, MiddleName, LastName");

        logger.info("Step 06: Click the Save button");

        logger.info("Step 07: Assert Success Message displayed");*/
    }
}
