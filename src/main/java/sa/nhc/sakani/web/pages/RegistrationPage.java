package sa.nhc.sakani.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.sakani.web.NHSSakaniWebApplication;
import sa.nhc.sakani.web.objects.RegistrationPageObjects;

import java.util.Map;


public class RegistrationPage {
    public RegistrationPage() {
    }


    // Click on (No Account? Create New Account) Link
    public void clickOnRegisterLink() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.RegistrationLink(), 6);
        Browser.click(RegistrationPageObjects.RegistrationLink());
    }

    // Click on Continue Button
    public void clickOnContinueButton() throws Exception {
        Browser.click(RegistrationPageObjects.BTNContinue());
    }


    // Enter ID/Iqama Number
    public void enterIDNumber(Map<String, String> data) throws Exception {
        Browser.setText(RegistrationPageObjects.TXTIDNumber(), data.get("ID_Number"));
    }

    // Enter Birth Of Date
    public void enterBirthOfDate(Map<String, String> data) throws Exception {
        Browser.setText(RegistrationPageObjects.TXTBirthOfDate(), data.get("Birth_Of_Date"));
        Browser.click(RegistrationPageObjects.TXTIDNumber());
        Browser.takeScreenshot();

    }

    // Verify the Validation Message of Required Data in First Step of Registration
    public void verifyTheValidationMessageOfFirstStep() throws Exception {
        Browser.click(RegistrationPageObjects.TXTIDNumber());
        Browser.click(RegistrationPageObjects.TXTBirthOfDate());
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.MsgRequired(), 6);
        Assert.assertTrue(Browser.isElementPresent(RegistrationPageObjects.MsgRequired()));
        Browser.takeScreenshot();
    }

    // Verify the Validation Message of Required Data in Second Step of Registration
    public void verifyTheValidationMessageOfSecondStep() throws Exception {
        Browser.moveToElement(RegistrationPageObjects.TXTPassword());
        Browser.click(RegistrationPageObjects.TXTEmail());
        Browser.click(RegistrationPageObjects.TXTPhoneNumber());
        Browser.executeJSScroll(110);
        Browser.click(RegistrationPageObjects.TXTPassword());
        Browser.click(RegistrationPageObjects.TXTPasswordConfirmation());
        Browser.click(RegistrationPageObjects.TXTPassword());
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.MsgRequired(), 6);
        Assert.assertTrue(Browser.isElementPresent(RegistrationPageObjects.MsgRequired()));
        Browser.takeScreenshot();
    }

    //Enter Email ,  Can Change the Data in Run Manager
    public void enterEmail(Map<String, String> data) throws Exception {
        Browser.setText(RegistrationPageObjects.TXTEmail(), data.get("Email"));

    }

    // Enter Phone Number ,  Can Change the Data in Run Manager
    public void enterPhoneNumber(Map<String, String> data) throws Exception {
        Browser.setText(RegistrationPageObjects.TXTPhoneNumber(), data.get("PhoneNumber"));
    }

    // Enter Password ,  Can Change the Data in Run Manager
    public void enterPassword(Map<String, String> data) throws Exception {
        Browser.setText(RegistrationPageObjects.TXTPassword(), data.get("Password"));
    }

    // Enter Password Confirmation ,  Can Change the Data in Run Manager
    public void enterPasswordConfirmation(Map<String, String> data) throws Exception {
        Browser.setText(RegistrationPageObjects.TXTPasswordConfirmation(), data.get("Password_Confirmation"));
    }


    // Checking is Navigate to next step/page after Register
    public void checkSuccessfulRegisterMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.MSGSuccessfulRegistered(), 6);
        Browser.moveToElement(RegistrationPageObjects.MSGSuccessfulRegistered());
        Assert.assertTrue(Browser.isElementPresent(RegistrationPageObjects.MSGSuccessfulRegistered()));
        Browser.takeScreenshot();
    }

    // Verify User Complete First Step of Registration
    public void checkSuccessfulRegisterInFirstStep() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.TXTEmail(), 6);
        Assert.assertTrue(Browser.isElementPresent(RegistrationPageObjects.TXTEmail()));
        Browser.takeScreenshot();
    }

    // Verify the Account Already Created
    public void checkTheAccountIsAlreadyCreated() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.MSGAccountAlreadyCreated(), 6);
        Assert.assertTrue(Browser.isElementPresent(RegistrationPageObjects.MSGAccountAlreadyCreated()));
        Browser.takeScreenshot();
    }
    public void scrollToOTP() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.ScrollToOTP(),6);
        Browser.executeJSScrollIntoView(RegistrationPageObjects.ScrollToOTP());
    }

}
