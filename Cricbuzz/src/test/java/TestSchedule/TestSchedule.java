package TestSchedule;

import base.HomePage;
import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import schedule.Schedule;

public class TestSchedule extends MobileAPI2 {

    Schedule schedule;
    @BeforeMethod
    public void intializationSignInPage() {
        schedule = PageFactory.initElements(appiumDriver, Schedule.class);
    }

    @Test(enabled = true)
    public void testWC19(){
        schedule.WC19();
    }

}
