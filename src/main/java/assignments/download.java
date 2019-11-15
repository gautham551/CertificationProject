package assignments;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class download {
    static WebDriver driver;

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Certification Project\\CertificationProject\\chromedriver.exe");
        String downloadFilepath = "‪C:\\Music Assignment";

        Map<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--disable-notifications");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(options);
        driver.get("https://www.last.fm/music/+free-music-downloads");
        driver.findElement(By.xpath("//tr[1]/td[6]/a[1]")).click();
    }
}