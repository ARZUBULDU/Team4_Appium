package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

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

    public void seePopularBrands() throws InvalidMidiDataException {
        for (int i = 0; i < 2; i++) {
            swipe(600,2500,600,300);
        }
        assertTrue(firstPopularBrands.isDisplayed());
    }

    public void signUpPhoneNumber(String fullName, String phoneNumber, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(successRegisterAlert.isDisplayed());
    }

    public void signUpEmail(String fullName, String email, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        useEmailButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(email).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(successRegisterAlert.isDisplayed());
    }

    public void signUpInvalidEmail(String fullName, String invalidEmail, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        useEmailButton.click();
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(invalidEmail).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(invalidEmailText.isDisplayed());
    }

    public void signUpInvalidPhoneNumber(String fullName, String invalidPhoneNumber, String password) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(invalidPhoneNumber).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(invalidPhoneNumberAlert.isDisplayed());
    }

    public void signUpInvalidPassword(String fullName, String email, String invalidPassword) {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(signUpNameBox.isDisplayed());
        useEmailButton.click();
        signUpNameBox.click();
        signUpNameBox.sendKeys(fullName);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(email).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(invalidPassword).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        assertTrue(invalidPasswordAlert.isDisplayed());
    }

    public void login() {
        Actions actions = new Actions(getAppiumDriver());
        assertTrue(queryCardLogoElement.isDisplayed());
        profileButton.click();
        assertTrue(signInToSeeText.isDisplayed());
        signInButton.click();
        phoneTextBox.sendKeys(ConfigReader.getProperty("phoneNumberMurat"));
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty("passwordMurat")).perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    public void editProfile(String email, String phoneNumber) {
        editPageEmailBox.click();
        editPageEmailBox.clear();
        editPageEmailBox.sendKeys(email);
        editPagePhoneBox.click();
        editPagePhoneBox.clear();
        editPagePhoneBox.sendKeys(phoneNumber);
        editPageSaveChanges.click();
        ReusableMethods.wait(2);
        assertTrue(profileUpdateAlert.isDisplayed());
    }
}
