import java.util. Scanner;
 // Assignment 10
public class Assignment10{
public static void main( String[] args)
{
Scanner keyboard = new Scanner (System.in);



System.out.println("What's your birthday?"); 
System.out.print  ("Birth date (mm dd yyyy):"); 
int mm = keyboard. nextInt ();
int dd = keyboard. nextInt (); 
int yyyy = keyboard. nextInt ();

// put a function calL for weekday () here 
System.out.print ("You were born on "); 
System.out.println(weekday(mm, dd, yyyy));

keyboard. close();
}

public static String weekday (int mm, int dd, int yyyy) { 
int yy,total; 
String date = "";

//bunch of calculations go here 
yy = yyyy - 1900;
total = (yy / 4) + yy + dd; 
int offset = month_offset (mm);
total = total + offset;
boolean leapYear = is_leap(yyyy); 
String mon = month_name(mm);

if(leapYear && (mon. equals("January") || mon.equals("February"))) 
 total = total - 1;

int a= total % 7; 
String wday = weekday_name(a);

date = wday + ","+ mon + " " + dd + ","+ yyyy;
//date = month_name (mm) + "," + yyyy;

 return date;
}

 // paste your functions from MonthName, Weekday Name, and MonthOffset here 
public static String weekday_name (int n) {
if (n == 1) 
return "Sunday";
 else if (n == 2) 
return "Monday" ;
 else if (n == 3) 
return "Tuesday";
 else if (n == 4) 
return "Wednesday";
 else if (n == 5) 
return "Thursday";
 else if (n == 6) 
return "Friday";
else if (n == 7) 
return "Saturday";
else  
return "Error!"; 
}

public static String month_name (int n){ 
if (n == 1)
return "January"; 
else if (n == 2)
return "February";
else if (n == 3)
return "March"; 
else if (n == 4)
return "April"; 
else if (n == 5) 
return "May"; 
else if (n == 6) 
return "June"; 
else if (n == 7) 
return "July" ; 
else if (n == 8)
return "Augest"; 
else if (n == 9)
return "September"; 
else if (n == 10)
return "October"; 
else if (n == 11)
return "November"; 
else if (n == 12)
return "December"; 
else
return "Error!";
}

 /* offset of months
 January, October = 1 | February, march, november = 4 
 April, July = 0 | May = 2 | June = 5| Augest = 3 
 September, December = 6 | else retun -1 */

public static int month_offset (int n){
if (n == 1 || n == 10)
return 1;
else if (n == 2 || n == 3 || n == 11) 
return 4;
else if (n == 4 || n == 7) 
return 0;
else if (n == 5) 
return 2;
else if (n == 6) 
return 5; 
else if (n == 8) 
return 3;
else if (n == 9 || n == 12)
return 6;
 else
 return -1;
}

 public static boolean is_leap (int year) {
 // years which are evenLy divisible by 4 are Leap years,
 // but years divisible by 100 are not Leap years,
 // though years divisibLe by 400 are Leap years 
boolean result;

if (year % 400 == 0) 
    result = true;
else if (year % 100 == 0) 
    result = false; 
else if (year % 4 == 0)
    result = true;
else 
    result = false;
    return result; 
    }
}