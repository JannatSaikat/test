package testBase;

import base.HomePage;
import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {

    HomePage homePage;
    @BeforeMethod
    public void intializationSignInPage() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }

    @Test(enabled = false)
    public void testClick(){
        homePage.theme();
    }

    @Test
    public void testfixtures(){
        homePage.fixtures();
    }

    @Test(enabled = true)
    public void testMatch(){
        homePage.matches();
    }


}
