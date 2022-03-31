import java.io.*;
import java.util.*;

public class Max{
// find the largest element
  public static int indexOfMax(int[] a){
    int maxIndex = 0;
    int tempMax = a[0];
    for(int i = 1; i < a.length; i++){
      if(a[i] > tempMax){
        maxIndex = i;
        tempMax = a[i];
      }
    }
    return maxIndex;
  }
  // random array with spcified length
  public static int[] randomArray(int size){
    Random random = new Random();
    int[] a = new int[size];
    for(int i = 0; i < size; i++){
      a[i] = random.nextInt(100);
    }
    return a;
  }
  public static void main (String[]args){
    int[] values = randomArray(10);
    System.out.println("For the array:");
    System.out.println(Arrays.toString(values));;
    System.out.println();

    System.out.println("The index of the maximum value is:");
    System.out.println(indexOfMax(values));
    System.out.println();
    
  }
  
}