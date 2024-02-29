package sa.nhc.web;

import sa.nhc.web.pages.*;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.util.Map;

public class NHCWebApplication {

    //Sakani Partners
    public final RegistrationAndLoginPage registrationAndLogin;
    public final UpdateUnitPage updateUnitPage;
    public final BookUnitPage bookUnitPage;

    //Sakani Housing
    public final BookingPage bookingPage;
    public final LoginPage loginPage;
    public final CommonUtilityPage commonUtilityPage;
    public final HomePage homePage;

    //Sakani Admin
    public final CreateProjectPage createProjectPage;


    public NHCWebApplication() {
        //Sakani Partners
        registrationAndLogin = new RegistrationAndLoginPage();
        updateUnitPage = new UpdateUnitPage();
        bookUnitPage = new BookUnitPage();

        //Sakani Housing
        bookingPage = new BookingPage();
        loginPage =  new LoginPage() ;
        commonUtilityPage = new CommonUtilityPage();
        homePage = new HomePage();

        //Sakani Admin
        createProjectPage = new CreateProjectPage();

    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
    }
}
