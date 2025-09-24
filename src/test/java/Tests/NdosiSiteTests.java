package Tests;

import org.testng.annotations.Test;

public class NdosiSiteTests extends Base {
    @Test
    public void HomePageIsDisplayedTest() {
        homeScreen.verifyHomeScreenIsDisplayed();
    }
}
