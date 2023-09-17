/*
1. Define a class called Fraction.    >>>>>>>  DONE

This class is used to represent a ratio of two integers.
Include mutator methods that allow the user to set the numerator and the
denominator.

2. Include a method that returns the value of numerator divided
by denominator as a double. >>>>>>>>>> CLEARED

3. Include an additional method that outputs the value
of the fraction reduced to lowest terms (e.g., instead of outputting 20/60, the
method should output 1/3). >>>>>>>>>>> WILL FIND A METHOD FOR LEAST COMMON MULTIPLE and GCF

This will require finding the greatest common divisor
for the numerator and denominator, then dividing both by that number. Embed
your class in a test program.
 */
import java.sql.SQLOutput;
import java.util.*;
import java.math.*;
import java.text.*;
import java.lang.*;

public class Fraction {

    public int numerator;
    public int denominator;
    public double ratio;

    //Pseudocode: set the numerator and denominator
    public void setNumeratorDenominator()
    {
        String fraction = "/"; //slash for division sign.
        String ratio = ":"; //colon for ratio sign.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the numerator as a whole number.");
        numerator = keyboard.nextInt();
        numerator = this.numerator;
        System.out.println("Enter the denominator as a whole number.");
        denominator = keyboard.nextInt();
        denominator = this.denominator;
        System.out.println("The numerator is " + numerator + " and the denominator is " + denominator + ".");
        System.out.println(numerator + fraction + denominator + " is the fraction.");
    }

    //Pseudocode: get the fraction ratio.


    public double getRatio(double numerator, double denominator)
    {
        ratio = numerator / denominator;
        System.out.println("The decimal form is " + ratio + ".");
        return ratio;

    }

    //TODO: Find a function that gets the greatest common factor of the numerator and denominator from their product and least common multiple or prime division.

    public void simplifyFraction(int numerator, int denominator)
    {
        int commonFactor = 1;

//I will stop at 23. The concept can be extended to whatever level possible.
        //There is no pattern for the prime numbers that can be identified.
    while ((numerator % 2 == 0) && (denominator % 2 == 0)) {
        numerator = numerator / 2;
        denominator = denominator / 2;
        commonFactor = commonFactor * 2;
    }
        while ((numerator % 3 == 0) && (denominator % 3 == 0)) {
            numerator = numerator / 3;
            denominator = denominator / 3;
            commonFactor = commonFactor * 3;
        }
        while ((numerator % 5 == 0) && (denominator % 5 == 0)) { //There is no definable sequence for the prime numbers.
            numerator = numerator / 5;
            denominator = denominator / 5;
            commonFactor = commonFactor * 5;
        }
        while ((numerator % 7 == 0) && (denominator % 7 == 0)) {
            numerator = numerator / 7;
            denominator = denominator / 7;
            commonFactor = commonFactor * 7;
        }
        while ((numerator % 11 == 0) && (denominator % 11 == 0)) {
            numerator = numerator / 11;
            denominator = denominator / 11;
            commonFactor = commonFactor * 11;
        }
        while ((numerator % 13 == 0) && (denominator % 13 == 0)) {
            numerator = numerator / 13;
            denominator = denominator / 13;
            commonFactor = commonFactor * 13;
        }
        System.out.println("Your fraction is " + numerator + "/" + denominator + ".");
        System.out.println("This fraction would simplify to:");
    System.out.println(numerator + "/" + denominator + " with a greatest common factor of " + commonFactor + ".");
    }
        
        
    }

