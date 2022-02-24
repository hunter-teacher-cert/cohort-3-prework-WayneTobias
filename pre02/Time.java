import java.io.*;
import java.util.*;
public class Time {
  public static void main(String[]args){
System.out.println("Hello, this is the Time.java file");

int hour = 15;
int minute = 18;
int second = 15;

System.out.print("Number of seconds since midnight are: ");
System.out.println(hour*3600 +minute*60 +second);

System.out.print("Number of seconds remaining in the day are: ");
System.out.println((24*3600) - (hour*3600 +minute*60 +second));
//I used pemdas by inserting parenthesis around current calculation and subtracting from 24 hours

System.out.print("The percentage of the day that has passed is approximately: ");
System.out.print((hour*3600 +minute*60 +second)*100/(24*3600));
System.out.println(" percent");
//I used pemdas by inserting parenthesis around current calculation and multiplying by 100 before dividing by one day (24 hrs) worth of seconds. I also left it rounded to a whole number. 

int currentHour = 15;
int currentMinute = 36;
int currentSecond = 30;
System.out.print("Number of seconds since I started: ");
System.out.println((currentHour*3600 + currentMinute*60 +currentSecond)-(hour*3600 +minute*60 +second));
System.out.println("Convert the number of seconds to minutes to get approximately: "+(((currentHour*3600 + currentMinute*60 +currentSecond)-(hour*3600 +minute*60 +second))/60) +" minutes");

  }
}
