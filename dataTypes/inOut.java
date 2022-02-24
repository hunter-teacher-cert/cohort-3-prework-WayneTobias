import java.io.*;
import java.util.*;

public class inOut{
  public static void main(String[]args){
int inch;
double CM_PER_INCH = 2.54;
Scanner in = new Scanner(System.in);

String name = "";
int age;

System.out.print("How many inches? ");
inch = in.nextInt ();

CM_PER_INCH = inch * 2.54;
System.out.print (inch + " in = ");
System.out.println (CM_PER_INCH + " cm");

System.out.println(4.0 / 3.0);
System.out.printf("Four thirds = %.3f", 4.0 / 3.0);

System.out.print("What is your age? ");
age = in.nextInt();
in.nextLine();  // read the newline
System.out.println("What is your name? ");
name = in.nextLine();
System.out.printf("Hello %s, age %d\n", name, age);

  }
}