package Setups;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities extends DesiredCapabilities {
    protected AndroidDriver driver;
    private AppiumDriverLocalService service;

    protected void preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "io.flutter.demo.gallery");
        capabilities.setCapability("appActivity", "io.flutter.demo.gallery.MainActivity");

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);

        driver = new AndroidDriver(new URL(service_url), capabilities);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public void stopServer() {
        service.stop();
    }
}