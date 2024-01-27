package org.example.test;

import org.example.pojo.Activity;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ActivityTest {

    @Test
    public void activityShouldHaveSpaceWhenCreated() {
        Activity activity = new Activity("Test Activity", "Test Description", 20, 10);
        assertFalse(activity.isCapacityFull());
    }

    @Test
    public void activityShouldNotHaveSpaceAfterCapacityReached() {
        Activity activity = new Activity("Test Activity", "Test Description", 20, 1);
        activity.reduceCapacity();
        assertTrue(activity.isCapacityFull());
    }
}