import java.io.*;
import java.util.*;

public class Date{
  public static void main(String[]args){
System.out.println("Hello bub");

String day = "Sunday";
int date = 6;
String month = "February";
int year = 2020;
System.out.println(day);
System.out.println(date);
System.out.println(month);
System.out.println(year);

// American format
System.out.println("American format: " +day+ ", " +month+" " +date +", "+year );

// Euro format
System.out.println("European format: " +day+ " " +date+ " " +month+ " " +year);

  }
}