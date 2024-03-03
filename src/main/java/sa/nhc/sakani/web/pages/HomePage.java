package sa.nhc.sakani.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.HomePageObjects;
import sa.nhc.sakani.web.objects.LoginPageObjects;


public class HomePage  {
    public static ReportManager logger = new ReportManager(WebBaseTest.class);
    public HomePage() {
    }

    // Click on Login Button In home Page
    public void clickOnLoginButtonInHomePage() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNHomeLogin(), 6);
        Browser.click(HomePageObjects.BTNHomeLogin());
        logger.addScreenshot("Sakani Landing Page");
    }

    // Click on My Profile
    public void clickOnMyProfileButton() throws Exception {
        Browser.click(HomePageObjects.BTNMyProfile());

    }

    // Close Pop Ups Windows after First Time Login
    public void checkPopUpWindows() throws Exception {
        if (Browser.isElementPresent(HomePageObjects.BTNX()) && Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(HomePageObjects.BTNX());
            Browser.click(LoginPageObjects.BTNChoose());

        } else if (Browser.isElementPresent(HomePageObjects.BTNX())) {
            Browser.click(HomePageObjects.BTNX());
        } else if (Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(LoginPageObjects.BTNChoose());
        }
    }

    // Verify User Login Successfully
    public void checkSuccessfulLogin() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.CheckLoginSuccessful(), 6);
        Assert.assertTrue(Browser.isElementPresent(HomePageObjects.CheckLoginSuccessful()));

        logger.addScreenshot("Sakani Landing Page");
    }

    // Click on Check Eligibility from Services Drop Down Button
    public void clickOnCheckEligibilityButton() throws Exception {
        Browser.click(HomePageObjects.BTNCheckEligibility());

    }

    // Click on Financial Advisory from Services Drop Down Button
    public void clickOnFinancialAdvisoryButton() throws Exception {
        Browser.click(HomePageObjects.BTNFinancialAdvisory());

    }

    // Click on X Button of Pop Up Window
    public void clickOnXButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNX(), 11);
        Browser.click(HomePageObjects.BTNX());

    }

    // Click on Cancel Button of Pop Up Window
    public void clickOnCancelADWindowButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNCancelADWindow(), 6);
        Browser.click(HomePageObjects.BTNCancelADWindow());
    }
}
