//Algorithm for factorial of a number using recursion.
import java.util.*;
public class Day_011 {
	
	public static int factorial(int x) {
		if(x >= 1)return x * factorial(x-1);
		return 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(factorial(x));

	}
}
