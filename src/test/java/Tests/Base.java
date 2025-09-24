package Tests;

import Pages.HomeScreen;
import Pages.LandingScreen;
import Pages.LearningMaterialScreen;
import Utils.WebBrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    WebBrowserFactory webBrowserFactory = new WebBrowserFactory();
    final WebDriver driver = webBrowserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomeScreen homeScreen = PageFactory.initElements(driver, HomeScreen.class);
    LandingScreen landingScreen = PageFactory.initElements(driver, LandingScreen.class);
    LearningMaterialScreen learningMaterialScreen = PageFactory.initElements(driver, LearningMaterialScreen.class);
}
