package Page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);

    }
}
