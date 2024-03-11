package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class BookUnitPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Booking-Management-Option", new HashMap<>() {{
                put("ar", "//a[text() = ' إدارة الحجوزات ']");
                put("en", "//a[text() = ' Booking management ']");
            }});
            put("New-Booking-Button", new HashMap<>() {{
                put("ar", "//button[text() = ' حجز جديد ']");
                put("en", "");
            }});
            put("National-Id-Input", new HashMap<>() {{
                put("ar", "//label[text() = 'رقم الهوية الوطنية']/ancestor::app-sapa-input-with-icon/descendant::input[@type=\"number\"]");
                put("en", "");
            }});
            put("Search-Button", new HashMap<>() {{
                put("ar", "//span[text()='بحث']");
                put("en", "");
            }});
            put("Start-Booking-Button", new HashMap<>() {{
                put("ar", "//button[text()=' البدء بالحجز ']");
                put("en", "");
            }});
            put("SearchBy-Dropdown", new HashMap<>() {{
                put("ar", "(//app-sapa-dropdown/descendant::div[text()='تحديد']/parent::div)[2]");
                put("en", "");
            }});
            put("SearchBy-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[@role=\"option\"]");
                put("en", "");
            }});
            put("Project-Name-Input", new HashMap<>() {{
                put("ar", "//label[text()='اسم المشروع']/ancestor::app-sapa-dropdown/descendant::input");
                put("en", "");
            }});
            put("Search-Project-Button", new HashMap<>() {{
                put("ar", "//button[text()=' بحث ']");
                put("en", "");
            }});
            put("Select-Project-From-Dropdown", new HashMap<>() {{
                put("ar", "//div[@class=\"ng-option ng-option-marked ng-star-inserted\"]");
                put("en", "");
            }});
            put("Select-Project-Button", new HashMap<>() {{
                put("ar", "//span[text()='تحديد المشروع']/parent::button");
                put("en", "");
            }});
            put("Unit-Code-Input", new HashMap<>() {{
                put("ar", "//label[text()='رمز الوحدة']/ancestor::app-sapa-input-with-icon/descendant::input");
                put("en", "");
            }});
            put("View-Unit-Button", new HashMap<>() {{
                put("ar", "//app-sapa-datatable//datatable-body-row//datatable-body-cell[10]");
                put("en", "");
            }});
            put("Select-And-Continue-Button", new HashMap<>() {{
                put("ar", "//span[text()=' التحديد والاستمرار ']/parent::button");
                put("en", "");
            }});
            put("Booking-Fees-Pop-Up", new HashMap<>() {{
                put("ar", "//button[text()=' إستمرار ']");
                put("en", "");
            }});
            put("Continue-Booking-Button", new HashMap<>() {{
                put("ar", "//button[text()=' مواصلة الحجز ']");
                put("en", "");
            }});
            put("Confirm-And-Book-Button", new HashMap<>() {{
                put("ar", "//span[text()='تأكيد الحجز']/parent::button");
                put("en", "");
            }});
            put("Confirmation-Pop-Up", new HashMap<>() {{
                put("ar", "//button[text() = ' نعم ']/parent::div/preceding-sibling::div[1]/child::div");
                put("en", "");
            }});
            put("Confirm-Button", new HashMap<>() {{
                put("ar", "//button[text() = ' نعم ']");
                put("en", "");
            }});
            put("Booking-Confirmed-Text", new HashMap<>() {{
                put("ar", "//span[text()='تم تأكيد الحجز!']");
                put("en", "");
            }});
            put("National-Id-Search-Input", new HashMap<>() {{
                put("ar", "//label[contains (text() , 'رقم الهوية')]/ancestor::app-sapa-input-with-icon/descendant::input");
                put("en", "");
            }});
            put("Eligibility-Status-Text", new HashMap<>() {{
                put("ar", "//button[text() = ' البدء بالحجز ']/parent::div/preceding-sibling::span[1]");
                put("en", "");
            }});
            put("Cancel-Booking-Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), ' إلغاء الحجز ')]");
                put("en", "");
            }});
            put("View-Booking-Details-Button", new HashMap<>() {{
                put("ar", "//datatable-body-row//datatable-body-cell[7]/child::div");
                put("en", "");
            }});
            put("Reason-Of-Cancellation-Dropdown", new HashMap<>() {{
                put("ar", "//label[text() = 'اسباب الإلغاء']/ancestor::app-sapa-dropdown/descendant::div[@class=\"ng-value-container\"]");
                put("en", "");
            }});
            put("Reason-Of-Cancellation-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[@role ='option']");
                put("en", "");
            }});
            put("No-Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), 'لا')]");
                put("en", "");
            }});
            put("Yes-Button", new HashMap<>() {{
                put("ar", "//button[contains (text(), ' نعم ')]");
                put("en", "");
            }});
            put("Input-OTP", new HashMap<>() {{
                put("ar", "//label[text()='رمز التحقق']/ancestor::app-sapa-input-with-icon/descendant::input");
                put("en", "");
            }});
            put("Booking-Cancelled-Text", new HashMap<>() {{
                put("ar", "//div[contains (text(),'تم  إلغاء الحجز للمستفيد ')]");
                put("en", "");
            }});
            put("Loading-Icon", new HashMap<>() {{
                put("ar", "//div[@class=\"backdrop full-screen\"]");
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

    public static By BookingManagementOption() throws Exception {
        return By.xpath(get("Booking-Management-Option"));
    }

    public static By NewBookingButton() throws Exception {
        return By.xpath(get("New-Booking-Button"));
    }

    public static By NationalIDInput() throws Exception {
        return By.xpath(get("National-Id-Input"));
    }

    public static By SearchButton() throws Exception {
        return By.xpath(get("Search-Button"));
    }

    public static By StartBookingButton() throws Exception {
        return By.xpath(get("Start-Booking-Button"));
    }

    public static By SearchByDropdown() throws Exception {
        return By.xpath(get("SearchBy-Dropdown"));
    }

    public static By SearchByDropdownOptions() throws Exception {
        return By.xpath(get("SearchBy-Dropdown-Options"));

    }

    public static By ProjectNameInput() throws Exception {
        return By.xpath(get("Project-Name-Input"));
    }

    public static By SearchProjectButton() throws Exception {
        return By.xpath(get("Search-Project-Button"));
    }

    public static By SelectProjectFromDropdown() throws Exception {
        return By.xpath(get("Select-Project-From-Dropdown"));
    }


    public static By SelectProjectButton() throws Exception {
        return By.xpath(get("Select-Project-Button"));
    }

    public static By UnitCodeInput() throws Exception {
        return By.xpath(get("Unit-Code-Input"));
    }

    public static By ViewUnitButton() throws Exception {
        return By.xpath(get("View-Unit-Button"));
    }

    public static By SelectAndContinueButton() throws Exception {
        return By.xpath(get("Select-And-Continue-Button"));
    }

    public static By BookingFeesPopUp() throws Exception {
        return By.xpath(get("Booking-Fees-Pop-Up"));
    }

    public static By ContinueBookingButton() throws Exception {
        return By.xpath(get("Continue-Booking-Button"));
    }

    public static By ConfirmAndBookButton() throws Exception {
        return By.xpath(get("Confirm-And-Book-Button"));
    }

    public static By ConfirmationPopUp() throws Exception {
        return By.xpath(get("Confirmation-Pop-Up"));
    }

    public static By ConfirmButton() throws Exception {
        return By.xpath(get("Confirm-Button"));
    }

    public static By BookingConfirmedText() throws Exception {
        return By.xpath(get("Booking-Confirmed-Text"));
    }

    public static By NationalIdSearchInput() throws Exception {
        return By.xpath(get("National-Id-Search-Input"));
    }

    public static By EligibilityStatusText() throws Exception {
        return By.xpath(get("Eligibility-Status-Text"));
    }


    //for Cancel Booking

    public static By CancelBookingButton() throws Exception {
        return By.xpath(get("Cancel-Booking-Button"));
    }

    public static By ViewBookingDetailsButton() throws Exception {
        return By.xpath(get("View-Booking-Details-Button"));
    }

    public static By ReasonOfCancellationDropdown() throws Exception {
        return By.xpath(get("Reason-Of-Cancellation-Dropdown"));
    }

    public static By ReasonOfCancellationDropdownOptions() throws Exception {
        return By.xpath(get("Reason-Of-Cancellation-Dropdown-Options"));
    }

    public static By NoButton() throws Exception {
        return By.xpath(get("No-Button"));
    }

    public static By YesButton() throws Exception {
        return By.xpath(get("Yes-Button"));
    }

    public static By InputOTP() throws Exception {
        return By.xpath(get(getLocator()));
    }

    private static String getLocator() {
        return "Input-OTP";
    }

    public static By BookingCancelledText() throws Exception {
        return By.xpath(get("Booking-Cancelled-Text"));
    }

    public static By LoadingIcon() throws Exception {
        return By.xpath(get("Loading-Icon"));
    }
}
