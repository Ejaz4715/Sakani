package sa.nhc.sakani.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;
import sa.nhc.sakani.web.objects.*;

import java.util.Map;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class NewMethods  {

    public NewMethods() {
    }


    public void userLoginNew(String id, String password) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.SwitchLanguage(), 45);
//        Browser.click(CommonUtilityPageObjects.SwitchLanguage());
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
    }


    public void LoginAsAdmin(String username, String password) throws Exception {
        Browser.setText(LoginPageObjects.Email(), username);
        Browser.setText(LoginPageObjects.Password(), password);
        logger.addScreenshot("Enter Credentials");
        Browser.moveToElement(LoginPageObjects.BTNLogin());
        Browser.click(LoginPageObjects.BTNLogin());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(), 40);
        Browser.waitForSeconds(2);
        Browser.setText(CommonUtilityPageObjects.AdminOTP(), "1234");
        logger.addScreenshot("Entered OTP");
        Browser.click(CommonUtilityPageObjects.OTPVerify());
    }

    public void FillPaymentDetails(String cardNumber, String holderName, String expiryDate, String cvv) throws Exception {
        Browser.waitUntilVisibilityOfElement(BookingPageObjects.payNowTitle(), 30);
        String PaymentPage = Browser.getWebElement(BookingPageObjects.payNowTitle()).getText();
        Assert.assertTrue(PaymentPage.contains("اللحظي"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        WebElement iframe = driver.findElement(BookingPageObjects.CardNumberIframe());
        Browser.waitForSeconds(1);
        driver.switchTo().frame(iframe);
        Browser.waitForSeconds(1);
        WebElement CardNumber = driver.findElement(BookingPageObjects.cardNumberInputTxt());
//        Browser.waitForSeconds(2);
        CardNumber.sendKeys(cardNumber);
//        Browser.waitForSeconds(2);
        driver.switchTo().defaultContent();
//        Browser.waitForSeconds(2);
        Browser.setText(BookingPageObjects.holderNameInputTxt(), holderName);
//        Browser.waitForSeconds(2);
        Browser.setText(BookingPageObjects.expiryDateInputTxt(), expiryDate);
//        Browser.waitForSeconds(2);
        WebElement iframe2 = driver.findElement(BookingPageObjects.cvvIframe());
//        Browser.waitForSeconds(2);
        driver.switchTo().frame(iframe2);
//        Browser.waitForSeconds(2);
        WebElement Cvv = driver.findElement(BookingPageObjects.cvvInputTxt());
//        Browser.waitForSeconds(2);
        Cvv.sendKeys(cvv);
//        Browser.waitForSeconds(2);
        driver.switchTo().defaultContent();
//        Browser.waitForSeconds(2);
        logger.addScreenshot("");
//        Browser.waitForSeconds(2);
        Browser.click(BookingPageObjects.payNowButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
//        Browser.waitForSeconds(12);
    }
}
