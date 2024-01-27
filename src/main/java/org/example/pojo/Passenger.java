package org.example.pojo;

import java.util.ArrayList;
import java.util.List;

public abstract class Passenger {
    private String passengerName;
    private String passengerNumber;
    private double balance;
    private List<ActivityDetails> activityDetailsList;

    public Passenger(String passengerName, String passengerNumber, double balance) {
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        activityDetailsList = new ArrayList<>();
    }

    public abstract boolean signUp(Activity activity, Destination destination);

    public void addActivityDetail(ActivityDetails activityDetails) {
        activityDetailsList.add(activityDetails);
    }

    public void reduceBalance(double reduceAmt) {
        balance = balance - reduceAmt;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(String passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<ActivityDetails> getActivityDetailsList() {
        return activityDetailsList;
    }

    public void setActivityDetailsList(List<ActivityDetails> activityDetailsList) {
        this.activityDetailsList = activityDetailsList;
    }

}
