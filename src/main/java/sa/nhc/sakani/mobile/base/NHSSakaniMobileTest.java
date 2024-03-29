package sa.nhc.sakani.mobile.base;

import sa.nhc.sakani.mobile.NHSSakaniMobileApplication;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.mobile.Mobile;
import com.testcrew.wrapper.base.TestCrewMobileBaseTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

public class NHSSakaniMobileTest extends TestCrewMobileBaseTest {

    public NHSSakaniMobileApplication app;

    public NHSSakaniMobileTest() {
        app = new NHSSakaniMobileApplication();
    }

    @BeforeSuite
    public void beforeSuiteRewaa() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        // Browser Stack Capabilities
        if (TestConfigManager.getTestSettingsMobileDeviceType().equalsIgnoreCase("browserstack")) {
            desiredCapabilities.setCapability("app", TestConfigManager.getTestSettingsMobileBrowserStackAppURL());
            desiredCapabilities.setCapability("project", TestConfigManager.getTestSettingsMobileBrowserStackProject());
            desiredCapabilities.setCapability("build", TestConfigManager.getTestSettingsMobileBrowserStackBuild());
            desiredCapabilities.setCapability("name", "Test");
        }

        desiredCapabilities.setCapability("deviceName", TestConfigManager.getTestSettingsMobileDeviceName());
        desiredCapabilities.setCapability("platformName", TestConfigManager.getTestSettingsMobilePlatform());
        desiredCapabilities.setCapability("autoGrantPermissions", "true");
        desiredCapabilities.setCapability("appPackage", TestConfigManager.getTestSettingsMobileAppPackage());
        desiredCapabilities.setCapability("appActivity", TestConfigManager.getTestSettingsMobileAppActivity());
        desiredCapabilities.setCapability("newCommandTimeout", 100000);

//            if (data.get("AutomationName").equalsIgnoreCase("uiautomator2")) {
//                desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_UIAUTOMATOR2);
//            }
//        } else if (data.get("PlatformName").equalsIgnoreCase("ios")) {
//            desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.IOS);
//        }
//        desiredCapabilities.setCapability("autoGrantPermissions", data.get("AutoGrantPermissions"));

        Mobile.setUserDesiredCapabilities(desiredCapabilities);
    }

}