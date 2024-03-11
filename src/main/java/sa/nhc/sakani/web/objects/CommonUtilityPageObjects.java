package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CommonUtilityPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("TXT_OTP", new HashMap<>(){{
            put ("ar", "//input[@type=\"tel\"]");
        }});
        put("BTN_Verify", new HashMap<>(){{
            put ("ar", "//button[contains(text(),'تحقق')]");
        }});
        put("OTP-BTN_Verify", new HashMap<>(){{
            put ("ar", "//button[contains(text(),' تأكيد ')]");
        }});

        put("Admin-OTP", new HashMap<>(){{
            put ("ar", "//app-otp-input//input[@class='form-control valid ng-untouched ng-pristine ng-valid']");
        }});

        put("Msg_OTP_Wrong", new HashMap<>(){{
            put ("ar", "//span[text()='التحقق من رمز التحقق غير ناجح ، يرجى المحاولة لاحقًا']");
        }});
        put("CheckBox_AgreeTerm_Of_Conditions", new HashMap<>(){{
            put ("ar", "//input[@id=\"agreeTermsConditions\"]");
        }});
        put("Switch_Language", new HashMap<>(){{
            put ("ar", "//li[contains(text(),'عربي')]");
        }});
        put("Spinner_Loading", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'spinner-border')]");
        }});
        put("Spinner_Loading_Admin", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'sakani-loading')]");
        }});




    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }


    public static By TXTOTP (int i) throws Exception{
        for(int j = 1; j <= 4; j++) {
            return By.xpath("//input[@type=\"tel\"]["+ j +"]");
        }
        return null;
    }

    public static By AdminOTP () throws Exception{
        return By.xpath(get("Admin-OTP"));
    }
    public static By BTNVerify () throws Exception{
        return By.xpath(get("BTN_Verify"));
    }
    public static By OTPVerify () throws Exception{
        return By.xpath(get("OTP-BTN_Verify"));
    }

    public static By MsgOTPWrong () throws Exception{
        return By.xpath(get("Msg_OTP_Wrong"));
    }
    public static By CheckBoxAgreeTermOfConditions () throws Exception{
        return By.xpath(get("CheckBox_AgreeTerm_Of_Conditions"));
    }
    public static By SwitchLanguage () throws Exception{
        return By.xpath(get("Switch_Language"));
    }
    public static By SpinnerLoading () throws Exception{
        return By.xpath(get("Spinner_Loading"));
    }

    public static By SpinnerLoadingAdmin () throws Exception{
        return By.xpath(get("Spinner_Loading_Admin"));
    }

    public static By UserOTP () throws Exception{
        return By.xpath("(//div[@formarrayname=\"otps\"]/child::input)[1]");
    }

}
