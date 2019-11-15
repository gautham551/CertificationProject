package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dropbox {
    @Test(invocationCount = 5)
    public void dropBoxTest() {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.dropbox.com");
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.close();

    }
}
