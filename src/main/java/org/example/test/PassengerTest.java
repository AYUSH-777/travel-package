package org.example.test;

import org.example.pojo.Activity;
import org.example.pojo.Destination;
import org.example.pojo.Passenger;
import org.example.pojo.StandardPassenger;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {
    @Test
    public void passengerShouldSignUpForActivityWithSufficientBalance() {
        Passenger passenger = new StandardPassenger("Test Passenger", "1", 50.0);
        Activity activity = new Activity("Test Activity", "Test Description", 20, 10);

        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Test Activity", "Test Description", 20, 10));

        passenger.signUp(activity, paris);
        assertEquals(1, passenger.getActivityDetailsList().size());
    }

    @Test
    public void passengerShouldNotSignUpForActivityWithoutSufficientBalance() {
        Passenger passenger = new StandardPassenger("Test Passenger", "1", 10.0);
        Activity activity = new Activity("Test Activity", "Test Description", 20, 10);

        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Test Activity", "Test Description", 20, 10));

        passenger.signUp(activity, paris);
        assertEquals(0, passenger.getActivityDetailsList().size());
    }
}
