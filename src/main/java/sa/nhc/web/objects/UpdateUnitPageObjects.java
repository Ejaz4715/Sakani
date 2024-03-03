package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class UpdateUnitPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {

            put("The-Project-Button", new HashMap<>() {{
                put("ar", "//a[text()=' المشاريع ']");
                put("en", "");
            }});
            put("Update-Units-Button", new HashMap<>() {{
                put("ar", "//a[text()=' تحديث حالة الوحدات ']");
                put("en", "");
            }});

            put("Advanced-Search-Radio-Button", new HashMap<>() {{
                put("ar", "//label[text()='بحث متقدم']");
                put("en", "");
            }});

            put("Project-Code-Dropdown-List", new HashMap<>() {{
                put("ar", "(//app-sapa-label/following-sibling::div/descendant::input)[3]");
                put("en", "");
            }});
            put("Select-Option", new HashMap<>() {{
                put("ar", "//div[contains(@class,'option')]/span");
                put("en", "");
            }});
            put("Search-Button", new HashMap<>() {{
                put("ar", "//button[text()=' بحث ']");
                put("en", "");
            }});
            put("Details-Button", new HashMap<>() {{
                put("ar", "//span[contains(@class,'pointer icon-password')]");
                put("en", "");
            }});
            put("Unit-Details-Button", new HashMap<>() {{
                put("ar", "//a[text()='تفاصيل الوحدات']");
                put("en", "");
            }});
            put("Search_By-Dropdown-List", new HashMap<>() {{
                put("ar", "(//app-sapa-label/following-sibling::div/ng-select)[1]");
                put("en", "");
            }});
            put("Unit-Code-Input", new HashMap<>() {{
                put("ar", "//app-sapa-label/following-sibling::div/input");
                put("en", "");
            }});
            put("Unit-Status", new HashMap<>() {{
                put("ar", "(//datatable-body-cell/descendant::span[contains(text(),'')])[2]");
                put("en", "");
            }});
            put("New-Update-Button", new HashMap<>() {{
                put("ar", "//button[text()=' تحديث جديد ']");
                put("en", "");
            }});
            put("Download-Template-Button", new HashMap<>() {{
                put("ar", "//button[contains(text(),'تحميل النموذج')]");
                put("en", "");
            }});
            put("Upload-Template-Button", new HashMap<>() {{
                put("ar", "//div[@class=\"input-file\"]/descendant::input");
                put("en", "");
            }});
            put("Analyze-The-File-Button", new HashMap<>() {{
                put("ar", "//button[text()=' تحليل الملف ']");
                put("en", "");
            }});
            put("Show-The-Result-Button", new HashMap<>() {{
                put("ar", "(//span[contains(@class,'pointer icon-edit')])[1]");
                put("en", "");
            }});
            put("Commit-Button", new HashMap<>() {{
                put("ar", "//button[text()=' أعتماد ']");
                put("en", "");
            }});

            put("Success-Message", new HashMap<>() {{
                put("ar", "//div[@class=\"font-weight-normal\"]");
                put("en", "");
            }});
            put("Yes-Button", new HashMap<>() {{
                put("ar", "//button[text()=' نعم ']");
                put("en", "");
            }});
            put("Dots-Loading", new HashMap<>() {{
                put("ar", "//div[@class=\"stage\"]");
                put("en", "");
            }});
            put("Error-Message", new HashMap<>() {{
                put("ar", "//div[contains(@class,'title')]/span[text()=' تقرير الأخطاء ']");
                put("en", "");
            }});
            put("Developers-Option", new HashMap<>() {{
                put("ar", "//div[contains (text(),' شركات التطوير العقارية ')]/parent::div");
                put("en", "");
            }});
            put("Add-Developer-Button", new HashMap<>() {{
                put("ar", "//span[text()='إضافة مطور']");
                put("en", "");
            }});
            put("Name-Input-Field", new HashMap<>() {{
                put("ar", "//input[@placeholder=\"الاسم\"]");
                put("en", "");
            }});
            put("Real-Name-Input-Field", new HashMap<>() {{
                put("ar", "//input[@placeholder=\"الاسم الرسمي\"]");
                put("en", "");
            }});
            put("Cr-Number-Input-Field", new HashMap<>() {{
                put("ar", "//input[@placeholder=\"رقم السجل التجاري\"]");
                put("en", "");
            }});
            put("Description-Input-Field", new HashMap<>() {{
                put("ar", "//textarea[@placeholder=\"الوصف\"]");
                put("en", "");
            }});
            put("Status-Dropdown", new HashMap<>() {{
                put("ar", "//div[@role=\"combobox\"]");
                put("en", "");
            }});
            put("Status-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[@role=\"option\"]");
                put("en", "");
            }});
            put("Save-Button", new HashMap<>() {{
                put("ar", "//button[contains (text() , ' حفظ ')]");
                put("en", "");
            }});
            put("Confirmation-Pop-Up-Message", new HashMap<>() {{
                put("ar", "//simple-snack-bar[ contains (@class, 'mat-simple-snackbar')]");
                put("en", "");
            }});
            put("Project-Code-Input", new HashMap<>() {{
                put("ar", "//label[text()='رمز المشروع']/following-sibling::input");
                put("en", "");
            }});
            put("Search-Button-On-Projects-Page", new HashMap<>() {{
                put("ar", "//span[contains (text(),'بحث')]");
                put("en", "");
            }});
            put("View-Project-Details", new HashMap<>() {{
                put("ar", "//datatable-body//datatable-body-row[1]//datatable-body-cell[1]");
                put("en", "");
            }});
            put("Developer-Name-Input", new HashMap<>() {{
                put("ar", "//input[@id=\"inputDeveloper\"]");
                put("en", "");
            }});
            put("Select-Developer-Name-Dropdown", new HashMap<>() {{
                put("ar", "//span[@class=\"mat-option-text\"]");
                put("en", "");
            }});
            put("Iban-Input", new HashMap<>() {{
                put("ar", "//input[@formcontrolname=\"iban_number\"]");
                put("en", "");
            }});
            put("Bank-Name-Dropdown", new HashMap<>() {{
                put("ar", "//label[@for=\"bank_name\"]/parent::div/descendant::div[@class=\"ng-value-container\"]");
                put("en", "");
            }});
            put("Bank-Name-Dropdown-Options", new HashMap<>() {{
                put("ar", "//div[@role=\"option\"]");
                put("en", "");
            }});
            put("Developer-List", new HashMap<>() {{
                put("ar", "//datatable-body//datatable-body-row[1]//datatable-body-cell[2]/descendant::span");
                put("en", "");
            }});
            put("Search-Developer", new HashMap<>() {{
                put("ar", "//input[@placeholder=\"اسم المطور\"]");
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
    public static By theProjectButton() throws Exception {
        return By.xpath(get("The-Project-Button"));
    }

    public static By updateUnitsButton() throws Exception {
        return By.xpath(get("Update-Units-Button"));
    }

    public static By advancedSearchRadioButton() throws Exception {
        return By.xpath(get("Advanced-Search-Radio-Button"));
    }

    public static By projectCodeDropdownList() throws Exception {
        return By.xpath(get("Project-Code-Dropdown-List"));
    }

    public static By selectOption() throws Exception {
        return By.xpath(get("Select-Option"));
    }

    public static By searchButton() throws Exception {
        return By.xpath(get("Search-Button"));
    }

    public static By detailsButton() throws Exception {
        return By.xpath(get("Details-Button"));
    }

    public static By unitsDetailsButton() throws Exception {
        return By.xpath(get("Unit-Details-Button"));
    }

    public static By searchBy() throws Exception {
        return By.xpath(get("Search_By-Dropdown-List"));
    }

    public static By unitCodeInput() throws Exception {
        return By.xpath(get("Unit-Code-Input"));
    }

    public static By unitStatus() throws Exception {
        return By.xpath(get("Unit-Status"));
    }

    public static By newUpdateButton() throws Exception {
        return By.xpath(get("New-Update-Button"));
    }

    public static By downloadTemplateButton() throws Exception {
        return By.xpath(get("Download-Template-Button"));
    }

    public static By uploadTemplateButton() throws Exception {
        return By.xpath(get("Upload-Template-Button"));
    }

    public static By analyzeTheFileButton() throws Exception {
        return By.xpath(get("Analyze-The-File-Button"));
    }

    public static By showTheResultButton() throws Exception {
        return By.xpath(get("Show-The-Result-Button"));
    }

    public static By commitButton() throws Exception {
        return By.xpath(get("Commit-Button"));
    }

    public static By successMessage() throws Exception {
        return By.xpath(get("Success-Message"));
    }

    public static By yesButton() throws Exception {
        return By.xpath(get("Yes-Button"));
    }

    public static By dotsLoading() throws Exception {
        return By.xpath(get("Dots-Loading"));
    }

    public static By errorMessage() throws Exception {
        return By.xpath(get("Error-Message"));
    }


    //for adding developer which is registered as a company
    public static By DevelopersOption() throws Exception {
        return By.xpath(get("Developers-Option"));
    }

    public static By AddDeveloperButton() throws Exception {
        return By.xpath(get("Add-Developer-Button"));
    }

    public static By NameInputField() throws Exception {
        return By.xpath(get("Name-Input-Field"));
    }

    public static By RealNameInputField() throws Exception {
        return By.xpath(get("Real-Name-Input-Field"));
    }

    public static By CrNumberInputField() throws Exception {
        return By.xpath(get("Cr-Number-Input-Field"));
    }

    public static By DescriptionInputField() throws Exception {
        return By.xpath(get("Description-Input-Field"));
    }

    public static By StatusDropdown() throws Exception {
        return By.xpath(get("Status-Dropdown"));
    }

    public static By StatusDropdownOptions() throws Exception {
        return By.xpath(get("Status-Dropdown-Options"));
    }

    public static By SaveButton() throws Exception {
        return By.xpath(get("Save-Button"));
    }

    public static By ConfirmationPopUpMessage() throws Exception {
        return By.xpath(get("Confirmation-Pop-Up-Message"));
    }
    public static By DeveloperList() throws Exception{
        return By.xpath(get("Developer-List"));
    }
    public static By SearchDeveloper() throws Exception {
        return By.xpath(get("Search-Developer"));
    }


    //For link project to new Developer
    public static By ProjectCodeInput() throws Exception {
        return By.xpath(get("Project-Code-Input"));
    }

    public static By SearchButtonOnProjectsPage() throws Exception {
        return By.xpath(get("Search-Button-On-Projects-Page"));
    }
    public static By ViewProjectDetails() throws Exception {
        return By.xpath(get("View-Project-Details"));
    }

    public static By DeveloperNameInput() throws Exception {
        return By.xpath(get("Developer-Name-Input"));
    }

    public static By SelectDeveloperNameDropdown() throws Exception {
        return By.xpath(get("Select-Developer-Name-Dropdown"));
    }
    public static By IbanInput() throws Exception {
        return By.xpath(get("Iban-Input"));
    }
    public static By BankNameDropdown() throws Exception {
        return By.xpath(get("Bank-Name-Dropdown"));
    }
    public static By BankNameDropdownOptions() throws Exception {
        return By.xpath(get("Bank-Name-Dropdown-Options"));
    }


}



