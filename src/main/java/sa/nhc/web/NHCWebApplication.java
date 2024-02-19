package sa.nhc.web;

import com.testcrew.utility.TCRobot;
import sa.nhc.web.pages.*;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.awt.event.KeyEvent;
import java.util.Map;

public class NHCWebApplication {
    public final RegistrationAndLoginPage registrationAndLogin;
    public final UpdateUnitPage updateUnitPage;

    public NHCWebApplication() {
        registrationAndLogin = new RegistrationAndLoginPage();
        updateUnitPage = new UpdateUnitPage();
    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
//        Browser.waitForSeconds(8);
//        TCRobot robot = new TCRobot();
//        for (int i = 0; i < 3; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//        }
    }
}
