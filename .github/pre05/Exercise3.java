import java.util.*;

    public class Exercise3 {
    
      
      public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      System.out.print("Side1: ");
      int s1 = in .nextInt();
      System.out.print("Side2: ");
      int s2 = in .nextInt();
      System.out.print("Side3: ");
      int s3 = in .nextInt();

      
      
     }
     public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b);
        System.out.print("Yes, those sides CAN form a triangle: " + isTriangle(s1, s2, s3));
       else 
        System.out.print("No, those sides CANNOT form a triangle: " + isTriangle(s1, s2, s3));
     }
}
