import java.util.Scanner;
public class OdometerExecutor {
    public static void main(String[] args) {
Odometer trip = new Odometer();
Scanner keyboard = new Scanner(System.in);
String tryAgain = "true";
        trip.setGallons();
        int tripNumber = 1;
while (tryAgain.equalsIgnoreCase("true")) {
    trip.milesDriven();
    trip.setFuelEfficiency();
    trip.getFuelRemaining();
    System.out.println("Would you like to try again for another trip? Type \"true\" for yes, and \"false\" for no.");
    tryAgain = keyboard.next();
    if ((tryAgain.equalsIgnoreCase("true")) || (tryAgain.equalsIgnoreCase("yes")))
    {
        tripNumber++;
        continue;
    }
    if ((tryAgain.equalsIgnoreCase("false")) || (tryAgain.equalsIgnoreCase("no")))
    {
        double fuelEffAvg = trip.totalMiles/trip.totalGallonsUsed;
        System.out.println("Your average fuel efficiency is " + fuelEffAvg + " miles per gallon.");
        if (tripNumber == 1)
        System.out.println("Over this trip.");
        else {
            System.out.println("Over " + tripNumber + " trips.");
        }
        trip.resetOdometer();
        System.exit(0);
    }
    }
}


    }
