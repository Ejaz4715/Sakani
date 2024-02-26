package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class RegistrationAndLogin extends NHCWebTest {

    @Test(dataProvider = "testDataProvider", testName = "TC_1_login to Sakani Partners as an Individual ")
    public void LoginAsAnIndividual(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.verifyHomePageIsAppearing();

    }

    @Test(dataProvider = "testDataProvider", testName = "TC_2_login to Sakani Partners as a Company ")
    public void LoginAsACompany(Map<String, String> data) throws Exception{
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Sakani Partners");
        app.registrationAndLogin.loginToSakani();
        app.registrationAndLogin.loginToSakaniPartners(data.get("Username"), data.get("Password"));
        app.registrationAndLogin.verifyHomePageIsAppearing();
    }
}
