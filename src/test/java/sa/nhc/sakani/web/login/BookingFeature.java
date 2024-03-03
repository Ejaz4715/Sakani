package sa.nhc.sakani.web.login;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;
import java.util.Map;


public class BookingFeature extends NHSSakaniWebTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK01",
            description = "Verify Eligible User Able to Booking OffPlan MOH Project Without Fee")
    public void VerifyBookingOffPlanMOHProjectAsEligibleUserWithoutFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan MOH Project As Eligible User and Booking unit Without Fee");
        app.bookingPage.BookingOffPlanMOHEligibleWithoutFee(data);
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK02",
            description = "Verify Eligible User Able to Booking OffPlan MOH Project With Fee")
    public void VerifyBookingOffPlanMOHProjectAsEligibleUserWithFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan MOH Project As Eligible User and Booking unit With Fee");
        app.bookingPage.BookingOffPlanMOHEligible(data);
        Browser.close();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK03",
            description = "Verify InEligible User Able to Booking OffPlan MOH Project Without Fee")
    public void VerifyBookingOffPlanMOHProjectAsInEligibleUserWithoutFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan MOH Project As InEligible User and Booking unit Without Fee");
        app.bookingPage.BookingOffPlanMOHInEligibleWithoutFee(data);
        Browser.close();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK04",
            description = "Verify InEligible User Able to Booking OffPlan MOH Project With Fee")
    public void VerifyBookingOffPlanMOHProjectAsInEligibleUserWithFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan MOH Project As InEligible User and Booking unit With Fee");
        app.bookingPage.BookingOffPlanMOHInEligible(data);
        Browser.close();


    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK05_Verify Eligible User Able to Booking Private Project Without Fee",
            description = "Verify Eligible User Able to Booking Private Project Without Fee")
    public void VerifyBookingOffPlanPrivateProjectAsEligibleUserWithoutFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan Private project As Eligible User and Booking unit without Fee");
        app.bookingPage.BookingOffPlanPrivateEligibleWithoutFee(data);
        Browser.close();

    }
    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK06_Verify Eligible User Able to Booking Private Project With Fee",
            description = "Verify Eligible User Able to Booking Private Project With Fee")
    public void VerifyBookingOffPlanPrivateProjectAsEligibleUserWithFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan Private project As Eligible User and Booking unit with Fee");
        app.bookingPage.BookingOffPlanPrivateEligible(data);
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK07_Verify InEligible User Able to Booking Private Project Without Fee",
            description = "Verify InEligible User Able to Booking Private Project Without Fee")
    public void VerifyBookingOffPlanPrivateProjectAsInEligibleUserWithoutFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan Private project As InEligible User and Booking unit without Fee");
        app.bookingPage.BookingOffPlanPrivateInEligibleWithoutFee(data);
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK08_Verify InEligible User Able to Booking Private Project With Fee",
            description = "Verify InEligible User Able to Booking Private Project With Fee")
    public void VerifyBookingOffPlanPrivateProjectAsInEligibleUserWithFee(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select OffPlan Private project As InEligible User and Booking unit with Fee");
        app.bookingPage.BookingOffPlanPrivateInEligible(data);
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK09",
            description = "Verify Eligible User Able to Booking Land MOH Project With Signature")
    public void VerifyBookingLandMOHProjectAsEligibleUserWithSignature(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select Land MOH project As Eligible User and Booking Free Land With Signature");
        app.bookingPage.BookingLandMOHEligibleWithSignature(data);
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_BK10",
            description = "Verify Eligible User Able to Booking Land MOH Project Without Signature")
    public void VerifyBookingLandMOHProjectAsEligibleUserWithoutSignature(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLogin(data);
        app.homePage.clickOnLoginButtonInHomePage();
        logger.info("Step 02: Search for published project");
        app.bookingPage.SearchForProject(data);
        logger.info("Step 03: Select Land MOH project As Eligible User and Booking Free Land Without Signature");
        app.bookingPage.BookingLandMOHEligibleWithoutSignature(data);
        Browser.close();

    }
}
