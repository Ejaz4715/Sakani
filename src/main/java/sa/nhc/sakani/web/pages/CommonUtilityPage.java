package sa.nhc.sakani.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.CommonUtilityPageObjects;

public class CommonUtilityPage {

    public static ReportManager logger = new ReportManager(WebBaseTest.class);
    public CommonUtilityPage() {
    }

    // Enter OTP number
    public void enterOTPNumber() throws Exception {

//        Browser.waitForSeconds(5);
//        for (int i = 1; i <= 1; i++) {

            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(1)"), "1");
            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(2)"), "2");
            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(3)"), "3");
            Browser.setText(By.cssSelector("ngb-modal-window[role='dialog'] input:nth-child(4)"), "4");
//        }
        logger.addScreenshot("OTP Page");
    }

    // Click on Verify Button
    public void clickOnVerifyButton() throws Exception {
        Browser.click(CommonUtilityPageObjects.BTNVerify());

    }

    // Verify the Validation OTP Message
    public void verifyTheValidationMessageOTP() throws Exception {
        for (int i = 1; i <= 1; i++) {


            Browser.setText(CommonUtilityPageObjects.TXTOTP(i), "2222");

        }
        Browser.click(CommonUtilityPageObjects.BTNVerify());
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.MsgOTPWrong(), 6);
        Assert.assertTrue(Browser.isElementPresent(CommonUtilityPageObjects.MsgOTPWrong()));
        Browser.takeScreenshot();
    }

    // Click on English Button To Switch the Language
    public void switchLanguage() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.SwitchLanguage(), 7);
        Browser.click(CommonUtilityPageObjects.SwitchLanguage());


    }

    // Click On Agreement Of Terms and Conditions Checkbox
    public void clickOnAgreeTermsOfConditions() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonUtilityPageObjects.CheckBoxAgreeTermOfConditions(), 6);
        Browser.executeJSScroll(310);
        Browser.click(CommonUtilityPageObjects.CheckBoxAgreeTermOfConditions());

    }

    // Loading Spinner
    public void spinnerLoading() throws Exception {
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoading(), 20);

    }

    // Wait in 10 Second

}
