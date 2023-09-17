/*
Define a class called Fraction. This class is used to represent a ratio of two integers.
Include mutator methods that allow the user to set the numerator and the
denominator. Also include a method that returns the value of numerator divided
by denominator as a double. Include an additional method that outputs the value
of the fraction reduced to lowest terms (e.g., instead of outputting 20/60, the
method should output 1/3). This will require finding the greatest common divisor
for the numerator and denominator, then dividing both by that number. Embed
your class in a test program.
 */
import java.util.*;
import java.math.*;
import java.text.*;
import java.lang.*;
public class Fraction {

    private int numerator;
    private int denominator;

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
    //TODO: Find a function that gets the greatest common factor of the numerator and denominator.

    public void getGreatestCommonFactor(String ratio)
    {
        ratio = numerator + ":" + denominator;
        System.out.println(ratio + " is your ratio.");
        Math.s

    }

}
