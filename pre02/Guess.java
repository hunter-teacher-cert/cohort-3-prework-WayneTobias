import java.io.*;
import java.util.*;
//  guess a Random Number from 1 to 100
  
public class Guess {
    public static void main(String[] args)
    {
  
int pickNumber;
Random random = new Random();
  pickNumber = random.nextInt(100) + 1;
  System.out.println("Secret number is " +   pickNumber); 
  // hide if it works

 Scanner keyboard = new Scanner(System.in);
  int guess;
  System.out.print("Enter a guess: ");
  guess = keyboard.nextInt();
  System.out.println("Your guess is " + guess); 
  // user puts in a guess

  System.out.println("The number I was thinking of is " + pickNumber);
  // program reveals number it picked randomly

 if (guess == pickNumber)
  System.out.println("Your guess is correct. Congratulations!");
  else if (guess < pickNumber)
    System.out.println("Your guess is smaller than the secret number.");
  else if (guess > pickNumber)
     System.out.println("Your guess is greater than the secret number.");
  // checks to see if you were right, high, or low

  System.out.println("You were off by: " + ((pickNumber - guess) *(-1)));
  // tells you how much you were high or low ??? absolute value ???
    }
}