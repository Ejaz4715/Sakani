package sa.nhc.sakani.web.login;


import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;

import java.util.Map;

public class FinancialAdvisoryFeature extends NHSSakaniWebTest {


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_17-Verify Financial Advisory Service in Sakani is Clickable",
            description = "Verify Financial Advisory Service is Clickable")
    public void verifyFinancialAdvisoryServiceIsClickable(Map<String, String> data) throws Exception {
        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already eligible and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on financial advisory button");
        app.homePage.clickOnFinancialAdvisoryButton();
        logger.info("Step 05:Verify Financial Advisory Service Clicked");
        app.financialAdvisoryPage.verifyFinancialAdvisoryServiceIsClicked();


    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_18-Verify Navigation to final purchasing power",
            description = "Verify Navigate To Final Purchasing Power")
    public void verifyNavigateToFinalPurchasingPower(Map<String, String> data) throws Exception {
        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already eligible and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on financial advisory button");
        app.homePage.clickOnFinancialAdvisoryButton();
        logger.info("Step 05: Click on start service ");
        app.financialAdvisoryPage.clickOnStartServiceButton();
        logger.info("Step 06: Verify The Navigation to Final Purchasing Power");
        app.financialAdvisoryPage.verifyTheNavigationFinalPurchasingPower();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_19-Verify In Final Purchasing Power Page With Invalid Data",
            description = "Verify The Data is Required in Final Purchasing Power")
    public void verifyInFinalPurchasingPowerWithInvalidData(Map<String, String> data) throws Exception {
        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already eligible and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on financial advisory button");
        app.homePage.clickOnFinancialAdvisoryButton();
        logger.info("Step 05: Click on start service ");
        app.financialAdvisoryPage.clickOnStartServiceButton();
        logger.info("Step 06: Verify The Validation Message");
        app.financialAdvisoryPage.verifyFinalPurchasingPowerWithInvalidData();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_20-Verify Qualifying Financial Advisory Service Successfully",
            description = "Verify Financial Advisory Service is Successful")
    public void verifyFinancialAdvisoryServiceIsSuccessful(Map<String, String> data) throws Exception {
        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already eligible and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on financial advisory button");
        app.homePage.clickOnFinancialAdvisoryButton();
        logger.info("Step 05: Click on start service ");
        app.financialAdvisoryPage.clickOnStartServiceButton();
        logger.info("Step 06: Select Type of Employment ");
        app.financialAdvisoryPage.selectTypeOfEmployment(data);
        logger.info("Step 07: Select Salary Bank ");
        app.financialAdvisoryPage.selectSalaryBank(data);
        logger.info("Step 08: Enter Basic Salary ");
        app.financialAdvisoryPage.enterBasicSalary(data);
        logger.info("Step 9: Enter Housing Allowance ");
        app.financialAdvisoryPage.enterHousingAllowance(data);
        logger.info("Step 010: Enter Other Allowances ");
        app.financialAdvisoryPage.enterOtherAllowances(data);
        logger.info("Step 011: Enter Total Financial Savings");
        app.financialAdvisoryPage.enterTotalFinancialSaving(data);
        logger.info("Step 012: Enter Value of down payment ");
        app.financialAdvisoryPage.enterTheValueOfTheDownPayment(data);
        logger.info("Step 013: Enter Monthly Commitment ");
        app.financialAdvisoryPage.enterMonthlyCommitments(data);
        logger.info("Step 014: Enter Duration of Commitment ");
        app.financialAdvisoryPage.enterDurationOfCommitments(data);
        logger.info("Step 015: Choose Product Type");
        app.financialAdvisoryPage.clickOnChooseProductType();
        app.commonUtilityPage.spinnerLoading();
        logger.info("Step 016: Click on certify that additional saving information is correct checkbox");
        app.financialAdvisoryPage.scrollTo();
        app.financialAdvisoryPage.clickOnAdditionalSavingInformationCheckbox();
        logger.info("Step 017: Click on Submit Button");
        app.financialAdvisoryPage.clickOnSubmitButton();
        logger.info("Step 018: Verify Financial Advisory Service is Successful ");
        app.profilePage.checkQualifiedFinancialAdvisory();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_21-Verify Not Qualify Financial Advisory Service",
            description = "Verify Financial Advisory Service is not Successful")
    public void verifyNotQualifyFinancialAdvisoryService(Map<String, String> data) throws Exception {
        logger.info("Step 01: Open Sakani website");
        app.openApplication(data);
        logger.info("Step 02: Pre-Condition: User already not eligible and should be login");
        app.loginPage.userLogin(data);
        logger.info("Step 03: Hover on The Drop down services button");
        app.basicMethodsPage.HoverOnDropDownButtonServices();
        logger.info("Step 04: Click on financial advisory button");
        app.homePage.clickOnFinancialAdvisoryButton();
        logger.info("Step 05: Click on start service ");
        app.financialAdvisoryPage.clickOnStartServiceButton();
        logger.info("Step 06: Check You are not Eligible ");
        app.profilePage.checkNotEligible();

    }
}































