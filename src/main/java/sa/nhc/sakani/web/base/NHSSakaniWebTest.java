package sa.nhc.sakani.web.base;

import sa.nhc.sakani.web.NHSSakaniWebApplication;
import com.testcrew.web.Browser;
import com.testcrew.wrapper.base.TestCrewWebBaseTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

public class NHSSakaniWebTest extends TestCrewWebBaseTest {

    public NHSSakaniWebApplication app;

    public NHSSakaniWebTest() {
        app = new NHSSakaniWebApplication();
    }

    @BeforeSuite
    public void beforeSuiteRewaa() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        Browser.setUserDesiredCapabilities(desiredCapabilities);
    }
}