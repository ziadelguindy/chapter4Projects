import java.util.Scanner;

public class Date {
    public String month;
    public int day;
    public int year;

    public Date() //A constructor with no arguments.
    {
        month = "January";
        day = 1;
        year = 1000;
    }

    public Date(int monthInt, int day, int year) //First overload, can invoke another method in a constructor definition
    {
        setDate(monthInt, day, year);
    }

    public Date(String monthString, int day, int year) //Second overload, constructors initialise all instance vars even without corresponding parameters.
    {
        setDate(1, 1, year);
    }

    public Date(Date aDate)
    {
        if (aDate == null) //Not a real date.
            {
                System.out.println("Fatal Error.");  System.exit(0);
            }
        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public void setDate (int monthInt, int day, int year) //First method named setDate, parameters are three integer variables.
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }
        else {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate (String monthString, int day, int year) //First method overload named setDate, parameters are three integer variables.
    {
        if (dateOK(monthString, day, year))
        {
            this.month = monthString;
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Datal Error");
            System.exit(0);
        }
    }

    public void setDate(int year) //Second overload. Mutator method
    {
        setDate(1, 1, year);
    }

    public void setYear (int year) //this is a mutator method
    {
        if ((year < 1000) || (year > 9999))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else {
            this.year = year;
        }
    }

    public void setMonth (int monthNumber) //this is a mutator method.
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
        {
        month = monthString(monthNumber);
        }
    }

    public void setDay(int day) //This is a mutator method
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Datal Error");
            System.exit(0);
        }
        else {
            this.day = day;
        }
    }

    public int getMonth() //This is an accessor method that returns an integer.
    {
        if (month.equalsIgnoreCase("January"))
            return 1;
        else if (month.equalsIgnoreCase("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 3;
        else if (month.equalsIgnoreCase("April"))
            return 4;
        else if (month.equalsIgnoreCase("May"))
            return 5;
        else if (month.equalsIgnoreCase("June"))
            return 6;
        else if (month.equalsIgnoreCase("July"))
            return 7;
        else if (month.equalsIgnoreCase("August"))
            return 8;
        else if (month.equalsIgnoreCase("September"))
            return 9;
        else if (month.equalsIgnoreCase("October"))
            return 10;
        else if (month.equalsIgnoreCase("November"))
            return 11;
        else if (month.equalsIgnoreCase("December"))
            return 12;
        else {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }
    }

    public int getDay() //Accessor method returns an int.
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    public String toString() //Accessor method with method toString to return a String.
    {
        return (day + " " + month + " " + year);
    }

    public boolean equals(Date otherDate) //method equals of the class String. It will return a boolean.
    {
        return ((month.equals(otherDate.month)) && (day == otherDate.day) && (year == otherDate.year));
    }

    public boolean precedes(Date otherDate)
    {
        return ((year < otherDate.year && getMonth() < otherDate.getMonth()) || (year == otherDate.year && month.equals(otherDate.month) && day < otherDate.day));
    }

    public void readInput()
    {
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain)
        {
            System.out.println("Enter the month, day and year. NO COMMAS");
            String monthInput = keyboard.next();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if (dateOK(monthInput, day, year))
            {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }
            else
                System.out.println("Illegal Date. Reenter.");
        }
    }

    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ((monthInt >= 1) && (monthInt <= 12) && (dayInt >= 1) && (dayInt <= 31) && (yearInt > 1000) && (yearInt < 9999));
    }

    private  boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return (monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
    }

    private boolean monthOK(String month)
    {
        return (month.equals("January") || month.equals("February") || month.equals("March") ||
                month.equals("April") || month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") || month.equals("September") ||
                month.equals("October") || month.equals("November") || month.equals("December"));
    }

    private String monthString(int monthNumber)
    {
        switch (monthNumber)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }





    }
