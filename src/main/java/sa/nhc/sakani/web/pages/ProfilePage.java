package sa.nhc.sakani.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.sakani.web.objects.ProfilePageObjects;

public class ProfilePage {
    public ProfilePage() {
    }


    public  void closeRates() throws Exception {
        Browser.waitForSeconds(5);
        if (Browser.isElementPresent(ProfilePageObjects.BTNCancel())) {
            Browser.click(ProfilePageObjects.BTNCancel());
        }
    }
    // Verify The User is Eligibility Support
    public void checkEligibilitySupport() throws Exception {
            Browser.waitUntilVisibilityOfElement(ProfilePageObjects.CheckEligibilitySupport(), 6);
            Assert.assertTrue(Browser.isElementPresent(ProfilePageObjects.CheckEligibilitySupport()));
            Browser.takeScreenshot();
        }


    // Verify  for User Qualified the Financial Advisory
    public void checkQualifiedFinancialAdvisory() throws Exception {
        Browser.waitUntilVisibilityOfElement(ProfilePageObjects.CheckFinancialAdvisory(), 6);
        Assert.assertTrue(Browser.isElementPresent(ProfilePageObjects.CheckFinancialAdvisory()));
        Browser.takeScreenshot();

    }

    // Verify the User not Qualified the Financial Advisory because not eligible
    public void checkNotEligible() throws Exception {
        Browser.waitUntilVisibilityOfElement(ProfilePageObjects.Check_Not_Eligible(), 6);
        Browser.moveToElement(ProfilePageObjects.Check_Not_Eligible());
        Assert.assertTrue(Browser.isElementPresent(ProfilePageObjects.Check_Not_Eligible()));
        Browser.takeScreenshot();
    }
}

