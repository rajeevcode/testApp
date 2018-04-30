package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class Step {

    AppiumDriver driver;

    @Given("^Launch the App$")
    public void launch_the_App() throws Throwable {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.sourcey.materialloginexample" );
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sourcey.materiallogindemo.MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.launchApp();
    }

    @Given("^Enter into username field$")
    public void enter_into_username_field() throws Throwable {
        driver.findElementById("com.sourcey.materialloginexample:id/input_email").sendKeys("rajeev1");
    }

    @Given("^Enter into password field$")
    public void enter_into_password_field() throws Throwable {
        driver.findElementById("com.sourcey.materialloginexample:id/input_password").sendKeys("rajeev12");
    }

    @When("^user tap on login button$")
    public void user_tap_on_login_button() throws Throwable {
        driver.findElementById("com.sourcey.materialloginexample:id/btn_login").click();
    }

    @Then("^user should able to login$")
    public void user_should_able_to_login() throws Throwable {
        Thread.sleep(5000);
        //Assert Validation
    }

}
