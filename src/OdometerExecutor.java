import java.util.Scanner;
public class OdometerExecutor {
    public static void main(String[] args) {
Odometer trip = new Odometer();
Scanner keyboard = new Scanner(System.in);
String tryAgain = "true";
        trip.setGallons();
while (tryAgain.equalsIgnoreCase("true")) {
    trip.milesDriven();
    trip.setFuelEfficiency();
    trip.getFuelRemaining();
    System.out.println("Would you like to try again for another trip? Type \"true\" for yes, and \"false\" for no.");
    tryAgain = keyboard.next();
    if (tryAgain.equalsIgnoreCase("true"))
    {
        continue;
    }
    if (tryAgain.equalsIgnoreCase("false"))
    {
        trip.resetOdometer();
        System.exit(0);
    }
    }
}


    }
