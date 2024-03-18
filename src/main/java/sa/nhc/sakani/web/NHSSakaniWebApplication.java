package sa.nhc.sakani.web;

import com.testcrew.utility.TCRobot;
import sa.nhc.sakani.web.objects.RegistrationAndLoginPartnersPageObjects;
import sa.nhc.sakani.web.pages.*;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;
import java.awt.event.KeyEvent;
import java.util.Map;

public class NHSSakaniWebApplication {

    public final HomePage homePage;
    public final LoginPage loginPage;
    public final RegistrationPage registrationPage;
    public final CommonUtilityPage commonUtilityPage;
    public final CheckEligibilityPage checkEligibilityPage;
    public final FinancialAdvisoryPage financialAdvisoryPage;
    public final ProfilePage profilePage;
    public final BasicMethodsPage basicMethodsPage;
    public final BookingPage bookingPage;
    public final CreateProjectPage createProjectPage;

    //Sakani 4
    public final BookUnitPage bookUnitPage;
    public final  UpdateUnitPage updateUnitPage;
    public RegistrationAndLoginPartnersPage registrationAndLoginPartners;

    public final NewMethods newMethods;

    public NHSSakaniWebApplication() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registrationPage = new RegistrationPage();
        commonUtilityPage = new CommonUtilityPage();
        checkEligibilityPage = new CheckEligibilityPage();
        financialAdvisoryPage = new FinancialAdvisoryPage();
        profilePage = new ProfilePage();
        basicMethodsPage = new BasicMethodsPage();
        bookingPage = new BookingPage();
        createProjectPage = new CreateProjectPage();

        //Sakani 4
        bookUnitPage = new BookUnitPage();
        updateUnitPage = new UpdateUnitPage();
        registrationAndLoginPartners = new RegistrationAndLoginPartnersPage();
        newMethods = new NewMethods();

    }

    /*public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
        loginPage.waitForPageLoad();
    }*/

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
//        TCRobot robot = new TCRobot();
//        robot.keyPress(KeyEvent.VK_ENTER);
//        Browser.waitForSeconds(1);
//        robot.setText(data.get("Username"));
//        robot.keyPress(KeyEvent.VK_TAB);
//        Browser.waitForSeconds(1);
//        robot.setText(data.get("InitialPassword"));
//        robot.keyPress(KeyEvent.VK_ENTER);
//        Browser.waitForSeconds(1);
////        robot.keyPress(KeyEvent.VK_TAB);
//        Browser.waitForSeconds(1);
//        for (int i = 0; i < 4; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }

        TCRobot robot = new TCRobot();
        robot.setText("sakani");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_TAB);
        Browser.waitForSeconds(1);
        robot.setText("together we build Vision 2030");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPartnersPageObjects.LoginButton(), 100);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
    }
}
