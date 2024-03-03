package sa.nhc.sakani.mobile.login;

import sa.nhc.sakani.mobile.base.NHSSakaniMobileTest;
import org.testng.annotations.Test;

import java.util.Map;

public class TC01_Mobile_LoginInvalid extends NHSSakaniMobileTest {

    @Test(dataProvider = "testDataProvider")
    public void mobileLoginInvalid(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());

        logger.info("Step 01: Assert Home page displayed");

        logger.info("Step 02: Enter Instance URL & Continue");

        logger.info("Step 03: Login to Application Using Page functions");
        app.loginPage.waitForPageLoad();
        app.loginPage.login(data);

        logger.info("Step 04: Verify Error displayed - Invalid credentials");
        app.loginPage.assertErrorDisplayedInvalidCredentials();
    }
}
