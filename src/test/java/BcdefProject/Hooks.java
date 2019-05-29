package BcdefProject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {
    BrowserSelected browserSelected=new BrowserSelected();
    static String timeStamp=new SimpleDateFormat("dd.mm.yy.hh.mm.ss").format(new Date());

    @Before
    public void setUpBrowser() {
        browserSelected.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void closeBrowse(Scenario scenario)throws IOException {
        if (scenario.isFailed()) {
            //String screenshotName = scenario.getName().replaceAll("[*,:?!]", "") + timeStamp + ".png";
            try {
                File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                FileUtils.copyFile(ts, new File("Screenshort\\" + scenario.getName() +  GetCurrentTimeStamp() + ".png"));

                //System.out.println("Screenshort taken");

                // File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/extent-reports/screenshots/" + screenshotName);
                // copyFile(sourcePath, destinationPath);
                // scenario.write("!!!!!!......Scenario Failed....!!!!!! please see attached screenshot for the error/issue");
                //scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");

            } catch (IOException e) {

            }
        }
    }
}

