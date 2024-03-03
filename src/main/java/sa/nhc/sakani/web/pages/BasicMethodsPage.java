package sa.nhc.sakani.web.pages;


import com.testcrew.web.Browser;
import sa.nhc.sakani.web.objects.HomePageObjects;

public class BasicMethodsPage {
    public BasicMethodsPage() {
    }

    //Hover on Services from Home Page
    public void HoverOnDropDownButtonServices() throws Exception {
//        Thread.sleep(5);
//        WebDriver driver = DriverManager.getDriver();
//        WebElement element = driver.findElement(HomePageObjects.DDBTNServices());
//        Actions action = new Actions(driver);
//        action.moveToElement(element).perform();
        Browser.moveToElement(HomePageObjects.DDBTNServices());
    }

    //Hover on The User Profile
    public void HoverOnUserProfileButton() throws Exception {
//        Thread.sleep(7);
//        WebDriver driver = DriverManager.getDriver();
//        WebElement element = driver.findElement(HomePageObjects.DDBTNServices());
//        Actions action = new Actions(driver);
//        action.moveToElement(element).perform();
        Browser.moveToElement(HomePageObjects.IconProfile());
    }

}
