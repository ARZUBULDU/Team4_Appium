package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utilities.OptionsMet;

public class QueryCardPage extends OptionsMet {

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    public static WebElement queryCardLogoElement;
    @AndroidFindBy (xpath = "(//android.widget.ImageView[1])[2]")
    public static WebElement searchBoxElement;
    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    public static WebElement signInLoginButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public static WebElement phoneTextBox;
    @AndroidFindBy(accessibility = "See All")
    public static WebElement seeAllIconElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public static WebElement passwordTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement rememberMeCheckBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    public static WebElement addWishListToast;

    }




