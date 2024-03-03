package sa.nhc.sakani.web.pages;


import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.FinancialAdvisoryPageObjects;

import java.util.Map;


public class FinancialAdvisoryPage {

    public FinancialAdvisoryPage() {
    }

    // Click On Start Service of Financial Advisory
    public void clickOnStartServiceButton() throws Exception {
        Browser.click(FinancialAdvisoryPageObjects.BTNStartService());


    }

    // Verify financial Advisory Button is Clickable
    public void verifyFinancialAdvisoryServiceIsClicked() throws Exception {
        Browser.waitUntilVisibilityOfElement(FinancialAdvisoryPageObjects.BTNStartService(), 6);
        Assert.assertTrue(Browser.isElementPresent(FinancialAdvisoryPageObjects.BTNStartService()));
        Browser.takeScreenshot();

    }

    // Verify the Data of Final Purchasing Power Step is Required
    public void verifyFinalPurchasingPowerWithInvalidData() throws Exception {
        Browser.click(FinancialAdvisoryPageObjects.ChooseProductType());
        Browser.waitUntilVisibilityOfElement(FinancialAdvisoryPageObjects.MsgRequired(), 6);
        Assert.assertTrue(Browser.isElementPresent(FinancialAdvisoryPageObjects.MsgRequired()));
        Browser.takeScreenshot();

    }

    //Verify the Navigation to Final Purchasing Power Step
    public void verifyTheNavigationFinalPurchasingPower() throws Exception {
        Browser.waitUntilVisibilityOfElement(FinancialAdvisoryPageObjects.DDLTypeOfEmployment(), 6);
        Assert.assertTrue(Browser.isElementPresent(FinancialAdvisoryPageObjects.DDLTypeOfEmployment()));
        Browser.takeScreenshot();

    }

    // Select from DropDown Type of Employment ,  Can Change the Data in Run Manager
    public void selectTypeOfEmployment(Map<String, String> data) throws Exception {

        if (Browser.isElementPresent(FinancialAdvisoryPageObjects.DDLTypeOfEmployment()) && Browser.isElementPresent(FinancialAdvisoryPageObjects.getDDL_Option(data.get("Type_Of_Employment")))) {
        } else {
            Browser.click(FinancialAdvisoryPageObjects.DDLTypeOfEmployment());
            Browser.click(FinancialAdvisoryPageObjects.getDDL_Option((data.get("Type_Of_Employment"))));


            if (Browser.isElementPresent(FinancialAdvisoryPageObjects.DDLMilitaryRank()) && (Browser.isElementPresent(FinancialAdvisoryPageObjects.DDLNameMilitarySector()))) {
                Browser.click(FinancialAdvisoryPageObjects.DDLMilitaryRank());
                Browser.click(FinancialAdvisoryPageObjects.getDDL_Option((data.get("Military_Rank"))));
                Browser.click(FinancialAdvisoryPageObjects.DDLNameMilitarySector());
                Browser.click(FinancialAdvisoryPageObjects.getDDL_Option((data.get("Name_Military_Sector"))));
            }
        }
    }

    // Select from DropDown Salary Bank ,  Can Change the Data in Run Manager
    public void selectSalaryBank(Map<String, String> data) throws Exception {


        if ( Browser.isElementNotPresent(FinancialAdvisoryPageObjects.DDLSalaryBank()) && Browser.isElementPresent(FinancialAdvisoryPageObjects.getDDL_Option(data.get("Salary_Bank")))){
            Browser.click(FinancialAdvisoryPageObjects.DDLSalaryBank());
            Browser.click(FinancialAdvisoryPageObjects.getDDL_Option((data.get("Salary_Bank"))));
        }

    }

    // Enter Basic Salary ,  Can Change the Data in Run Manager
    public void enterBasicSalary(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTBasicSalary());
        Browser.setText(FinancialAdvisoryPageObjects.TXTBasicSalary(),data.get("Basic_Salary"));
    }

    // Enter Housing Allowance ,  Can Change the Data in Run Manager
    public void enterHousingAllowance(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTHousingAllowance());
        Browser.setText(FinancialAdvisoryPageObjects.TXTHousingAllowance(),data.get("Housing_Allowance"));

    }

    // Enter Other Allowances ,  Can Change the Data in Run Manager
    public void enterOtherAllowances(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTOtherAllowances());
        Browser.setText(FinancialAdvisoryPageObjects.TXTOtherAllowances(),data.get("Other_Allowances"));

    }

    // Enter Total Financial Saving ,  Can Change the Data in Run Manager
    public void enterTotalFinancialSaving(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTTotalFinancialSavings());
        Browser.setText(FinancialAdvisoryPageObjects.TXTTotalFinancialSavings(),data.get("Total_Financial_Savings"));

    }

    // Enter the Value of the Down Payment ,  Can Change the Data in Run Manager
    public void enterTheValueOfTheDownPayment(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTTheValueOfTheDownPayment());
        Browser.setText(FinancialAdvisoryPageObjects.TXTTheValueOfTheDownPayment(),data.get("The_Value_Of_The_Down_Payment"));

    }

    // Enter Monthly Commitments ,  Can Change the Data in Run Manager
    public void enterMonthlyCommitments(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTMonthlyCommitments());
        Browser.setText(FinancialAdvisoryPageObjects.TXTMonthlyCommitments(),data.get("Monthly_Commitments"));

    }

    // Enter Duration of Commitments ,  Can Change the Data in Run Manager
    public void enterDurationOfCommitments(Map<String, String> data) throws Exception {
        Browser.clearText(FinancialAdvisoryPageObjects.TXTDurationOfCommitments());
        Browser.setText(FinancialAdvisoryPageObjects.TXTDurationOfCommitments(),data.get("Duration_Of_Commitments"));

    }

    // Select from DropDown Preferred Unit Types ,  Can Change the Data in Run Manager
    public void selectPreferredUnitTypes(Map<String, String> data) throws Exception {
        Browser.click(FinancialAdvisoryPageObjects.DDLPreferredUnitTypes());
        Browser.click(FinancialAdvisoryPageObjects.getDDL_Option((data.get("Preferred_Unit_Types"))));


    }

    // Click on Choose Product Type
    public void clickOnChooseProductType() throws Exception {
        Browser.executeJSScroll(150);
        Browser.click(FinancialAdvisoryPageObjects.ChooseProductType());

    }

    // Scroll to Specific Point
    public void scrollTo() throws Exception {
//        Browser.moveToElement(FinancialAdvisoryPageObjects.ScrollTo());
        Browser.executeJSScroll(1150);

    }

    // Click on Additional Saving Information Checkbox
    public void clickOnAdditionalSavingInformationCheckbox() throws Exception {
        Browser.executeJSClick(FinancialAdvisoryPageObjects.CheckboxAdditionalSavingInformation());

    }

    // Click on Submit Button
    public void clickOnSubmitButton() throws Exception {
        Browser.click(FinancialAdvisoryPageObjects.BTNSubmit());

    }

//    public void clickOnUpdateInfo(){
//        if(Browser.isElementPresent(FinancialAdvisoryPageObjects.)){
//            Actions.click(BTN_Update_Info);
//        } else {
//            Actions.sleep(1);
//        }
//    }
}
