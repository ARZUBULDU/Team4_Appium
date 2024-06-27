package Page;

import org.openqa.selenium.Keys;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class ActionsMet extends QueryCardPage{


    public void LogoGorunurTest(){

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(queryCardLogoElement.isDisplayed());
        queryCardLogoElement.click();
    }
    public  void Login (String phoneNumber,String password){
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(getAppiumDriver());
        phoneTextBoxClickAndSendKeys(ConfigReader.getProperty(phoneNumber));
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty(password)).perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        signInLoginClick();
    }


    public void SearchBoxGorunurlukClickTest(){
        assertTrue(searchBoxElement.isDisplayed());
        searchBoxElement.click();
    }
    public void phoneTextBoxClickAndSendKeys(String phoneNumber){
        assertTrue(phoneTextBox.isDisplayed());
        phoneTextBox.click();
        phoneTextBox.sendKeys(phoneNumber);
    }
    public void signInLoginClick(){
        assertTrue(signInLoginButton.isDisplayed());
        signInLoginButton.click();
    }
    public void wishListToast(){
        System.out.println(addWishListToast.getText());
        assertTrue(addWishListToast.isEnabled());
    }
}
