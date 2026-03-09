package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FlightBookingPage;

public class FlightBookingTest extends BaseTest {

    @Test
    public void testFlightBooking() {

        FlightBookingPage page = new FlightBookingPage(driver);

        page.bookFlight();
    }
}