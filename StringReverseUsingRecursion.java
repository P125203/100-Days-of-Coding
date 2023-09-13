//Algorithm for reversing a string using Recursion.
import java.util.*;
public class Day_008 {
	
	public static String reverseString(String s) {
		if((s == null) || (s.length() <= 1)) 
			System.out.print(s);
		else {
			System.out.print(s.charAt(s.length()-1));
			return reverseString(s.substring(0 , s.length()-1));
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		for(int i = str.length()-1 ; i >= 0  ; i--) {
//			System.out.print(str.charAt(i));
//		}
		
		reverseString(str);
	}
}
