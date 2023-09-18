/*
Define a class called Odometer that will be used to track fuel and mileage for an
automobile.

1. The class should have instance variables to track the miles driven and
the fuel efficiency of the vehicle in miles per gallon.

2. Include a mutator method  to reset the odometer to zero miles,
3. a mutator method to set the fuel efficiency,
4. a mutator method that accepts miles driven for a trip and adds it to the odometer’s total,
5. an accessor method that returns the number of gallons of gasoline that the vehicle has consumed since the odometer was last reset.

Use your class with a test program that creates several trips with different fuel
efficiencies. You should decide which variables should be public, if any.
=========================================
GIVEN:
1. distance traveled in miles
2. gallons of fuel in your vehicle

GET:
1. Fuel economy
2. remaining fuel from the end of a certain trip.

 */
import java.util.*;
import java.text.*;
import java.math.*;
public class Odometer {

    public double totalMiles = 0.0; //total miles driven.
    public double fuelEff = 0.0; //your vehicle's overall fuel efficiency.

    public double miles = 0.0; //miles for a single trip.

    public double totalGallons = 0.0; //your vehicle's fuel capacity.
    public double gallonsRemaining;

    public double gallonsUsed;

    public void resetOdometer() //This class will reset the odometer to 0.0 miles.
    {
        totalMiles = 0.0;
    }

    public void milesDriven() //Mutator method that adds miles to the total miles in the odometer.
    {
        Scanner ayaye = new Scanner(System.in);
        System.out.println("Enter the amount of miles you have traveled in this trip.");
        miles = ayaye.nextDouble();
        totalMiles = totalMiles + miles;
        System.out.println("So far, you have driven " + totalMiles + " miles.");
    }
    public void setFuelEfficiency() //This class will calculate the fuel efficiency in miles per gallon.
    {
        Scanner ayaye = new Scanner(System.in);
        System.out.println("How many gallons have you used on your trip?");
        gallonsUsed = ayaye.nextDouble();
        fuelEff = miles/gallonsUsed;
        System.out.println("Your vehicle's fuel efficiency is: " + fuelEff + " miles per gallon.");
    }

    public void setGallons()
    {
        Scanner ayaye = new Scanner(System.in);
        System.out.println("Enter the amount of gallons your vehicle has.");
        totalGallons = ayaye.nextDouble();
    }

    public double getFuelRemaining() //Accessor method that gets the remaining fuel from a certain trip.
    {
        gallonsUsed = miles / fuelEff; //get gallons used in a trip by dividing the trip distance by the vehicle's fuel economy.

        gallonsRemaining = totalGallons - gallonsUsed;
        System.out.println("From the " + totalGallons + " gallons you had initially, you used " + gallonsUsed + " gallons, which leaves you with " + gallonsRemaining + " gallons.");
            totalGallons = gallonsRemaining;
        if (gallonsRemaining <= 4 && gallonsRemaining >= 0.00001)
        {
            System.out.println("You are running low on fuel...");
        }

        if (gallonsRemaining <= 0)
        {
            System.out.println("You're out of gas!");
        }
        return gallonsRemaining;
    }


}
