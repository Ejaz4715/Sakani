package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import sa.nhc.web.objects.RegistrationAndLoginPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.testcrew.manager.PDFReportManager.logger;


public class RegistrationAndLoginPage extends WebBasePage {

    public void loginToSakani() throws AWTException {
        TCRobot robot = new TCRobot();
        robot.setText("sakani");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_TAB);
        Browser.waitForSeconds(1);
        robot.setText("together we build Vision 2030");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void loginToSakaniPartners(String id, String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.loginButton(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.userNameInput(), id);
        Browser.setText(RegistrationAndLoginPageObjects.userPasswordInput(), password);
        Browser.click(RegistrationAndLoginPageObjects.loginButton());
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.OTPInput(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.OTPInput(), "1234");
        Browser.click(RegistrationAndLoginPageObjects.verifyOTPButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Login to Sakani Partners");
    }

    public void verifyHomePageIsAppearing() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.SakaniLogo(), 20);

    }
}