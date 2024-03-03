package sa.nhc.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.CreateAndPublishProjectPageObjects;
import sa.nhc.web.objects.UpdateUnitPageObjects;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.userDesiredCapabilities;

public class UpdateUnitPage {


    public void clickOnTheProjectsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.theProjectButton(), 30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.theProjectButton());
    }

    public void clickOnAdvancedSearchRadioButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(UpdateUnitPageObjects.dotsLoading(), 30);
//        Browser.waitUntilElementToBeClickable(UpdateUnitPageObjects.advancedSearchRadioButton(),30);
        Browser.waitForSeconds(1);
        Browser.click(UpdateUnitPageObjects.advancedSearchRadioButton());

    }

    public void clickOnProjectCode(String projectCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.advancedSearchRadioButton(), 30);
        Browser.waitForSeconds(1);
        Browser.click(UpdateUnitPageObjects.advancedSearchRadioButton());
        Browser.click(UpdateUnitPageObjects.projectCodeDropdownList());
        selectFromList(projectCode);
        Browser.waitForSeconds(2);
        logger.addScreenshot("Search By Project Code");


    }

    public void selectFromList(String list) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.selectOption(), 30);
        List<WebElement> selectList = driver.findElements(UpdateUnitPageObjects.selectOption());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(list)) {
                listName.click();
                break;
            }
        }
    }

    public void clickOnSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.searchButton(), 30);
        Browser.click(UpdateUnitPageObjects.searchButton());

    }

    public void clickOnSearchBy() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.searchBy(), 30);
        Browser.click(UpdateUnitPageObjects.searchBy());
        selectFromList("رمز الوحدة");

    }

    public void clickOnDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.detailsButton(), 30);
        Browser.waitForSeconds(1);
        Browser.click(UpdateUnitPageObjects.detailsButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Display The Searched Unit");
    }

    public void clickOnUnitsDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitsDetailsButton(), 30);
        Browser.click(UpdateUnitPageObjects.unitsDetailsButton());
    }

    public void enterUnitCode(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitCodeInput(), 30);
        Browser.setText(UpdateUnitPageObjects.unitCodeInput(), unitCode);
    }

    public void checkUnitStatusInactiveUpdate() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitStatus(), 30);
        Browser.executeJSScrollIntoView(UpdateUnitPageObjects.unitStatus());
        Browser.waitForSeconds(1);
        String unitStatus = Browser.getWebElement(UpdateUnitPageObjects.unitStatus()).getText();
        unitStatus = unitStatus.trim();
        boolean status = false;
        if(unitStatus.contains("غير نشط")){
            status = true;
        }
        Assert.assertTrue(status, "Unit is not updated");
        Browser.waitForSeconds(2);
        logger.addScreenshot("Unit Status is: " + unitStatus);
    }

    public void checkUnitStatusActiveUpdate() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitStatus(), 30);
        Browser.waitForSeconds(1);
        String unitStatus = Browser.getWebElement(UpdateUnitPageObjects.unitStatus()).getText();
        boolean status = false;
        unitStatus = unitStatus.trim();
        if(unitStatus.equalsIgnoreCase("نشط")){
            status = true;
        }
        Assert.assertTrue(status, "Unit is not updated");
        Browser.waitForSeconds(2);
        logger.addScreenshot("Unit Status is: " + unitStatus);
    }

    public void clickOnUpdateUnitsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.updateUnitsButton(), 30);
        Browser.click(UpdateUnitPageObjects.updateUnitsButton());
    }

    public void clickOnNewUpdateButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.newUpdateButton(), 30);
        Browser.click(UpdateUnitPageObjects.newUpdateButton());

    }

    public static String setDownloadPath() {
        String fileName = "update_unit_template.xlsx";
        String downloadPath = System.getProperty("user.dir") + "\\src\\test\\resources\\downloads\\" + fileName;
        return downloadPath;
    }

    public void deleteFile() {
        File file = new File(setDownloadPath());
        if(file.exists())
            if(file.delete()){
                logger.info("Existing file is deleted");
            }
    }

    public void clickOnDownloadTemplateButton() throws Exception {
        deleteFile();
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.downloadTemplateButton(), 30);
        Browser.waitForSeconds(1);
        Browser.click(UpdateUnitPageObjects.downloadTemplateButton());
        TCRobot robot = new TCRobot();
        Browser.waitForSeconds(2);
        robot.setText(setDownloadPath());
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitForSeconds(3);
    }

    public void clickOnUploadTemplateButton() throws Exception {
//        String home = System.getProperty("user.dir");
//        String filePath = home + "\\Downloads\\update_unit_template.xlsx";
        WebElement UploadFile = Browser.getWebElement(UpdateUnitPageObjects.uploadTemplateButton());
        UploadFile.sendKeys(setDownloadPath());
    }


    public void clickOnAnalyzeTheFileButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.analyzeTheFileButton(), 30);
        Browser.click(UpdateUnitPageObjects.analyzeTheFileButton());

    }

    public void clickOnShowTheResultButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.showTheResultButton(), 30);
        Browser.click(UpdateUnitPageObjects.showTheResultButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("The Result Of The Unit To Update");

    }

    public void clickOnCommitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.commitButton(), 30);
        Browser.click(UpdateUnitPageObjects.commitButton());
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.successMessage(), 30);
        String success = Browser.getWebElement(UpdateUnitPageObjects.successMessage()).getText();
        Assert.assertTrue(success.contains("تم إعتماد الوحدات بنجاح"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("The Units Successfully Commit It");
        Browser.click(UpdateUnitPageObjects.yesButton());

    }

    public void checkTheErrorMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.errorMessage(), 30);
        String error = Browser.getWebElement(UpdateUnitPageObjects.errorMessage()).getText();
        Assert.assertTrue(error.contains("تقرير الأخطاء"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("Unit should not be booked");

    }


    /**
     * Method to read and edit the update unit template file
     *
     * @param projectCode   - Project code of the unit
     * @param productCode   - Unit code that needs to be updated
     * @param newUnitStatus - New status to be given to the unit
     */
    public void editTemplateFile(String projectCode, String productCode, String newUnitStatus) throws IOException {
//        String home = System.getProperty("user.home");
//        String filePath = home + "\\Downloads\\update_unit_template.xlsx";
        FileInputStream fileRead = new FileInputStream(new File(setDownloadPath()));
        Workbook workbook = new XSSFWorkbook(fileRead);
        System.out.println("File is opened");
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = sheet.getLastRowNum(); i > 0; i--) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 3; j++) {
                Cell cell = row.createCell(j);
                switch (i) {
                    case 0, 1, 2:
                        cell.setCellValue("");
                        break;
                    default:
                        System.out.println("Error occurred while writing to excel template ");
                }
            }
        }


        int firstRowNum = sheet.getFirstRowNum();
        System.out.println(firstRowNum);


        Row row = sheet.createRow(firstRowNum + 1);
        for (int i = 0; i < 3; i++) {
            Cell cell = row.createCell(i);

            switch (i) {
                case 0:
                    cell.setCellValue(projectCode);
                    break;
                case 1:
                    cell.setCellValue(productCode);
                    break;
                case 2:
                    cell.setCellValue(newUnitStatus);
                    break;
                default:
                    System.out.println("Error occurred while writing to excel template ");
            }
        }
        FileOutputStream fos = new FileOutputStream(setDownloadPath());
        workbook.write(fos);
        fos.close();
    }

    public void NavigateToProjectsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.Hover(), 20);
        Browser.moveToElement(CreateAndPublishProjectPageObjects.Hover());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.BTNInter(), 20);
        Browser.click(CreateAndPublishProjectPageObjects.BTNInter());
        Browser.click(CreateAndPublishProjectPageObjects.BTNProjects());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
    }

    public void navigateToDevelopersPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.Hover(), 20);
        Browser.moveToElement(CreateAndPublishProjectPageObjects.Hover());
        Browser.waitUntilVisibilityOfElement(CreateAndPublishProjectPageObjects.PartnersOption(), 20);
        Browser.click(CreateAndPublishProjectPageObjects.PartnersOption());
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.DevelopersOption(), 20);
        Browser.click(UpdateUnitPageObjects.DevelopersOption());
        logger.addScreenshot("");
    }

    public void clickOnAddDeveloperButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.AddDeveloperButton(), 20);
        Browser.click(UpdateUnitPageObjects.AddDeveloperButton());
    }

    public void enterName(String companyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.NameInputField(), 20);
        Browser.setText(UpdateUnitPageObjects.NameInputField(), companyName);
    }

    public void enterRealName(String realName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.RealNameInputField(), 20);
        Browser.setText(UpdateUnitPageObjects.RealNameInputField(), realName);
    }

    public void enterCrNumber(String crNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.CrNumberInputField(), 20);
        Browser.setText(UpdateUnitPageObjects.CrNumberInputField(), crNumber);
    }

    public void enterDescription(String description) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.DescriptionInputField(), 20);
        Browser.setText(UpdateUnitPageObjects.DescriptionInputField(), description);
    }

    public void selectStatusOfDeveloper(String status) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.StatusDropdown(), 20);
        Browser.click(UpdateUnitPageObjects.StatusDropdown());
        List<WebElement> statusList = driver.findElements(UpdateUnitPageObjects.StatusDropdownOptions());
        for (WebElement listOption : statusList) {
            String getOptionName = listOption.getText();
            if (getOptionName.contains(status)) {
                listOption.click();
                break;
            }
        }
        Browser.waitForSeconds(2);
        logger.addScreenshot("Developer option is added with status: " + status);
    }

    public void clickOnSaveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.SaveButton(), 20);
        Browser.click(UpdateUnitPageObjects.SaveButton());
    }

    public void verifyConfirmationPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.ConfirmationPopUpMessage(), 300);
        Assert.assertTrue(Browser.isElementPresent(UpdateUnitPageObjects.ConfirmationPopUpMessage()));
        logger.addScreenshot("");
    }

    public void enterProjectCode(String projectCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.ProjectCodeInput(), 20);
        Browser.setText(UpdateUnitPageObjects.ProjectCodeInput(), projectCode);
    }

    public void clickOnProjectSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.SearchButtonOnProjectsPage(), 20);
        Browser.click(UpdateUnitPageObjects.SearchButtonOnProjectsPage());
    }

    public void viewDetailsOfProject() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.ViewProjectDetails(), 300);
        Browser.click(UpdateUnitPageObjects.ViewProjectDetails());
    }

    public void changeDeveloperName(String companyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.DeveloperNameInput(), 20);
        Browser.click(UpdateUnitPageObjects.DeveloperNameInput());
        Browser.waitForSeconds(1);
        Browser.clearText(UpdateUnitPageObjects.DeveloperNameInput());
        Browser.waitForSeconds(1);
        Browser.setText(UpdateUnitPageObjects.DeveloperNameInput(), companyName);
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.SelectDeveloperNameDropdown(), 20);
        WebElement ele = Browser.getWebElement(UpdateUnitPageObjects.SelectDeveloperNameDropdown());
        ele.click();
        Browser.waitForSeconds(1);
        logger.addScreenshot("Developer name is changed to new Developer: " + companyName);
    }

    public void enterIBAN(String iban) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.IbanInput(), 20);
        Browser.setText(UpdateUnitPageObjects.IbanInput(), iban);
    }


    public void selectBankName(String bankName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.BankNameDropdown(), 20);
        Browser.click(UpdateUnitPageObjects.BankNameDropdown());
        List<WebElement> nameList = Browser.getWebElements(UpdateUnitPageObjects.BankNameDropdownOptions());
        for (WebElement listOption : nameList) {
            String getOptionName = listOption.getText();
            if (getOptionName.contains(bankName)) {
                listOption.click();
                break;
            }
        }
        Browser.waitForSeconds(2);
        logger.addScreenshot("Entered Bank name and Iban");
    }

    public void verifyDeveloperIsAdded(String companyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.DeveloperList(), 100);
        Browser.waitForSeconds(3);
        WebElement ele = Browser.getWebElement(UpdateUnitPageObjects.DeveloperList());
        boolean match = false;
        String actualCompanyName = ele.getText();
        if (actualCompanyName.contains(companyName)) {
            match = true;
        }
        Assert.assertTrue(match, "Developer is not added");
        logger.addScreenshot("Added developer: " + actualCompanyName);
    }

    public void searchForDeveloper(String companyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.SearchDeveloper(), 100);
        Browser.setText(UpdateUnitPageObjects.SearchDeveloper(), companyName);
    }
}

