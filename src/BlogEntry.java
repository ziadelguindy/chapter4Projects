/*
1.Define a class called BlogEntry that could be used to store an entry for a Web
log.
 a.The class should have instance variables to store the poster’s username, text of
the entry, and the date of the entry using the Date class from this chapter.
2. Add a constructor that allows the user of the class to set all instance variables. (create methods in this class and invoke them as objects in the main method)
3. add a method, DisplayEntry, that outputs all the instance variables,
4. add method called getSummary that returns the first 10 words from the text (or the entire text if it is less than 10 words).
Test your class from your main method.
 */
import java.util.Scanner;
public class BlogEntry {

    public String username;
    public String textPost;

    public String postingDate;

    public int day, month, year;

    //This method should take the user's input for their username, the name of the post, and the date posted.
    //It should output "##Name of username## posted "##Name of post##" on ##Date of posting## on the screen.
    public void displayEntry()
    {
        Date splice = new Date();
        splice.readInput();

        day = splice.getDay();

        month = splice.getMonth();

        year = splice.getYear();

        System.out.println(username + " posted " + "\"" + textPost + "\"" + " at " + postingDate);
    }

    //This method should return the first ten words of the text entry string.
    public void getSummary()
    {




    }
}




