import java.util.Scanner;

public class Exercise8 {


  public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m;
        System.out.println("Enter m: ");
        m = reader.nextInt(); 
        int n;
        System.out.println("Enter n: ");
        n = reader.nextInt(); 
        System.out.println("ack(" + m + ", " + n + ") = " + ack(m, n));
    }
    public static int ack (int m, int n){
        if(m == 0){
            return  n + 1;
        }
        if(n == 0){
            return ack(m - 1, 1);
        }
        return ack(m - 1, ack(m, n - 1));
    }
}