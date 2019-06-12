package TestTarget;

import base.MobileAPI2;
import target.Home;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestHome extends MobileAPI2{
    Home home;

    @BeforeMethod
    public void initialization(){
        home = PageFactory.initElements(appiumDriver, Home.class);
    }

    @Test(enabled = false)
    public void testClickSignIn(){
        home.clickSignIn();
    }

    @Test(enabled = false)
    public void testsigninpermanent(){
        home.signinpermanent("jannatsaikat@gmail.com", "PasswordForEveryone");
    }

    @Test(enabled = false)
    public  void testenteringSignIn() {
        home.enteringSignIn("jannatsaikat@gmail.com","PasswordForEveryone");
    }


    @Test(enabled = false)
    public void testsetShopping(){
        home.setShopping("jannatsaikat@gmail.com","PasswordForEveryone");
    }

    @Test(enabled = false)
    public void testsetWeeklyadd(){
        home.setWeeklyadd("jannatsaikat@gmail.com","PasswordForEveryone");
    }

    @Test(enabled = true)
    public void setCartWheel(){
        home.setCartWheel("jannatsaikat@gmail.com","PasswordForEveryone");
    }



}
