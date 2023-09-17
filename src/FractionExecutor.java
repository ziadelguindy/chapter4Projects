import java.util.Scanner;

public class FractionExecutor {
    public static void main(String[] args) {
        Fraction nyet = new Fraction(); //Constructor that creats an instance object of the class Fraction.
        nyet.setNumeratorDenominator();
        nyet.getRatio(nyet.numerator, nyet.denominator);
        //include the object name preceding the instance variable name with a dot.
        nyet.simplifyFraction(nyet.numerator, nyet.denominator);

    }
}
