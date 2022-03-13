import java.io.*;
import java.util.*;

public class Methods{
    public static void printHello(String name){
        String result;
        result = returnHello(name);
        System.out.println(result);
    }

    public static String returnHello(String name){
        String result;
        return "Hello " + name + "!";
    }
public static void countup(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        countup(n - 1);
        System.out.println(n);
      }
    }
     public static boolean isDivisible(int n, int m){
      return (m != 0 && n % m == 0);

   }
    public static void main(String[] args){
        String s;
        printHello("Kessler");
        s = returnHello("TiffKneeAnne");
        System.out.println(s);
        countup(3);
        System.out.println("Have a nice day.");

        boolean z;
      int m = 5;
      int n = 4;
      boolean isDivisible;
      //z = isDivisible(5,4);
    }
   /**
      @ return true if m is not `0` and n is divisible by m 
   */

  }