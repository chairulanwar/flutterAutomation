package PageObject;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;


public class FlutterHomePage {
    private AppiumDriver appiumDriver;

    public FlutterHomePage(AppiumDriver driver) {
        super();
        this.appiumDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void openShrineGallery() throws InterruptedException {
        TouchAction touchAction = new TouchAction(appiumDriver);
        //swipe left to Shrine Gallery
        touchAction.longPress(PointOption.point(900, 500)).moveTo(PointOption.point(200,500)).release().perform();
        Thread.sleep(2000);
        //Open the Shrine Gallery
        touchAction.tap(PointOption.point(900, 500)).perform();
        Thread.sleep(2000);
        //Tap next button with empty username and password
        touchAction.tap(PointOption.point(900, 1350)).perform();
        Thread.sleep(2000);
    }

    public void addToShoppingCart() throws InterruptedException {
        TouchAction touchAction = new TouchAction(appiumDriver);
        //Activate the "Clothing" filter
        touchAction.tap(PointOption.point(60, 140)).perform();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(500, 670)).perform();
        Thread.sleep(1000);

        //swipe until "Walter henley (white)" appear on the screen
        touchAction.longPress(PointOption.point(1000, 900)).moveTo(PointOption.point(50,500)).release().perform();
        touchAction.longPress(PointOption.point(1000, 900)).moveTo(PointOption.point(50,500)).release().perform();
        touchAction.longPress(PointOption.point(1000, 900)).moveTo(PointOption.point(50,500)).release().perform();

        //Tap on the "Walter henley (white)"
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(800, 900)).perform();
        Thread.sleep(2000);

        //Activate the "Accessories" filter
        touchAction.tap(PointOption.point(60, 140)).perform();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(522, 527)).perform();
        Thread.sleep(1000);

        //Tap on the "Shrug bag"
        touchAction.tap(PointOption.point(800, 900)).perform();
    }

    public void clearTheCart() throws InterruptedException {
        TouchAction touchAction = new TouchAction(appiumDriver);
        //tap the shopping cart and clear it
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(988, 1712)).perform();
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(500, 1680)).perform();
    }

}