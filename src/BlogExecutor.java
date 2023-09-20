import java.util.Scanner;
import java.util.StringTokenizer;
public class BlogExecutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BlogEntry entry = new BlogEntry();
        Date datesetter = new Date();
        System.out.println("Enter your username, the post title, and the date of posting.");
        entry.username = input.next(); //User inputs username
        entry.textPost= input.next(); //User inputs textual description of the blog post.
        StringTokenizer textEntry = new StringTokenizer(entry.textPost);
        //I need the String Tokenizer to output each token (word) onto the screen.
        datesetter.readInput();
        entry.postingDate = datesetter.month + " " + datesetter.day + " " + datesetter.year;
        System.out.println(datesetter.month + " " + datesetter.day + " " + datesetter.year);
        System.out.println(entry.username + " posted " + "\"" + textEntry.nextToken() + "\"" + " at " + entry.postingDate);

    }
}
