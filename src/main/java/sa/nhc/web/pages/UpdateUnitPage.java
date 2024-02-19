package sa.nhc.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.UpdateUnitPageObjects;

import java.util.List;

public class UpdateUnitPage {


    public void clickOnTheProjectsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.theProjectButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.theProjectButton());

    }
    public void clickOnAdvancedSearchRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.advancedSearchRadioButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.advancedSearchRadioButton());

    }
    public void clickOnProjectCode() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.advancedSearchRadioButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.advancedSearchRadioButton());
        Browser.click(UpdateUnitPageObjects.projectCodeDropdownList());
        selectFromList("01-01-0108");

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

    }

    public void clickOnDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.detailsButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.detailsButton());

    }
    public void clickOnUnitsDetailsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitsDetailsButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(UpdateUnitPageObjects.unitsDetailsButton());

    }
    public void enterUnitCode(String unitCode) throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitCodeInput(),30);
        Browser.waitForSeconds(2);
        Browser.setText(UpdateUnitPageObjects.unitCodeInput(),unitCode);

    }
    public void checkUnitStatusInactiveUpdate() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitStatus(),30);
        Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(UpdateUnitPageObjects.unitStatus());
        String unitStatus = Browser.getWebElement(UpdateUnitPageObjects.unitStatus()).getText();
        Assert.assertTrue(unitStatus.contains("غير نشط"));

    }

    public void checkUnitStatusActiveUpdate() throws Exception {
        Browser.waitUntilVisibilityOfElement(UpdateUnitPageObjects.unitStatus(),30);
        Browser.waitForSeconds(2);
        String unitStatus = Browser.getWebElement(UpdateUnitPageObjects.unitStatus()).getText();
        Assert.assertTrue(unitStatus.contains("نشط"));

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

    }
}
