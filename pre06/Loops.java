import java.io.*;
import java.util.*;

public class Loops{
// number 2 - Square root
public static double squareRoot(double a){
  double x0;
  double x1 = a/2;
  do { x0 = x1;
    x1 = (x0 + a/x0)/2;
    } while (Math.abs(x1-x0)>=0.0001);
  return x1;
}  

// number 3 - power
public static double power(double x, int n){
double p = 1;
  for (int i = 1; i <= n; i += 1){
    p = p * x;
  }
return p;
}
// number 4 - factorial
public static int factorial(int n){
  int f = 1;
  if (n == 0 || n ==1){return f;}
  else {
    for (int i = 1; i <=n; i += 1){
      f = f * i;
    }
    return f;
  }
}
public static void main(String[]args){
  System.out.println();
  System.out.println("The square root of 2 is approximately "+squareRoot(2)+".");
  System.out.println();
  System.out.println("The value of 2^16 is "+power(2,16)+".");
  System.out.println();
  System.out.println("The value of 11! is "+factorial(11)+".");
  System.out.println();
  }
}