package org.example.test;

import org.example.TravelPackage;
import org.example.pojo.Destination;
import org.example.pojo.Passenger;
import org.example.pojo.StandardPassenger;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TravelPackageTest {
    @Test
    public void travelPackageShouldAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 10);
        Destination destination = new Destination("Test Destination");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getDestinationList().size());
    }

    @Test
    public void travelPackageShouldAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 10);
        Passenger passenger = new StandardPassenger("Test Passenger", "1", 10.0);
        travelPackage.addPassenger(passenger);
        assertEquals(1, travelPackage.getPassengerList().size());
    }
}
