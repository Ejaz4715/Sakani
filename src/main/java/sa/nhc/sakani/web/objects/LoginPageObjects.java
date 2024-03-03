package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class LoginPageObjects {
    /**
     * Page Objects
     * A map of map is used to store the page objects of the Application
     * Add objects in the Right section
     * Add getters to get the Page Objects.
     * Name the method with the type of the object, following standards
     */

    static Map<String, Map<String, String>> objects = new HashMap<>() {{
        put("BTN_Login", new HashMap<>(){{
            put ("en", "//button[contains(text(),'Login')]");
            put ("ar", "//button[contains(text(), 'تسجيل الدخول ')]");
        }});
        put("TXT_ID_Number", new HashMap<>(){{
            put ("en", "//input[@id=\"nationId\"]");
            put ("ar", "//input[@id=\"nationId\"]");
        }});

        put("Email-ID", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//input[@formcontrolname=\"username\"]");
        }});
        put("TXT_Password", new HashMap<>(){{
            put ("en", "//input[@id=\"password\"]");
            put ("ar", "//input[@id=\"password\"]");
        }});

        put("Password", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//input[@formcontrolname=\"password\"]");
        }});
        put("Msg_Required", new HashMap<>(){{
            put ("en", "//span[contains(@class,'text-danger')]");
            put ("ar", "//span[contains(@class,'text-danger')]");
        }});
        put("Msg_Wrong_ID_Password", new HashMap<>(){{
            put ("en", "//div[contains(@class,'text-danger')]");
            put ("ar", "//div[contains(@class,'text-danger')]");
        }});
        put("BTN_Choose", new HashMap<>(){{
            put ("en", "//div/div[3]/button[1]");
            put ("ar", "//div/div[3]/button[1]");
        }});
        put("BTN_Update", new HashMap<>(){{
            put ("en", "//button[text()=' Update ']");
            put ("ar", "");
        }});
        put("BTN_Continue", new HashMap<>(){{
            put ("en", "//button[contains(text(),'Continue')]");
            put ("ar", "");
        }});

        ///////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        put("Hover", new HashMap<>(){{
            put ("en", "//i[contains(@class,'diamond')]");
            put ("ar", "//i[contains(@class,'diamond')]");
        }});
        put("BTN_Inter", new HashMap<>(){{
            put ("ar", "//div[contains(text(),'المخزون الداخلي')]");
        }});
        put("BTN_Projects", new HashMap<>(){{
            put ("ar", "//div[contains(text(),' المشاريع ')]");
        }});
        put("BTN_Add_New_Project", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'إضافة مشروع جديد')]/parent::button");
        }});
        put("TXT_Project_Name", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"name\"]");
        }});

        //////////00000000000000000////////////
        put("DDL_Project_Type", new HashMap<>(){{
            put ("ar", "//mat-option//span[@class='mat-option-text']");
        }});
        put("DDL-Project-Type-Arrow", new HashMap<>(){{
            put ("ar", "(//div[contains(@class,'mat-select-arrow-wrapper')])[1]");
        }});

        put("DDL_Region", new HashMap<>(){{
            put ("ar", "//ng-select[@formcontrolname=\"region_id\"]");
        }});

        put("TXT_City", new HashMap<>(){{
            put ("ar", "  //input[@id=\"inputCity\"]");
        }});
        put("TXT_Developer", new HashMap<>(){{
            put ("ar", "  //input[@id=\"inputDeveloper\"]");
        }});


    }};



    //input[@id="inputCity"]
    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By BTNLogin () throws Exception{
        return By.xpath(get("BTN_Login"));
    }
    public static By TXTIDNumber () throws Exception{
        return By.xpath(get("TXT_ID_Number"));
    }
    public static By Email () throws Exception{
        return By.xpath(get("Email-ID"));
    }
    public static By Password () throws Exception{
        return By.xpath(get("Password"));
    }

    public static By TXTPassword () throws Exception{
        return By.xpath(get("TXT_Password"));
    }
    public static By MsgRequired () throws Exception{
        return By.xpath(get("Msg_Required"));
    }
    public static By MsgWrongIDPassword () throws Exception{
        return By.xpath(get("Msg_Wrong_ID_Password"));
    }
    public static By BTNChoose () throws Exception{
        return By.xpath(get("BTN_Choose"));
    }
    public static By BTNUpdate () throws Exception{
        return By.xpath(get("BTN_Update"));
    }
    public static By BTNContinue () throws Exception{
        return By.xpath(get("BTN_Continue"));
    }
    ////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////
    public static By Hover () throws Exception{
        return By.xpath(get("Hover"));
    }
    public static By BTNInter () throws Exception{
        return By.xpath(get("BTN_Inter"));
    }

    public static By BTNProjects () throws Exception{
        return By.xpath(get("BTN_Projects"));
    }
    public static By BTNAddNewProject () throws Exception{
        return By.xpath(get("BTN_Add_New_Project"));
    }
    public static By TXTProjectName () throws Exception{
        return By.xpath(get("TXT_Project_Name"));
    }
    public static By DDLProjectType_Arrow () throws Exception{
        return By.xpath(get("DDL-Project-Type-Arrow"));
    }

    public static By DDLProjectType () throws Exception{
        return By.xpath(get("DDL_Project_Type"));
    }


    public static By DDLRegion () throws Exception{
        return By.xpath(get("DDL_Region"));
    }
    public static By TXTCity () throws Exception{
        return By.xpath(get("TXT_City"));
    }

    public static By TXTDeveloper () throws Exception{
        return By.xpath(get("TXT_Developer"));
    }




    public static final By getDDL_Option(String name) {
        String xpath = "//span[contains(text(),'" + name + "')]";
        return By.xpath(xpath);
    }

    //*********************************************************************************************
    //Existing objects

































        /*// Button
        put("button-language", new HashMap<>() {{
            put("en", "//button[@label='Eng']");
            put("ar", "//button[@label='العربية']");
        }});
        put("button-login", new HashMap<>() {{
            put("en", "//button[contains(@type,'submit')]");
            put("ar", "//button//span[normalize-space(text())='تسجيل الدخول']");
        }});
        // Checkbox
        // Dropdown
        // Element
        put("element-error-invalid-credentials", new HashMap<>() {{
            put("en", "//p[(text() = 'Invalid credentials' or . = 'Invalid credentials')]");
            put("ar", "//p[(text() = 'Invalid credentials' or . = 'Invalid credentials')]");
        }});

        // Link
        // Radio
        // Text
        put("text-username", new HashMap<>() {{
            put("en", "//input[@name='username']");
            put("ar", "//input[@name='username']");
        }});
        put("text-password", new HashMap<>() {{
            put("en", "//input[@name='password']");
            put("ar", "//input[@name='password']");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    // Button
    public static By getButtonLanguage(String language) throws Exception {
        return By.xpath(get("button-language", language));
    }

    public static By getButtonLogin() throws Exception {
        return By.xpath(get("button-login"));
    }

    // Checkbox
    // Dropdown
    // Element
    public static By getElementErrorInvalidCredentials() throws Exception {
        return By.xpath(get("element-error-invalid-credentials"));
    }

    // Link
    // Radio
    // Text
    public static By getTextUsername() throws Exception {
        return By.xpath(get("text-username"));
    }

    public static By getTextPassword() throws Exception {
        return By.xpath(get("text-password"));
    }*/
}
