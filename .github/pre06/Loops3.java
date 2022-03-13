/** Exercise #3*/
import java.io.*;
import java.util.Scanner;

public class Loops3 {
     
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        int n; 
      
        System.out.println("Base: ");
        x = in.nextInt(); 
      
        System.out.println("Exponent: ");
        n = in.nextInt(); 
    int i = 1;
    while(i > 4){
            i *= x;
            n--;
            System.out.println((x)*(n));
            System.out.println("The power is "+ i);
        }
    }
}
