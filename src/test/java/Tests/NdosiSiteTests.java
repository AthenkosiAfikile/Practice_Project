package Tests;

import org.testng.annotations.Test;

public class NdosiSiteTests extends Base {
    @Test
    public void HomePageIsDisplayedTest() {
        homeScreen.verifyHomeScreenIsDisplayed();
    }

    @Test(dependsOnMethods = "HomePageIsDisplayedTest")
    public void TestForClickingLearningMaterial(){
        homeScreen.clickOnLearningMaterial();
    }
}
