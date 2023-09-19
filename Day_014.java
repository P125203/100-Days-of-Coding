//Algorithm for checking if given string is palindrome or not.
import java.util.*;
public class Day_014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = new String(s1);
		String s3 = "";
		
		for(int i = (s1.length()-1) ; i >= 0 ; i-- ) {
			s3 = s3 + s1.charAt(i);
		}
		if(s3.equals(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}