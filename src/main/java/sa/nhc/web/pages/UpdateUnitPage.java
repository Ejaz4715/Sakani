package sa.nhc.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.UpdateUnitPageObjects;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;

public class UpdateUnitPage {


    public void clickOnTheProjectsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.theProjectButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.theProjectButton());

    }
    public void clickOnAdvancedSearchRadioButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(UpdateUnitPageObjects.dotsLoading(),30);
//        Browser.waitUntilElementToBeClickable(UpdateUnitPageObjects.advancedSearchRadioButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.advancedSearchRadioButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Select Advanced Search");


    }
    public void clickOnProjectCode() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.advancedSearchRadioButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.advancedSearchRadioButton());
        Browser.click(UpdateUnitPageObjects.projectCodeDropdownList());
        selectFromList("01-01-0108");
        Browser.waitForSeconds(3);
        logger.addScreenshot("Search By Project Code");

    }

    public void selectFromList(String list) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.selectOption(), 30);
        Browser.waitForSeconds(2);
        List<WebElement> selectList = Browser.driver.findElements(UpdateUnitPageObjects.selectOption());
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(list)) {
                listName.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
    }

    public void clickOnSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.searchButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.searchButton());

    }

    public void clickOnSearchBy() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.searchBy(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.searchBy());
        selectFromList("رمز الوحدة");
        Browser.waitForSeconds(3);
        logger.addScreenshot("Search By Unit Code");

    }

    public void clickOnDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.detailsButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.detailsButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Display The Searched Unit");

    }
    public void clickOnUnitsDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitsDetailsButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.unitsDetailsButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Click Units Details");

    }
    public void enterUnitCode(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitCodeInput(),30);
        Browser.waitForSeconds(2);
        Browser.setText(UpdateUnitPageObjects.unitCodeInput(),unitCode);
        Browser.waitForSeconds(3);
        logger.addScreenshot("Enter The Unit Code For Searching");

    }
    public void checkUnitStatusInactiveUpdate() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitStatus(),30);
        Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(UpdateUnitPageObjects.unitStatus());
        String unitStatus = Browser.getWebElement(UpdateUnitPageObjects.unitStatus()).getText();
        Assert.assertTrue(unitStatus.contains("غير نشط"));
        Browser.waitForSeconds(3);
        logger.addScreenshot("Unit Status Is Inactive");

    }

    public void checkUnitStatusActiveUpdate() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitStatus(),30);
        Browser.waitForSeconds(2);
        String unitStatus = Browser.getWebElement(UpdateUnitPageObjects.unitStatus()).getText();
        Assert.assertTrue(unitStatus.contains("نشط"));
        Browser.waitForSeconds(3);
        logger.addScreenshot("Unit Status Is Active");

    }

    public void clickOnUpdateUnitsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.updateUnitsButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.updateUnitsButton());

    }
    public void clickOnNewUpdateButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.newUpdateButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.newUpdateButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Download And Upload The File Of Unit Template");

    }

    public static String setDownloadPath(){
        String fileName = "update_unit_template.xlsx";
        String downloadPath = System.getProperty("user.dir") + "\\src\\test\\resources\\downloads\\" + fileName ;
        return downloadPath;
    }

    public static void deleteFile(){
        File file = new File(setDownloadPath());
        if (file.delete()){
            logger.info("File deleted");
        }
    }




    public void clickOnDownloadTemplateButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.downloadTemplateButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.downloadTemplateButton());
        TCRobot robot = new TCRobot();
        Browser.waitForSeconds(5);
        robot.setText(setDownloadPath());
        Browser.waitForSeconds(3);
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitForSeconds(5);
    }

    public void clickOnUploadTemplateButton() throws Exception {
        Browser.waitForSeconds(2);
//        String home = System.getProperty("user.dir");
//        String filePath = home + "\\Downloads\\update_unit_template.xlsx";
        WebElement UploadFile = Browser.getWebElement(UpdateUnitPageObjects.uploadTemplateButton());
        UploadFile.sendKeys(setDownloadPath());
    }


    public void clickOnAnalyzeTheFileButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.analyzeTheFileButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.analyzeTheFileButton());

    }
    public void clickOnShowTheResultButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.showTheResultButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.showTheResultButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("The Result Of The Unit To Update");

    }
    public void clickOnCommitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.commitButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.commitButton());
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.successMessage(),30);
        String success = Browser.getWebElement(UpdateUnitPageObjects.successMessage()).getText();
        Assert.assertTrue(success.contains("تم إعتماد الوحدات بنجاح"));
        Browser.waitForSeconds(3);
        logger.addScreenshot("The Units Successfully Commit It");
        Browser.waitForSeconds(3);
        Browser.click(UpdateUnitPageObjects.yesButton());

    }
    public void checkTheErrorMessage() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.errorMessage(),30);
        Browser.waitForSeconds(2);
        String error = Browser.getWebElement(UpdateUnitPageObjects.errorMessage()).getText();
        Assert.assertTrue(error.contains("تقرير الأخطاء"));
        Browser.waitForSeconds(3);
        logger.addScreenshot("Unit should not be booked");

    }




    /**
     * Method to read and edit the update unit template file
     * @param projectCode - Project code of the unit
     * @param productCode - Unit code that needs to be updated
     * @param newUnitStatus - New status to be given to the unit
     */
    public void editTemplateFile(String projectCode, String productCode, String newUnitStatus) throws IOException {
//        String home = System.getProperty("user.home");
//        String filePath = home + "\\Downloads\\update_unit_template.xlsx";
        FileInputStream fileRead = new FileInputStream(new File(setDownloadPath()));
        Workbook workbook = new XSSFWorkbook(fileRead);
        System.out.println("File is opened");
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = sheet.getLastRowNum(); i > 0 ; i--){
            Row row = sheet.createRow(i);
            for (int j = 0 ; j < 3; j++) {
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
}