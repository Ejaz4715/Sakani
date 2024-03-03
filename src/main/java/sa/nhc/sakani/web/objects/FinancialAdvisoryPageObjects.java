package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class FinancialAdvisoryPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("BTN_Start_Service", new HashMap<>(){{
            put ("en", "//h3[contains(text(),'The Financial Advisory service')]/parent::div/following-sibling::a");
            put ("ar", "//h3[contains(text(),'برنامج الدعم السكني المحدث')]/parent::div/following-sibling::a");
        }});
        put("DDL_Type_Of_Employment", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Type of Employment ')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
            put ("ar", "//span[contains(text(),' الجهة ')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
        }});
        put("DDL_Military_Rank", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Military rank')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
            put ("ar", "//span[contains(text(),' الرتبة ')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
        }});
        put("DDL_Name_Military_Sector", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Name military sector')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
            put ("ar", "//span[contains(text(),' اسم القطاع العسكري ')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
        }});
        put("DDL_Salary_Bank", new HashMap<>(){{
            put ("en", "//span[text() =' Salary bank ']/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
            put ("ar", "//span[contains(text(),' البنك ')]/parent::label/parent::app-label/following-sibling::app-dropdown/div/div/ng-select/div");
        }});
        put("TXT_Basic_Salary", new HashMap<>(){{
            put ("en", "//span[contains(text(),'Basic salary')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' الدخل الشهري ')]/parent::label/parent::app-label/following-sibling::input");
        }});
        put("TXT_Housing_Allowance", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Housing allowance ')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' بدل السكن ')]/parent::label/parent::app-label/following-sibling::input");
        }});
        put("TXT_Other_Allowances", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Other allowance ')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' بدلات أخرى ')]/parent::label/parent::app-label/following-sibling::input");
        }});
        put("TXT_Total_Financial_Savings", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Total financial savings ')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' اجمالي المدخرات المالية')]/parent::label/parent::app-label/following-sibling::input");
        }});
//
        put("TXT_The_Value_Of_The_Down_Payment", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Value of down payment ')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' الدفعة المقدمة ')]/parent::label/parent::app-label/following-sibling::input");
        }});
        put("TXT_Monthly_Commitments", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Monthly commitment ')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' الالتزامات الشهرية ')]/parent::label/parent::app-label/following-sibling::input");
        }});

        put("TXT_Duration_Of_Commitments", new HashMap<>(){{
            put ("en", "//span[contains(text(),' Duration of commitment ')]/parent::label/parent::app-label/following-sibling::input");
            put ("ar", "//span[contains(text(),' مدة الالتزامات')]/parent::label/parent::app-label/following-sibling::input");
        }});
        put("DDL_Preferred_Unit_Types", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"preferred_region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div");
            put ("ar", "//input[@formcontrolname=\"preferred_region_id\"]/preceding-sibling::app-region-selector/descendant::ng-select/div");
        }});
        put("Choose_Product_Type", new HashMap<>(){{
            put ("en", "//p[contains(text(),'Off Plan')]/preceding-sibling::p/parent::div/parent::div/parent::div/div");
            put ("ar", "//p[contains(text(),' تحت الإنشاء ')]/preceding-sibling::p/parent::div/parent::div/parent::div/div");
        }});
        put("Scroll_To", new HashMap<>(){{
            put ("en", "//div[text()=' باقة الدفعة المقدمة ']");
            put ("ar", "//div/h4[text()=' باقات الدعم المتاحة ']");
        }});
        put("Checkbox_Additional_Saving_Information", new HashMap<>(){{
            put ("en", "//input[@type=\"checkbox\"]");
            put ("ar", "//input[@type=\"checkbox\"]");
        }});
        put("BTN_Submit", new HashMap<>(){{
            put ("en", "//button[@type=\"submit\"]");
            put ("ar", "//button[@type=\"submit\"]");
        }});
        put("Msg_Required", new HashMap<>(){{
            put ("en", "//div[contains(@class,'text-danger')]");
            put ("ar", "//div[contains(@class,'text-danger')]");
        }});


    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By BTNStartService () throws Exception{
        return By.xpath(get("BTN_Start_Service"));
    }
    public static By DDLTypeOfEmployment () throws Exception{
        return By.xpath(get("DDL_Type_Of_Employment"));
    }

    public static By DDLMilitaryRank () throws Exception{
        return By.xpath(get("DDL_Military_Rank"));
    }
    public static By DDLNameMilitarySector () throws Exception{
        return By.xpath(get("DDL_Name_Military_Sector"));
    }
    public static By DDLSalaryBank () throws Exception{
        return By.xpath(get("DDL_Salary_Bank"));
    }
    public static By TXTBasicSalary () throws Exception{
        return By.xpath(get("TXT_Basic_Salary"));
    }
    public static By TXTHousingAllowance () throws Exception{
        return By.xpath(get("TXT_Housing_Allowance"));
    }
    public static By TXTOtherAllowances () throws Exception{
        return By.xpath(get("TXT_Other_Allowances"));
    }
    public static By TXTTotalFinancialSavings () throws Exception{
        return By.xpath(get("TXT_Total_Financial_Savings"));
    }
    public static By TXTTheValueOfTheDownPayment () throws Exception{
        return By.xpath(get("TXT_The_Value_Of_The_Down_Payment"));
    }
    public static By TXTMonthlyCommitments () throws Exception{
        return By.xpath(get("TXT_Monthly_Commitments"));
    }
    public static By TXTDurationOfCommitments () throws Exception{
        return By.xpath(get("TXT_Duration_Of_Commitments"));
    }
    public static By DDLPreferredUnitTypes () throws Exception{
        return By.xpath(get("DDL_Preferred_Unit_Types"));
    }
    public static By ChooseProductType () throws Exception{
        return By.xpath(get("Choose_Product_Type"));
    }
    public static By ScrollTo () throws Exception{
        return By.xpath(get("Scroll_To"));
    }
    public static By CheckboxAdditionalSavingInformation () throws Exception{
        return By.xpath(get("Checkbox_Additional_Saving_Information"));
    }
    public static By BTNSubmit () throws Exception{
        return By.xpath(get("BTN_Submit"));
    }
    public static By MsgRequired () throws Exception{
        return By.xpath(get("Msg_Required"));
    }

    public static final By getDDL_Option(String name) {
        String xpath = "//span[contains(text(),'" + name + "')]";
        return By.xpath(xpath);
    }


}
