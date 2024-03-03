package sa.nhc.sakani.web.login;


import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;

import java.util.Map;

public class CheckEligibilityFeature extends NHSSakaniWebTest {


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_11-Verify Check Eligibility Service in Sakani is Clickable  ",
            description = "Verify Check Eligibility Service is Clickable")
    public void verifyCheckEligibilityServiceIsClickable(Map<String, String> data) throws Exception {

        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already registered and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on check eligibility button");
        app.homePage.clickOnCheckEligibilityButton();
        logger.info("Step 05:Verify Check Eligibility Service Clicked ");
        app.checkEligibilityPage.verifyCheckEligibilityServiceIsClicked();

    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_12-Verify Acknowledgements Is Required",
            description = "Verify Acknowledgement Checkboxes are Required")
    public void verifyAcknowledgementIsRequired(Map<String, String> data) throws Exception {

        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already registered and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on check eligibility button");
        app.homePage.clickOnCheckEligibilityButton();
        logger.info("Step 05:Click on start service ");
        app.checkEligibilityPage.clickOnStartServiceButton();
        logger.info("Step 06: Click on agreement terms and conditions checkbox and button");
        app.checkEligibilityPage.clickOnAgreeTermsOfConditions();
        app.checkEligibilityPage.clickOnAgreeOnTheTermsAndConditionsButton();
        logger.info("Step 07: Verify The Validation Message");
        app.commonUtilityPage.spinnerLoading();
        app.checkEligibilityPage.verifyTheValidationMessageOfAcknowledgementCheckboxes();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_13-Verify Navigation to Information Step",
            description = "Verify Navigate To Verify Information Step ")
    public void verifyNavigateToVerifyInformationStep(Map<String, String> data) throws Exception {

        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already registered and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on check eligibility button");
        app.homePage.clickOnCheckEligibilityButton();
        logger.info("Step 05:Click on start service ");
        app.checkEligibilityPage.clickOnStartServiceButton();
        logger.info("Step 06: Click on agreement terms and conditions checkbox and button");
        app.checkEligibilityPage.clickOnAgreeTermsOfConditions();
        app.checkEligibilityPage.clickOnAgreeOnTheTermsAndConditionsButton();
        logger.info("Step 07: Click on Acknowledgement checkboxes and click on continue to confirm acknowledge button");
        app.commonUtilityPage.spinnerLoading();
        app.checkEligibilityPage.clickOnAcknowledgementCheckboxes();
        logger.info("Step 08: Verify The Navigation to Verify Information Step");
        app.checkEligibilityPage.verifyTheNavigationToVerifyInformationStep();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_14-The user using invalid data",
            description = "Verify The Data is Required in Verify Information Step")
    public void verifyInVerifyInformationStepWithInvalidData(Map<String, String> data) throws Exception {

        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already registered and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on check eligibility button");
        app.homePage.clickOnCheckEligibilityButton();
        logger.info("Step 05:Click on start service ");
        app.checkEligibilityPage.clickOnStartServiceButton();
        logger.info("Step 06: Click on agreement terms and conditions checkbox and button");
        app.checkEligibilityPage.clickOnAgreeTermsOfConditions();
        app.checkEligibilityPage.clickOnAgreeOnTheTermsAndConditionsButton();
        logger.info("Step 07: Click on Acknowledgement checkboxes and click on continue to confirm acknowledge button");
        app.commonUtilityPage.spinnerLoading();
        app.checkEligibilityPage.clickOnAcknowledgementCheckboxes();
        logger.info("Step 08:Click On Confirm Button");
        app.checkEligibilityPage.clickOnConfirmButton();
        logger.info("Step 9: Verify The Validation Message");
        app.checkEligibilityPage.verifyTheValidationMessageOfInformationStep();
    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_15-Verify TheBeneficiary Is Eligibility Support ",
            description = "Verify The Beneficiary is Eligibility Support Successfully ")
    public void verifyTheBeneficiaryIsEligibilitySupport(Map<String, String> data) throws Exception {

        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already registered and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on check eligibility button");
        app.homePage.clickOnCheckEligibilityButton();
        logger.info("Step 05:Click on start service ");
        app.checkEligibilityPage.clickOnStartServiceButton();
        logger.info("Step 06: Click on agreement terms and conditions checkbox and button");
        app.checkEligibilityPage.clickOnAgreeTermsOfConditions();
        app.checkEligibilityPage.clickOnAgreeOnTheTermsAndConditionsButton();
        logger.info("Step 07: Click on Acknowledgement checkboxes and click on continue to confirm acknowledge button");
        app.commonUtilityPage.spinnerLoading();
        app.checkEligibilityPage.clickOnAcknowledgementCheckboxes();
        logger.info("Step 08:Select Current Region");
        app.checkEligibilityPage.clickXClearButton();
        app.checkEligibilityPage.selectCurrentRegion(data);
        logger.info("Step 9:Select Current City");
        app.checkEligibilityPage.selectCurrentCity(data);
        logger.info("Step 010:Select Preferred Region");
        app.checkEligibilityPage.selectPreferredRegion(data);
        logger.info("Step 011:Select Preferred City and if exist Preferred District");
        app.checkEligibilityPage.selectPreferredCity(data);
        app.checkEligibilityPage.selectPreferredDistrict(data);
        logger.info("Step 012:Select Current Housing Status");
        app.checkEligibilityPage.selectCurrentHosingStatus(data);
        logger.info("Step 013:Click On Confirm Button");
        app.checkEligibilityPage.clickOnConfirmButton();
        logger.info("Step 014:Check is Eligibility Support from My Profile");
        app.commonUtilityPage.spinnerLoading();
        app.profilePage.closeRates();
        app.basicMethodsPage.HoverOnUserProfileButton();
        app.homePage.clickOnMyProfileButton();
        app.profilePage.checkEligibilitySupport();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_16-Verify TheBeneficiary Is Not Eligibility Support",
            description = "Verify The Beneficiary is Not Eligibility Support Successfully ")
    public void verifyTheBeneficiaryIsNotEligibilitySupport(Map<String, String> data) throws Exception {

        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already registered and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on check eligibility button");
        app.homePage.clickOnCheckEligibilityButton();
        logger.info("Step 05:Click on start service ");
        app.checkEligibilityPage.clickOnStartServiceButton();
        logger.info("Step 06: Click on agreement terms and conditions checkbox and button");
        app.checkEligibilityPage.clickOnAgreeTermsOfConditions();
        app.checkEligibilityPage.clickOnAgreeOnTheTermsAndConditionsButton();
        logger.info("Step 07: Click on Acknowledgement checkboxes and click on continue to confirm acknowledge button");
        app.commonUtilityPage.spinnerLoading();
        app.checkEligibilityPage.clickOnAcknowledgementCheckboxes();
        logger.info("Step 08:Select Current Region");
        app.checkEligibilityPage.clickXClearButton();
        app.checkEligibilityPage.selectCurrentRegion(data);
        logger.info("Step 9:Select Current City");
        app.checkEligibilityPage.selectCurrentCity(data);
        logger.info("Step 010:Select Preferred Region");
        app.checkEligibilityPage.selectPreferredRegion(data);
        logger.info("Step 011:Select Preferred City and if exist Preferred District");
        app.checkEligibilityPage.selectPreferredCity(data);
        app.checkEligibilityPage.selectPreferredDistrict(data);
        logger.info("Step 012:Select Current Housing Status");
        app.checkEligibilityPage.selectCurrentHosingStatus(data);
        logger.info("Step 013:Click On Confirm Button");
        app.checkEligibilityPage.clickOnConfirmButton();
        logger.info("Step 014:Check is not Eligibility Support from My Profile");
        app.commonUtilityPage.spinnerLoading();
        app.profilePage.closeRates();
        app.basicMethodsPage.HoverOnUserProfileButton();
        app.homePage.clickOnMyProfileButton();
        app.profilePage.checkEligibilitySupport();


    }
}
















