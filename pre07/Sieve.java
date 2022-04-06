import java.io.*;
import java.util.*;

public class Sieve{
  public static boolean[] sieve(int n){
    
// make the array
  boolean[] a = new boolean [n];
  for(int i = 0; i < a.length; i++){
    a[i] = true;
    }
    //apply the sieve
    for(int i = 2; i < a.length; i++){
      for(int j = 2; i*j < a.length; j++){
        a[i*j] = false;
      }
    }
      return a;
  }
public static void main(String[]args){
  // make array to represent positive integers to num given
  int n = 100;
  boolean[] isPrime = new boolean [n];
  // call the sive and print
  isPrime = sieve(n);
  for(int i = 2; i < isPrime.length; i++){
    System.out.println(i + " " + isPrime[i]);
  }
}
  
}