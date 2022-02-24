import java.io.*;
import java.util.*;

public class Celsius{
  public static void main(String[]args){
int celsius;
int farenheit;

Scanner in = new Scanner(System.in);

System.out.println("I will convert Celsius to Farenheit degrees");
System.out.print("How many degrees Celsius? ");
celsius = in.nextInt ();

farenheit = ((9/5) * celsius + 32);
System.out.print (celsius + " degrees celsius = ");
System.out.println (farenheit + " degrees farenheit");


  }
}