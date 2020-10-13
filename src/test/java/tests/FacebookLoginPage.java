package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginPage {

    WebDriver driver = null;

    @BeforeTest
    public void Setup() {


        System.setProperty("webdriver.chrome.driver", "/Users/vishnudeep.jayam/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void fbLoginPage() {

        driver.get("https://fb.com/");
        Assert.assertTrue(driver.getTitle().contains("Facebook – log in or sign up"));
    }


    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
