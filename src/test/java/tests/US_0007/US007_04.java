package tests.US_0007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelRooms;
import utilities.TestBaseRapor;

public class US007_04 extends TestBaseRapor {
   // 4-)İstenilen hotel için 'DETAİLS' a click yapılmalı ve
   // yeni  açılan sayfada 'Edit Hotelroom' yazisini görünürlüğü kontrol edilmelidir

    HotelMyCampHotelRooms hotelMyCampHotelRooms;
@Test
    public void test04(){
    extentTest=extentReports.createTest("EditHotelroomDisplayed");
    hotelMyCampHotelRooms=new HotelMyCampHotelRooms();

    hotelMyCampHotelRooms.detailsButonu.click();
    Assert.assertTrue(hotelMyCampHotelRooms.editHotelRoomYaziElementi.isDisplayed());
    extentTest.pass("Edit Hotelroom Goruldu");



}

}
