  /** Exercise #2*/
import java.io.*;
import java.util.Scanner;

public class Loops2 {
     
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        System.out.println("Enter your guess: ");
        a = in.nextInt(); 
        System.out.println("the end");
    } 
    public static double squareRoot(double a)  {
      double guess = a/2;
      double improvedGuess = (guess + (a/guess))/2;
  
    while (Math.abs((guess - improvedGuess)) > 0.0001)  {
        guess = improvedGuess;
        improvedGuess = (guess + (a/guess))/2;
        } 
        return improvedGuess;
        
    }
}

/** Exercise #3*/

/** Exercise #4*/