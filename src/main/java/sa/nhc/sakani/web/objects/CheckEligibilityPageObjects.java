package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CheckEligibilityPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("BTN_Start_Service", new HashMap<>(){{
            put ("en", "//h1[contains(text(),'Check Eligibility')]/parent::div/child::div/a");
            put ("ar", "//h1[contains(text(),'Check Eligibility')]/parent::div/child::div/a");
        }});
        put("CheckBox_Agree_Term_Of_Conditions", new HashMap<>(){{
            put ("en", "//input[@id=\"agreeTermsConditions\"]");
            put ("ar", "//input[@id=\"agreeTermsConditions\"]");
        }});
        put("BTN_Agree_On_The_Terms_And_Conditions", new HashMap<>(){{
            put ("en", "//button[contains(text(),' Agree on the terms and conditions ')]");
            put ("ar", "//button[contains(text(),' أوافق على الشروط والأحكام ')]");
        }});
        put("Title_Acknowledgement", new HashMap<>(){{
            put ("en", "//h4[contains(text(),' Acknowledgement ')]");
            put ("ar", "//h4[contains(text(),'الإقرار')]");
        }});
        put("Checkbox_One", new HashMap<>(){{
            put ("en", "//input[@id=\"firstCheckbox\"]");
            put ("ar", "//input[@id=\"firstCheckbox\"]");
        }});
        put("Checkbox_Two", new HashMap<>(){{
            put ("en", "//input[@id=\"secondCheckbox\"]");
            put ("ar", "//input[@id=\"secondCheckbox\"]");
        }});
        put("Checkbox_Three", new HashMap<>(){{
            put ("en", "//input[@id=\"thirdCheckbox\"]");
            put ("ar", "//input[@id=\"thirdCheckbox\"]");
        }});
        put("Msg_Required", new HashMap<>(){{
            put ("en", "//div[contains(@class,'text-danger')]");
            put ("ar", "//div[contains(@class,'text-danger')]");
        }});
        put("BTN_Continue_To_Confirm_Acknowledge", new HashMap<>(){{
            put ("en", "//button[contains(text(),' Continue to confirm acknowledge ')]");
            put ("ar", "//button[contains(text(),' المتابعة ')]");
        }});
//        put("getDDL_Option", new HashMap<>(){{
//            put ("en", "//span[contains(text(),'\" + name + \"')]");
//            put ("ar", "//button[contains(text(),' المتابعة ')]");
//        }});
        put("DDL_Current_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname=\"region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div");
        }});
        put("Clear_Current_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div//span[@title=\"Clear all\"]");
            put ("ar", "//input[@formcontrolname=\"region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div//span[@title=\"حذف الكل\"]");
        }});

        put("DDL_Current_City", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname=\"city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/div");
        }});
        put("DDL_Preferred_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"preferred_region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname=\"preferred_region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div");
        }});
        put("Clear_Preferred_Region", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"preferred_region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div//span[@title=\"Clear all\"]");
            put ("ar", "//input[@formcontrolname=\"preferred_region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div//span[@title=\"حذف الكل\"]");
        }});
        put("DDL_Preferred_City", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"preferred_city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname=\"preferred_city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/div");
        }});
        put("Clear_Preferred_City", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"preferred_city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/div//span[@title=\"Clear all\"]");
            put ("ar", "//input[@formcontrolname=\"preferred_city_id\"]/preceding-sibling::app-city-selector/descendant::ng-select/div//span[@title=\"حذف الكل\"]");
        }});
        put("DDL_Preferred_District", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"preferred_district_id\"]/preceding-sibling::app-district-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname=\"preferred_district_id\"]/preceding-sibling::app-district-selector/descendant::ng-select/div");
        }});
        put("DDL_Current_Hosing_Status", new HashMap<>(){{
            put ("en", "//span[text()=' Current housing status ']/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
            put ("ar", "//span[text()=' حالة السكن الحالي  ']/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
        }});
        put("BTN_Confirm", new HashMap<>(){{
            put ("en", "//button[@type=\"submit\"]");
            put ("ar", "//button[@type=\"submit\"]");
        }});

    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By BTNStartService () throws Exception{
        return By.xpath(get("BTN_Start_Service"));
    }
    public static By CheckBoxAgreeTermOfConditions () throws Exception{
        return By.xpath(get("CheckBox_Agree_Term_Of_Conditions"));
    }

    public static By BTNAgreeOnTheTermsAndConditions () throws Exception{
        return By.xpath(get("BTN_Agree_On_The_Terms_And_Conditions"));
    }
    public static By TitleAcknowledgement () throws Exception{
        return By.xpath(get("Title_Acknowledgement"));
    }
    public static By CheckboxOne () throws Exception{
        return By.xpath(get("Checkbox_One"));
    }
    public static By CheckboxTwo () throws Exception{
        return By.xpath(get("Checkbox_Two"));
    }
    public static By CheckboxThree () throws Exception{
        return By.xpath(get("Checkbox_Three"));
    }
    public static By MsgRequired () throws Exception{
        return By.xpath(get("Msg_Required"));
    }
    public static By BTNContinueToConfirmAcknowledge () throws Exception{
        return By.xpath(get("BTN_Continue_To_Confirm_Acknowledge"));
    }
    public static By DDLCurrentRegion () throws Exception{
        return By.xpath(get("DDL_Current_Region"));
    }
    public static By ClearCurrentRegion () throws Exception{
        return By.xpath(get("Clear_Current_Region"));
    }
    public static By DDLCurrentCity () throws Exception{
        return By.xpath(get("DDL_Current_City"));
    }
    public static By DDLPreferredRegion () throws Exception{
        return By.xpath(get("DDL_Preferred_Region"));
    }
    public static By ClearPreferredRegion () throws Exception{
        return By.xpath(get("Clear_Preferred_Region"));
    }
    public static By DDLPreferredCity () throws Exception{
        return By.xpath(get("DDL_Preferred_City"));
    }
    public static By ClearPreferredCity () throws Exception{
        return By.xpath(get("Clear_Preferred_City"));
    }
    public static By DDLPreferredDistrict () throws Exception{
        return By.xpath(get("DDL_Preferred_District"));
    }
    public static By DDLCurrentHosingStatus () throws Exception{
        return By.xpath(get("DDL_Current_Hosing_Status"));
    }
    public static By BTNConfirm () throws Exception{
        return By.xpath(get("BTN_Confirm"));
    }


    public static final By getDDL_Option(String name) {
        String xpath = "//span[contains(text(),'" + name + "')]";
        return By.xpath(xpath);
    }


}
