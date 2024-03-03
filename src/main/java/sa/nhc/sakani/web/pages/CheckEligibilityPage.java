package sa.nhc.sakani.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.CheckEligibilityPageObjects;

import java.util.Map;

import static com.testcrew.web.Browser.driver;


public class CheckEligibilityPage {

    public CheckEligibilityPage() {
    }

    // Click On Start Service in Check Eligibility
    public void clickOnStartServiceButton() throws Exception {
        Browser.click(CheckEligibilityPageObjects.BTNStartService());

    }

    // Verify Check Eligibility is Clickable
    public void verifyCheckEligibilityServiceIsClicked() throws Exception {
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.BTNStartService(), 6);
        Assert.assertTrue(Browser.isElementPresent(CheckEligibilityPageObjects.BTNStartService()));
        Browser.takeScreenshot();

    }

    // Click On Agreement Of Terms and Conditions Checkbox
    public void clickOnAgreeTermsOfConditions() throws Exception {
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.CheckBoxAgreeTermOfConditions(), 10);
        Browser.executeJSScroll(500);
        Browser.executeJSClick(CheckEligibilityPageObjects.CheckBoxAgreeTermOfConditions());

    }

    // Click on Agreements Terms and Conditions Button
    public void clickOnAgreeOnTheTermsAndConditionsButton() throws Exception {
        Browser.executeJSScroll(250);
        Browser.click(CheckEligibilityPageObjects.BTNAgreeOnTheTermsAndConditions());

    }

    // Click on Acknowledgement Checkboxes
    public void clickOnAcknowledgementCheckboxes() throws Exception {
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.TitleAcknowledgement(), 10);
        Browser.executeJSScrollIntoView(CheckEligibilityPageObjects.TitleAcknowledgement());


        if (!driver.findElement(CheckEligibilityPageObjects.CheckboxOne()).isSelected() && !driver.findElement(CheckEligibilityPageObjects.CheckboxTwo()).isSelected() && !driver.findElement(CheckEligibilityPageObjects.CheckboxThree()).isSelected()) {
            driver.findElement(CheckEligibilityPageObjects.CheckboxOne());
            Browser.executeJSClick(CheckEligibilityPageObjects.CheckboxOne());
            driver.findElement(CheckEligibilityPageObjects.CheckboxTwo());
            Browser.executeJSClick(CheckEligibilityPageObjects.CheckboxTwo());
            driver.findElement(CheckEligibilityPageObjects.CheckboxThree());
            Browser.executeJSClick(CheckEligibilityPageObjects.CheckboxThree());
            Browser.click(CheckEligibilityPageObjects.BTNContinueToConfirmAcknowledge());


        } else {
            Browser.click(CheckEligibilityPageObjects.BTNContinueToConfirmAcknowledge());
        }
    }


    // Verify the Validation Message of Acknowledgement Checkboxes
    public void verifyTheValidationMessageOfAcknowledgementCheckboxes() throws Exception {
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.TitleAcknowledgement(), 6);
        Browser.executeJSScrollIntoView(CheckEligibilityPageObjects.TitleAcknowledgement());


        if (!driver.findElement(CheckEligibilityPageObjects.CheckboxOne()).isSelected() && !driver.findElement(CheckEligibilityPageObjects.CheckboxTwo()).isSelected() && !driver.findElement(CheckEligibilityPageObjects.CheckboxThree()).isSelected()) {
            Browser.click(CheckEligibilityPageObjects.BTNContinueToConfirmAcknowledge());

        } else {
            Browser.executeJSClick(CheckEligibilityPageObjects.CheckboxOne());
            Browser.executeJSClick(CheckEligibilityPageObjects.CheckboxTwo());
            Browser.executeJSClick(CheckEligibilityPageObjects.CheckboxThree());
            Browser.click(CheckEligibilityPageObjects.BTNContinueToConfirmAcknowledge());
        }
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.MsgRequired(), 8);
        Assert.assertTrue(Browser.isElementPresent(CheckEligibilityPageObjects.MsgRequired()));
        Browser.takeScreenshot();
    }

    // Click on Continue to Confirm Acknowledgement Button
    public void clickOnContinueToConfirmAcknowledgeButton() throws Exception {
        Browser.click(CheckEligibilityPageObjects.BTNContinueToConfirmAcknowledge());
    }

    //Verify the Navigation to Verify Information Step
    public void verifyTheNavigationToVerifyInformationStep() throws Exception {
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.DDLCurrentRegion(), 10);
        Assert.assertTrue(Browser.isElementPresent(CheckEligibilityPageObjects.DDLCurrentRegion()));
        Browser.takeScreenshot();
    }

    // Select  from DropDown Current Region ,  Can Change the Data in Run Manager
    public void selectCurrentRegion(Map<String, String> data) throws Exception {
        Browser.click(CheckEligibilityPageObjects.DDLCurrentRegion());
        Browser.click(CheckEligibilityPageObjects.getDDL_Option((data.get("Current_Region"))));

    }

    // Click on X Button to Clear
    public void clickXClearButton() throws Exception {

        if (Browser.isElementPresent(CheckEligibilityPageObjects.ClearCurrentRegion()) && Browser.isElementPresent(CheckEligibilityPageObjects.ClearPreferredRegion()) && Browser.isElementPresent(CheckEligibilityPageObjects.ClearPreferredCity())) {
            Browser.click(CheckEligibilityPageObjects.ClearPreferredCity());
            Browser.click(CheckEligibilityPageObjects.ClearPreferredRegion());
            Browser.click(CheckEligibilityPageObjects.ClearCurrentRegion());

        }
    }

    // Select  from DropDown Current City ,  Can Change the Data in Run Manager
    public void selectCurrentCity(Map<String, String> data) throws Exception {
        Browser.click(CheckEligibilityPageObjects.DDLCurrentCity());
        Browser.click(CheckEligibilityPageObjects.getDDL_Option((data.get("Current_City"))));

    }

    // Select  from DropDown Preferred Region ,  Can Change the Data in Run Manager
    public void selectPreferredRegion(Map<String, String> data) throws Exception {
        Browser.click(CheckEligibilityPageObjects.DDLPreferredRegion());
        Browser.click(CheckEligibilityPageObjects.getDDL_Option((data.get("Preferred_Region"))));

    }

    // Select  from DropDown Preferred City ,  Can Change the Data in Run Manager
    public void selectPreferredCity(Map<String, String> data) throws Exception {
        Browser.click(CheckEligibilityPageObjects.DDLPreferredCity());
        Browser.click(CheckEligibilityPageObjects.getDDL_Option((data.get("Preferred_City"))));

    }

    // Select  from DropDown Preferred District ,  Can Change the Data in Run Manager
    public void selectPreferredDistrict(Map<String, String> data) throws Exception {

        if (Browser.isElementPresent(CheckEligibilityPageObjects.DDLPreferredDistrict())) {
            Browser.click(CheckEligibilityPageObjects.DDLPreferredDistrict());
            Browser.click(CheckEligibilityPageObjects.getDDL_Option((data.get("Preferred_District"))));
        }
    }


    // Select  from DropDown Current Housing Status ,  Can Change the Data in Run Manager
    public void selectCurrentHosingStatus(Map<String, String> data) throws Exception {
        if (Browser.isElementPresent(CheckEligibilityPageObjects.DDLCurrentHosingStatus()) && Browser.isElementPresent(CheckEligibilityPageObjects.getDDL_Option(data.get("Current_Hosing_Status")))) {
        } else {
            Browser.click(CheckEligibilityPageObjects.DDLCurrentHosingStatus());
            Browser.click(CheckEligibilityPageObjects.getDDL_Option((data.get("Current_Hosing_Status"))));

        }
    }

    // Verify the Validation Message of the Data in Verify Information Step
    public void verifyTheValidationMessageOfInformationStep() throws Exception {
        Browser.waitUntilVisibilityOfElement(CheckEligibilityPageObjects.MsgRequired(), 6);
        Browser.executeJSScrollIntoView(CheckEligibilityPageObjects.MsgRequired());
        Assert.assertTrue(Browser.isElementPresent(CheckEligibilityPageObjects.MsgRequired()));
        Browser.takeScreenshot();

    }

    // Click on Confirmation Button
    public void clickOnConfirmButton() throws Exception {
        Browser.executeJSClick(CheckEligibilityPageObjects.BTNConfirm());

    }


}














