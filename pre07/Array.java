import java.io.*;
import java.util.*;
// Array

public class Array{
  //raise each number in the array to a power and return a new array
  public static double[] powArray(double[] a, int p){
    double b[];
    b = new double[5];
    for(int i=0; i<5; i++){
      double temp = a[i];
      b[i] = 1;
      for(int j = 1; j <= p; j++){
        b[i] = b[i] * temp;
      }
    }
    return b;
  }
  public static void main (String[]args){
//    variable for power and arrays everything being raised to a power
int power = 4;
    double values[];
    double valPowers[];
    values = new double[5];
    valPowers = new double[5];
    // put in 1-5 
    for (int i = 1; i <= 5; i++){
      values[i-1] = i;
      System.out.println ("a ["+(i-1)+"]) = "+values [i-1]);
    }
    //show the results
    valPowers = powArray (values, power);
    for(int i = 1; i < 6; i++){
      System.out.println("a ["+(i-1)+"] ^ "+power+" = "+valPowers[i-1]);
    }
    
  }
}
