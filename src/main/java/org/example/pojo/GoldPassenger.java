package org.example.pojo;

public class GoldPassenger extends Passenger {

    public GoldPassenger(String passengerName, String passengerNumber, double balance) {
        super(passengerName, passengerNumber, balance);
    }

    @Override
    public boolean signUp(Activity activity, Destination destination) {
        double balance = getBalance();
        double discountedCost = 0.9 * activity.getCost();
        if (activity.isCapacityFull() || balance < discountedCost) {
            return false;
        }
        activity.reduceCapacity();
        reduceBalance(discountedCost);
        addActivityDetail(new ActivityDetails(activity, destination, discountedCost));
        return true;
    }
}
