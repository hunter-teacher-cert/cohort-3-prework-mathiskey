/** Exercise #4*/
public class Loops4 {

	public static void main(String[] args) {
		System.out.println("Factorial of 5 (I): "+factorial(5));
	}
	
	public static int factorial(int n){
		int result=1,i=1; // INITIALIZION
		while(i<=n){ // TEST
			result=result*i; // INCREMENT
			i++; // INCREMENT
		}
		
		return result;
	}

}