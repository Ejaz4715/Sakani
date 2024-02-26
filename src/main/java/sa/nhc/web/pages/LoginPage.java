package sa.nhc.web.pages;

import com.testcrew.utility.TCRobot;
import org.openqa.selenium.By;
import sa.nhc.web.objects.CommonUtilityPageObjects;
import sa.nhc.web.objects.HomePageObjects;
import sa.nhc.web.objects.LoginPageObjects;
import com.testcrew.base.WebBasePage;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.testng.Assert;

import java.util.Map;


public class LoginPage extends WebBasePage {
    public static final ReportManager logger = new ReportManager(LoginPage.class);

    // Click on Login Button
    public void clickOnLoginButton() throws Exception {
        Browser.moveToElement(LoginPageObjects.BTNLogin());
        Browser.click(LoginPageObjects.BTNLogin());
        Browser.takeScreenshot("Login Page");
        logger.addScreenshot("Login Page");
    }

    // Enter ID/Iqama Number
    public void enterIDNumber(Map<String, String> data) throws Exception {
        Browser.setText(LoginPageObjects.TXTIDNumber(), data.get("ID_Number"));
        Browser.waitForSeconds(2);
    }

    // Enter Password
    public void enterPassword(Map<String, String> data) throws Exception {
        Browser.setText(LoginPageObjects.TXTPassword(), data.get("Password"));
        Browser.waitForSeconds(2);
    }

    // Click on Update Button
    public void clickOnUpdateButton() throws Exception {
        if (Browser.isElementPresent(LoginPageObjects.BTNUpdate())) {
            Browser.click(LoginPageObjects.BTNUpdate());

            for (int i = 1; i <= 1; i++) {

                Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "1234");

            }
            Browser.click(CommonUtilityPageObjects.BTNVerify());
            Browser.click(LoginPageObjects.BTNContinue());
        } else {
            Browser.waitForSeconds(2);
        }
    }

    // Verify the Validation Message of Required Data
    public void verifyTheValidationMessage() throws Exception {
        Browser.waitForSeconds(3);
        Browser.click(LoginPageObjects.BTNLogin());
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.MsgRequired(), 6);
        Browser.waitForSeconds(3);
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.MsgRequired()));
        Browser.waitForSeconds(5);
        logger.addScreenshot("Verify the Validation message");
    }

    // Verify the Validation Message of Wrong Data
    public void verifyTheValidationMessageOfWrongIDOrPassword() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.MsgWrongIDPassword(), 6);
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.MsgWrongIDPassword()));
        Browser.takeScreenshot();
    }

    public void closeWindow() throws Exception {
        if (Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(LoginPageObjects.BTNChoose());
        } else {
            Browser.waitForSeconds(2);
        }
    }

    public void userLoginAsAdmin(Map<String, String> data) throws Exception {
        Browser.setText(LoginPageObjects.Email(), data.get("Email"));
        Browser.waitForSeconds(4);
        Browser.setText(LoginPageObjects.Password(), data.get("Password"));
        Browser.waitForSeconds(4);
        logger.addScreenshot("Enter Credentials");
        Browser.moveToElement(LoginPageObjects.BTNLogin());
        Browser.click(LoginPageObjects.BTNLogin());
        Browser.waitForSeconds(5);
        for (int i = 1; i <= 1; i++) {

            Browser.setText(CommonUtilityPageObjects.AdminOTP(), "1234");

        }
        logger.addScreenshot("Enter OTP");
        Browser.waitForSeconds(5);
        Browser.takeScreenshot();
        Browser.waitForSeconds(3);
        Browser.click(CommonUtilityPageObjects.OTPVerify());
    }

    // User Login
    public void userLogin(String id, String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.SwitchLanguage(), 45);
        Browser.click(CommonUtilityPageObjects.SwitchLanguage());
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNHomeLogin(), 6);
        Browser.click(HomePageObjects.BTNHomeLogin());
        Browser.waitUntilVisibilityOfElement(HomePageObjects.BTNHomeLogin(), 6);
        Browser.setText(LoginPageObjects.TXTIDNumber(), id);
        Browser.setText(LoginPageObjects.TXTPassword(), password);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.moveToElement(LoginPageObjects.BTNLogin());
        Browser.click(LoginPageObjects.BTNLogin());
        Browser.waitUntilElementToBeClickable(CommonUtilityPageObjects.UserOTP(), 30);
//        for (int i = 1; i <= 1; i++) {
//            Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "1234");
//            Browser.setText(CommonUtilityPageObjects.UserOTP(), "1234");

        TCRobot robot = new TCRobot();
        robot.setText("1234");
//            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(1)"), "1");
//            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(2)"), "2");
//            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(3)"), "3");
//            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(4)"), "4");
        Browser.waitForSeconds(2);
        logger.addScreenshot("Enter OTP");
        Browser.click(CommonUtilityPageObjects.BTNVerify());
//
//        if (Browser.isElementPresent(LoginPageObjects.BTNChoose())){
//            Browser.click(LoginPageObjects.BTNChoose());
//        }
//        else {
//            Browser.waitForSeconds(1);
//        }


//        if (Browser.isElementPresent(LoginPageObjects.BTNUpdate())) {
//            Browser.click(LoginPageObjects.BTNUpdate());
//        }

        Browser.waitForSeconds(3);
        if (Browser.isElementPresent(HomePageObjects.BTNX()) && Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(HomePageObjects.BTNX());
            Browser.click(LoginPageObjects.BTNChoose());

        } else if (Browser.isElementPresent(HomePageObjects.BTNX())) {
            Browser.click(HomePageObjects.BTNX());
        } else if (Browser.isElementPresent(LoginPageObjects.BTNChoose())) {
            Browser.click(LoginPageObjects.BTNChoose());
        } else {
            Browser.waitForSeconds(2);
        }
//        }

        //*****************************************************************************Old code
        /**
         * Page action
         * A Page action is the granular level of action performed on that page.
         * Example:
         * 1. click login button
         * 2. enter username
         */
    /*public void enterUsername(String username) throws Exception {
        logger.info("Enter Username as " + username);
        Browser.setText(LoginPageObjects.getTextUsername(), username);
        logger.addScreenshot("After Username");
    }

    public void enterPassword(String password) throws Exception {
        logger.info("Enter Password as " + password);
        Browser.setText(LoginPageObjects.getTextPassword(), password);
    }

    public void clickLogin() throws Exception {
        logger.info("Click Login");
        Browser.click(LoginPageObjects.getButtonLogin());
    }

    *//**
         * Page function
         * A Page function is the group of action.
         *//*
    public void changeLanguage(String language) throws Exception {
        logger.info("Change Language");
        if (language.equalsIgnoreCase("en")) {
            if (Browser.isElementPresent(LoginPageObjects.getButtonLanguage("en"))) {
                Browser.click(LoginPageObjects.getButtonLanguage("en"));
            }
        } else {
            if (Browser.isElementPresent(LoginPageObjects.getButtonLanguage("ar"))) {
                Browser.click(LoginPageObjects.getButtonLanguage("ar"));
            }
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getButtonLogin(), 10);
    }

    public void login(Map<String, String> data) throws Exception {
        logger.info("Login to application.");
        enterUsername(data.get("Username"));
        enterPassword(data.get("Password"));
        clickLogin();
    }

    *//**
         * Wait function
         * A Wait function is the one which waits for certain event on that page.
         *//*
    public void waitForPageLoad() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getButtonLogin(), elementTimeout);
    }

    *//**
         * Verify function
         * A Verify function is the one which return a boolean flag as a rust of the verification
         * Can be used in the Asserts
         * Can be used for conditional business flow based on data.
         *//*
    public boolean isLoginPageDisplayed() throws Exception {
        return Browser.isElementPresent(LoginPageObjects.getButtonLogin());
    }


    *//**
         * Assert function
         * A Assert function is the one which does the Test Validation & Reports the same in Report
         * Always use addPassLabel
         *//*

    public void assertLoginPageDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getButtonLogin(), elementTimeout);
        Assert.assertTrue(isLoginPageDisplayed(), "Login button not present.");
        logger.addPassLabel("Login Page displayed.");
    }

    public void assertErrorDisplayedInvalidCredentials() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getElementErrorInvalidCredentials(), elementTimeout);
        logger.addScreenshot("Error Invalid credentials.");
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.getElementErrorInvalidCredentials()), "Error message displayed.");
        logger.addPassLabel("Error displayed - Invalid credentials.");
    }*/
    }
}
