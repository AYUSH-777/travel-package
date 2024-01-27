package org.example.pojo;

public class ActivityDetails {
    private Activity activity;
    private Destination destination;
    private double pricePaid;

    public ActivityDetails(Activity activity, Destination destination, double pricePaid) {
        this.activity = activity;
        this.destination = destination;
        this.pricePaid = pricePaid;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }
}
