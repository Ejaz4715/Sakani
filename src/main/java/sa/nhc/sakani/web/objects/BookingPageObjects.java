package sa.nhc.sakani.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;


public class BookingPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("Filter-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[@class='d-flex flex-row gap-4']//div[1]//span[2]//span[1]");
            }});

            put("Input-Search", new HashMap<>() {{
                put("en", "");
                put("ar", "(//ng-select//div//input[@type='text'])[3]");
            }});

            put("Option-Search", new HashMap<>() {{
                put("en", "");
                put("ar", "//ng-dropdown-panel//div/span[contains(@class,'ng-option')]");
            }});

            put("Display-button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(@class,'btn btn-primary text-white')]");
            }});

            put("Project-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[contains(@class,'project-name')]");
            }});

            put("Unit-List", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'قائمة الوحدات')]");
            }});

            put("Start-Booking-button", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'بدء حجز جديد')]");
            }});

            put("Select-Unit-Tab", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-secondary justify-content-center gap-3 btn-start-cont text-nowrap']");
            }});

            put("Filter-Arrow", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div[contains(@class,'desktop-filter')])[2]");
            }});

            put("Search-button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-apply-filter btn-smokey-blue']");
            }});

            put("Filter-Arrow-Type-Unit", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div[contains(@class,'desktop-filter')])[3]");
            }});

            put("Select-First-Available-Unit", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//span[contains(@class,'unit-channel sales-channels online ng-star-inserted')])[1]");
            }});

            put("Booking-Unit", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'حجز الوحدة السكنية')]");
            }});

            put("Confirm-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-secondary']");
            }});

            put("Close-review", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@aria-label='Close']");
            }});

            put("Successful-Booking-Msg", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[@class='text-primary m-start-4 mb-0']");
            }});

            put("Successful-Booking-Land-Msg", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[@class='text-primary']");
            }});

            put("View-booking", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(@class,'d-inline')]");
            }});

            put("Agreement-Label", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@id='agreeTerms']");
            }});

            put("Fee-title", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'+ رسوم الحجز:')]");
            }});

            put("Pay-Fee-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'دفع رسوم الحجز')]");
            }});

            put("Invoice-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[contains(text(),'ملخص الفاتورة')]");
            }});

            put("Select-mada", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[@id='madaBtn']");
            }});

            put("Card-Number-Frame", new HashMap<>() {{
                put("en", "");
                put("ar", "iframe[placeholder='Card Number']");
            }});

            put("PayNow-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[contains(text(),'الدفع اللحظي')]");
            }});

            put("Card-Number-Input-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//form//input[@name='card.number']");
            }});

            put("Holder-Name-Input-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//form//input[@name='card.holder']");
            }});

            put("Expiry-Date-Input-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//form//input[@data-action='blur-card-expiry']");
            }});

            put("Cvv-Iframe", new HashMap<>() {{
                put("en", "");
                put("ar", "iframe[placeholder='CVV']");
            }});

            put("Cvv-Input-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//form//input[@name='card.cvv']");
            }});

            put("PayNow-button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@aria-label='Pay now']");
            }});

            put("Display-As-List", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'عرض القائمة')]");
            }});

            put("Booking-Land-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'حجز قطعة أرض')]");
            }});

            put("Signature-Option-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'التوقيع والتأكيد')]");
            }});

            put("Signature-Later-Option", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'التوقيع لاحقًا وإنشاء الحجز')]");
            }});

            put("Select-User-Menu", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[@class='d-flex flex-row align-items-center']//span[@class='d-flex flex-column']//span[2]");
            }});

            put("Select-User-Profile", new HashMap<>() {{
                put("en", "");
                put("ar", "//h6[contains(text(),'ملفي الشخصي')]");
            }});

            put("Select-User-Activity", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[@class='d-flex gap-3']//span[contains(text(),'أنشطتي')]");
            }});

            put("View-Land-booking", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'عرض الحجز')]");
            }});

            put("View-Land-Booking-Details", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[@class='fw-bold text-secondary cursor-pointer']");
            }});

            put("Cancel-Booking", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[@class='text-danger fw-bold']");
            }});

            put("Continue-Cancellation-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'المتابعة')]");
            }});

            put("Other-Option", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@id='id-7']");
            }});

            put("Cancellation-Reason-Input", new HashMap<>() {{
                put("en", "");
                put("ar", "//textarea[@placeholder='سبب الإلغاء كتابي']");
            }});
            put("Confirm-Cancellation-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(@class,'btn btn-secondary')]");
            }});

            put("Confirm-Cancellation-Button-Yes", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'نعم')]");
            }});

            put("Successful-Cancel-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[contains(text(),'تم إلغاء الحجز بنجاح!')]");
            }});

            put("Display-Booking-After-Cancel", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[@class='m-end-2']");
            }});

            put("Successful-Booking-Cancel", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'تم إلغاء هذا الحجز')]");
            }});

            put("Cancellation-Contract-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[contains(text(),'إلغاء العقد')]");
            }});

            put("Cancellation-Dropdown", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[@class='ng-arrow-wrapper']");
            }});

            put("Cancellation-Reason", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'موقع المشروع')]");
            }});

            put("Save-And-Continue-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'حفظ ومتابعة')]");
            }});

            put("Disclaimer-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@id='disclaimerId']");
            }});

            put("Continue-Cancellation-Land", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'الاستمرار')]");
            }});

            put("My-Booking-Page", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//a//span[@class='px-4 py-2'])[1]");
            }});


            //Sakani 4
            put("Project-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[contains(@class,'project-name')]");
            }});

            put("Unit-List", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'قائمة الوحدات')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By filterButton() throws Exception {
        return By.xpath(get("Filter-Button"));
    }

    public static By inputSearch() throws Exception {
        return By.xpath(get("Input-Search"));
    }

    public static By optionSearch() throws Exception {
        return By.xpath(get("Option-Search"));
    }

    public static By displayButton() throws Exception {
        return By.xpath(get("Display-button"));
    }

    public static By projectTitle() throws Exception {
        return By.xpath(get("Project-Title"));
    }

    public static By unitList() throws Exception {
        return By.xpath(get("Unit-List"));
    }

    public static By startBookingButton() throws Exception {
        return By.xpath(get("Start-Booking-button"));
    }

    public static By selectUnitTab() throws Exception {
        return By.xpath(get("Select-Unit-Tab"));
    }

    public static By filterArrowForEligibleOrNotEligible() throws Exception {
        return By.xpath(get("Filter-Arrow"));
    }

    public static By searchButton() throws Exception {
        return By.xpath(get("Search-button"));
    }

    public static By filterArrowTypeUnit() throws Exception {
        return By.xpath(get("Filter-Arrow-Type-Unit"));
    }

    public static By selectFirstAvailableUnit() throws Exception {
        return By.xpath(get("Select-First-Available-Unit"));
    }

    public static By bookingUnit() throws Exception {
        return By.xpath(get("Booking-Unit"));
    }

    public static By confirmButton() throws Exception {
        return By.xpath(get("Confirm-Button"));
    }

    public static By closeReview() throws Exception {
        return By.xpath(get("Close-review"));
    }

    public static By successfulBookingMsg() throws Exception {
        return By.xpath(get("Successful-Booking-Msg"));
    }

    public static By viewBookingButton() throws Exception {
        return By.xpath(get("View-booking"));
    }
    public static By viewLandBookingButton() throws Exception {
        return By.xpath(get("View-Land-booking"));
    }

    public static By agreementLabel() throws Exception {
        return By.xpath(get("Agreement-Label"));
    }

    public static By feeTitle() throws Exception {
        return By.xpath(get("Fee-title"));
    }

    public static By payFeeButton() throws Exception {
        return By.xpath(get("Pay-Fee-Button"));
    }

    public static By invoiceTitle() throws Exception {
        return By.xpath(get("Invoice-Title"));
    }

    public static By SelectMada() throws Exception {
        return By.xpath(get("Select-mada"));
    }

    public static By payNowTitle() throws Exception {
        return By.xpath(get("PayNow-Title"));
    }

    public static By CardNumberIframe() throws Exception {
        return By.cssSelector(get("Card-Number-Frame"));
    }

    public static By cardNumberInputTxt () throws Exception {
        return By.xpath(get("Card-Number-Input-Txt"));
    }

    public static By holderNameInputTxt() throws Exception {
        return By.xpath(get("Holder-Name-Input-Txt"));
    }

    public static By expiryDateInputTxt() throws Exception {
        return By.xpath(get("Expiry-Date-Input-Txt"));
    }

    public static By cvvIframe() throws Exception {
        return By.cssSelector(get("Cvv-Iframe"));
    }

    public static By cvvInputTxt() throws Exception {
        return By.xpath(get("Cvv-Input-Txt"));
    }

    public static By payNowButton() throws Exception {
        return By.xpath(get("PayNow-button"));
    }

    public static By displayAsList() throws Exception {
        return By.xpath(get("Display-As-List"));
    }
    public static By bookingLandButton() throws Exception {
        return By.xpath(get("Booking-Land-Button"));
    }
    public static By SignatureOptionButton() throws Exception {
        return By.xpath(get("Signature-Option-Button"));
    }
    public static By SignatureLaterOptionButton() throws Exception {
        return By.xpath(get("Signature-Later-Option"));
    }

    public static By selectUserMenu() throws Exception {
        return By.xpath(get("Select-User-Menu"));
    }
    public static By selectUserProfile() throws Exception {
        return By.xpath(get("Select-User-Profile"));
    }

    public static By selectUserActivity() throws Exception {
        return By.xpath(get("Select-User-Activity"));
    }

    public static By myBookingPage() throws Exception {
        return By.xpath(get("My-Booking-Page"));
    }

    public static By viewLandBookingDetails() throws Exception {
        return By.xpath(get("View-Land-Booking-Details"));
    }

    public static By cancelBooking() throws Exception {
        return By.xpath(get("Cancel-Booking"));
    }

    public static By continueCancellationButton () throws Exception {
        return By.xpath(get("Continue-Cancellation-Button"));
    }

    public static By otherOption() throws Exception {
        return By.xpath(get("Other-Option"));
    }

    public static By cancellationReasonInput() throws Exception {
        return By.xpath(get("Cancellation-Reason-Input"));
    }

    public static By confirmCancellationButton() throws Exception {
        return By.xpath(get("Confirm-Cancellation-Button"));
    }

    public static By confirmCancellationButtonYes() throws Exception {
        return By.xpath(get("Confirm-Cancellation-Button-Yes"));
    }

    public static By successfulCancelTxt () throws Exception {
        return By.xpath(get("Successful-Cancel-Txt"));
    }

    public static By displayBookingAfterCancel() throws Exception {
        return By.xpath(get("Display-Booking-After-Cancel"));
    }

    public static By successfulBookingCancel() throws Exception {
        return By.xpath(get("Successful-Booking-Cancel"));
    }

    public static By cancellationContractButton() throws Exception {
        return By.xpath(get("Cancellation-Contract-Button"));
    }

    public static By cancellationDropdown() throws Exception {
        return By.xpath(get("Cancellation-Dropdown"));
    }

    public static By cancellationReason () throws Exception {
        return By.xpath(get("Cancellation-Reason"));
    }

    public static By saveAndContinueButton() throws Exception {
        return By.xpath(get("Save-And-Continue-Button"));
    }

    public static By disclaimerButton() throws Exception {
        return By.xpath(get("Disclaimer-Button"));
    }

    public static By continueCancellationLand() throws Exception {
        return By.xpath(get("Continue-Cancellation-Land"));
    }

    public static By successfulBookingLandMsg() throws Exception {
        return By.xpath(get("Successful-Booking-Land-Msg"));
    }

    //Sakani 4

    public static By ProjectName() throws Exception {
        return By.xpath(get("Project-Name"));
    }

    public static By UnitCode() throws Exception {
        return By.xpath(get("Unit-Code"));
    }
}