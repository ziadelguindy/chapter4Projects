import java.util.Scanner;

public class Lyrics {

    public int numberOfBottles;

    public void setNumber() //Mutator method that asks the user how many bottles there are.
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of bottles between 0 and 99.");
        numberOfBottles = keyboard.nextInt();
        if (numberOfBottles < 0)
        {
            numberOfBottles = 0;
        }
        else if (numberOfBottles > 99)
        {
            numberOfBottles = 99;
        }
        System.out.println("You have " + numberOfBottles + " bottles.");

    }

    public String number2Word(int numberOfBottles)
    {
        String numberWord019 = "";
        String numberTens = "";
        String numberOnes = "";
        if (numberOfBottles >= 0 && numberOfBottles <= 19) {
            switch (numberOfBottles) {
                case 0:
                    numberWord019 = "Zero";
                    break;
                case 1:
                    numberWord019 = "One";
                    break;
                case 2:
                    numberWord019 = "Two";
                    break;
                case 3:
                    numberWord019 = "Three";
                    break;
                case 4:
                    numberWord019 = "Four";
                    break;
                case 5:
                    numberWord019 = "Five";
                    break;
                case 6:
                    numberWord019 = "Six";
                    break;
                case 7:
                    numberWord019 = "Seven";
                    break;
                case 8:
                    numberWord019 = "Eight";
                    break;
                case 9:
                    numberWord019 = "Nine";
                    break;
                case 10:
                    numberWord019 = "Ten";
                    break;
                case 11:
                    numberWord019 = "Eleven";
                    break;
                case 12:
                    numberWord019 = "Twelve";
                    break;
                case 13:
                    numberWord019 = "Thirteen";
                    break;
                case 14:
                    numberWord019 = "Fourteen";
                    break;
                case 15:
                    numberWord019 = "Fifteen";
                    break;
                case 16:
                    numberWord019 = "Sixteen";
                    break;
                case 17:
                    numberWord019 = "Seventeen";
                    break;
                case 18:
                    numberWord019 = "Eighteen";
                    break;
                case 19:
                    numberWord019 = "Nineteen";
                    break;
//It is optional to include the default case in a swtich statement, but recommended for syntax.
            }

            return numberWord019;
        }
        else {
            switch (numberOfBottles / 10) { //For the tens after 20.
                case 2:
                    numberTens = "Twenty";
                    break;
                case 3:
                    numberTens = "Thirty";
                    break;
                case 4:
                    numberTens = "Forty";
                    break;
                case 5:
                    numberTens = "Fifty";
                    break;
                case 6:
                    numberTens = "Sixty";
                    break;
                case 7:
                    numberTens = "Seventy";
                    break;
                case 8:
                    numberTens = "Eighty";
                    break;
                case 9:
                    numberTens = "Ninety";
                    break;
            }

            switch (numberOfBottles % 10) { //For the ones after twenty
                case 0:
                    numberOnes = "";
                    break;
                case 1:
                    numberOnes = "-one";
                    break;
                case 2:
                    numberOnes = "-two";
                    break;
                case 3:
                    numberOnes = "-three";
                    break;
                case 4:
                    numberOnes = "-four";
                    break;
                case 5:
                    numberOnes = "-five";
                    break;
                case 6:
                    numberOnes = "-six";
                    break;
                case 7:
                    numberOnes = "-seven";
                    break;
                case 8:
                    numberOnes = "-eight";
                    break;
                case 9:
                    numberOnes = "-nine";
                    break;

            }
            if (numberOfBottles <= 19)
            {
                System.out.println(numberWord019 + "\n");
            }
            if (numberOfBottles >= 20 && numberOfBottles <= 99)
            {
                System.out.println(numberTens + numberOnes + "\n");
            }
            return numberTens + numberOnes;
        }

    }

    public void printString(int numyy)
    {

        while (numyy >= 20)
        {
            System.out.println(number2Word(numyy) + " bottles of beer on the wall");
            System.out.println(number2Word(numyy) + " bottles of beer");
            System.out.println("Take one down pass it around");
            numyy--;
            System.out.println(number2Word(numyy) + " bottles of beer on the wall \n");

        }
        while (numyy <= 19 && numyy > 0)
        {
            System.out.println(number2Word(numyy) + " bottles of beer on the wall");
            System.out.println(number2Word(numyy) + " bottles of beer");
            System.out.println("Take one down pass it around");
            numyy--;
            System.out.println(number2Word(numyy) + " bottles of beer on the wall \n");

        }
    }
    /*
    This method getNumberWord uses a switch statement based on the number integer and returns the value as a String.
    For example: 86 - Eighty-six
     */
    /* public String getNumberWord() {
        switch (numberOfBottles) {



        }
    } */
    /* public void stanza
    if (numberOfBottles >= 0 && numberOfBottles <= 19) {
        switch (numberOfBottles) {
            case 0:
                numberWord019 = "Zero";
                break;
            case 1:
                numberWord019 = "One";
                break;
            case 2:
                numberWord019 = "Two";
                break;
            case 3:
                numberWord019 = "Three";
                break;
            case 4:
                numberWord019 = "Four";
                break;
            case 5:
                numberWord019 = "Five";
                break;
            case 6:
                numberWord019 = "Six";
                break;
            case 7:
                numberWord019 = "Seven";
                break;
            case 8:
                numberWord019 = "Eight";
                break;
            case 9:
                numberWord019 = "Nine";
                break;
            case 10:
                numberWord019 = "Ten";
                break;
            case 11:
                numberWord019 = "Eleven";
                break;
            case 12:
                numberWord019 = "Twelve";
                break;
            case 13:
                numberWord019 = "Thirteen";
                break;
            case 14:
                numberWord019 = "Fourteen";
                break;
            case 15:
                numberWord019 = "Fifteen";
                break;
            case 16:
                numberWord019 = "Sixteen";
                break;
            case 17:
                numberWord019 = "Seventeen";
                break;
            case 18:
                numberWord019 = "Eighteen";
                break;
            case 19:
                numberWord019 = "Nineteen";
                break;
            default:
                System.out.println("Please re-assign.");
                break;

        }
        System.out.println(numberWord019);
    }
            else
    {
        switch (numberOfBottles / 10) { //For the tens after 20.
            case 2:
                numberTens = "Twenty";
                break;
            case 3:
                numberTens = "Thirty";
                break;
            case 4:
                numberTens = "Forty";
                break;
            case 5:
                numberTens = "Fifty";
                break;
            case 6:
                numberTens = "Sixty";
                break;
            case 7:
                numberTens = "Seventy";
                break;
            case 8:
                numberTens = "Eighty";
                break;
            case 9:
                numberTens = "Ninety";
                break;

        }

        switch (numberOfBottles % 10) { //For the ones after twenty
            case 0:
                numberOnes = "";
                break;
            case 1:
                numberOnes = "-one";
                break;
            case 2:
                numberOnes = "-two";
                break;
            case 3:
                numberOnes = "-three";
                break;
            case 4:
                numberOnes = "-four";
                break;
            case 5:
                numberOnes = "-five";
                break;
            case 6:
                numberOnes = "-six";
                break;
            case 7:
                numberOnes = "-seven";
                break;
            case 8:
                numberOnes = "-eight";
                break;
            case 9:
                numberOnes = "-nine";
                break;
            default:
                System.out.println("Reenter input.");
                break;
        }
        System.out.println(numberTens + numberOnes);
    } */

}
