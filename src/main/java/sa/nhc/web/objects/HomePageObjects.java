package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class HomePageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("BTN_Home_Login", new HashMap<>(){{
            put ("en", "//span//a[@role=\"button\"]");
            put ("ar", "//span//a[@role=\"button\"]");
        }});
        put("BTN_Cancel_AD_Window", new HashMap<>(){{
            put ("en", "//button[contains(text(),' Cancel ')]");
            put ("ar", "");
        }});
        put("BTN_X", new HashMap<>(){{
            put ("en", "//a[contains(@class,'skipbutton')]");
            put ("ar", "//a[contains(@class,'skipbutton')]");
        }});
        put("DD_BTN_Services", new HashMap<>(){{
            put ("en", "//a/span[contains(text(),'Services')]");
            put ("ar", "//a/span[contains(text(),'الخدمات')]");
        }});
        put("BTN_Check_Eligibility", new HashMap<>(){{
            put ("en", "//img[contains(@src,'Check_Eligibility')]/parent::a/span/span[1]");
            put ("ar", "//img[contains(@src,'Check_Eligibility')]/parent::a/span/span[1]");
        }});
        put("BTN_Financial_Advisory", new HashMap<>(){{
            put ("en", "//img[contains(@src,'Financial_Advisory')]/parent::a/span/span[1]");
            put ("ar", "//img[contains(@src,'Financial_Advisory')]/parent::a/span/span[1]");
        }});
        put("Icon_Profile", new HashMap<>(){{
            put ("en", "//span[contains(@class,\"icon-profile\")]/parent::a");
            put ("ar", "//span[contains(@class,\"icon-profile\")]/parent::a");
        }});
        put("Check_Login_Successful", new HashMap<>(){{
            put ("en", "//h6[contains(text(),'Logout')]");
            put ("ar", "//h6[contains(text(),'خروج')]");
        }});
        put("BTN_My_Profile", new HashMap<>(){{
            put ("en", "//h6[contains(text(),'My Profile')]");
            put ("ar", "//h6[contains(text(),'ملفي الشخصي')]");
        }});

    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By BTNHomeLogin () throws Exception{
        return By.xpath(get("BTN_Home_Login"));
    }
    public static By BTNCancelADWindow () throws Exception{
        return By.xpath(get("BTN_Cancel_AD_Window"));
    }

    public static By BTNX () throws Exception{
        return By.xpath(get("BTN_X"));
    }
    public static By DDBTNServices () throws Exception{
        return By.xpath(get("DD_BTN_Services"));
    }
    public static By BTNCheckEligibility () throws Exception{
        return By.xpath(get("BTN_Check_Eligibility"));
    }
    public static By BTNFinancialAdvisory () throws Exception{
        return By.xpath(get("BTN_Financial_Advisory"));
    }
    public static By IconProfile () throws Exception{
        return By.xpath(get("Icon_Profile"));
    }
    public static By CheckLoginSuccessful () throws Exception{
        return By.xpath(get("Check_Login_Successful"));
    }
    public static By BTNMyProfile () throws Exception{
        return By.xpath(get("BTN_My_Profile"));
    }

}
