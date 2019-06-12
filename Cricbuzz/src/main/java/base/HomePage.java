package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends MobileAPI2{

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
    public WebElement settings;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")
    public WebElement darkTheme;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
    public WebElement matchesn;

    @FindBy(xpath = "//android.widget.TextView[@text='UPCOMING']")
    public WebElement upcomingMatches;

    @FindBy(xpath = "//android.widget.TextView[@text='3 more matches']")
    public WebElement more;

    @FindBy(xpath = "//android.widget.TextView[@text='Match 21 • Cardiff']")
    public WebElement desired;

    @FindBy(xpath = "//android.widget.TextView[@text='Sat, Jun 15']")
    public WebElement date;

    public void theme(){
        settings.click();
        darkTheme.click();
        sleep(10);
       // TestLogger.log(getClass().getSimpleName() + ": newTab" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appiumDriver.navigate().back();

    }


    public void fixtures(){
        theme();
        appiumDriver.navigate().back();
        matchesn.click();
        sleep(5);
        upcomingMatches.click();
    }


    public void matches(){
        settings.click();
        darkTheme.click();
        appiumDriver.navigate().back();
        matchesn.click();
        sleep(5);
        upcomingMatches.click();
        more.click();
        desired.click();
        String matchDay = date.getText();
        System.out.println("The 21st match is on" + matchDay);
    }




}
