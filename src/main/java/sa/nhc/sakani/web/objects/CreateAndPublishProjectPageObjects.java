package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;

public class CreateAndPublishProjectPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>(){{
        put("Hover", new HashMap<>(){{
            put ("ar", "//i[contains(@class,'diamond')]");
        }});

        put("BTN_Inter", new HashMap<>(){{
            put ("ar", "//div[contains(text(),'المخزون الداخلي')]");
        }});

        put("Project_Details", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'label-content')][text()='تفاصيل المشروع']");
        }});

        put("BTN_Projects", new HashMap<>(){{
            put ("ar", "//div[contains(text(),' المشاريع ')]");
        }});

        put("BTN_Add_New_Project", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'إضافة مشروع جديد')]/parent::button");
        }});

        put("TXT_Project_Name", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"name\"]");
        }});

        put("DDL_Project_Type", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'نوع المشروع')]/parent::div/following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]");
        }});

        put("DDL_Region", new HashMap<>(){{
            put ("ar", "//ng-select[@formcontrolname=\"region_id\"]");
        }});

        put("TXT_City", new HashMap<>(){{
            put ("ar", "  //input[@id=\"inputCity\"]");
        }});

        put("TXT_Developer", new HashMap<>(){{
            put ("ar", "  //input[@id=\"inputDeveloper\"]");
        }});

        put("DDL_Subsidize_Level", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'قابلية الدعم')]/parent::div/following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]");
        }});

        put("DDL_Project_Status", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'حالة المشروع')]/parent::div/following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]");
        }});

        put("DDL_Subsidy_Type", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'الدعم العيني للمشروع')]/parent::div/following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]");
        }});

        put("TXT_Max_Subsidy_Amount", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"max_subsidy_amount\"]");
        }});

        put("BTN_Agreement_Date", new HashMap<>(){{
            put ("ar", "(//span[@class=\"mat-button-wrapper\"])[2]");
        }});

        put("BTN_Choose_Agreement_Year", new HashMap<>(){{
            put ("ar", "//div[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"][1]");
        }});

        put("BTN_Choose_Agreement_Month", new HashMap<>(){{
            put ("ar", "//div[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"][1]");
        }});

        put("BTN_Choose_Agreement_Day", new HashMap<>(){{
            put ("ar", "//div[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"][1]");
        }});

        put("BTN_License_Date", new HashMap<>(){{
            put ("ar", "(//span[@class=\"mat-button-wrapper\"])[3]");
        }});

        put("BTN_Choose_License_Year", new HashMap<>(){{
            put ("ar", "//div[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"][1]");
        }});

        put("BTN_Choose_License_Month", new HashMap<>(){{
            put ("ar", "//div[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"][1]");
        }});

        put("BTN_Choose_License_Day", new HashMap<>(){{
            put ("ar", "//div[@class=\"mat-calendar-body-cell-content mat-focus-indicator\"][1]");
        }});

        put("BTN_Choose_Year_Month_Day", new HashMap<>(){{
            put ("ar", " //button[@aria-label=\"Choose month and year\"]");
        }});

        put("TXT_Project_License", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"project_license\"]");
        }});

        put("TXT_Iban_Number", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"iban_number\"]");
        }});

        put("DDL_Bank_Name", new HashMap<>(){{
            put ("ar", "//span[contains(text(),' البنك المصدر منه الضمان ')]/parent::label/following::app-nsar-dropdown/descendant::ng-select");
        }});

        put("TXT_Deduct_Percentage", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"deduct_percentage\"]");
        }});

        put("TXT_Deed_City", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"deed_city\"]");
        }});

        put("BTN_Save", new HashMap<>(){{
            put ("ar", "//button[contains(text(),'حفظ')]");
        }});
        put("Slide_Toggle_Bookable", new HashMap<>(){{
            put ("ar", "//mat-slide-toggle[@formcontrolname=\"bookable\"]");
        }});

        put("Slide_Toggle_AZM", new HashMap<>(){{
            put ("ar", "//mat-slide-toggle[@formcontrolname=\"azm_item_status\"]");
        }});

        put("Project_Financial_Institutions", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'label-content')][text()='قائمة الجهات التمويلية المشاركة في المشروع']");
        }});

        put("Checkbox_Project_Financial_Institutions", new HashMap<>(){{
            put ("ar", "//datatable-header-cell/descendant::input[@type=\"checkbox\"]");
        }});

        put("The_Units", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'label-content')][text()='الوحدات']");
        }});

        put("BTN_Import_New_Unit", new HashMap<>(){{
            put ("ar", "//button/child::span[contains(text(),'استيراد وحدة جديدة')]");
        }});

        put("DDL_Unit_Type", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'mat-select-arrow-wrapper')]");
        }});

        put("Import_Unit_File", new HashMap<>(){{
            put ("ar", "//a[text()=' تصفح ']");
        }});

        put("Records_And_Issues", new HashMap<>(){{
            put ("ar", "(//span[@class=\"ng-star-inserted\"])[2]");
        }});

        put("BTN_Commit", new HashMap<>(){{
            put ("ar", "//button[contains(text(),' اعتماد ')]");
        }});

        put("BTN_Accept", new HashMap<>(){{
            put ("ar", "//button[contains(text(),'موافق')]");
        }});

        put("BTN_Back", new HashMap<>(){{
            put ("ar", "//button[contains(text(),' رجوع ')]");
        }});

        put("The_Media", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'label-content')]/span[text()=' المحتوى المرئي ( مسودة ) ']");
        }});

        put("Upload_Ad_Image", new HashMap<>(){{
            put ("ar", "//h1[contains(text(),' الصورة الإعلانية ')]/parent::div/following::div[2]/child::button/span[contains(text(),' أضف ملف ')]");
        }});

        put("Upload_Main_Scheme", new HashMap<>(){{
            put ("ar", "//h1[contains(text(),' ملف المخطط الرئيسي')]/parent::div/following::div[2]/child::button/span[contains(text(),' أضف ملف ')]");
        }});

        put("Upload_Gallery", new HashMap<>(){{
            put ("ar", "//h1[contains(text(),'معرض الصور')]/parent::div/following::div[2]/child::button/span[contains(text(),' أضف ملف ')]");
        }});

        put("BTN_Upload_Ad_Image", new HashMap<>(){{
            put ("ar", "//h1[contains(text(),' الصورة الإعلانية ')]/parent::div/following::div/div/descendant::button[contains(@class,'uploadStatus')]/span[@class=\"mat-button-wrapper\"]");
        }});

        put("BTN_Upload_Main_Scheme", new HashMap<>(){{
            put ("ar", "//h1[contains(text(),'ملف المخطط الرئيسي')]/parent::div/following::div/div/descendant::button[contains(@class,'uploadStatus')]/span[@class=\"mat-button-wrapper\"]");
        }});

        put("BTN_Upload_Gallery", new HashMap<>(){{
            put ("ar", "//h1[contains(text(),'معرض الصور')]/parent::div/following::div/div/descendant::button[contains(@class,'uploadStatus')]/span[@class=\"mat-button-wrapper\"]");
        }});

        put("TXT_Title_Of_Details_Page_Project", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"title_of_detail_page\"]");
        }});

        put("TXT_Name", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"name\"]");
        }});

        put("TXT_Summary", new HashMap<>(){{
            put ("ar", "//textarea[@formcontrolname=\"summary\"]");
        }});

        put("TXT_Description", new HashMap<>(){{
            put ("ar", "//textarea[@formcontrolname=\"description\"]");
        }});

        put("TXT_Price_Starting_At", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"price_starting_at\"]");
        }});

        put("TXT_Latitude", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"latitude\"]");
        }});

        put("TXT_Longitude", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"longitude\"]");
        }});

        put("Units_Models", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'label-content')][text()='نماذج الوحدات']");
        }});

        put("BTN_Model_Status", new HashMap<>(){{
            put ("ar", "//datatable-body-cell[2]");
        }});

        put("BTN_Model_Apartment_Status", new HashMap<>(){{
            put ("ar", "//h3[contains(text(),' شقة ')]/parent::div//datatable-body-cell[2]");
        }});

        put("BTN_Model_Villa_Status", new HashMap<>(){{
            put ("ar", "//h3[contains(text(),' فيلا')]/parent::div//datatable-body-cell[2]");
        }});

        put("TXT_Model_Status", new HashMap<>(){{
            put ("ar", "//datatable-body-cell[2]/div/span");
        }});

        put("BTN_Save_Model_Status", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'حفظ')]");
        }});

        put("The_Media_Model", new HashMap<>(){{
            put ("ar", " (//div[@class=\"mat-tab-label-content\"])[2]");
        }});

        put("BTN_Request_Approve", new HashMap<>(){{
            put ("ar", "//button[@id=\"request_approve_btn\"]");
        }});

        put("BTN_Approve", new HashMap<>(){{
            put ("ar", "//button[@id=\"approve_btn\"]");
        }});

        put("BTN_Back_To_Main", new HashMap<>(){{
            put ("ar", "//a[contains(@class,'back-action')]");
        }});
        put("BTN_Approval_Request", new HashMap<>(){{
            put ("ar", "//button[@id=\"request_approval_btn\"]");
        }});

        put("Is_Published", new HashMap<>(){{
            put ("ar", "(//mat-slide-toggle)[1]");
        }});

        put("Reserve_Document", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'label-content')][text()='قالب مستند الحجز']");
        }});

        put("BTN_Add_Reserve_Document", new HashMap<>(){{
            put ("ar", "  //span[contains(text(),' أضف ملف ')]");
        }});

        put("DDL_Document_Template_Type", new HashMap<>(){{
            put ("ar", "//div[contains(@class,'mat-select-arrow-wrapper')]");
        }});

        put("BTN_Upload_Document_Template_Type", new HashMap<>(){{
            put ("ar", "//mat-icon[normalize-space()='file_upload']");
        }});

        put("BTN_Self_Construction", new HashMap<>(){{
            put ("ar", "//div[contains(text(),'البناء الذاتي')]");
        }});

        put("BTN_Services_Package", new HashMap<>(){{
            put ("ar", "//div[contains(text(),' باقات الخدمات ')] ");
        }});

        put("Select_Services_Package", new HashMap<>(){{
            put ("ar", "//span[@title='Service package 1']");
        }});

        put("Relation", new HashMap<>(){{
            put ("ar", "//div[@id='mat-tab-label-8-1']//div[1]");
        }});

        put("BTN_Link_Project", new HashMap<>(){{
            put ("ar", "//button[@class='btn btn-primary mr-12 mt-sm-0 m-end-3']");
        }});

        put("TXT_Search_Project_To_Link", new HashMap<>(){{
            put ("ar", "//div[@aria-expanded='true']//input[@type='text']");
        }});

        put("DDL_Blocks", new HashMap<>(){{
            put ("ar", "//div[@aria-expanded='true']");
            //span[contains(text(),'حدد حظر')]/parent::label/following-sibling::ng-select/div/span[contains(@class,'ng-arrow-wrapper')]
        }});

        put("BTN_Update_The_Relation", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'تحديث')]");
        }});

        put("BTN_Search", new HashMap<>(){{
            put ("ar", "//button[@type='submit']");
        }});

        put("Select_Searched_Project", new HashMap<>(){{
            put ("ar", "//datatable-body-cell");
        }});

        put("BTN_Model_Townhouse_Status", new HashMap<>(){{
            put ("ar", "//h3[contains(text(),' تاون هاوس ')]/parent::div//datatable-body-cell[2]");
        }});

        put("project-Setting", new HashMap<>(){{
            put ("ar", "//span[contains(text(),'إعدادات المشاريع')]");
        }});

        put("Fee-Label-Option", new HashMap<>(){{
            put ("ar", "(//span[@class='mat-slide-toggle-bar'])[9]");
        }});

        put("Fee-Label-Option2", new HashMap<>(){{
            put ("ar", "(//span[@class='mat-slide-toggle-bar'])[10]");
        }});

        put("Fee-Label-Option3", new HashMap<>(){{
            put ("ar", "(//span[@class='mat-slide-toggle-bar'])[11]");
        }});

        put("Add-Media-File", new HashMap<>(){{
            put ("ar", "//button[@class='mat-button file-chooser p-3 mb-4 ng-star-inserted']//span[@class='mx-2 text-primary font-size-h3'][contains(text(),'أضف ملف')]");
        }});

        put("Upload-Button", new HashMap<>(){{
            put ("ar", "//mat-icon[normalize-space()='file_upload']");
        }});

        put("Add-Media-File2", new HashMap<>(){{
            put ("ar", "(//span[@class='mx-2 text-primary font-size-h3'][contains(text(),'أضف ملف')])[1]");
        }});

        put("Add-Media-File3", new HashMap<>(){{
            put ("ar", "(//span[@class='mx-2 text-primary font-size-h3'][contains(text(),'أضف ملف')])[2]");
        }});

        put("Add-Media-File4", new HashMap<>(){{
            put ("ar", "(//span[contains(text(),'أضف ملف')])[3]");
        }});

        put("Add-Media-File5", new HashMap<>(){{
            put ("ar", "(//span[contains(text(),'أضف ملف')])[4]");
        }});

        put("Add-Media-File6", new HashMap<>(){{
            put ("ar", "(//span[contains(text(),'أضف ملف')])[5]");
        }});

        put("Unit-Name", new HashMap<>(){{
            put ("ar", "(//div//input[@type='text'])[2]");
        }});

        put("Unit-Description1", new HashMap<>(){{
            put ("ar", "(//div//textarea[@formcontrolname='description'])[2]");
        }});

        put("Unit-Description2", new HashMap<>(){{
            put ("ar", "(//div//input[@type='text'])[3]");
        }});

        put("Unit-Description3", new HashMap<>(){{
            put ("ar", "(//div//input[@type='text'])[4]");
        }});

        put("Total-Area", new HashMap<>(){{
            put ("ar", "(//div//input[@type='text'])[5]");
        }});
    }};


    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By Hover () throws Exception{
        return By.xpath(get("Hover"));
    }
    public static By BTNInter () throws Exception{
        return By.xpath(get("BTN_Inter"));
    }
    public static By ProjectDetails () throws Exception{
        return By.xpath(get("Project_Details"));
    }

    public static By BTNProjects () throws Exception{
        return By.xpath(get("BTN_Projects"));
    }
    public static By BTNAddNewProject () throws Exception{
        return By.xpath(get("BTN_Add_New_Project"));
    }
    public static By TXTProjectName () throws Exception{
        return By.xpath(get("TXT_Project_Name"));
    }

    public static By DDLProjectType () throws Exception{
        return By.xpath(get("DDL_Project_Type"));
    }

    public static By DDLRegion () throws Exception{
        return By.xpath(get("DDL_Region"));
    }
    public static By TXTCity () throws Exception{
        return By.xpath(get("TXT_City"));
    }

    public static By TXTDeveloper () throws Exception{
        return By.xpath(get("TXT_Developer"));
    }

    public static final By getDDL_Option(String name) {
        String xpath = "//span[contains(text(),'" + name + "')]";
        return By.xpath(xpath);
    }

    public static By DDLSubsidizeLevel () throws Exception{
        return By.xpath(get("DDL_Subsidize_Level"));
    }

    public static By DDLProjectStatus () throws Exception{
        return By.xpath(get("DDL_Project_Status"));
    }

    public static By DDLSubsidyType () throws Exception{
        return By.xpath(get("DDL_Subsidy_Type"));
    }
    public static By TXTMaxSubsidyAmount () throws Exception{
        return By.xpath(get("TXT_Max_Subsidy_Amount"));
    }

    public static By BTNAgreementDate () throws Exception{
        return By.xpath(get("BTN_Agreement_Date"));
    }
    public static By BTNChooseAgreementYear () throws Exception{
        return By.xpath(get("BTN_Choose_Agreement_Year"));
    }
    public static By BTNChooseAgreementMonth () throws Exception{
        return By.xpath(get("BTN_Choose_Agreement_Month"));
    }
    public static By BTNChooseAgreementDay () throws Exception{
        return By.xpath(get("BTN_Choose_Agreement_Day"));
    }

    public static By BTNLicenseDate () throws Exception{
        return By.xpath(get("BTN_License_Date"));
    }

    public static By BTNChooseLicenseYear () throws Exception{
        return By.xpath(get("BTN_Choose_License_Year"));
    }

    public static By BTNChooseLicenseMonth () throws Exception{
        return By.xpath(get("BTN_Choose_License_Month"));
    }

    public static By BTNChooseLicenseDay () throws Exception{
        return By.xpath(get("BTN_Choose_License_Day"));
    }

    public static By BTNChooseYearMonthDay () throws Exception{
        return By.xpath(get("BTN_Choose_Year_Month_Day"));
    }

    public static By TXTProjectLicense () throws Exception{
        return By.xpath(get("TXT_Project_License"));
    }

    public static By TXTIbanNumber () throws Exception{
        return By.xpath(get("TXT_Iban_Number"));
    }

    public static By DDLBankName () throws Exception{
        return By.xpath(get("DDL_Bank_Name"));
    }

    public static By TXTDeductPercentage () throws Exception{
        return By.xpath(get("TXT_Deduct_Percentage"));
    }

    public static By TXTDeedCity () throws Exception{
        return By.xpath(get("TXT_Deed_City"));
    }

    public static By BTNSave () throws Exception{
        return By.xpath(get("BTN_Save"));
    }

    public static By SlideToggleBookable () throws Exception{
        return By.xpath(get("Slide_Toggle_Bookable"));
    }

    public static By SlideToggleAZM () throws Exception{
        return By.xpath(get("Slide_Toggle_AZM"));
    }

    public static By ProjectFinancialInstitutions () throws Exception{
        return By.xpath(get("Project_Financial_Institutions"));
    }

    public static By CheckboxProjectFinancialInstitutions () throws Exception{
        return By.xpath(get("Checkbox_Project_Financial_Institutions"));
    }

    public static By TheUnits () throws Exception{
        return By.xpath(get("The_Units"));
    }

    public static By BTNImportNewUnit () throws Exception{
        return By.xpath(get("BTN_Import_New_Unit"));
    }
    public static By DDLUnitType () throws Exception{
        return By.xpath(get("DDL_Unit_Type"));
    }

    public static By ImportUnitFile () throws Exception{
        return By.xpath(get("Import_Unit_File"));
    }

    public static By RecordsAndIssues () throws Exception{
        return By.xpath(get("Records_And_Issues"));
    }

    public static By BTNCommit () throws Exception{
        return By.xpath(get("BTN_Commit"));
    }
    public static By BTNAccept () throws Exception{
        return By.xpath(get("BTN_Accept"));
    }
    public static By BTNBack () throws Exception{
        return By.xpath(get("BTN_Back"));
    }

    public static By TheMedia () throws Exception{
        return By.xpath(get("The_Media"));
    }

    public static By UploadAdImage () throws Exception{
        return By.xpath(get("Upload_Ad_Image"));
    }

    public static By UploadMainScheme () throws Exception{
        return By.xpath(get("Upload_Main_Scheme"));
    }

    public static By UploadGallery () throws Exception{
        return By.xpath(get("Upload_Gallery"));
    }

    public static By BTNUploadAdImage () throws Exception{
        return By.xpath(get("BTN_Upload_Ad_Image"));
    }

    public static By BTNUploadMainScheme () throws Exception{
        return By.xpath(get("BTN_Upload_Main_Scheme"));
    }

    public static By BTNUploadGallery () throws Exception{
        return By.xpath(get("BTN_Upload_Gallery"));
    }

    public static By TXTTitleOfDetailsPageProject () throws Exception{
        return By.xpath(get("TXT_Title_Of_Details_Page_Project"));
    }

    public static By TXTName () throws Exception{
        return By.xpath(get("TXT_Name"));
    }
    public static By TXTSummary () throws Exception{
        return By.xpath(get("TXT_Summary"));
    }
    public static By TXTDescription () throws Exception{
        return By.xpath(get("TXT_Description"));
    }
    public static By TXTPriceStartingAt () throws Exception{
        return By.xpath(get("TXT_Price_Starting_At"));
    }

    public static By TXTLatitude () throws Exception{
        return By.xpath(get("TXT_Latitude"));
    }

    public static By TXTLongitude () throws Exception{
        return By.xpath(get("TXT_Longitude"));
    }

    public static By UnitsModels () throws Exception{
        return By.xpath(get("Units_Models"));
    }

    public static By BTNModelStatus () throws Exception{
        return By.xpath(get("BTN_Model_Status"));
    }

    public static By BTNModelApartmentStatus () throws Exception{
        return By.xpath(get("BTN_Model_Apartment_Status"));
    }
    public static By BTNModelVillaStatus () throws Exception{
        return By.xpath(get("BTN_Model_Villa_Status"));
    }

    public static By TXTModelStatus () throws Exception{
        return By.xpath(get("TXT_Model_Status"));
    }

    public static By BTNSaveModelStatus () throws Exception{
        return By.xpath(get("BTN_Save_Model_Status"));
    }

    public static By TheMediaModel () throws Exception{
        return By.xpath(get("The_Media_Model"));
    }

    public static By addMediaFile () throws Exception{
        return By.xpath(get("Add-Media-File"));
    }

    public static By uploadButton () throws Exception{
        return By.xpath(get("Upload-Button"));
    }

    public static By BTNRequestApprove () throws Exception{
        return By.xpath(get("BTN_Request_Approve"));
    }

    public static By BTNApprove () throws Exception{
        return By.xpath(get("BTN_Approve"));
    }

    public static By BTNBackToMain () throws Exception{
        return By.xpath(get("BTN_Back_To_Main"));
    }

    public static By BTNApprovalRequest () throws Exception{
        return By.xpath(get("BTN_Approval_Request"));
    }

    public static By IsPublished () throws Exception{
        return By.xpath(get("Is_Published"));
    }

    public static By ReserveDocument () throws Exception{
        return By.xpath(get("Reserve_Document"));
    }

    public static By BTNAddReserveDocument () throws Exception{
        return By.xpath(get("BTN_Add_Reserve_Document"));
    }

    public static By DDLDocumentTemplateType () throws Exception{
        return By.xpath(get("DDL_Document_Template_Type"));
    }

    public static By BTNUploadDocumentTemplateType () throws Exception{
        return By.xpath(get("BTN_Upload_Document_Template_Type"));
    }

    public static By BTNSelfConstruction () throws Exception{
        return By.xpath(get("BTN_Self_Construction"));
    }

    public static By BTNServicesPackage () throws Exception{
        return By.xpath(get("BTN_Services_Package"));
    }

    public static By SelectServicesPackage () throws Exception{
        return By.xpath(get("Select_Services_Package"));
    }

    public static By Relation () throws Exception{
        return By.xpath(get("Relation"));
    }

    public static By BTNLinkProject () throws Exception{
        return By.xpath(get("BTN_Link_Project"));
    }

    public static By TXTSearchProjectToLink () throws Exception{
        return By.xpath(get("TXT_Search_Project_To_Link"));
    }

    public static By DDLBlocks () throws Exception{
        return By.xpath(get("DDL_Blocks"));
    }

    public static By BTNUpdateTheRelation () throws Exception{
        return By.xpath(get("BTN_Update_The_Relation"));
    }

    public static By BTNSearch () throws Exception{
        return By.xpath(get("BTN_Search"));
    }

    public static By SelectSearchedProject () throws Exception{
        return By.xpath(get("SelectSearchedProject"));
    }

    public static By BTNModelTownhouseStatus () throws Exception{
        return By.xpath(get("BTN_Model_Townhouse_Status"));
    }

    public static By projectSetting () throws Exception{
        return By.xpath(get("project-Setting"));
    }

    public static By feeLabelOption () throws Exception{
        return By.xpath(get("Fee-Label-Option"));
    }

    public static By feeLabelOption2 () throws Exception{
        return By.xpath(get("Fee-Label-Option2"));
    }

    public static By feeLabelOption3 () throws Exception{
        return By.xpath(get("Fee-Label-Option3"));
    }

    public static By addMediaFile2 () throws Exception{
        return By.xpath(get("Add-Media-File2"));
    }

    public static By addMediaFile3 () throws Exception{
        return By.xpath(get("Add-Media-File3"));
    }

    public static By addMediaFile4 () throws Exception{
        return By.xpath(get("Add-Media-File4"));
    }

    public static By addMediaFile5 () throws Exception{
        return By.xpath(get("Add-Media-File5"));
    }

    public static By addMediaFile6 () throws Exception{
        return By.xpath(get("Add-Media-File6"));
    }

    public static By unitName () throws Exception{
        return By.xpath(get("Unit-Name"));
    }

    public static By unitDescription1 () throws Exception{
        return By.xpath(get("Unit-Description1"));
    }

    public static By unitDescription2 () throws Exception{
        return By.xpath(get("Unit-Description2"));
    }

    public static By unitDescription3 () throws Exception{
        return By.xpath(get("Unit-Description3"));
    }

    public static By totalArea () throws Exception{
        return By.xpath(get("Total-Area"));
    }
}