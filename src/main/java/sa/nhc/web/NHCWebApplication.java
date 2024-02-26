package sa.nhc.web;

import sa.nhc.web.pages.*;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.util.Map;

public class NHCWebApplication {

    //Sakani Partners
    public final RegistrationAndLoginPage registrationAndLogin;
    public final UpdateUnitPage updateUnitPage;
    public final  UnitBookingPage unitBookingPage;

    //Sakani Housing
    public final BookingPage bookingPage;
    public final LoginPage loginPage;
    public final CommonUtilityPage commonUtilityPage;
    public final HomePage homePage;


    public NHCWebApplication() {
        //Sakani Partners
        registrationAndLogin = new RegistrationAndLoginPage();
        updateUnitPage = new UpdateUnitPage();
        unitBookingPage = new UnitBookingPage();

        //Sakani Housing
        bookingPage = new BookingPage();
        loginPage =  new LoginPage() ;
        commonUtilityPage = new CommonUtilityPage();
        homePage = new HomePage();

    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
    }
}
