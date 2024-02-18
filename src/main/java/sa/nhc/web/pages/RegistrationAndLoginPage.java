package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import sa.nhc.web.objects.RegistrationAndLoginPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.testcrew.manager.PDFReportManager.logger;


public class RegistrationAndLoginPage extends WebBasePage {

    /*
    * Login through Sakani alert box
    * */
    public void loginToSakani() throws AWTException {
        TCRobot robot = new TCRobot();
        robot.setText("sakani");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_TAB);
        Browser.waitForSeconds(1);
        robot.setText("together we build Vision 2030");
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    /**
     * Method to Login to Sakani Partners
     * @param id - user national id
     * @param password - user password
     * */
    public void loginToSakaniPartners(String id, String password) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.loginButton(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.userNameInput(), id);
        Browser.setText(RegistrationAndLoginPageObjects.userPasswordInput(), password);
        Browser.click(RegistrationAndLoginPageObjects.loginButton());
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.OTPInput(), 20);
        Browser.setText(RegistrationAndLoginPageObjects.OTPInput(), "1234");
        Browser.click(RegistrationAndLoginPageObjects.verifyOTPButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Login to Sakani Partners");
    }

    /**
     * Method to verify homepage is appearing after user login
     * */
    public void verifyHomePageIsAppearing() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationAndLoginPageObjects.SakaniLogo(), 20);
        Assert.assertTrue(Browser.isElementDisabled(RegistrationAndLoginPageObjects.SakaniLogo()),"Login Successful");
    }

    /**
     * Method to read and edit the update unit template file
     * @param projectCode - Project code of the unit
     * @param productCode - Unit code that needs to be updated
     * @param newUnitStatus - New status to be given to the unit
     */
    public void editTemplateFile(String projectCode, String productCode, String newUnitStatus) throws IOException {
        String home = System.getProperty("user.home");
        String filePath = home + "\\Downloads\\update_unit_template_inactive.xlsx";
        FileInputStream fileRead = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileRead);
        System.out.println("File is opened");
        Sheet sheet = workbook.getSheetAt(0);

        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);


        Row row = sheet.createRow(lastRowNum-7);
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
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
    }



}