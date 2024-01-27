package org.example.pojo;

public class StandardPassenger extends Passenger {

    public StandardPassenger(String passengerName, String passengerNumber, double balance) {
        super(passengerName, passengerNumber, balance);
    }

    @Override
    public boolean signUp(Activity activity, Destination destination) {
        double balance = getBalance();
        int cost = activity.getCost();
        if (activity.isCapacityFull() || balance < cost) {
            return false;
        }
        activity.reduceCapacity();
        reduceBalance(cost);
        addActivityDetail(new ActivityDetails(activity, destination, cost));
        return true;
    }
}
