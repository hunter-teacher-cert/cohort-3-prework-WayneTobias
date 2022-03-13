import java.io.*;
import java.util.*;

public class Beer{
  public static void main(String[]args){

  // for int beerNum - use a small number
int beerNum = 3;
      if (beerNum > 0){
         System.out.println(beerNum + " bottles of beer on the wall,");
         System.out.println(beerNum + " bottles of beer,");
         System.out.println("ya' take one down, ya' pass it around,");
         System.out.println(beerNum-1 + " bottles of beer on the wall.");

       beerNum = beerNum - 1;
        } else if (beerNum == 0); {
         System.out.println("No bottles of beer on the wall,");
         System.out.println("no bottles of beer,");
         System.out.println("ya' can't take one down, ya' can't pass it around,");
         System.out.println("'cause there are no more bottles of beer on the wall!");
      }
   }
}
    