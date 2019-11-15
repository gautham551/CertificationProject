package assignments;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericMethods {
    public static void captureScreenShot(String PageTitle, WebDriver driver){

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {

        FileUtils.copyFile(src, new File("C:/selenium/"+PageTitle+""+timestamp()+".png"));

        }

        catch (IOException e){ System.out.println(e.getMessage());}

        }
    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}
