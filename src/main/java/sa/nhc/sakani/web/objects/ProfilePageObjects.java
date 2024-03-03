package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class ProfilePageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("Check_Eligibility_Support", new HashMap<>(){{
            put ("en", "//h4/following-sibling::div/p");
            put ("ar", "//h4/following-sibling::div/p");
        }});
        put("Check_Financial_Advisory", new HashMap<>(){{
            put ("en", "//h4/parent::div/div[1]");
            put ("ar", "//h4/parent::div/div[1]");
        }});
        put("BTN_Cancel", new HashMap<>(){{
            put ("en", "//button[text()=\" Cancel \"]");
            put ("ar", "//button[text()=\" إلغاء \"]");
        }});
        put("Check_Not_Eligible", new HashMap<>(){{
            put ("en", "//h4/parent::div/div[1]");
            put ("ar", "//h4/parent::div/div[1]");
        }});

    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By CheckEligibilitySupport () throws Exception{
        return By.xpath(get("Check_Eligibility_Support"));
    }
    public static By CheckFinancialAdvisory () throws Exception{
        return By.xpath(get("Check_Financial_Advisory"));
    }

    public static By BTNCancel () throws Exception{
        return By.xpath(get("BTN_Cancel"));
    }

    public static By Check_Not_Eligible () throws Exception{
        return By.xpath(get("Check_Not_Eligible"));
    }



}
