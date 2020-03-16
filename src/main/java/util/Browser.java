package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver driver;


    public static void launch(String url) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(url);

    }

    public static String getTitle(){
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }


    public static WebDriver getDriver() {
        return driver;
    }

}
