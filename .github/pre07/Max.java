/** Exercise #4*/
import java.io.*;
import java.util.Scanner;

public class Max {

    public static void indexOfMax (String[] args) {
      
    }
    public static void main (String[] args) {
      
    }
}

//Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?

public int getIndexOfLargest( int[] array )
{
  if ( array == null || array.length == 0 ) return -1; // null or empty

  int largest = 0;
  for ( int i = 1; i < array.length; i++ )
  {
      if ( array[i] > array[largest] ) largest = i;
  }
  return largest; // position of the first largest found
}