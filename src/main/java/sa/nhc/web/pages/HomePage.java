package sa.nhc.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.web.objects.HomePageObjects;
import sa.nhc.web.objects.LoginPageObjects;


public class HomePage  {
    public static ReportManager logger = new ReportManager(WebBaseTest.class);
    public HomePage() {
    }

    // Click on Login Button In home Page
    public void clickOnLoginButtonInHomePage() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNHomeLogin(), 6);
        Browser.click(HomePageObjects.BTNHomeLogin());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Sakani Landing Page");
    }

    // Click on My Profile
    public void clickOnMyProfileButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(HomePageObjects.IconProfile(), 30);
        Browser.moveToElement(HomePageObjects.IconProfile());
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNMyProfile(), 30);
        Browser.click(HomePageObjects.BTNMyProfile());

    }

    // Close Pop Ups Windows after First Time Login
    public void checkPopUpWindows() throws Exception {
        Browser.waitForSeconds(6);
        if (Browser.isElementPresent(HomePageObjects.BTNX()) && Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.waitForSeconds(6);
            Browser.click(HomePageObjects.BTNX());
            Browser.click(LoginPageObjects.BTNChoose());

        } else if (Browser.isElementPresent(HomePageObjects.BTNX())) {
            Browser.waitForSeconds(6);
            Browser.click(HomePageObjects.BTNX());
        } else if (Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.waitForSeconds(6);
            Browser.click(LoginPageObjects.BTNChoose());
        } else {
            Browser.waitForSeconds(2);
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
