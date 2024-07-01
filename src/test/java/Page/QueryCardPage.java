package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utilities.OptionsMet;

public class QueryCardPage extends OptionsMet {

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    public static WebElement queryCardLogoElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    public static WebElement profileButton;
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
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Blossom Boutique\"]")
    public static   WebElement firstPopularBrands;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public static WebElement signUpNameBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Register Successfully.\")")
    public static WebElement successRegisterAlert;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    public static WebElement useEmailButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Enter Valid Email Address\")")
    public static WebElement invalidEmailText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Error\n" +
            "The phone field must be at least 7 characters.\")")
    public static WebElement invalidPhoneNumberAlert;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(3)")
    public static WebElement invalidPasswordAlert;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sing In To See Your Info\")")
    public static WebElement signInToSeeText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\")")
    public static WebElement signInButton;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public static WebElement editPageEmailBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public static WebElement editPagePhoneBox;
    @AndroidFindBy(accessibility = "Save Changes")
    public static WebElement editPageSaveChanges;
    @AndroidFindBy(accessibility = "PROFILE_UPDATE\\nProfile Updated Successfully")
    public static WebElement profileUpdateAlert;

    }




