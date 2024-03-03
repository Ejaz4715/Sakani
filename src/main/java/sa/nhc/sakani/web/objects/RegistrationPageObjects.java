package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RegistrationPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("Registration_Link", new HashMap<>(){{
            put ("en", "//u[contains(text(),' No Account? Create a new account. ')]");
            put ("ar", "//u[contains(text(),' ليس لديك حساب؟ تسجيل حساب جديد ')]");
        }});
        put("TXT_ID_Number", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"national_id_number\"]");
            put ("ar", "//input[@formcontrolname=\"national_id_number\"]");
        }});
        put("TXT_Birth_Of_Date", new HashMap<>(){{
            put ("en", "//input[@placeholder=\"YYYY-MM-DD\"]");
            put ("ar", "//input[@placeholder=\"YYYY-MM-DD\"]");
        }});
        put("Msg_Required", new HashMap<>(){{
            put ("en", "//div[contains(@class,'text-danger')]");
            put ("ar", "//div[contains(@class,'text-danger')]");
        }});
        put("BTN_Continue", new HashMap<>(){{
            put ("en", "//button[contains(text(),'Continue')]");
            put ("ar", "//button[contains(text(),' المتابعة ')]");
        }});
        put("TXT_Email", new HashMap<>(){{
            put ("en", "//input[@type=\"email\"]");
            put ("ar", "//input[@type=\"email\"]");
        }});
        put("TXT_PhoneNumber", new HashMap<>(){{
            put ("en", "//input[@type=\"text\"]");
            put ("ar", "//input[@type=\"text\"]");
        }});
        put("TXT_Password", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"password\"]");
            put ("ar", "//input[@formcontrolname=\"password\"]");
        }});
        put("TXT_Password_Confirmation", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"password_confirmation\"]");
            put ("ar", "//input[@formcontrolname=\"password_confirmation\"]");
        }});
        put("MSG_Successful_Registered", new HashMap<>(){{
            put ("en", "//h4[contains(text(),' Registered successfully ')]");
            put ("ar", "//h4[contains(text(),' تم التسجيل بنجاح! ')]");
        }});
        put("MSG_Account_Already_Created", new HashMap<>(){{
            put ("en", "//input[@formcontrolname=\"national_id_number\"]/following-sibling::div");
            put ("ar", "//input[@formcontrolname=\"national_id_number\"]/following-sibling::div");
        }});
        put("Scroll_To_OTP", new HashMap<>(){{
            put ("en", "//h4[contains(text(),' تسجيل حساب جديد ')]");
            put ("ar", "//h4[contains(text(),' تسجيل حساب جديد ')]");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By RegistrationLink () throws Exception{
        return By.xpath(get("Registration_Link"));
    }
    public static By TXTIDNumber () throws Exception{
        return By.xpath(get("TXT_ID_Number"));
    }
    public static By TXTBirthOfDate () throws Exception{
        return By.xpath(get("TXT_Birth_Of_Date"));
    }
    public static By MsgRequired () throws Exception{
        return By.xpath(get("Msg_Required"));
    }
    public static By BTNContinue () throws Exception{
        return By.xpath(get("BTN_Continue"));
    }
    public static By TXTEmail () throws Exception{
        return By.xpath(get("TXT_Email"));
    }
    public static By TXTPhoneNumber () throws Exception{
        return By.xpath(get("TXT_PhoneNumber"));
    }
    public static By TXTPassword () throws Exception{
        return By.xpath(get("TXT_Password"));
    }  public static By TXTPasswordConfirmation () throws Exception{
        return By.xpath(get("TXT_Password_Confirmation"));
    }
    public static By MSGSuccessfulRegistered () throws Exception{
        return By.xpath(get("MSG_Successful_Registered"));
    }
    public static By MSGAccountAlreadyCreated () throws Exception{
        return By.xpath(get("MSG_Account_Already_Created"));
    }
    public static By ScrollToOTP () throws Exception{
        return By.xpath(get("Scroll_To_OTP"));
    }


}
