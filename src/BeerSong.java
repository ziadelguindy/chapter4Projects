/*
Write a program that outputs the lyrics for “Ninety-nine Bottles of Beer on the  Wall.”*
Your program should print the number of bottles in English, not as a
number. For example,

Ninety-nine bottles of beer on the wall,
Ninety-nine bottles of beer,  Take one down, pass it around,
Ninety-eight bottles of beer on the wall.
...
One bottle of beer on the wall,
One bottle of beer,
Take one down, pass it around,
Zero bottles of beer on the wall.

Your program should not use ninety-nine output statements!
Design your program with a class named BeerSong whose constructor takes an
integer parameter that is the number of bottles of beer initially on the wall. If
the parameter is less than zero, set the number of bottles to zero. Similarly, if the
parameter is greater than 99, set the number of beer bottles to 99. Then make
a public method called printSong that outputs all stanzas from the number of
bottles of beer down to zero. Add any additional private methods you find helpful.

 */
import java.util.Scanner;
public class BeerSong {

    private int number;

    public static void main(String[] args) {
        //Lyrics song = new Lyrics(); //Created a constructor with
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of bottles between 0 and 99.");
        String numberWord019 = "";
        String numberTens = "";
        String numberOnes = "";
        int numberOfBottles = keyboard.nextInt();
        if (numberOfBottles < 0)
        {
            numberOfBottles = 0;
        }
        else if (numberOfBottles > 99)
        {
            numberOfBottles = 99;
        }
        System.out.println("You have " + numberOfBottles + " bottles.");

        // TODO Add this to a class called printString.


            }

            public static String number2Word(int numberOfBottles)
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
                        default:
                            System.out.println("Please re-assign.");
                            break;

                    }
                    return numberWord019;
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
                    return numberTens + numberOnes;
                }

            }

    public void printString(int bottleNumber)
    {
        bottleNumber = number;
        while (number >= 20)
        {
            System.out.println(number2Word(number) + " bottles of beer on the wall");
            System.out.println(number2Word(number) + " bottles of beer");
            System.out.println("Take one down pass it around");
            number--;
            System.out.println(number2Word(number) + " bottles of beer on the wall \n");

        }
        while (number <= 19 && number > 0)
        {
            System.out.println(number2Word(number) + " bottles of beer on the wall");
            System.out.println(number2Word(number) + " bottles of beer");
            System.out.println("Take one down pass it around");
            number--;
            System.out.println(number2Word(number) + " bottles of beer on the wall \n");

        }
    }

        }



