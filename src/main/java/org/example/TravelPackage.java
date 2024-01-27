package org.example;

import org.example.pojo.Activity;
import org.example.pojo.ActivityDetails;
import org.example.pojo.Destination;
import org.example.pojo.Passenger;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinationList;
    private List<Passenger> passengerList;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinationList = new ArrayList<>();
        this.passengerList = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        if (passengerList.size() < passengerCapacity) {
            passengerList.add(passenger);
        }
    }

    public void addDestination(Destination destination) {
        destinationList.add(destination);
    }

    public void printItinerary() {
        System.out.println("Travel Package Name : " + name);
        for (Destination currentDestination : destinationList) {
            System.out.println("Destination => Name : " + currentDestination.getName());
            List<Activity> currentDestinationActivityList = currentDestination.getActivityList();
            for (Activity currentActivity : currentDestinationActivityList) {
                System.out.println("Activity => Name : " + currentActivity.getName() + ", Cost : " + currentActivity.getCost() + ", Capacity : " + currentActivity.getCapacity() + ", Description : " + currentActivity.getDescription());
            }
        }
        System.out.print("\n");
    }

    public void printPassengerList() {
        System.out.println("Travel Package Name : " + name);
        System.out.println("Passenger Capacity : " + passengerCapacity);
        System.out.println("Number Of Passengers Enrolled : " + passengerList.size());
        for (Passenger currentPassenger : passengerList) {
            System.out.println("Passenger => Name : " + currentPassenger.getPassengerName() + ", Number : " + currentPassenger.getPassengerNumber());
        }
        System.out.print("\n");
    }

    public void printIndividualPassengerInfo(Passenger passenger) {
        System.out.println("Passenger Name : " + passenger.getPassengerName());
        System.out.println("Passenger Number : " + passenger.getPassengerNumber());
        System.out.println("Passenger Balance : " + passenger.getBalance());
        List<ActivityDetails> activityDetailsList = passenger.getActivityDetailsList();
        for (ActivityDetails currentActivityDetails : activityDetailsList) {
            Activity currentActivity = currentActivityDetails.getActivity();
            System.out.println("Activity => Name : " + currentActivity.getName() + ", Cost : " + currentActivity.getCost() + ", Capacity : " + currentActivity.getCapacity() + ", Description : " + currentActivity.getDescription() + ", Destination of this Activity : " + currentActivityDetails.getDestination().getName() + ", Price paid by Passenger for this Activity : " + currentActivityDetails.getPricePaid());
        }
        System.out.print("\n");
    }

    public void printAvailableActivityDetails() {
        for (Destination currentDestination : destinationList) {
            List<Activity> currentDestinationActivityList = currentDestination.getActivityList();
            for (Activity currentActivity : currentDestinationActivityList) {
                if (!currentActivity.isCapacityFull()) {
                    System.out.println("Activity => Name : " + currentActivity.getName() + ", Cost : " + currentActivity.getCost() + ", Available Capacity for this Activity : " + currentActivity.getCapacity() + ", Description : " + currentActivity.getDescription());
                }
            }
        }
        System.out.print("\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
