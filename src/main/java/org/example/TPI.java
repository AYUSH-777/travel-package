package org.example;

import org.example.pojo.*;

public class TPI {
    public static void main(String[] args) {
        TravelPackage europeTour = new TravelPackage("Europe Tour", 50);

        // preparing destination
        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Eiffel Tower Tour", "Guided tour of Eiffel Tower", 30, 50));
        paris.addActivity(new Activity("Louvre Museum Visit", "Explore world-class art collections", 25, 40));

        Destination rome = new Destination("Rome");
        rome.addActivity(new Activity("Colosseum Tour", "Visit the iconic Colosseum", 35, 60));
        rome.addActivity(new Activity("Vatican City Tour", "Explore St. Peter's Basilica", 40, 30));

        // preparing travel package
        europeTour.addDestination(paris);
        europeTour.addDestination(rome);

        // preparing passenger
        Passenger john = new StandardPassenger("John", "1", 100.0);
        john.signUp(paris.getActivityList().get(0), paris);
        john.signUp(rome.getActivityList().get(0), rome);


        Passenger emma = new GoldPassenger("Emma", "2", 150.0);
        emma.signUp(paris.getActivityList().get(1), paris);

        Passenger mike = new PremiumPassenger("Mike", "3", 0.0);
        mike.signUp(rome.getActivityList().get(0), rome);

        //adding passengers to the package tour
        europeTour.addPassenger(john);
        europeTour.addPassenger(emma);
        europeTour.addPassenger(mike);

        // Print itinerary, passenger list, and available activities
        europeTour.printItinerary();
        europeTour.printPassengerList();
        europeTour.printAvailableActivityDetails();

        // Print details of a specific passenger
        europeTour.printIndividualPassengerInfo(john);
    }
}