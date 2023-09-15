//Algorithm for removing whitespaces, special chars and numbers.
import java.util.*;
public class Day_010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String substr = "";
//		int n = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(Character.isAlphabetic(str.charAt(i)) == true) {
				substr = substr + str.charAt(i);
			}
//			if(Character.isDigit(str.charAt(i)) == true) {
//				n = n*10 + Character.getNumericValue(str.charAt(i));
//			}
		}
		System.out.print(substr);
	}
}
