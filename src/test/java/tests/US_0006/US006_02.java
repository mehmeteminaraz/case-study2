package tests.US_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMain;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import java.io.IOException;

public class US006_02 extends TestBaseRapor {


    HotelMyCampMain hotelMyCamp;



    @Test
    public void test2() throws IOException, InterruptedException {
        hotelMyCamp = new HotelMyCampMain();

        hotelMyCamp.loginOl();
        Thread.sleep(5000);


        String expectedUrl = "https://www.hotelmycamp.com/Admin/UserAdmin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
extentReports.createTest("US_0006", "Beklenen ve gelen Url'ler ayni");

        ReusableMethods.getScreenshot("US06/LoginBasarili");
extentReports.createTest("US_0006", "Yonetici olarak siteye giris basarili");

    }

}
