/** Exercise #1*/
import java.io.*;
import java.util.Scanner;

public class Array {

    public static void main (String[] args) {
     double[] squareArry = powArray(new double[]{10,20,30},3);

        }

        public static double[] powArray (double a[],int z){
            double[] b = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = Math.pow(a[i], z);
                System.out.print(b[i]);
            }
            return b;
    }
}
//double[] a = new double[a*a];