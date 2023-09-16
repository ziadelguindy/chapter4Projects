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

public class BeerSongExecutor {
    public static void main(String[] args) {
        Lyrics stoy = new Lyrics();
        stoy.setNumber();
        //stoy.number2Word(stoy.numberOfBottles); //Sending an attribute of a class instance.
        stoy.printString(stoy.numberOfBottles); //The printString method will also invoke the number2Word method in the lyrics class.
    }
}
