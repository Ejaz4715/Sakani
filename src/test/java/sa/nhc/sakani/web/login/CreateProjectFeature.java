package sa.nhc.sakani.web.login;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.nhc.sakani.web.base.NHSSakaniWebTest;
import java.util.Map;

public class CreateProjectFeature extends NHSSakaniWebTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName ="TC_WEB_01",
            description = "Verify Admin able to create and publish OffPlan MOH project Without Fess")
    public void CreateAndPublishOffPlanMOHProjectWithoutFess(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLoginAsAdmin(data);
        logger.info("Step 02: Create New Project,Fill project details,Enable AZM,Disabled Fee option");
        app.createProjectPage.clickOnAddNewProject();
        app.createProjectPage.addProjectDetails(data);
        app.createProjectPage.clickOnAZMLabelAndDisabledTheFeeOption();
        logger.info("Step 03: Add Project Financial Institutions");
        app.createProjectPage.addProjectFinancialInstitutions();
        logger.info("Step 04: Import New Unit");
        app.createProjectPage.importNewUnitOffPlanMOH(data);
        logger.info("Step 05: Add media for Units Models and check Status is Published");
        app.createProjectPage.verifyUnitsModelsStatus();
        logger.info("Step 06: Add The Media");
        app.createProjectPage.addMedia(data);
        logger.info("Step 07: Verify The Project Created and Published");
        app.createProjectPage.verifyTheProjectIsPublished();
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName ="TC_WEB_02",
            description = "Verify Admin able to create and publish OffPlan MOH project With Fess")
    public void CreateAndPublishOffPlanMOHProjectWithFess(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLoginAsAdmin(data);
        logger.info("Step 02: Create New Project,Fill project details,Enable AZM,Enable Fee option");
        app.createProjectPage.clickOnAddNewProject();
        app.createProjectPage.addProjectDetails(data);
        app.createProjectPage.clickOnAZMSwitch();
        app.createProjectPage.clickOnSaveButton();
        logger.info("Step 03: Add Project Financial Institutions");
        app.createProjectPage.addProjectFinancialInstitutions();
        logger.info("Step 04: Import New Unit");
        app.createProjectPage.importNewUnitOffPlanMOH(data);
        logger.info("Step 05: Add media for Units Models and check Status is Published");
        app.createProjectPage.verifyUnitsModelsStatus();
        logger.info("Step 06: Add The Media");
        app.createProjectPage.addMedia(data);
        logger.info("Step 07: Verify The Project Created and Published");
        app.createProjectPage.verifyTheProjectIsPublished();
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_03-Verify Admin able to create and publish offplan private project Without Fess",
            description = "Verify Admin able to create and publish OffPlan private project Without Fees")
    public void CreateAndPublishOffPlanPrivateProjectWithoutFees(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application , Enter Username, Enter Password, click Login");
        app.loginPage.userLoginAsAdmin(data);
        logger.info("Step 02: Create New Project,Fill project details,Enable AZM,Disabled Fee option");
        app.createProjectPage.clickOnAddNewProject();
        app.createProjectPage.addProjectDetails(data);
        app.createProjectPage.clickOnAZMLabelAndDisabledTheFeeOption();
        logger.info("Step 03: Add Project Financial Institutions");
        app.createProjectPage.addProjectFinancialInstitutions();
        logger.info("Step 04: Import New Unit");
        app.createProjectPage.importNewUnitOffPlanPrivate(data);
        logger.info("Step 05: Verify Units Models Status is Published");
        app.createProjectPage.verifyUnitsModelsStatus();
        logger.info("Step 06: Add The Media");
        app.createProjectPage.addMedia(data);
        logger.info("Step 07: Verify The Project Created and Published");
        app.createProjectPage.verifyTheProjectIsPublished();
        Browser.close();

    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_04-Verify Admin able to create and publish offplan private project  With Fess",
            description = "Verify Admin able to create and publish OffPlan private project With Fees")
    public void CreateAndPublishOffPlanPrivateProjectWithFees(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLoginAsAdmin(data);
        logger.info("Step 02: Create New Project,Fill project details,Enable AZM,Disabled Fee option");
        app.createProjectPage.clickOnAddNewProject();
        app.createProjectPage.addProjectDetails(data);
        app.createProjectPage.clickOnAZMSwitch();
        app.createProjectPage.clickOnSaveButton();
        logger.info("Step 03: Add Project Financial Institutions");
        app.createProjectPage.addProjectFinancialInstitutions();
        logger.info("Step 04: Import New Unit");
        app.createProjectPage.importNewUnitOffPlanPrivate(data);
        logger.info("Step 05: Verify Units Models Status is Published");
        app.createProjectPage.verifyUnitsModelsStatus();
        logger.info("Step 06: Add The Media");
        app.createProjectPage.addMedia(data);
        logger.info("Step 07: Verify The Project Created and Published");
        app.createProjectPage.verifyTheProjectIsPublished();
        Browser.close();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_05-Verify Admin able to create and publish Land MOH project",
            description = " Verify Admin able to create and publish land MOH project")
    public void CreateAndPublishLandMOHProject(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.userLoginAsAdmin(data);
        logger.info("Step 02: Create New Project");
        app.createProjectPage.clickOnAddNewProject();
        app.createProjectPage.addProjectDetailsForLand(data);
        logger.info("Step 03: Import New Unit");
        app.createProjectPage.importNewUnitLandMOH(data);
        logger.info("Step 04: Add The Media");
        app.createProjectPage.addMedia(data);
        logger.info("Step 05: Verify The Project Created and Published");
        app.createProjectPage.verifyTheProjectIsPublished();
    }

//    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_22",
//    description = "Verify Admin able to create offPlan MOH project")
//    public void CreateOffPlanMOHProject(Map<String, String> data) throws Exception {
//        //Eligible - not Eligible
//        logger.info("Step 01: Open Sakani website");
//        app.openApplication(data);
//        logger.info("Step 02: Click on Login button");
//        app.loginPage.userLoginAsAdmin(data);
//        app.createProjectPage.clickOnAddNewProject();
//        app.createProjectPage.addProjectDetails(data);
//        Browser.close();
//
//    }
//
//    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_WEB_23",
//            description = "Verify Admin able to create offPlan Private project")
//    public void CreateOffPlanPrivate(Map<String, String> data) throws Exception {
//        //Eligible - not Eligible
//        logger.info("Step 01: Open Sakani website");
//        app.openApplication(data);
//        logger.info("Step 02: Click on Login button");
//        app.commonUtilityPage.switchLanguage();
//        app.homePage.clickOnLoginButtonInHomePage();
//        Browser.close();
//
//    }
}