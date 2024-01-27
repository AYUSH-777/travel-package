package org.example.pojo;

public class PremiumPassenger extends Passenger {

    public PremiumPassenger(String passengerName, String passengerNumber, double balance) {
        super(passengerName, passengerNumber, balance);
    }

    @Override
    public boolean signUp(Activity activity, Destination destination) {
        activity.reduceCapacity();
        addActivityDetail(new ActivityDetails(activity, destination, 0.0));
        return true;
    }
}
