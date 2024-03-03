package sa.nhc.sakani.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.BookingPageObjects;
import sa.nhc.sakani.web.objects.CommonUtilityPageObjects;
import sa.nhc.sakani.web.objects.CreateAndPublishProjectPageObjects;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.testcrew.web.Browser.*;

public class CreateProjectPage extends WebBasePage {

    public void clickOnAddNewProject() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.Hover(), 30);
        Browser.moveToElement(CreateAndPublishProjectPageObjects.Hover());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNInter(), 30);
        Browser.click(CreateAndPublishProjectPageObjects.BTNInter());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Select Project from nav menu");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNProjects(),30);
        Browser.click(CreateAndPublishProjectPageObjects.BTNProjects());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNAddNewProject(), 50);
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAddNewProject());
        Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNAddNewProject(),30);
        Browser.waitForSeconds(1);
    }

    public void enterProjectName(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        driver.navigate().refresh();
        Browser.waitForSeconds(2);
        logger.info("Fill all Project Details");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTProjectName(), 10);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTProjectName(), data.get("Project_Name"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("Enter Project Name:  " + data.get("Project_Name"));
    }

    public void selectProjectType(Map<String, String> data) throws Exception {
        logger.info("Select Project Type : " + data.get("Project_Type"));
//        Browser.waitUntilElementToBeClickable(CreateAndPublishProjectPageObjects.DDLProjectType(), 20);
        Browser.waitForSeconds(7);
        Browser.click(CreateAndPublishProjectPageObjects.DDLProjectType());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type"))), 20);
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type"))));

    }

    public void selectRegion(Map<String, String> data) throws Exception {
        logger.info("Select Region : " + data.get("Region"));
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLRegion(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.DDLRegion());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Region"))));
    }

    public void enterCity(Map<String, String> data) throws Exception {
        logger.info("Select City : " + data.get("City"));
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTCity(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTCity(), data.get("City"));
    }

    public void selectDeveloper(Map<String, String> data) throws Exception {
        logger.info("Select Developer : " + data.get("Developer"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDeveloper(), data.get("Developer"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Developer"))));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void clickOnIsBookableSwitch() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.SlideToggleBookable(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.SlideToggleBookable());
    }

    public void clickOnAZMSwitch() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.SlideToggleAZM(), 20);
        Browser.click(CreateAndPublishProjectPageObjects.SlideToggleAZM());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        logger.addScreenshot("Enable AZM");

    }

    public void clickOnAZMLabelAndDisabledTheFeeOption() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.SlideToggleAZM(), 30);
        Browser.click(CreateAndPublishProjectPageObjects.SlideToggleAZM());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.projectSetting());
        Browser.waitForSeconds(1);
//        Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.projectSetting(),20);
        Browser.click(CreateAndPublishProjectPageObjects.projectSetting());
        logger.addScreenshot("");
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.feeLabelOption());
        Browser.click(CreateAndPublishProjectPageObjects.feeLabelOption());
        Browser.click(CreateAndPublishProjectPageObjects.feeLabelOption2());
        Browser.click(CreateAndPublishProjectPageObjects.feeLabelOption3());
        logger.addScreenshot("Disabled Fee Options");
        Browser.executeJSScroll(450);
//        Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSave(),20);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
    }

    public void selectSubsidizeLevel(Map<String, String> data) throws Exception {
        logger.info("Select Subsidize Level : " + data.get("Subsidize_Level"));
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLSubsidizeLevel(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.DDLSubsidizeLevel());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Subsidize_Level"))));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void selectProjectStatus(Map<String, String> data) throws Exception {
        Browser.click(CreateAndPublishProjectPageObjects.DDLProjectStatus());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Status"))));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void selectSubsidizeType(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLSubsidyType(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.DDLSubsidyType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Subsidy_Type"))));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void enterProjectLicense(Map<String, String> data) throws Exception {
        logger.info("Enter Project License : " + data.get("Project_License"));
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTProjectLicense(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTProjectLicense(), data.get("Project_License"));
    }

    public void enterIbanNumber(Map<String, String> data) throws Exception {
        logger.info("Enter Iban Number : " + data.get("Iban_Number"));
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTIbanNumber(), 7);
        Browser.executeJSScroll(250);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTIbanNumber(), data.get("Iban_Number"));
    }

    public void selectBankName(Map<String, String> data) throws Exception {
        logger.info("Select Bank Name : " + data.get("Bank_Name"));
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLBankName(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.DDLBankName());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Bank_Name"))));
    }

    public void enterDeductPercentage(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTDeductPercentage(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDeductPercentage(), data.get("Deduct_Percentage"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void enterDeedCity(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTDeedCity(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDeedCity(), data.get("Deed_City"));
    }

    public void clickOnSaveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSave(), 7);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void addProjectDetails(Map<String, String> data) throws Exception {
//        Browser.waitForSeconds(2);
//        driver.navigate().refresh();
//        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTProjectName(), 40);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTProjectName(), data.get("Project_Name"));
        logger.addScreenshot("Enter Project Name:  " + data.get("Project_Name"));
//        Browser.waitUntilElementToBeClickable(CreateAndPublishProjectPageObjects.DDLProjectType(),5);
        while(!(Browser.isElementPresent(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type")))))) {
            Browser.click(CreateAndPublishProjectPageObjects.DDLProjectType());
        }
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type"))), 50);
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type"))));
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.DDLRegion(),30);
        logger.addScreenshot("Fill all project details");
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.DDLRegion());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Region"))));
        logger.info("Select Region : " + data.get("Region"));
        logger.info("Select City : " + data.get("City"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTCity(), data.get("City"));
        logger.info("Select Developer : " + data.get("Developer"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDeveloper(), data.get("Developer"));
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Developer"))));
        Browser.click(CreateAndPublishProjectPageObjects.SlideToggleBookable());
        Browser.click(CreateAndPublishProjectPageObjects.DDLSubsidizeLevel());
        logger.info("Select Subsidize Level : " + data.get("Subsidize_Level"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Subsidize_Level"))));
        Browser.click(CreateAndPublishProjectPageObjects.DDLProjectStatus());
        logger.info("Select Project Status : " + data.get("Project_Status"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Status"))));
        Browser.click(CreateAndPublishProjectPageObjects.DDLSubsidyType());
        logger.addScreenshot("");
        logger.info("Select Subsidy Type : " + data.get("Subsidy_Type"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Subsidy_Type"))));
        //Browser.waitForSeconds(2);
        if(Browser.isElementPresent(CreateAndPublishProjectPageObjects.TXTMaxSubsidyAmount())){
        logger.info("Select Max Subsidy Amount : " + data.get("Max_Subsidy_Amount"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTMaxSubsidyAmount(), data.get("Max_Subsidy_Amount"));
        }
        Browser.executeJSScroll(150);
        selectِAgreementDate("15", "JUN", "2020");
        //Browser.waitForSeconds(3);
        logger.info("Select Project License : " + data.get("Project_License"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTProjectLicense(), data.get("Project_License"));
        selectِLicenseDate("14", "APR", "2020");
        logger.addScreenshot("");
        Browser.executeJSScroll(250);
        logger.info("Select Iban Number : " + data.get("Iban_Number"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTIbanNumber(), data.get("Iban_Number"));
        Browser.click(CreateAndPublishProjectPageObjects.DDLBankName());
        logger.info("Select Bank Name: " + data.get("Bank_Name"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Bank_Name"))));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDeductPercentage(), data.get("Deduct_Percentage"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDeedCity(), data.get("Deed_City"));
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());

    }

    public void addProjectDetailsForLand(Map<String, String> data) throws Exception {
//        Browser.waitForSeconds(2);
//        driver.navigate().refresh();
//        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTProjectName(), 40);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTProjectName(), data.get("Project_Name"));
        logger.addScreenshot("Enter Project Name:  " + data.get("Project_Name"));
//        Browser.waitUntilElementToBeClickable(CreateAndPublishProjectPageObjects.DDLProjectType(),5);
        while(!(Browser.isElementPresent(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type")))))) {
            Browser.click(CreateAndPublishProjectPageObjects.DDLProjectType());
        }
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type"))), 50);
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Project_Type"))));
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.DDLRegion(),30);
        logger.addScreenshot("Fill all project details");
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.DDLRegion());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Region"))));
        logger.info("Select Region : " + data.get("Region"));
        logger.info("Select City : " + data.get("City"));
        Browser.click(CreateAndPublishProjectPageObjects.DDLSubsidizeLevel());
        logger.info("Select Subsidize Level : " + data.get("Subsidize_Level"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Subsidize_Level"))));
        Browser.click(CreateAndPublishProjectPageObjects.SlideToggleBookable());
        Browser.click(CreateAndPublishProjectPageObjects.DDLSubsidyType());
        logger.addScreenshot("");
        logger.info("Select Subsidy Type : " + data.get("Subsidy_Type"));
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Subsidy_Type"))));
        //Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());

    }

    public void selectِAgreementDate(String day, String month, String year) throws Exception {
        Browser.executeJSScroll(150);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNAgreementDate(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAgreementDate());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseYearMonthDay(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNChooseYearMonthDay());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseAgreementYear(), 5);
        List<WebElement> listYear = driver.findElements(CreateAndPublishProjectPageObjects.BTNChooseAgreementYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseAgreementMonth(), 6);
        List<WebElement> listMonth = driver.findElements(CreateAndPublishProjectPageObjects.BTNChooseAgreementMonth());
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(month)) {
                m.click();
                break;
            }
        }
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseAgreementDay(), 6);
        List<WebElement> listDay = driver.findElements(CreateAndPublishProjectPageObjects.BTNChooseAgreementDay());
        for (WebElement d : listDay) {
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }
        logger.addScreenshot("Select Start Date");
    }

    public void selectِLicenseDate(String day, String month, String year) throws Exception {
        Browser.click(CreateAndPublishProjectPageObjects.BTNLicenseDate());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseYearMonthDay(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNChooseYearMonthDay());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseLicenseYear(), 5);
        List<WebElement> listYear = driver.findElements(CreateAndPublishProjectPageObjects.BTNChooseLicenseYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseLicenseMonth(), 6);
        List<WebElement> listMonth = driver.findElements(CreateAndPublishProjectPageObjects.BTNChooseLicenseMonth());
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(month)) {
                m.click();
                break;
            }
        }

        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNChooseLicenseDay(), 6);
        List<WebElement> listDay = driver.findElements(CreateAndPublishProjectPageObjects.BTNChooseLicenseDay());
        for (WebElement d : listDay) {
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }
        logger.addScreenshot("Select End Date");
    }


    public void addProjectFinancialInstitutions() throws Exception {
        Browser.waitForSeconds(1);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.ProjectFinancialInstitutions());
        Browser.click(CreateAndPublishProjectPageObjects.ProjectFinancialInstitutions());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.CheckboxProjectFinancialInstitutions(), 40);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.CheckboxProjectFinancialInstitutions());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Select All Financial Institutions options");
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSave());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSave(),20);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
    }

    public void importNewUnitOffPlanMOH(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheUnits(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.TheUnits());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNImportNewUnit(),40);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNImportNewUnit());
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 30);
        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type1"))));
        //Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());
        uploadFile("Offplan_MOH_units_apartment_sample.xlsx",1);
//        robotFiles("Offplan_MOH_units_apartment_sample.xlsx");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("Select Apartment and uploading the file");
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),10);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),10);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNCommit());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        //Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
        //Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        driver.navigate().back();
        Browser.waitForSeconds(2);
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 10);
        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type2"))));
        //Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());
        uploadFile("Offplan_MOH_units_villa_sample.xlsx",1);
        //robotFiles("Offplan_MOH_units_villa_sample.xlsx");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("Select villa and uploading the file");
        waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        driver.navigate().refresh();
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNCommit());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        //Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
        //Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        driver.navigate().back();
        Browser.waitForSeconds(2);
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type3"))));
        //Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());
        uploadFile("Offplan_MOH_units_townhouse_sample 1.xlsx",1);
        //robotFiles("Offplan_MOH_units_townhouse_sample 1.xlsx");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("Select TownHouse and uploading the file");
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNCommit());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNCommit(),20);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
        logger.addScreenshot("");
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNAccept(),20);
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNBack(),20);
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNBack());
    }

    public void robotFiles(String File) throws Exception {
        Robot robot = new Robot();
        robot.delay(2000);
        String CURRENT_DIR = System.getProperty("user.dir");
        String filepath1 = Paths.get(CURRENT_DIR, "src", "main", "resources", "units") + "\\" + File;
        StringSelection select1 = new StringSelection(filepath1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void uploadFile (String File , int index){
        String CURRENT_DIR = System.getProperty("user.dir");
        String filepath = Paths.get(CURRENT_DIR, "src", "main", "resources" ,"units") + "\\" + File;
        WebElement UploadFile = Browser.getWebElement(By.xpath("(//input[@type='file'])"+"[" +index +"]"));
        UploadFile.sendKeys(filepath);
        Browser.waitForSeconds(1);
    }


    public void importNewUnitOffPlanPrivate(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheUnits(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.TheUnits());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNImportNewUnit(),40);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNImportNewUnit());
        Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNImportNewUnit(),30);
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 30);
        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type1"))));
        //Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());
        uploadFile("Offplan_Private_units_apartment_sample.xlsx",1);
//        robotFiles("Offplan_MOH_units_apartment_sample.xlsx");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("Select Apartment and uploading the file");
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),10);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),10);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNCommit());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
        //Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        driver.navigate().back();
        Browser.waitForSeconds(2);
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 10);
        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type2"))));
        //Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());
        uploadFile("Offplan_Private_units_villa_sample.xlsx",1);
        //robotFiles("Offplan_MOH_units_villa_sample.xlsx");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("Select villa and uploading the file");
        waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        driver.navigate().refresh();
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNCommit());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
        //Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        driver.navigate().back();
        Browser.waitForSeconds(2);
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type3"))));
        //Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());
        uploadFile("Offplan_Private_units_townhouse_sample 1.xlsx",1);
        //robotFiles("Offplan_MOH_units_townhouse_sample 1.xlsx");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("Select TownHouse and uploading the file");
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNCommit());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNCommit(),20);
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
        logger.addScreenshot("");
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNAccept(),20);
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        //Browser.waitUntilInvisibilityOfElement(CreateAndPublishProjectPageObjects.BTNBack(),20);
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.BTNBack());
    }

    public void importNewUnitLandMOH(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheUnits(), 7);
        Browser.click(CreateAndPublishProjectPageObjects.TheUnits());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNImportNewUnit(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNImportNewUnit());
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLUnitType(), 6);
//        Browser.click(CreateAndPublishProjectPageObjects.DDLUnitType());
//        Browser.waitForSeconds(5);
//        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Unit_Type"))));
//        Browser.waitForSeconds(2);
//        Browser.click(CreateAndPublishProjectPageObjects.ImportUnitFile());

//        robotFiles("MOH_Land_units_land_sample.xlsx");
        uploadFile("MOH_Land_units_land_sample.xlsx",1);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.waitUntilInvisibilityOfElement(CommonUtilityPageObjects.SpinnerLoadingAdmin(),500);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.RecordsAndIssues(),20);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNBack());
        Browser.click(CreateAndPublishProjectPageObjects.RecordsAndIssues());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        if (Browser.isElementPresent(CreateAndPublishProjectPageObjects.BTNCommit())) {
            Browser.click(CreateAndPublishProjectPageObjects.BTNCommit());
            Browser.waitForSeconds(2);
            Browser.click(CreateAndPublishProjectPageObjects.BTNAccept());
        }
        else{
            Assert.assertTrue(Browser.isElementPresent(CreateAndPublishProjectPageObjects.BTNCommit()));
        }

        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNBack());
    }

    public void clickOnTheMedia() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheMedia(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.TheMedia());
    }

    public void uploadAdImage() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UploadAdImage(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.UploadAdImage());
        robotFiles("NHC_logo.png");
        Browser.click(CreateAndPublishProjectPageObjects.BTNUploadAdImage());
    }

    public void uploadMainScheme() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UploadMainScheme(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.UploadMainScheme());
        robotFiles("NHC_logo.png");
        Browser.click(CreateAndPublishProjectPageObjects.BTNUploadMainScheme());
    }

    public void uploadGallery() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UploadGallery(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.UploadGallery());
        robotFiles("NHC_logo.png");
        Browser.click(CreateAndPublishProjectPageObjects.BTNUploadGallery());
    }

    public void enterTitleOfDetailsPageProject(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTTitleOfDetailsPageProject(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTTitleOfDetailsPageProject(), data.get("Title_Of_Details_Page_Project"));

    }

    public void enterName(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTName(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTName(), data.get("Title_Of_Details_Page_Project"));
        Browser.takeScreenshot();

    }

    public void enterDescription(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTDescription(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDescription(), data.get("Description"));
        Browser.takeScreenshot();
    }

    public void enterLatitude(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTLatitude(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTLatitude(), data.get("Latitude"));
    }

    public void enterLongitude(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTLongitude(), 7);
        Browser.setText(CreateAndPublishProjectPageObjects.TXTLongitude(), data.get("Longitude"));
        Browser.takeScreenshot();
    }

    public void addMedia(Map<String, String> data) throws Exception {
        logger.info("Form project page add media and other details");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheMedia(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.TheMedia());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UploadAdImage(), 6);
//        Browser.click(CreateAndPublishProjectPageObjects.UploadAdImage());
        uploadFile("NHC_logo.png",2);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
//        Browser.click(CreateAndPublishProjectPageObjects.BTNUploadAdImage());
        logger.addScreenshot("");
        Browser.setText(CreateAndPublishProjectPageObjects.TXTTitleOfDetailsPageProject(), data.get("Title_Of_Details_Page_Project"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTName(), data.get("The_Name"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTSummary(), data.get("Summary"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTDescription(), data.get("Description"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTPriceStartingAt(), data.get("Price_Start_At"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTLatitude(), data.get("Latitude"));
        Browser.setText(CreateAndPublishProjectPageObjects.TXTLongitude(), data.get("Longitude"));
        logger.addScreenshot("");
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        logger.addScreenshot("");
    }

    public void verifyUnitsModelsStatus() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UnitsModels(),20);
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.UnitsModels());
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNModelApartmentStatus(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNModelApartmentStatus());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSaveModelStatus(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSaveModelStatus(),30);
//        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheMediaModel(),30);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.TheMediaModel());
        uploadFile("Test.mp4",1);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.uploadButton(),30);
        logger.addScreenshot("Uploading video");
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",2);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        logger.addScreenshot("Uploading image");
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",3);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",4);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",5);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",6);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",7);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",8);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        Browser.executeJSScroll(100);
//        uploadFile("NHC_logo.png",9);
        Browser.waitForSeconds(1);
//        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.unitName());
        Browser.setText(CreateAndPublishProjectPageObjects.unitName(), "Test Create Project A-11");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription1(), "Test this scenario land above and below the earth's surface");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription2(), "Test");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription3(), "Test");
        Browser.setText(CreateAndPublishProjectPageObjects.totalArea(), "600");
        //Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        Browser.takeScreenshot();
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.TheMediaModel());
        Browser.click(CreateAndPublishProjectPageObjects.BTNRequestApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNBackToMain());
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTModelStatus(), 6);
        Browser.waitForSeconds(2);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UnitsModels(),30);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        String Text = Browser.getWebElement(CreateAndPublishProjectPageObjects.TXTModelStatus()).getText();
        Assert.assertTrue(Text.contains(Text));
        logger.addScreenshot("Check status is published");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNModelVillaStatus(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNModelVillaStatus());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSaveModelStatus(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.TheMediaModel());
//        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
//        Browser.click(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());

//        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.TheMediaModel());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheMediaModel(),30);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.TheMediaModel());
        uploadFile("Test.mp4",1);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        logger.addScreenshot("Uploading video");
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",2);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        logger.addScreenshot("Uploading image");
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",3);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",4);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",5);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",6);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",7);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",8);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
//        uploadFile("NHC_logo.png",9);
        //Browser.waitForSeconds(1);
//        Browser.executeJSScroll(100);
//        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.unitName());
        Browser.setText(CreateAndPublishProjectPageObjects.unitName(), "Test Create Project A-11");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription1(), "Real Estate is property consisting of land and the buildings");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription2(), "Test");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription3(), "Test");
        Browser.setText(CreateAndPublishProjectPageObjects.totalArea(), "600");
        logger.addScreenshot("");
        Browser.click(CreateAndPublishProjectPageObjects.BTNRequestApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNBackToMain());
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTModelStatus(), 6);
        Browser.waitForSeconds(2);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UnitsModels(),30);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        String Text2 = Browser.getWebElement(CreateAndPublishProjectPageObjects.TXTModelStatus()).getText();
        Assert.assertTrue(Text.contains(Text2));
        logger.addScreenshot("Check status is published");
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNModelTownhouseStatus(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNModelTownhouseStatus());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNSaveModelStatus(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        //Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheMediaModel(),30);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.TheMediaModel());
        uploadFile("Test.mp4",1);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        logger.addScreenshot("Uploading video");
        uploadFile("NHC_logo.png",2);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",3);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        logger.addScreenshot("Uploading image");
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",4);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        uploadFile("NHC_logo.png",5);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",6);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
       // Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",7);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
        uploadFile("NHC_logo.png",8);
        //Browser.waitForSeconds(1);
        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        //Browser.waitForSeconds(1);
//        uploadFile("NHC_logo.png",9);
       // Browser.waitForSeconds(1);
//        Browser.executeJSScroll(100);
//        Browser.click(CreateAndPublishProjectPageObjects.uploadButton());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.unitName());
        Browser.setText(CreateAndPublishProjectPageObjects.unitName(), "Test Create Project A-11");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription1(), "Test this scenario land above and below the earth's surface");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription2(), "Test");
        Browser.setText(CreateAndPublishProjectPageObjects.unitDescription3(), "Test");
        Browser.setText(CreateAndPublishProjectPageObjects.totalArea(), "600");
        logger.addScreenshot("");
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSaveModelStatus());
        Browser.takeScreenshot();
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.TheMediaModel());
        Browser.click(CreateAndPublishProjectPageObjects.BTNRequestApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNBackToMain());
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTModelStatus(), 6);
        Browser.waitForSeconds(2);
        driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.UnitsModels(),30);
        Browser.waitForSeconds(2);
        Browser.click(CreateAndPublishProjectPageObjects.UnitsModels());
        String Text3 = Browser.getWebElement(CreateAndPublishProjectPageObjects.TXTModelStatus()).getText();
        Assert.assertTrue(Text.contains(Text3));
        logger.addScreenshot("Check status is published");
    }

    public void verifyTheProjectIsPublished() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TheMedia(), 6);
        Browser.click(CreateAndPublishProjectPageObjects.TheMedia());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.TheMedia());
        Browser.click(CreateAndPublishProjectPageObjects.ProjectDetails());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.BTNApprovalRequest());
        Browser.click(CreateAndPublishProjectPageObjects.BTNApprovalRequest());
        Browser.click(CreateAndPublishProjectPageObjects.BTNApprove());
        Browser.click(CreateAndPublishProjectPageObjects.BTNSave());
        Browser.executeJSScrollIntoView(CreateAndPublishProjectPageObjects.IsPublished());
        Assert.assertTrue(Browser.getWebElement(CreateAndPublishProjectPageObjects.IsPublished()).isEnabled());
        logger.addScreenshot("Project is saved and published");
    }
}


//    public void enterPriceStartingAt(Map<String, String> data) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTPriceStartingAt(), 7);
//        Browser.setText(CreateAndPublishProjectPageObjects.TXTPriceStartingAt(), data.get("Price_Start_At"));
//        Browser.waitForSeconds(5);
//    }
//    public void enterSummary(Map<String, String> data) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTSummary(), 7);
//        Browser.setText(CreateAndPublishProjectPageObjects.TXTSummary(), data.get("Summary"));
//        Browser.waitForSeconds(5);
//
//    }
//
//    public void enterMaxSubsidyAmount(Map<String, String> data) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTMaxSubsidyAmount(), 7);
//        Browser.setText(CreateAndPublishProjectPageObjects.TXTMaxSubsidyAmount(), data.get("Max_Subsidy_Amount"));
//        Browser.waitForSeconds(3);
//    }
//
//    public void selectProjectType(String city) throws Exception {
//        Browser.waitUntilVisibilityOfElement(LoginPageObjects.DDLProjectType(), 20);
//        Browser.waitForSeconds(2);
//        List<WebElement> listCity = driver.findElements(LoginPageObjects.DDLProjectType());
//        for (WebElement cityName : listCity) {
//            String getCityName = cityName.getText();
//            if (getCityName.contains(city)) {
//                cityName.click();
//                Browser.waitForSeconds(2);
//                break;
//            }
//        }
//        Browser.takeScreenshot();
//    }
//    public void selectProjectType(String city) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLProjectType(), 20);
//        Browser.waitForSeconds(2);
//        List<WebElement> listCity = Browser.driver.findElements(CreateAndPublishProjectPageObjects.DDLProjectType());
//        for (WebElement cityName : listCity){
//            String getCityName = cityName.getText();
//            if (getCityName.contains(city)){
//                cityName.click();
//                Browser.waitForSeconds(2);
//                break;
//            }
//        }
//        Browser.takeScreenshot();
//    }

//    public void clickOnSelfConstructionButton() throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.Hover(), 7);
//        Browser.moveToElement(CreateAndPublishProjectPageObjects.Hover());
//        Browser.waitForSeconds(2);
//        Browser.click(CreateAndPublishProjectPageObjects.BTNSelfConstruction());
//    }
//    public void clickOnServicesPackageButton() throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNServicesPackage(), 7);
//        Browser.waitForSeconds(2);
//        Browser.click(CreateAndPublishProjectPageObjects.BTNServicesPackage());
//    }
//    public void selectServicesPackage() throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.SelectServicesPackage(), 7);
//        Browser.waitForSeconds(2);
//        Browser.click(CreateAndPublishProjectPageObjects.SelectServicesPackage());
//    }
//    public void clickOnRelation() throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.Relation(), 7);
//        Browser.waitForSeconds(2);
//        Browser.click(CreateAndPublishProjectPageObjects.Relation());
//    }
//    public void clickOnLinkProject() throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNLinkProject(), 7);
//        Browser.waitForSeconds(2);
//        Browser.click(CreateAndPublishProjectPageObjects.BTNLinkProject());
//    }
//    public void selectSearchProjectToLink(Map<String, String> data) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.TXTSearchProjectToLink(), 7);
//        Browser.setText(CreateAndPublishProjectPageObjects.TXTSearchProjectToLink(),data.get("Select_Project_To_Link"));
//        Browser.waitForSeconds(5);
//        Browser.click(CreateAndPublishProjectPageObjects.getDDL_Option((data.get("Select_Project_To_Link"))));
//    }

//    public void clickOnAddNewProject() throws Exception {
//        Browser.waitUntilVisibilityOfElement(LoginPageObjects.Hover(), 7);
//        Browser.moveToElement(LoginPageObjects.Hover());
//        Browser.waitForSeconds(2);
//        Browser.click(LoginPageObjects.BTNInter());
//        Browser.waitForSeconds(2);
//        Browser.click(LoginPageObjects.BTNProjects());
//        Browser.waitUntilVisibilityOfElement(LoginPageObjects.BTNAddNewProject(), 7);
//        Browser.click(LoginPageObjects.BTNAddNewProject());
//    }

//    public void addProjectDetails(Map<String, String> data) throws Exception {
//        Browser.waitUntilVisibilityOfElement(LoginPageObjects.TXTProjectName(), 6);
//        Browser.setText(LoginPageObjects.TXTProjectName(), data.get("Project_Name"));
//        Browser.waitForSeconds(2);
//        Browser.click(LoginPageObjects.DDLProjectType_Arrow());
//        selectProjectType("مشاريع البيع على الخارطة على أراضي الوزارة");
////        Browser.click(LoginPageObjects.getDDL_Option((data.get("Project_Type"))));
//        Browser.waitForSeconds(2);
//        Browser.click(LoginPageObjects.DDLRegion());
//        Browser.click(LoginPageObjects.getDDL_Option((data.get("Region"))));
//        Browser.waitForSeconds(2);
//        Browser.setText(LoginPageObjects.TXTCity(), data.get("City"));
//        Browser.waitForSeconds(2);
//        Browser.setText(LoginPageObjects.TXTDeveloper(), data.get("Developer"));
//        Browser.click(LoginPageObjects.getDDL_Option((data.get("Developer"))));

//    public void clickOnReserveDocument() throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.ReserveDocument(), 6);
//        Browser.click(CreateAndPublishProjectPageObjects.ReserveDocument());
//        Browser.waitForSeconds(3);
//    }
//
//    public void addReserveDocument(Map<String, String> data) throws Exception {
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNAddReserveDocument(), 6);
//        Browser.click(CreateAndPublishProjectPageObjects.BTNAddReserveDocument());
//        Browser.waitForSeconds(3);
//        Robot robot = new Robot();
//        robot.delay(2000);
//        StringSelection file = new StringSelection("\"C:\\Users\\USER\\Desktop\\IMPORTANT-DAILY_CHECK_NHC\\NHC_logo.png\"");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
//        robot.delay(2000);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.delay(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        Browser.waitForSeconds(3);
//        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.DDLDocumentTemplateType(), 20);
////        Browser.waitForSeconds(2);
////        List<WebElement> listCity = Browser.driver.findElements(CreateAndPublishProjectPageObjects.DDLProjectType());
////        for (WebElement cityName : listCity){
////            String getCityName = cityName.getText();
////            if (getCityName.contains(city)){
////                cityName.click();
////                Browser.waitForSeconds(2);
////                break;
////            }
//
//        Browser.click(CreateAndPublishProjectPageObjects.DDLDocumentTemplateType());
//        Browser.waitForSeconds(3);
//    }

//
//    }

