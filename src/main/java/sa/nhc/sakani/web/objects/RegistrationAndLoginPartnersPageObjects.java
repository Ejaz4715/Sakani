package sa.nhc.sakani.web.objects;


import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;


public class RegistrationAndLoginPartnersPageObjects {

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
//                put("ar", "//span[text() = ' التحقق من الرمز ']");
                put("ar", "//span[contains (text() , 'التحقق من الرمز')]");
                put("en", "");
            }});
            put("sakani-logo", new HashMap<>() {{
                put("ar", "//img[@alt=\"logo\"]");
                put("en", "");
            }});
            put("Register-Button", new HashMap<>() {{
                put("ar", "//span[contains (text() , 'التسجيل')]/parent::button");
                put("en", "");
            }});
            put("Individual-Registration", new HashMap<>() {{
                put("ar", "//h3[contains (text() , 'فرد')]");
                put("en", "");
            }});
            put("Company-Registration", new HashMap<>() {{
                put("ar", "//h3[contains (text(), 'الشركة')]");
                put("en", "");
            }});
            put("CR-Number-Input-Field", new HashMap<>() {{
                put("ar", "//label[text()=' رقم السجل التجاري ']/ancestor::app-sapa-input-with-icon-v2/descendant::input");
                put("en", "");
            }});
            put("Next-Button", new HashMap<>() {{
                put("ar", "//span[text()='التالي']/parent::button");
                put("en", "");
            }});
            put("Delegate-Registration", new HashMap<>() {{
                put("ar", "//h3[text()=' مفوض ']");
                put("en", "");
            }});
            put("National-ID-Input", new HashMap<>() {{
                put("ar", "//label[text()=' يرجى ادخال رقم الهوية الوطنية / الإقامة ']/ancestor::app-sapa-input-with-icon-v2/descendant::input");
                put("en", "");
            }});
            put("DOB-Input", new HashMap<>() {{
                put("ar", "//label[text()=' تاريخ الميلاد ']/ancestor::app-hijri-datepicker-v2/descendant::input[1]");
                put("en", "");
            }});
            put("Attachment-Input", new HashMap<>() {{
                put("ar", "//input[@type = 'file']");
                put("en", "");
            }});
            put("Mobile-Number-Input", new HashMap<>() {{
                put("ar", "//label[text()=' رقم الجوال ']/ancestor::app-sapa-phone-input-v2/descendant::input");
                put("en", "");
            }});
            put("Email-Input", new HashMap<>() {{
                put("ar", "//label[text()=' البريد الإلكتروني ']/ancestor::app-sapa-input-with-icon-v2/descendant::input");
                put("en", "");
            }});
            put("Verify-Password-Input", new HashMap<>() {{
                put("ar", "//label[text()=' تأكيد كلمة المرور ']/ancestor::app-sapa-password-input-with-icon-v2/descendant::input");
                put("en", "");
            }});
            put("Terms-And-Conditions-Checkbox", new HashMap<>() {{
                put("ar", "//input[@type=\"checkbox\"]");
                put("en", "");
            }});
            put("Congratulation-Text", new HashMap<>() {{
                put("ar", "//h3[text() = ' تهانينا! ']");
                put("en", "");
            }});
            put("User-Management-Side-Menu-Option", new HashMap<>() {{
                put("ar", "//a[contains (text(), 'إدارة المستخدمين')]");
                put("en", "");
            }});
            put("Search-Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), ' بحث ')]");
                put("en", "");
            }});
            put("User-Details-Icon", new HashMap<>() {{
                put("ar", "//datatable-body//datatable-body-row[1]//datatable-body-cell[7]/child::div");
                put("en", "");
            }});
            put("Status-Dropdown", new HashMap<>() {{
                put("ar", "//span[contains (text() , 'غير نشط')]/parent::div/parent::div");
                put("en", "");
            }});
            put("Status-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[contains (@class , 'ng-option')]");
                put("en", "");
            }});
            put("Admin-Radio-Button", new HashMap<>() {{
                put("ar", "//label[text() = ' مدير الشركة ']/parent::div/descendant::label[@class=\"switch\"]");
                put("en", "");
            }});
            put("Apply-Role-Button", new HashMap<>() {{
                put("ar", "//button [contains (text() , ' تطبيق الاشتراك ')]");
                put("en", "");
            }});
            put("Account-Status-Text", new HashMap<>() {{
                put("ar", "//datatable-body//datatable-body-row[1]//datatable-body-cell[6]/descendant::span[1]");
                put("en", "");
            }});
            put("Updates-Pop-Up", new HashMap<>() {{
                put("ar", "//button[text()='إلغاء']");
                put("en", "");
            }});
            put("Company-Type", new HashMap<>() {{
                put("ar", "//div[@class=\"options-container d-flex flex-wrap\"]/descendant::label");
                put("en", "");
            }});
            put("Role-Dropdown", new HashMap<>() {{
                put("ar", "//div[@class=\"dropdown-container pointer\"]/descendant::div[@class=\"ng-value-container\"]");
                put("en", "");
            }});
            put("Role-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[@role=\"option\"]");
                put("en", "");
            }});
            put("Warning-Pop-Up", new HashMap<>() {{
                put("ar", "//button[@title=\"Close\"]");
                put("en", "");
            }});
            put("Accept-Button", new HashMap<>() {{
                put("ar", "//button[text()=' قبول ']");
                put("en", "");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }


    //Methods to return elements
    public static By UserNameInput() throws Exception {
        return By.xpath(get("User-Name-Input"));
    }

    public static By UserPasswordInput() throws Exception {
        return By.xpath(get("User-Password-Input"));
    }

    public static By LoginButton() throws Exception {
        return By.xpath(get("login-button"));
    }

    public static By OTPInput() throws Exception {
        return By.xpath(get("input-OTP"));
    }

    public static By VerifyOTPButton() throws Exception {
        return By.xpath(get("verify-otp-button"));
    }

    public static By SakaniLogo() throws Exception {
        return By.xpath(get("sakani-logo"));
    }

    public static By RegisterButton() throws Exception {
        return By.xpath(get("Register-Button"));
    }

    public static By IndividualRegistration() throws Exception {
        return By.xpath(get("Individual-Registration"));
    }

    public static By CompanyRegistration() throws Exception {
        return By.xpath(get("Company-Registration"));
    }

    public static By CRNumberInputField() throws Exception {
        return By.xpath(get("CR-Number-Input-Field"));
    }

    public static By NextButton() throws Exception {
        return By.xpath(get("Next-Button"));
    }

    public static By DelegateRegistration() throws Exception {
        return By.xpath(get("Delegate-Registration"));
    }

    public static By NationalIdInput() throws Exception {
        return By.xpath(get("National-ID-Input"));
    }

    public static By DOBInput() throws Exception {
        return By.xpath(get("DOB-Input"));
    }

    public static By AttachmentInput() throws Exception {
        return By.xpath(get("Attachment-Input"));
    }

    public static By MobileNumberInput() throws Exception {
        return By.xpath(get("Mobile-Number-Input"));
    }

    public static By EmailInput() throws Exception {
        return By.xpath(get("Email-Input"));
    }

    public static By VerifyPasswordInput() throws Exception {
        return By.xpath(get("Verify-Password-Input"));
    }

    public static By TermsAndConditionsCheckbox() throws Exception {
        return By.xpath(get("Terms-And-Conditions-Checkbox"));
    }

    public static By CongratulationText() throws Exception {
        return By.xpath(get("Congratulation-Text"));
    }

    public static By UserManagementOption() throws Exception {
        return By.xpath(get("User-Management-Side-Menu-Option"));
    }

    public static By SearchButton() throws Exception {
        return By.xpath(get("Search-Button"));
    }

    public static By UserDetailsIcon() throws Exception{
        return By.xpath(get("User-Details-Icon"));
    }

    public static By StatusDropdown() throws Exception{
        return By.xpath(get("Status-Dropdown"));
    }

    public static By StatusDropdownOptions() throws Exception{
        return By.xpath(get("Status-Dropdown-Options"));
    }
    public static By AdminRadioButton() throws Exception{
        return By.xpath(get("Admin-Radio-Button"));
    }

    public static By ApplyRoleButton() throws Exception{
        return By.xpath(get("Apply-Role-Button"));
    }

    public static By AccountStatusText() throws Exception{
        return By.xpath(get("Account-Status-Text"));
    }

    public static By UpdatesPopUp() throws Exception{
        return By.xpath(get("Updates-Pop-Up"));
    }

    public static By CompanyType() throws Exception{
        return By.xpath(get("Company-Type"));
    }
    public static By RoleDropdown() throws Exception {
        return By.xpath(get("Role-Dropdown"));
    }


    public static By RoleDropdownOptions() throws Exception{
        return By.xpath(get("Role-Dropdown-Options"));
    }

    public static By WarningPopUp() throws Exception{
        return By.xpath(get("Warning-Pop-Up"));
    }

    public static By AcceptButton() throws Exception{
        return By.xpath(get("Accept-Button"));
    }
}