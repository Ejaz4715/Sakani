package sa.nhc.web.objects;


import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;


public class RegistrationAndLoginPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {

            put("User-Name-Input", new HashMap<>() {{
                put("ar", "//label[text()=' يرجى ادخال رقم الهوية الوطنية / الإقامة ']/ancestor::app-sapa-input-with-icon-v2/descendant::input");
                put("en", "");
            }});

            put("User-Password-Input", new HashMap<>() {{
                put("ar", "//label[text()=' كلمة المرور ']/ancestor::app-sapa-password-input-with-icon-v2/descendant::input");
                put("en", "");
            }});

            put("login-button", new HashMap<>() {{
                put("ar", "//span[text()=' تسجيل الدخول ']/parent::button");
                put("en", "");
            }});

            put("input-OTP", new HashMap<>() {{
                put("ar", "//label[text()=' رمز التحقق ']/parent::app-sapa-label-v2/parent::div/descendant::input[1]");
                put("en", "");
            }});

            put("verify-otp-button", new HashMap<>() {{
                put("ar", "//span[text() = ' التحقق من الرمز ']");
                put("en", "");
            }});

            put("sakani-logo", new HashMap<>() {{
                put("ar", "//img[@alt=\"logo\"]");
                put("en", "");
            }});

        }
    };

    public static String get(String locator)throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }


    //Methods to return elements
    public static By userNameInput() throws Exception {
        return By.xpath(get("User-Name-Input"));
    }
    public static By userPasswordInput() throws Exception {
        return By.xpath(get("User-Password-Input"));
    }
    public static By loginButton() throws Exception {
        return By.xpath(get("login-button"));
    }
    public static By OTPInput() throws Exception {
        return By.xpath(get("input-OTP"));
    }
    public static By verifyOTPButton() throws Exception {
        return By.xpath(get("verify-otp-button"));
    }
    public static By SakaniLogo() throws Exception {
        return By.xpath(get("sakani-logo"));
    }
}