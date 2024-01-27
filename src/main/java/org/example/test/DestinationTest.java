package org.example.test;

import org.example.pojo.Activity;
import org.example.pojo.Destination;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DestinationTest {

    @Test
    public void destinationShouldContainAddedActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 20, 10);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivityList().size());
    }
}
